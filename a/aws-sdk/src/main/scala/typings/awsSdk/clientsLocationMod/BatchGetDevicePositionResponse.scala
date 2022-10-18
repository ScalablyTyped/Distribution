package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDevicePositionResponse extends StObject {
  
  /**
    * Contains device position details such as the device ID, position, and timestamps for when the position was received and sampled.
    */
  var DevicePositions: DevicePositionList
  
  /**
    * Contains error details for each device that failed to send its position to the tracker resource.
    */
  var Errors: BatchGetDevicePositionErrorList
}
object BatchGetDevicePositionResponse {
  
  inline def apply(DevicePositions: DevicePositionList, Errors: BatchGetDevicePositionErrorList): BatchGetDevicePositionResponse = {
    val __obj = js.Dynamic.literal(DevicePositions = DevicePositions.asInstanceOf[js.Any], Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDevicePositionResponse]
  }
  
  extension [Self <: BatchGetDevicePositionResponse](x: Self) {
    
    inline def setDevicePositions(value: DevicePositionList): Self = StObject.set(x, "DevicePositions", value.asInstanceOf[js.Any])
    
    inline def setDevicePositionsVarargs(value: DevicePosition*): Self = StObject.set(x, "DevicePositions", js.Array(value*))
    
    inline def setErrors(value: BatchGetDevicePositionErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchGetDevicePositionError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
