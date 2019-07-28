package typings.antd.libDropdownDropdownMod

import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown
  extends Component[DropDownProps, js.Any, js.Any] {
  def getTransitionName(): String = js.native
  def renderDropDown(hasGetPopupContainerGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderOverlay(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

