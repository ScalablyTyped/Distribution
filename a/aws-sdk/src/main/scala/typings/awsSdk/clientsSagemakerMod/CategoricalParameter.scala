package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalParameter extends StObject {
  
  /**
    * The Name of the environment variable.
    */
  var Name: String64
  
  /**
    * The list of values you can pass.
    */
  var Value: CategoricalParameterRangeValues
}
object CategoricalParameter {
  
  inline def apply(Name: String64, Value: CategoricalParameterRangeValues): CategoricalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoricalParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String64): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CategoricalParameterRangeValues): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String128*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
