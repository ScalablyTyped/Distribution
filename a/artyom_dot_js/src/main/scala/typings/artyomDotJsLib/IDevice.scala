package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevice extends js.Object {
  var isChrome: js.UndefOr[scala.Boolean] = js.undefined
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
}

object IDevice {
  @scala.inline
  def apply(
    isChrome: js.UndefOr[scala.Boolean] = js.undefined,
    isMobile: js.UndefOr[scala.Boolean] = js.undefined
  ): IDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isChrome)) __obj.updateDynamic("isChrome")(isChrome)
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile)
    __obj.asInstanceOf[IDevice]
  }
}

