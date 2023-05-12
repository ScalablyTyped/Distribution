package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWirelessDeviceImportTaskRequest extends StObject {
  
  /**
    * The identifier of the import task to be updated.
    */
  var Id: ImportTaskId
  
  /**
    * The Sidewalk-related parameters of the import task to be updated.
    */
  var Sidewalk: SidewalkUpdateImportInfo
}
object UpdateWirelessDeviceImportTaskRequest {
  
  inline def apply(Id: ImportTaskId, Sidewalk: SidewalkUpdateImportInfo): UpdateWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSidewalk(value: SidewalkUpdateImportInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
  }
}
