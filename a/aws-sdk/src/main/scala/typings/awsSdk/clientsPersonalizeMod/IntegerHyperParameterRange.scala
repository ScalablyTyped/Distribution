package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerHyperParameterRange extends StObject {
  
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[IntegerMaxValue] = js.undefined
  
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[IntegerMinValue] = js.undefined
  
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
}
object IntegerHyperParameterRange {
  
  inline def apply(): IntegerHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerHyperParameterRange]
  }
  
  extension [Self <: IntegerHyperParameterRange](x: Self) {
    
    inline def setMaxValue(value: IntegerMaxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: IntegerMinValue): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
