package typings.agDashGrid.distLibRowNodesSortServiceMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortedRowNode extends js.Object {
  var currentPos: Double
  var rowNode: RowNode
}

object SortedRowNode {
  @scala.inline
  def apply(currentPos: Double, rowNode: RowNode): SortedRowNode = {
    val __obj = js.Dynamic.literal(currentPos = currentPos.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortedRowNode]
  }
}

