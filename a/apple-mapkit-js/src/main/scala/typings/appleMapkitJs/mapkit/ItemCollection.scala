package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tree structure containing annotations, overlays, and nested item
  * collection objects.
  */
trait ItemCollection extends js.Object {
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
}

