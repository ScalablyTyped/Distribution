package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
  */
trait ViewData extends StObject {
  
  var component: js.Any
  
  var context: js.Any
  
  var `def`: ɵViewDefinition
  
  var disposables: js.Array[DisposableFn] | Null
  
  var initIndex: Double
  
  var nodes: NumberDictionary[NodeData]
  
  var oldValues: js.Array[js.Any]
  
  var parent: ViewData | Null
  
  var parentNodeDef: NodeDef | Null
  
  var renderer: Renderer2
  
  var root: RootData
  
  var state: ViewState
  
  var viewContainerParent: ViewData | Null
}
object ViewData {
  
  inline def apply(
    component: js.Any,
    context: js.Any,
    `def`: ɵViewDefinition,
    initIndex: Double,
    nodes: NumberDictionary[NodeData],
    oldValues: js.Array[js.Any],
    renderer: Renderer2,
    root: RootData,
    state: ViewState
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initIndex = initIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], disposables = null, parent = null, parentNodeDef = null, viewContainerParent = null)
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewData]
  }
  
  extension [Self <: ViewData](x: Self) {
    
    inline def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDef(value: ɵViewDefinition): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDisposables(value: js.Array[DisposableFn]): Self = StObject.set(x, "disposables", value.asInstanceOf[js.Any])
    
    inline def setDisposablesNull: Self = StObject.set(x, "disposables", null)
    
    inline def setDisposablesVarargs(value: DisposableFn*): Self = StObject.set(x, "disposables", js.Array(value :_*))
    
    inline def setInitIndex(value: Double): Self = StObject.set(x, "initIndex", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: NumberDictionary[NodeData]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setOldValues(value: js.Array[js.Any]): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    inline def setOldValuesVarargs(value: js.Any*): Self = StObject.set(x, "oldValues", js.Array(value :_*))
    
    inline def setParent(value: ViewData): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNodeDef(value: NodeDef): Self = StObject.set(x, "parentNodeDef", value.asInstanceOf[js.Any])
    
    inline def setParentNodeDefNull: Self = StObject.set(x, "parentNodeDef", null)
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRenderer(value: Renderer2): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: RootData): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setState(value: ViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setViewContainerParent(value: ViewData): Self = StObject.set(x, "viewContainerParent", value.asInstanceOf[js.Any])
    
    inline def setViewContainerParentNull: Self = StObject.set(x, "viewContainerParent", null)
  }
}
