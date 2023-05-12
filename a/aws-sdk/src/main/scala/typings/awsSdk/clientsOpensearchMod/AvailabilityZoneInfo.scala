package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZoneInfo extends StObject {
  
  /**
    * The name of the Availability Zone.
    */
  var AvailabilityZoneName: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * The number of data nodes active in the Availability Zone.
    */
  var AvailableDataNodeCount: js.UndefOr[NumberOfNodes] = js.undefined
  
  /**
    * The total number of data nodes configured in the Availability Zone.
    */
  var ConfiguredDataNodeCount: js.UndefOr[NumberOfNodes] = js.undefined
  
  /**
    * The total number of primary and replica shards in the Availability Zone.
    */
  var TotalShards: js.UndefOr[NumberOfShards] = js.undefined
  
  /**
    * The total number of primary and replica shards that aren't allocated to any of the nodes in the Availability Zone.
    */
  var TotalUnAssignedShards: js.UndefOr[NumberOfShards] = js.undefined
  
  /**
    * The current state of the Availability Zone. Current options are Active and StandBy.    Active - Data nodes in the Availability Zone are in use.    StandBy - Data nodes in the Availability Zone are in a standby state.    NotAvailable - Unable to retrieve information.  
    */
  var ZoneStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ZoneStatus] = js.undefined
}
object AvailabilityZoneInfo {
  
  inline def apply(): AvailabilityZoneInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZoneInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityZoneInfo] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneName(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    inline def setAvailableDataNodeCount(value: NumberOfNodes): Self = StObject.set(x, "AvailableDataNodeCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableDataNodeCountUndefined: Self = StObject.set(x, "AvailableDataNodeCount", js.undefined)
    
    inline def setConfiguredDataNodeCount(value: NumberOfNodes): Self = StObject.set(x, "ConfiguredDataNodeCount", value.asInstanceOf[js.Any])
    
    inline def setConfiguredDataNodeCountUndefined: Self = StObject.set(x, "ConfiguredDataNodeCount", js.undefined)
    
    inline def setTotalShards(value: NumberOfShards): Self = StObject.set(x, "TotalShards", value.asInstanceOf[js.Any])
    
    inline def setTotalShardsUndefined: Self = StObject.set(x, "TotalShards", js.undefined)
    
    inline def setTotalUnAssignedShards(value: NumberOfShards): Self = StObject.set(x, "TotalUnAssignedShards", value.asInstanceOf[js.Any])
    
    inline def setTotalUnAssignedShardsUndefined: Self = StObject.set(x, "TotalUnAssignedShards", js.undefined)
    
    inline def setZoneStatus(value: ZoneStatus): Self = StObject.set(x, "ZoneStatus", value.asInstanceOf[js.Any])
    
    inline def setZoneStatusUndefined: Self = StObject.set(x, "ZoneStatus", js.undefined)
  }
}
