package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalParameterRange extends StObject {
  
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: typings.awsSdk.clientsForecastserviceMod.Name
  
  /**
    * A list of the tunable categories for the hyperparameter.
    */
  var Values: typings.awsSdk.clientsForecastserviceMod.Values
}
object CategoricalParameterRange {
  
  inline def apply(Name: Name, Values: Values): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoricalParameterRange] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
