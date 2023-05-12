package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWirelessDeviceImportTaskRequest extends StObject {
  
  /**
    * The unique identifier of the import task to be deleted.
    */
  var Id: ImportTaskId
}
object DeleteWirelessDeviceImportTaskRequest {
  
  inline def apply(Id: ImportTaskId): DeleteWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
