package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeOffering extends StObject {
  
  /**
    * The instance type. For more information, see Instance types in the Amazon EC2 User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceType] = js.undefined
  
  /**
    * The identifier for the location. This depends on the location type. For example, if the location type is region, the location is the Region code (for example, us-east-2.)
    */
  var Location: js.UndefOr[typings.awsSdk.clientsEc2Mod.Location] = js.undefined
  
  /**
    * The location type.
    */
  var LocationType: js.UndefOr[typings.awsSdk.clientsEc2Mod.LocationType] = js.undefined
}
object InstanceTypeOffering {
  
  inline def apply(): InstanceTypeOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeOffering]
  }
  
  extension [Self <: InstanceTypeOffering](x: Self) {
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: LocationType): Self = StObject.set(x, "LocationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "LocationType", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
