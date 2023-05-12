package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingMetricDimension extends StObject {
  
  /**
    * The name of the dimension.
    */
  var Name: TargetTrackingMetricDimensionName
  
  /**
    * The value of the dimension.
    */
  var Value: TargetTrackingMetricDimensionValue
}
object TargetTrackingMetricDimension {
  
  inline def apply(Name: TargetTrackingMetricDimensionName, Value: TargetTrackingMetricDimensionValue): TargetTrackingMetricDimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingMetricDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetTrackingMetricDimension] (val x: Self) extends AnyVal {
    
    inline def setName(value: TargetTrackingMetricDimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TargetTrackingMetricDimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
