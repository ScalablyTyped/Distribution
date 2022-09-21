package typings.aureliaTemplating.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "PassThroughSlot")
@js.native
open class PassThroughSlot protected () extends StObject {
  def this(anchor: Any, name: Any, destinationName: Any, fallbackFactory: Any) = this()
  
  def addNode(view: View_, node: Node, projectionSource: ShadowSlot, index: Double): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ViewSlot, index: Double): Unit = js.native
  
  def attached(): Unit = js.native
  
  def bind(view: View_): Unit = js.native
  
  def created(ownerView: View_): Unit = js.native
  
  def detached(): Unit = js.native
  
  /**
  	 * Indicate whether this slot should render fallback default slot content
  	 */
  def needsFallbackRendering: Boolean = js.native
  
  def passThroughTo(destinationSlot: PassThroughSlot): Unit = js.native
  def passThroughTo(destinationSlot: ShadowSlot): Unit = js.native
  
  def projectFrom(view: View_, projectionSource: ShadowSlot): Unit = js.native
  def projectFrom(view: View_, projectionSource: ViewSlot): Unit = js.native
  
  def removeAll(projectionSource: ShadowSlot): Unit = js.native
  def removeAll(projectionSource: ViewSlot): Unit = js.native
  
  def removeView(view: View_, projectionSource: ShadowSlot): Unit = js.native
  def removeView(view: View_, projectionSource: ViewSlot): Unit = js.native
  
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ShadowSlot): Unit = js.native
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ShadowSlot, index: Double): Unit = js.native
  /**
  	 * @param view
  	 * @param nodes
  	 * @param projectionSource
  	 * @param index
  	 */
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ViewSlot): Unit = js.native
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ViewSlot, index: Double): Unit = js.native
  
  def unbind(): Unit = js.native
}
