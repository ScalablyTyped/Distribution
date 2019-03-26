package typings
package agDashGridLib.distLibInterfacesISetFilterParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFilterValuesFuncParams extends js.Object {
  var colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef
  def success(values: js.Array[java.lang.String]): scala.Unit
}

object SetFilterValuesFuncParams {
  @scala.inline
  def apply(
    colDef: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    success: js.Array[java.lang.String] => scala.Unit
  ): SetFilterValuesFuncParams = {
    val __obj = js.Dynamic.literal(colDef = colDef, success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[SetFilterValuesFuncParams]
  }
}

