package typings.antd.dropdownDropdownMod

import typings.antd.antdStrings.bottomCenter
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.topCenter
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getPlacement(): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getPlacement(direction: String): bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter = js.native
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String): ReactElement = js.native
}

