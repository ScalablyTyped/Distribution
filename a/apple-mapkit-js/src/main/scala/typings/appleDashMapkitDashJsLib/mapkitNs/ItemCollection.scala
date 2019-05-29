package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCollection extends js.Object {
  var data: js.Any
  var getFlattenedItemList: js.Array[Annotation | Overlay]
  var items: (js.Array[Annotation | Overlay]) | ItemCollection
}

object ItemCollection {
  @scala.inline
  def apply(
    data: js.Any,
    getFlattenedItemList: js.Array[Annotation | Overlay],
    items: (js.Array[Annotation | Overlay]) | ItemCollection
  ): ItemCollection = {
    val __obj = js.Dynamic.literal(data = data, getFlattenedItemList = getFlattenedItemList, items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemCollection]
  }
}

