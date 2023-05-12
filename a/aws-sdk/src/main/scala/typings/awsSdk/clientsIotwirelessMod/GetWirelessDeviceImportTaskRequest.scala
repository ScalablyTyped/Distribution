package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessDeviceImportTaskRequest extends StObject {
  
  /**
    * The identifier of the import task for which information is requested.
    */
  var Id: ImportTaskId
}
object GetWirelessDeviceImportTaskRequest {
  
  inline def apply(Id: ImportTaskId): GetWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
