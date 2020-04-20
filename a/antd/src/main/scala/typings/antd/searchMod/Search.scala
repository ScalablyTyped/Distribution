package typings.antd.searchMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
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
  def onSearch(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderAddonAfter(prefixCls: String, size: SizeType): js.UndefOr[js.Object | Null] = js.native
  def renderLoading(prefixCls: String): Element = js.native
  def renderSearch(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderSuffix(prefixCls: String): js.UndefOr[js.Object | Null] = js.native
  def saveInput(node: typings.antd.inputInputMod.default): Unit = js.native
}

