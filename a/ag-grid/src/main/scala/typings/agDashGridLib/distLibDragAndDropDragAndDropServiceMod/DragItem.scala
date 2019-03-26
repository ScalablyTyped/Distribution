package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragItem extends js.Object {
  var columns: js.UndefOr[js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]] = js.undefined
  var rowNode: js.UndefOr[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.undefined
  var visibleState: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
}

object DragItem {
  @scala.inline
  def apply(
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = null,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = null,
    visibleState: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null
  ): DragItem = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode)
    if (visibleState != null) __obj.updateDynamic("visibleState")(visibleState)
    __obj.asInstanceOf[DragItem]
  }
}

