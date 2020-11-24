package typings.antd.baseMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base
  extends Component[InternalBlockProps, BaseState, js.Any] {
  
  def canUseCSSEllipsis(): Boolean = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBase(prevProps: BlockProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBase(): Unit = js.native
  
  var contentRef: RefObject[HTMLElement] = js.native
  
  @JSName("context")
  var context_Base: ConfigConsumerProps = js.native
  
  var copiedStr: js.UndefOr[String] = js.native
  
  var copyId: js.UndefOr[Double] = js.native
  
  var copyStr: js.UndefOr[String] = js.native
  
  var editIcon: js.UndefOr[HTMLDivElement] = js.native
  
  var editStr: js.UndefOr[String] = js.native
  
  var expandStr: js.UndefOr[String] = js.native
  
  def getEditable(): EditConfig = js.native
  def getEditable(props: BlockProps): EditConfig = js.native
  
  def getEllipsis(): EllipsisConfig = js.native
  def getEllipsis(props: BlockProps): EllipsisConfig = js.native
  
  def getPrefixCls(): String = js.native
  
  def onCopyClick(): Unit = js.native
  
  def onEditCancel(): Unit = js.native
  
  def onEditChange(value: String): Unit = js.native
  
  def onEditClick(): Unit = js.native
  
  var onExpandClick: MouseEventHandler[HTMLElement] = js.native
  
  var rafId: js.UndefOr[Double] = js.native
  
  def renderContent(): Element = js.native
  
  def renderCopy(): js.UndefOr[Element] = js.native
  
  def renderEdit(): js.UndefOr[Element] = js.native
  
  def renderEditInput(): Element = js.native
  
  def renderExpand(): Element | Null = js.native
  def renderExpand(forceRender: Boolean): Element | Null = js.native
  
  def renderOperations(): js.Array[js.UndefOr[Element | Null]] = js.native
  def renderOperations(forceRenderExpanded: Boolean): js.Array[js.UndefOr[Element | Null]] = js.native
  
  def resizeOnNextFrame(): Unit = js.native
  
  def setEditRef(node: HTMLDivElement): Unit = js.native
  
  def syncEllipsis(): Unit = js.native
  
  def triggerEdit(edit: Boolean): Unit = js.native
}
