package typings
package agDashGridLib.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQuickFilterTextParams extends js.Object {
  var colDef: ColDef
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var data: js.Any
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var value: js.Any
}

object GetQuickFilterTextParams {
  @scala.inline
  def apply(
    colDef: ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    data: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    value: js.Any
  ): GetQuickFilterTextParams = {
    val __obj = js.Dynamic.literal(colDef = colDef, column = column, data = data, node = node, value = value)
  
    __obj.asInstanceOf[GetQuickFilterTextParams]
  }
}

