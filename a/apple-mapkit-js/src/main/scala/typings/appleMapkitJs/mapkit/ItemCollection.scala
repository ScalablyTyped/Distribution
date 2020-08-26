package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tree structure containing annotations, overlays, and nested item
  * collection objects.
  */
@js.native
trait ItemCollection extends js.Object {
  /**
    * The raw GeoJSON data.
    */
  var data: js.Object = js.native
  /**
    * A flattened array of items that include annotations or overlays.
    */
  var getFlattenedItemList: js.Array[Annotation | Overlay] = js.native
  /**
    * A nested list of annotations, overlays, or other item collections.
    */
  var items: js.Array[Annotation | Overlay | ItemCollection] = js.native
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
  implicit class ItemCollectionOps[Self <: ItemCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFlattenedItemListVarargs(value: (Annotation | Overlay)*): Self = this.set("getFlattenedItemList", js.Array(value :_*))
    @scala.inline
    def setGetFlattenedItemList(value: js.Array[Annotation | Overlay]): Self = this.set("getFlattenedItemList", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: (Annotation | Overlay | ItemCollection)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Annotation | Overlay | ItemCollection]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

