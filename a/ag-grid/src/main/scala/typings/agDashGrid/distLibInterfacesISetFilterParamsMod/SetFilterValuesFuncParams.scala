package typings.agDashGrid.distLibInterfacesISetFilterParamsMod

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFilterValuesFuncParams extends js.Object {
  var colDef: ColDef
  def success(values: js.Array[String]): Unit
}

object SetFilterValuesFuncParams {
  @scala.inline
  def apply(colDef: ColDef, success: js.Array[String] => Unit): SetFilterValuesFuncParams = {
    val __obj = js.Dynamic.literal(colDef = colDef, success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[SetFilterValuesFuncParams]
  }
}

