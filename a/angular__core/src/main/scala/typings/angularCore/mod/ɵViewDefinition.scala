package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵViewDefinition extends Definition[ViewDefinitionFactory] {
  
  var bindingCount: Double = js.native
  
  var flags: ɵViewFlags = js.native
  
  def handleEvent(view: ViewData, nodeIndex: Double, eventName: String, event: js.Any): Boolean = js.native
  @JSName("handleEvent")
  var handleEvent_Original: ViewHandleEventFn = js.native
  
  var lastRenderRootNode: NodeDef | Null = js.native
  
  /** aggregated NodeFlags for all nodes **/
  var nodeFlags: ɵNodeFlags = js.native
  
  /**
    * Binary or of all query ids that are matched by one of the nodes.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var nodeMatchedQueries: Double = js.native
  
  /**
    * Order: Depth first.
    * Especially providers are before elements / anchors.
    */
  var nodes: js.Array[NodeDef] = js.native
  
  var outputCount: Double = js.native
  
  var rootNodeFlags: ɵNodeFlags = js.native
  
  def updateDirectives(check: NodeCheckFn, view: ViewData): Unit = js.native
  @JSName("updateDirectives")
  var updateDirectives_Original: ViewUpdateFn = js.native
  
  def updateRenderer(check: NodeCheckFn, view: ViewData): Unit = js.native
  @JSName("updateRenderer")
  var updateRenderer_Original: ViewUpdateFn = js.native
}
