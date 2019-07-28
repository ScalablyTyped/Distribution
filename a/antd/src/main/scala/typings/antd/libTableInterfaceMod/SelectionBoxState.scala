package typings.antd.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBoxState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
}

object SelectionBoxState {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined): SelectionBoxState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[SelectionBoxState]
  }
}

