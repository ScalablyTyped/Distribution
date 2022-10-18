package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEvaluateGeofencesRequest extends StObject {
  
  /**
    * The geofence collection used in evaluating the position of devices against its geofences.
    */
  var CollectionName: ResourceName
  
  /**
    * Contains device details for each device to be evaluated against the given geofence collection.
    */
  var DevicePositionUpdates: BatchEvaluateGeofencesRequestDevicePositionUpdatesList
}
object BatchEvaluateGeofencesRequest {
  
  inline def apply(
    CollectionName: ResourceName,
    DevicePositionUpdates: BatchEvaluateGeofencesRequestDevicePositionUpdatesList
  ): BatchEvaluateGeofencesRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any], DevicePositionUpdates = DevicePositionUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEvaluateGeofencesRequest]
  }
  
  extension [Self <: BatchEvaluateGeofencesRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setDevicePositionUpdates(value: BatchEvaluateGeofencesRequestDevicePositionUpdatesList): Self = StObject.set(x, "DevicePositionUpdates", value.asInstanceOf[js.Any])
    
    inline def setDevicePositionUpdatesVarargs(value: DevicePositionUpdate*): Self = StObject.set(x, "DevicePositionUpdates", js.Array(value*))
  }
}
