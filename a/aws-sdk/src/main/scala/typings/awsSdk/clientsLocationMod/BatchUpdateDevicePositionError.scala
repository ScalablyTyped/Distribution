package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDevicePositionError extends StObject {
  
  /**
    * The device associated with the failed location update.
    */
  var DeviceId: Id
  
  /**
    * Contains details related to the error code such as the error code and error message.
    */
  var Error: BatchItemError
  
  /**
    * The timestamp at which the device position was determined. Uses  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var SampleTime: js.Date
}
object BatchUpdateDevicePositionError {
  
  inline def apply(DeviceId: Id, Error: BatchItemError, SampleTime: js.Date): BatchUpdateDevicePositionError = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], SampleTime = SampleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDevicePositionError]
  }
  
  extension [Self <: BatchUpdateDevicePositionError](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setSampleTime(value: js.Date): Self = StObject.set(x, "SampleTime", value.asInstanceOf[js.Any])
  }
}
