package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLocation extends StObject {
  
  /**
    * The Availability Zone. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region name.
    */
  var regionName: js.UndefOr[RegionName] = js.undefined
}
object ResourceLocation {
  
  inline def apply(): ResourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceLocation] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "regionName", js.undefined)
  }
}
