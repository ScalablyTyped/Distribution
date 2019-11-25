package typings.antdDashMobile.libCardPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPropsType extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
}

object CardPropsType {
  @scala.inline
  def apply(full: js.UndefOr[Boolean] = js.undefined): CardPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPropsType]
  }
}

