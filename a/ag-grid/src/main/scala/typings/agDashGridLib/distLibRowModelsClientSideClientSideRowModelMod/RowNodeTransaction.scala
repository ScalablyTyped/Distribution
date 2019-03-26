package typings
package agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeTransaction extends js.Object {
  var add: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
  var remove: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
  var update: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
}

object RowNodeTransaction {
  @scala.inline
  def apply(
    add: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    remove: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    update: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
  ): RowNodeTransaction = {
    val __obj = js.Dynamic.literal(add = add, remove = remove, update = update)
  
    __obj.asInstanceOf[RowNodeTransaction]
  }
}

