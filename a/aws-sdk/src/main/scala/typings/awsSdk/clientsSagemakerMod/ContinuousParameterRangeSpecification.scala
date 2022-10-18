package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousParameterRangeSpecification extends StObject {
  
  /**
    * The maximum floating-point value allowed.
    */
  var MaxValue: ParameterValue
  
  /**
    * The minimum floating-point value allowed.
    */
  var MinValue: ParameterValue
}
object ContinuousParameterRangeSpecification {
  
  inline def apply(MaxValue: ParameterValue, MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRangeSpecification]
  }
  
  extension [Self <: ContinuousParameterRangeSpecification](x: Self) {
    
    inline def setMaxValue(value: ParameterValue): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: ParameterValue): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
  }
}
