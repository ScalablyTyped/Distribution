package typings
package antdDashMobileLib.libCardPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPropsType extends js.Object {
  var full: js.UndefOr[scala.Boolean] = js.undefined
}

object CardPropsType {
  @scala.inline
  def apply(full: js.UndefOr[scala.Boolean] = js.undefined): CardPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    __obj.asInstanceOf[CardPropsType]
  }
}

