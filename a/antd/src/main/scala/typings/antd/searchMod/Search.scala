package typings.antd.searchMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[SearchProps, js.Any, js.Any] {
  var input: js.Any = js.native
  var onMouseDown: MouseEventHandler[HTMLElement] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: KeyboardEvent[HTMLInputElement]): Unit = js.native
  def onSearch(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def renderAddonAfter(prefixCls: String, size: SizeType): js.UndefOr[js.Object | Null] = js.native
  def renderLoading(prefixCls: String): Element = js.native
  def renderSearch(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typings.antd.inputInputMod.default): Unit = js.native
}

