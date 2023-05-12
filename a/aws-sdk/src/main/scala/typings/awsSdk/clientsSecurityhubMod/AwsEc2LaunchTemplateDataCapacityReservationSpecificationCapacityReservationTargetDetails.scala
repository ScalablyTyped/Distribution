package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails extends StObject {
  
  /**
    *  The ID of the Capacity Reservation in which to run the instance. 
    */
  var CapacityReservationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Capacity Reservation resource group in which to run the instance. 
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservationId(value: NonEmptyString): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    inline def setCapacityReservationResourceGroupArn(value: NonEmptyString): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
  }
}
