package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityZonesRequest extends StObject {
  
  /**
    * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your opt-in status. If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
    */
  var AllAvailabilityZones: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    group-name - For Availability Zones, use the Region name. For Local Zones, use the name of the group associated with the Local Zone (for example, us-west-2-lax-1) For Wavelength Zones, use the name of the group associated with the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    message - The Zone message.    opt-in-status - The opt-in status (opted-in, and not-opted-in | opt-in-not-required).    parent-zoneID - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.    parent-zoneName - The ID of the zone that handles some of the Local Zone and Wavelength Zone control plane operations, such as API calls.    region-name - The name of the Region for the Zone (for example, us-east-1).    state - The state of the Availability Zone, the Local Zone, or the Wavelength Zone (available).    zone-id - The ID of the Availability Zone (for example, use1-az1), the Local Zone (for example, usw2-lax1-az1), or the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    zone-type - The type of zone, for example, local-zone.    zone-name - The name of the Availability Zone (for example, us-east-1a), the Local Zone (for example, us-west-2-lax-1a), or the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).    zone-type - The type of zone, for example, local-zone.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
    */
  var ZoneIds: js.UndefOr[ZoneIdStringList] = js.undefined
  
  /**
    * The names of the Availability Zones, Local Zones, and Wavelength Zones.
    */
  var ZoneNames: js.UndefOr[ZoneNameStringList] = js.undefined
}
object DescribeAvailabilityZonesRequest {
  
  inline def apply(): DescribeAvailabilityZonesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityZonesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAvailabilityZonesRequest] (val x: Self) extends AnyVal {
    
    inline def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "AllAvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "AllAvailabilityZones", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setZoneIds(value: ZoneIdStringList): Self = StObject.set(x, "ZoneIds", value.asInstanceOf[js.Any])
    
    inline def setZoneIdsUndefined: Self = StObject.set(x, "ZoneIds", js.undefined)
    
    inline def setZoneIdsVarargs(value: String*): Self = StObject.set(x, "ZoneIds", js.Array(value*))
    
    inline def setZoneNames(value: ZoneNameStringList): Self = StObject.set(x, "ZoneNames", value.asInstanceOf[js.Any])
    
    inline def setZoneNamesUndefined: Self = StObject.set(x, "ZoneNames", js.undefined)
    
    inline def setZoneNamesVarargs(value: String*): Self = StObject.set(x, "ZoneNames", js.Array(value*))
  }
}
