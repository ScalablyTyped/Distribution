package typings.antd

import typings.antd.antdStrings.bottomCenter
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.topCenter
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import typings.antd.dropdownButtonMod.DropdownButtonType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonsRender extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.undefined
  var `type`: DropdownButtonType
  def buttonsRender(buttons: js.Array[ReactNode]): js.Array[ReactNode]
}

object AnonButtonsRender {
  @scala.inline
  def apply(
    buttonsRender: js.Array[ReactNode] => js.Array[ReactNode],
    `type`: DropdownButtonType,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = null
  ): AnonButtonsRender = {
    val __obj = js.Dynamic.literal(buttonsRender = js.Any.fromFunction1(buttonsRender))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonsRender]
  }
}

