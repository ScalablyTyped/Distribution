package typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeTransaction extends js.Object {
  var add: js.Array[RowNode]
  var remove: js.Array[RowNode]
  var update: js.Array[RowNode]
}

object RowNodeTransaction {
  @scala.inline
  def apply(add: js.Array[RowNode], remove: js.Array[RowNode], update: js.Array[RowNode]): RowNodeTransaction = {
    val __obj = js.Dynamic.literal(add = add, remove = remove, update = update)
  
    __obj.asInstanceOf[RowNodeTransaction]
  }
}

