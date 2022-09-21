package typings.aureliaTemplating.mod

import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ShadowSlot")
@js.native
open class ShadowSlot protected () extends StObject {
  def this(anchor: Any, name: Any, fallbackFactory: Any) = this()
  
  def addNode(view: View_, node: Node, projectionSource: ShadowSlot): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ShadowSlot, index: Double): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ShadowSlot, index: Double, destination: String): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ShadowSlot, index: Unit, destination: String): Unit = js.native
  /**
  	 * @param view
  	 * @param node
  	 * @param projectionSource
  	 * @param index
  	 * @param destination
  	 */
  def addNode(view: View_, node: Node, projectionSource: ViewSlot): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ViewSlot, index: Double): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ViewSlot, index: Double, destination: String): Unit = js.native
  def addNode(view: View_, node: Node, projectionSource: ViewSlot, index: Unit, destination: String): Unit = js.native
  
  def attached(): Unit = js.native
  
  /**
  	 * @param view
  	 */
  def bind(view: View_): Unit = js.native
  
  /**
  	 * @param ownerView
  	 */
  def created(ownerView: View_): Unit = js.native
  
  def detached(): Unit = js.native
  
  def needsFallbackRendering: Boolean = js.native
  
  def projectFrom(view: View_, projectionSource: ShadowSlot): Unit = js.native
  def projectFrom(view: View_, projectionSource: ViewSlot): Unit = js.native
  
  def projectTo(slots: Record[String, ShadowSlot | PassThroughSlot]): Unit = js.native
  
  def removeAll(projectionSource: ShadowSlot): Unit = js.native
  def removeAll(projectionSource: ViewSlot): Unit = js.native
  
  def removeView(view: View_, projectionSource: ShadowSlot): Unit = js.native
  def removeView(view: View_, projectionSource: ViewSlot): Unit = js.native
  
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ShadowSlot): Unit = js.native
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ShadowSlot, index: Double): Unit = js.native
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ViewSlot): Unit = js.native
  def renderFallbackContent(view: View_, nodes: js.Array[Node], projectionSource: ViewSlot, index: Double): Unit = js.native
  
  def unbind(): Unit = js.native
}
