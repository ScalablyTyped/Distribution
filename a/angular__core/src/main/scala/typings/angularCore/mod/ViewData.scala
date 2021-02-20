package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View instance data.
  * Attention: Adding fields to this is performance sensitive!
  */
@js.native
trait ViewData extends StObject {
  
  var component: js.Any = js.native
  
  var context: js.Any = js.native
  
  var `def`: ɵViewDefinition = js.native
  
  var disposables: js.Array[DisposableFn] | Null = js.native
  
  var initIndex: Double = js.native
  
  var nodes: NumberDictionary[NodeData] = js.native
  
  var oldValues: js.Array[_] = js.native
  
  var parent: ViewData | Null = js.native
  
  var parentNodeDef: NodeDef | Null = js.native
  
  var renderer: Renderer2 = js.native
  
  var root: RootData = js.native
  
  var state: ViewState = js.native
  
  var viewContainerParent: ViewData | Null = js.native
}
object ViewData {
  
  @scala.inline
  def apply(
    component: js.Any,
    context: js.Any,
    `def`: ɵViewDefinition,
    initIndex: Double,
    nodes: NumberDictionary[NodeData],
    oldValues: js.Array[_],
    renderer: Renderer2,
    root: RootData,
    state: ViewState
  ): ViewData = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initIndex = initIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldValues = oldValues.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewData]
  }
  
  @scala.inline
  implicit class ViewDataMutableBuilder[Self <: ViewData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDef(value: ɵViewDefinition): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposables(value: js.Array[DisposableFn]): Self = StObject.set(x, "disposables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposablesNull: Self = StObject.set(x, "disposables", null)
    
    @scala.inline
    def setDisposablesVarargs(value: DisposableFn*): Self = StObject.set(x, "disposables", js.Array(value :_*))
    
    @scala.inline
    def setInitIndex(value: Double): Self = StObject.set(x, "initIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: NumberDictionary[NodeData]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValues(value: js.Array[_]): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValuesVarargs(value: js.Any*): Self = StObject.set(x, "oldValues", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: ViewData): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeDef(value: NodeDef): Self = StObject.set(x, "parentNodeDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeDefNull: Self = StObject.set(x, "parentNodeDef", null)
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setRenderer(value: Renderer2): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: RootData): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ViewState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewContainerParent(value: ViewData): Self = StObject.set(x, "viewContainerParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewContainerParentNull: Self = StObject.set(x, "viewContainerParent", null)
  }
}
