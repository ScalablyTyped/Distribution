package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZone extends StObject {
  
  /**
    *  For Availability Zones, this parameter has the same value as the Region name. For Local Zones, the name of the associated group, for example us-west-2-lax-1. For Wavelength Zones, the name of the associated group, for example us-east-1-wl1-bos-wlz-1.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Any messages about the Availability Zone, Local Zone, or Wavelength Zone.
    */
  var Messages: js.UndefOr[AvailabilityZoneMessageList] = js.undefined
  
  /**
    * The name of the network border group.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * For Availability Zones, this parameter always has the value of opt-in-not-required. For Local Zones and Wavelength Zones, this parameter is the opt-in status. The possible values are opted-in, and not-opted-in.
    */
  var OptInStatus: js.UndefOr[AvailabilityZoneOptInStatus] = js.undefined
  
  /**
    * The ID of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
    */
  var ParentZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
    */
  var ParentZoneName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the Availability Zone, Local Zone, or Wavelength Zone. This value is always available.
    */
  var State: js.UndefOr[AvailabilityZoneState] = js.undefined
  
  /**
    * The ID of the Availability Zone, Local Zone, or Wavelength Zone.
    */
  var ZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Availability Zone, Local Zone, or Wavelength Zone.
    */
  var ZoneName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of zone. The valid values are availability-zone, local-zone, and wavelength-zone.
    */
  var ZoneType: js.UndefOr[String] = js.undefined
}
object AvailabilityZone {
  
  inline def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setMessages(value: AvailabilityZoneMessageList): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: AvailabilityZoneMessage*): Self = StObject.set(x, "Messages", js.Array(value*))
    
    inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    inline def setOptInStatus(value: AvailabilityZoneOptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
    
    inline def setParentZoneId(value: String): Self = StObject.set(x, "ParentZoneId", value.asInstanceOf[js.Any])
    
    inline def setParentZoneIdUndefined: Self = StObject.set(x, "ParentZoneId", js.undefined)
    
    inline def setParentZoneName(value: String): Self = StObject.set(x, "ParentZoneName", value.asInstanceOf[js.Any])
    
    inline def setParentZoneNameUndefined: Self = StObject.set(x, "ParentZoneName", js.undefined)
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setState(value: AvailabilityZoneState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setZoneId(value: String): Self = StObject.set(x, "ZoneId", value.asInstanceOf[js.Any])
    
    inline def setZoneIdUndefined: Self = StObject.set(x, "ZoneId", js.undefined)
    
    inline def setZoneName(value: String): Self = StObject.set(x, "ZoneName", value.asInstanceOf[js.Any])
    
    inline def setZoneNameUndefined: Self = StObject.set(x, "ZoneName", js.undefined)
    
    inline def setZoneType(value: String): Self = StObject.set(x, "ZoneType", value.asInstanceOf[js.Any])
    
    inline def setZoneTypeUndefined: Self = StObject.set(x, "ZoneType", js.undefined)
  }
}
