package typings.antd.backTopMod

import typings.antd.AnonPrefixCls
import typings.antd.AnonTargetAny
import typings.antd.AnonVisible
import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.NativeUIEvent
import typings.react.mod.UIEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.Document_
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackTop
  extends Component[BackTopProps, js.Any, js.Any] {
  var node: HTMLDivElement = js.native
  var scrollEvent: js.Any = js.native
  @JSName("state")
  var state_BackTop: AnonVisible = js.native
  def bindScrollEvent(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBackTop(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBackTop(prevProps: BackTopProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBackTop(): Unit = js.native
  def getDefaultTarget(): Document_ | (Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) = js.native
  def getVisible(): js.UndefOr[Boolean] = js.native
  def handleScroll(e: AnonTargetAny): Unit = js.native
  def handleScroll(e: UIEvent[HTMLElement, NativeUIEvent]): Unit = js.native
  def renderBackTop(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderChildren(hasPrefixCls: AnonPrefixCls): Element = js.native
  def saveDivRef(node: HTMLDivElement): Unit = js.native
  def scrollToTop(e: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
}

