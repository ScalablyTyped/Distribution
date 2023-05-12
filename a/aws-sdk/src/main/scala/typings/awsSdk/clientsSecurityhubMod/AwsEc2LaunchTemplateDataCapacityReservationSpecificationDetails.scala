package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails extends StObject {
  
  /**
    *  Indicates the instance's Capacity Reservation preferences. If equal to open, the instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). If equal to none, the instance avoids running in a Capacity Reservation even if one is available. The instance runs in On-Demand capacity. 
    */
  var CapacityReservationPreference: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Specifies a target Capacity Reservation. 
    */
  var CapacityReservationTarget: js.UndefOr[
    AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails
  ] = js.undefined
}
object AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservationPreference(value: NonEmptyString): Self = StObject.set(x, "CapacityReservationPreference", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationPreferenceUndefined: Self = StObject.set(x, "CapacityReservationPreference", js.undefined)
    
    inline def setCapacityReservationTarget(value: AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails): Self = StObject.set(x, "CapacityReservationTarget", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationTargetUndefined: Self = StObject.set(x, "CapacityReservationTarget", js.undefined)
  }
}
