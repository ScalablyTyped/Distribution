package typings.antd.esInputSearchMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onSearch(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def renderAddonAfter(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def renderSearch(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typings.antd.esInputInputMod.default): Unit = js.native
}

