package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotPlacement extends StObject {
  
  /**
    * The Availability Zone. [Spot Fleet only] To specify multiple Availability Zones, separate them using commas; for example, "us-west-2a, us-west-2b".
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for Spot Instances.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.clientsEc2Mod.Tenancy] = js.undefined
}
object SpotPlacement {
  
  inline def apply(): SpotPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotPlacement]
  }
  
  extension [Self <: SpotPlacement](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
