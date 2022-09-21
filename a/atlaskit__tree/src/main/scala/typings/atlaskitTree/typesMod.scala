package typings.atlaskitTree

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait FlattenedItem extends StObject {
    
    var item: TreeItem
    
    var path: Path
  }
  object FlattenedItem {
    
    inline def apply(item: TreeItem, path: Path): FlattenedItem = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedItem]
    }
    
    extension [Self <: FlattenedItem](x: Self) {
      
      inline def setItem(value: TreeItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  type FlattenedTree = js.Array[FlattenedItem]
  
  type ItemId = String | Double
  
  type Path = js.Array[Double]
  
  trait TreeData extends StObject {
    
    var items: Record[ItemId, TreeItem]
    
    var rootId: ItemId
  }
  object TreeData {
    
    inline def apply(items: Record[ItemId, TreeItem], rootId: ItemId): TreeData = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeData]
    }
    
    extension [Self <: TreeData](x: Self) {
      
      inline def setItems(value: Record[ItemId, TreeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setRootId(value: ItemId): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeDestinationPosition extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parentId: ItemId
  }
  object TreeDestinationPosition {
    
    inline def apply(parentId: ItemId): TreeDestinationPosition = {
      val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDestinationPosition]
    }
    
    extension [Self <: TreeDestinationPosition](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParentId(value: ItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeItem extends StObject {
    
    var children: js.Array[ItemId]
    
    var data: js.UndefOr[TreeItemData] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var id: ItemId
    
    var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeItem {
    
    inline def apply(children: js.Array[ItemId], id: ItemId): TreeItem = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItem]
    }
    
    extension [Self <: TreeItem](x: Self) {
      
      inline def setChildren(value: js.Array[ItemId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ItemId*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: TreeItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setId(value: ItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsChildrenLoading(value: Boolean): Self = StObject.set(x, "isChildrenLoading", value.asInstanceOf[js.Any])
      
      inline def setIsChildrenLoadingUndefined: Self = StObject.set(x, "isChildrenLoading", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
  
  type TreeItemData = Any
  
  trait TreeSourcePosition extends StObject {
    
    var index: Double
    
    var parentId: ItemId
  }
  object TreeSourcePosition {
    
    inline def apply(index: Double, parentId: ItemId): TreeSourcePosition = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSourcePosition]
    }
    
    extension [Self <: TreeSourcePosition](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: ItemId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    }
  }
}
