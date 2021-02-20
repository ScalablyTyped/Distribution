package typings.ajv.mod

import org.scalablytyped.runtime.StObject
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
  implicit class EnumParamsMutableBuilder[Self <: EnumParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: js.Array[_]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesVarargs(value: js.Any*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
  }
}
