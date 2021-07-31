package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tree structure containing annotations, overlays, and nested item
  * collection objects.
  */
trait ItemCollection extends StObject {
  
  /**
    * The raw GeoJSON data.
    */
  var data: js.Object
  
  /**
    * A flattened array of items that include annotations or overlays.
    */
  var getFlattenedItemList: js.Array[Annotation | Overlay]
  
  /**
    * A nested list of annotations, overlays, or other item collections.
    */
  var items: js.Array[Annotation | Overlay | ItemCollection]
}
object ItemCollection {
  
  @scala.inline
  def apply(
    data: js.Object,
    getFlattenedItemList: js.Array[Annotation | Overlay],
    items: js.Array[Annotation | Overlay | ItemCollection]
  ): ItemCollection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getFlattenedItemList = getFlattenedItemList.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollection]
  }
  
  @scala.inline
  implicit class ItemCollectionMutableBuilder[Self <: ItemCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFlattenedItemList(value: js.Array[Annotation | Overlay]): Self = StObject.set(x, "getFlattenedItemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFlattenedItemListVarargs(value: (Annotation | Overlay)*): Self = StObject.set(x, "getFlattenedItemList", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Annotation | Overlay | ItemCollection]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (Annotation | Overlay | ItemCollection)*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
