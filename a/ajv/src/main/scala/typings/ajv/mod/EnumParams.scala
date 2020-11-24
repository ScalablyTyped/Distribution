package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumParams extends ErrorParameters {
  
  var allowedValues: js.Array[_] = js.native
}
object EnumParams {
  
  @scala.inline
  def apply(allowedValues: js.Array[_]): EnumParams = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumParams]
  }
  
  @scala.inline
  implicit class EnumParamsOps[Self <: EnumParams] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: js.Any*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: js.Array[_]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
  }
}
