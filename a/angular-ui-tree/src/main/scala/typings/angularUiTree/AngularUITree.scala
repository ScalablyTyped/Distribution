package typings.angularUiTree

import typings.angular.mod.IRootScopeService
import typings.angularUiTree.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AngularUITree {
  
  type IAcceptCallback = js.Function3[
    /* source */ ITreeNodeScope, 
    /* destination */ ITreeNodeScope, 
    /* destinationIndex */ Double, 
    Boolean
  ]
  
  @js.native
  trait ICallbacks extends StObject {
    
    def accept(source: ITreeNodeScope, destination: ITreeNodeScope, destinationIndex: Double): Boolean = js.native
    @JSName("accept")
    var accept_Original: IAcceptCallback = js.native
    
    def dragStart(eventInfo: IEventInfo): Unit = js.native
    @JSName("dragStart")
    var dragStart_Original: IDroppedCallback = js.native
    
    def dropped(eventInfo: IEventInfo): Unit = js.native
    @JSName("dropped")
    var dropped_Original: IDroppedCallback = js.native
  }
  
  type IDroppedCallback = js.Function1[/* eventInfo */ IEventInfo, Unit]
  
  @js.native
  trait IEventInfo extends StObject {
    
    var dest: Index = js.native
    
    var elements: js.Any = js.native
    
    var pos: IPosition = js.native
    
    var source: IEventSourceInfo = js.native
  }
  object IEventInfo {
    
    @scala.inline
    def apply(dest: Index, elements: js.Any, pos: IPosition, source: IEventSourceInfo): IEventInfo = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventInfo]
    }
    
    @scala.inline
    implicit class IEventInfoMutableBuilder[Self <: IEventInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: Index): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElements(value: js.Any): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: IPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: IEventSourceInfo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEventSourceInfo extends StObject {
    
    var cloneModel: js.Any = js.native
    
    var index: Double = js.native
    
    var nodeScope: ITreeNodeScope = js.native
    
    var nodesScope: ITreeNodeScope = js.native
  }
  object IEventSourceInfo {
    
    @scala.inline
    def apply(cloneModel: js.Any, index: Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
      val __obj = js.Dynamic.literal(cloneModel = cloneModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nodeScope = nodeScope.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventSourceInfo]
    }
    
    @scala.inline
    implicit class IEventSourceInfoMutableBuilder[Self <: IEventSourceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloneModel(value: js.Any): Self = StObject.set(x, "cloneModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeScope(value: ITreeNodeScope): Self = StObject.set(x, "nodeScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesScope(value: ITreeNodeScope): Self = StObject.set(x, "nodesScope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IParentTreeNodeScope extends ITreeNodeScope {
    
    def isParent(nodeScope: ITreeNodeScope): Boolean = js.native
  }
  
  @js.native
  trait IPosition extends StObject {
    
    var dirAx: Double = js.native
    
    var dirX: Double = js.native
    
    var dirY: Double = js.native
    
    var distAxX: Double = js.native
    
    var distAxY: Double = js.native
    
    var distX: Double = js.native
    
    var distY: Double = js.native
    
    var lastDirX: Double = js.native
    
    var lastDirY: Double = js.native
    
    var lastX: Double = js.native
    
    var lastY: Double = js.native
    
    var moving: Boolean = js.native
    
    var nowX: Double = js.native
    
    var nowY: Double = js.native
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
    
    var startX: Double = js.native
    
    var startY: Double = js.native
  }
  object IPosition {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IPositionMutableBuilder[Self <: IPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirAx(value: Double): Self = StObject.set(x, "dirAx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirX(value: Double): Self = StObject.set(x, "dirX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirY(value: Double): Self = StObject.set(x, "dirY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistAxX(value: Double): Self = StObject.set(x, "distAxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistAxY(value: Double): Self = StObject.set(x, "distAxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistX(value: Double): Self = StObject.set(x, "distX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistY(value: Double): Self = StObject.set(x, "distY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDirX(value: Double): Self = StObject.set(x, "lastDirX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDirY(value: Double): Self = StObject.set(x, "lastDirY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoving(value: Boolean): Self = StObject.set(x, "moving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowX(value: Double): Self = StObject.set(x, "nowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowY(value: Double): Self = StObject.set(x, "nowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Node in list
    */
  @js.native
  trait ITreeNode extends StObject {
    
    var id: Double | String = js.native
    
    var nodes: js.Array[ITreeNode] = js.native
    
    var title: String = js.native
  }
  object ITreeNode {
    
    @scala.inline
    def apply(id: Double | String, nodes: js.Array[ITreeNode], title: String): ITreeNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNode]
    }
    
    @scala.inline
    implicit class ITreeNodeMutableBuilder[Self <: ITreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[ITreeNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: ITreeNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Internal representation of node in the UI
    */
  @js.native
  trait ITreeNodeScope extends IRootScopeService {
    
    var node: ITreeNode = js.native
  }
}
