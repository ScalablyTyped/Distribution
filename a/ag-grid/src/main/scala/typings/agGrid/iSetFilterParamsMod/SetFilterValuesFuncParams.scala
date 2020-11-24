package typings.agGrid.iSetFilterParamsMod

import typings.agGrid.colDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFilterValuesFuncParams extends js.Object {
  
  var colDef: ColDef = js.native
  
  def success(values: js.Array[String]): Unit = js.native
}
object SetFilterValuesFuncParams {
  
  @scala.inline
  def apply(colDef: ColDef, success: js.Array[String] => Unit): SetFilterValuesFuncParams = {
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[SetFilterValuesFuncParams]
  }
  
  @scala.inline
  implicit class SetFilterValuesFuncParamsOps[Self <: SetFilterValuesFuncParams] (val x: Self) extends AnyVal {
    
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
    def setColDef(value: ColDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: js.Array[String] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
