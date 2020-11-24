package typings.antd.affixMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Affix
  extends Component[AffixProps, AffixState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MAffix(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAffix(prevProps: AffixProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAffix(): Unit = js.native
  
  @JSName("context")
  var context_Affix: ConfigConsumerProps = js.native
  
  var fixedNode: HTMLDivElement = js.native
  
  def getOffsetBottom(): js.UndefOr[Double] = js.native
  
  def getOffsetTop(): js.UndefOr[Double] = js.native
  
  var getTargetFunc: js.Any = js.native
  
  def lazyUpdatePosition(): Unit = js.native
  
  def measure(): Unit = js.native
  
  var placeholderNode: HTMLDivElement = js.native
  
  def prepareMeasure(): Unit = js.native
  
  def saveFixedNode(node: HTMLDivElement): Unit = js.native
  
  def savePlaceholderNode(node: HTMLDivElement): Unit = js.native
  
  var timeout: js.Any = js.native
  
  def updatePosition(): Unit = js.native
}
