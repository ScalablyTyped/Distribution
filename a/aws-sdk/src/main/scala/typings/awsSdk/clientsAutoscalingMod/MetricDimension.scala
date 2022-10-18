package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDimension extends StObject {
  
  /**
    * The name of the dimension.
    */
  var Name: MetricDimensionName
  
  /**
    * The value of the dimension.
    */
  var Value: MetricDimensionValue
}
object MetricDimension {
  
  inline def apply(Name: MetricDimensionName, Value: MetricDimensionValue): MetricDimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
  
  extension [Self <: MetricDimension](x: Self) {
    
    inline def setName(value: MetricDimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MetricDimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
