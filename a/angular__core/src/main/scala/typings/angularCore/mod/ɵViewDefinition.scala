package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵViewDefinition
  extends StObject
     with Definition[ViewDefinitionFactory] {
  
  var bindingCount: Double
  
  var flags: ɵViewFlags
  
  def handleEvent(view: ViewData, nodeIndex: Double, eventName: String, event: js.Any): Boolean
  @JSName("handleEvent")
  var handleEvent_Original: ViewHandleEventFn
  
  var lastRenderRootNode: NodeDef | Null
  
  /** aggregated NodeFlags for all nodes **/
  var nodeFlags: ɵNodeFlags
  
  /**
    * Binary or of all query ids that are matched by one of the nodes.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var nodeMatchedQueries: Double
  
  /**
    * Order: Depth first.
    * Especially providers are before elements / anchors.
    */
  var nodes: js.Array[NodeDef]
  
  var outputCount: Double
  
  var rootNodeFlags: ɵNodeFlags
  
  def updateDirectives(check: NodeCheckFn, view: ViewData): Unit
  @JSName("updateDirectives")
  var updateDirectives_Original: ViewUpdateFn
  
  def updateRenderer(check: NodeCheckFn, view: ViewData): Unit
  @JSName("updateRenderer")
  var updateRenderer_Original: ViewUpdateFn
}
object ɵViewDefinition {
  
  inline def apply(
    bindingCount: Double,
    flags: ɵViewFlags,
    handleEvent: (/* view */ ViewData, /* nodeIndex */ Double, /* eventName */ String, /* event */ js.Any) => Boolean,
    nodeFlags: ɵNodeFlags,
    nodeMatchedQueries: Double,
    nodes: js.Array[NodeDef],
    outputCount: Double,
    rootNodeFlags: ɵNodeFlags,
    updateDirectives: (/* check */ NodeCheckFn, /* view */ ViewData) => Unit,
    updateRenderer: (/* check */ NodeCheckFn, /* view */ ViewData) => Unit
  ): ɵViewDefinition = {
    val __obj = js.Dynamic.literal(bindingCount = bindingCount.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction4(handleEvent), nodeFlags = nodeFlags.asInstanceOf[js.Any], nodeMatchedQueries = nodeMatchedQueries.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any], rootNodeFlags = rootNodeFlags.asInstanceOf[js.Any], updateDirectives = js.Any.fromFunction2(updateDirectives), updateRenderer = js.Any.fromFunction2(updateRenderer), factory = null, lastRenderRootNode = null)
    __obj.asInstanceOf[ɵViewDefinition]
  }
  
  extension [Self <: ɵViewDefinition](x: Self) {
    
    inline def setBindingCount(value: Double): Self = StObject.set(x, "bindingCount", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ɵViewFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHandleEvent(
      value: (/* view */ ViewData, /* nodeIndex */ Double, /* eventName */ String, /* event */ js.Any) => Boolean
    ): Self = StObject.set(x, "handleEvent", js.Any.fromFunction4(value))
    
    inline def setLastRenderRootNode(value: NodeDef): Self = StObject.set(x, "lastRenderRootNode", value.asInstanceOf[js.Any])
    
    inline def setLastRenderRootNodeNull: Self = StObject.set(x, "lastRenderRootNode", null)
    
    inline def setNodeFlags(value: ɵNodeFlags): Self = StObject.set(x, "nodeFlags", value.asInstanceOf[js.Any])
    
    inline def setNodeMatchedQueries(value: Double): Self = StObject.set(x, "nodeMatchedQueries", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[NodeDef]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeDef*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setOutputCount(value: Double): Self = StObject.set(x, "outputCount", value.asInstanceOf[js.Any])
    
    inline def setRootNodeFlags(value: ɵNodeFlags): Self = StObject.set(x, "rootNodeFlags", value.asInstanceOf[js.Any])
    
    inline def setUpdateDirectives(value: (/* check */ NodeCheckFn, /* view */ ViewData) => Unit): Self = StObject.set(x, "updateDirectives", js.Any.fromFunction2(value))
    
    inline def setUpdateRenderer(value: (/* check */ NodeCheckFn, /* view */ ViewData) => Unit): Self = StObject.set(x, "updateRenderer", js.Any.fromFunction2(value))
  }
}
