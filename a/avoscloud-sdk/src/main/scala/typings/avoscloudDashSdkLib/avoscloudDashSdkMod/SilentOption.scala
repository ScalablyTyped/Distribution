package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SilentOption extends js.Object {
  /**
    * Set to true to avoid firing the event.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object SilentOption {
  @scala.inline
  def apply(silent: js.UndefOr[scala.Boolean] = js.undefined): SilentOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[SilentOption]
  }
}

