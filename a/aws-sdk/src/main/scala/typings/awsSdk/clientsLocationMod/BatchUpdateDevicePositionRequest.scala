package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDevicePositionRequest extends StObject {
  
  /**
    * The name of the tracker resource to update.
    */
  var TrackerName: ResourceName
  
  /**
    * Contains the position update details for each device.
    */
  var Updates: BatchUpdateDevicePositionRequestUpdatesList
}
object BatchUpdateDevicePositionRequest {
  
  inline def apply(TrackerName: ResourceName, Updates: BatchUpdateDevicePositionRequestUpdatesList): BatchUpdateDevicePositionRequest = {
    val __obj = js.Dynamic.literal(TrackerName = TrackerName.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDevicePositionRequest]
  }
  
  extension [Self <: BatchUpdateDevicePositionRequest](x: Self) {
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: BatchUpdateDevicePositionRequestUpdatesList): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: DevicePositionUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
