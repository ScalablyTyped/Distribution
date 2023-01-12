package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails extends StObject {
  
  /**
    * The name of the Availability Zone.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails] (val x: Self) extends AnyVal {
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
