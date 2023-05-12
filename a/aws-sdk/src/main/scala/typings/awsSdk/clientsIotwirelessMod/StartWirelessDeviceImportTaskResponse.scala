package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWirelessDeviceImportTaskResponse extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the import task.
    */
  var Arn: js.UndefOr[ImportTaskArn] = js.undefined
  
  /**
    * The import task ID.
    */
  var Id: js.UndefOr[ImportTaskId] = js.undefined
}
object StartWirelessDeviceImportTaskResponse {
  
  inline def apply(): StartWirelessDeviceImportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWirelessDeviceImportTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartWirelessDeviceImportTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImportTaskArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ImportTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
