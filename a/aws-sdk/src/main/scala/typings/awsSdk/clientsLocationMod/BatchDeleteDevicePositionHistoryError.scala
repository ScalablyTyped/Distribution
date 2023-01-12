package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDevicePositionHistoryError extends StObject {
  
  /**
    * The ID of the device for this position.
    */
  var DeviceId: Id
  
  var Error: BatchItemError
}
object BatchDeleteDevicePositionHistoryError {
  
  inline def apply(DeviceId: Id, Error: BatchItemError): BatchDeleteDevicePositionHistoryError = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteDevicePositionHistoryError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteDevicePositionHistoryError] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setError(value: BatchItemError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
  }
}
