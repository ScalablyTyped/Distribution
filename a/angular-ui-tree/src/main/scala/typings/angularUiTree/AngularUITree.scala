package typings.angularUiTree

import typings.angular.mod.IRootScopeService
import typings.angularUiTree.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AngularUITree {
  
  type IAcceptCallback = js.Function3[
    /* source */ ITreeNodeScope, 
    /* destination */ ITreeNodeScope, 
    /* destinationIndex */ Double, 
    Boolean
  ]
  
  trait ICallbacks extends StObject {
    
    def accept(source: ITreeNodeScope, destination: ITreeNodeScope, destinationIndex: Double): Boolean
    @JSName("accept")
    var accept_Original: IAcceptCallback
    
    def dragStart(eventInfo: IEventInfo): Unit
    @JSName("dragStart")
    var dragStart_Original: IDroppedCallback
    
    def dropped(eventInfo: IEventInfo): Unit
    @JSName("dropped")
    var dropped_Original: IDroppedCallback
  }
  object ICallbacks {
    
    inline def apply(
      accept: (/* source */ ITreeNodeScope, /* destination */ ITreeNodeScope, /* destinationIndex */ Double) => Boolean,
      dragStart: /* eventInfo */ IEventInfo => Unit,
      dropped: /* eventInfo */ IEventInfo => Unit
    ): ICallbacks = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction3(accept), dragStart = js.Any.fromFunction1(dragStart), dropped = js.Any.fromFunction1(dropped))
      __obj.asInstanceOf[ICallbacks]
    }
    
    extension [Self <: ICallbacks](x: Self) {
      
      inline def setAccept(
        value: (/* source */ ITreeNodeScope, /* destination */ ITreeNodeScope, /* destinationIndex */ Double) => Boolean
      ): Self = StObject.set(x, "accept", js.Any.fromFunction3(value))
      
      inline def setDragStart(value: /* eventInfo */ IEventInfo => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      inline def setDropped(value: /* eventInfo */ IEventInfo => Unit): Self = StObject.set(x, "dropped", js.Any.fromFunction1(value))
    }
  }
  
  type IDroppedCallback = js.Function1[/* eventInfo */ IEventInfo, Unit]
  
  trait IEventInfo extends StObject {
    
    var dest: Index
    
    var elements: Any
    
    var pos: IPosition
    
    var source: IEventSourceInfo
  }
  object IEventInfo {
    
    inline def apply(dest: Index, elements: Any, pos: IPosition, source: IEventSourceInfo): IEventInfo = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventInfo]
    }
    
    extension [Self <: IEventInfo](x: Self) {
      
      inline def setDest(value: Index): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setElements(value: Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setPos(value: IPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSource(value: IEventSourceInfo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEventSourceInfo extends StObject {
    
    var cloneModel: Any
    
    var index: Double
    
    var nodeScope: ITreeNodeScope
    
    var nodesScope: ITreeNodeScope
  }
  object IEventSourceInfo {
    
    inline def apply(cloneModel: Any, index: Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
      val __obj = js.Dynamic.literal(cloneModel = cloneModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nodeScope = nodeScope.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventSourceInfo]
    }
    
    extension [Self <: IEventSourceInfo](x: Self) {
      
      inline def setCloneModel(value: Any): Self = StObject.set(x, "cloneModel", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNodeScope(value: ITreeNodeScope): Self = StObject.set(x, "nodeScope", value.asInstanceOf[js.Any])
      
      inline def setNodesScope(value: ITreeNodeScope): Self = StObject.set(x, "nodesScope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IParentTreeNodeScope
    extends StObject
       with ITreeNodeScope {
    
    def isParent(nodeScope: ITreeNodeScope): Boolean = js.native
  }
  
  trait IPosition extends StObject {
    
    var dirAx: Double
    
    var dirX: Double
    
    var dirY: Double
    
    var distAxX: Double
    
    var distAxY: Double
    
    var distX: Double
    
    var distY: Double
    
    var lastDirX: Double
    
    var lastDirY: Double
    
    var lastX: Double
    
    var lastY: Double
    
    var moving: Boolean
    
    var nowX: Double
    
    var nowY: Double
    
    var offsetX: Double
    
    var offsetY: Double
    
    var startX: Double
    
    var startY: Double
  }
  object IPosition {
    
    inline def apply(
      dirAx: Double,
      dirX: Double,
      dirY: Double,
      distAxX: Double,
      distAxY: Double,
      distX: Double,
      distY: Double,
      lastDirX: Double,
      lastDirY: Double,
      lastX: Double,
      lastY: Double,
      moving: Boolean,
      nowX: Double,
      nowY: Double,
      offsetX: Double,
      offsetY: Double,
      startX: Double,
      startY: Double
    ): IPosition = {
      val __obj = js.Dynamic.literal(dirAx = dirAx.asInstanceOf[js.Any], dirX = dirX.asInstanceOf[js.Any], dirY = dirY.asInstanceOf[js.Any], distAxX = distAxX.asInstanceOf[js.Any], distAxY = distAxY.asInstanceOf[js.Any], distX = distX.asInstanceOf[js.Any], distY = distY.asInstanceOf[js.Any], lastDirX = lastDirX.asInstanceOf[js.Any], lastDirY = lastDirY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], nowX = nowX.asInstanceOf[js.Any], nowY = nowY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPosition]
    }
    
    extension [Self <: IPosition](x: Self) {
      
      inline def setDirAx(value: Double): Self = StObject.set(x, "dirAx", value.asInstanceOf[js.Any])
      
      inline def setDirX(value: Double): Self = StObject.set(x, "dirX", value.asInstanceOf[js.Any])
      
      inline def setDirY(value: Double): Self = StObject.set(x, "dirY", value.asInstanceOf[js.Any])
      
      inline def setDistAxX(value: Double): Self = StObject.set(x, "distAxX", value.asInstanceOf[js.Any])
      
      inline def setDistAxY(value: Double): Self = StObject.set(x, "distAxY", value.asInstanceOf[js.Any])
      
      inline def setDistX(value: Double): Self = StObject.set(x, "distX", value.asInstanceOf[js.Any])
      
      inline def setDistY(value: Double): Self = StObject.set(x, "distY", value.asInstanceOf[js.Any])
      
      inline def setLastDirX(value: Double): Self = StObject.set(x, "lastDirX", value.asInstanceOf[js.Any])
      
      inline def setLastDirY(value: Double): Self = StObject.set(x, "lastDirY", value.asInstanceOf[js.Any])
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      inline def setNowX(value: Double): Self = StObject.set(x, "nowX", value.asInstanceOf[js.Any])
      
      inline def setNowY(value: Double): Self = StObject.set(x, "nowY", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Node in list
    */
  trait ITreeNode extends StObject {
    
    var id: Double | String
    
    var nodes: js.Array[ITreeNode]
    
    var title: String
  }
  object ITreeNode {
    
    inline def apply(id: Double | String, nodes: js.Array[ITreeNode], title: String): ITreeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNode]
    }
    
    extension [Self <: ITreeNode](x: Self) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ITreeNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ITreeNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Internal representation of node in the UI
    */
  @js.native
  trait ITreeNodeScope
    extends StObject
       with IRootScopeService {
    
    var node: ITreeNode = js.native
  }
}
