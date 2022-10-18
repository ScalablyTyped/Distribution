package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelImportTaskRequest extends StObject {
  
  /**
    * The reason for canceling the task.
    */
  var CancelReason: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the import image or import snapshot task to be canceled.
    */
  var ImportTaskId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImportTaskId] = js.undefined
}
object CancelImportTaskRequest {
  
  inline def apply(): CancelImportTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskRequest]
  }
  
  extension [Self <: CancelImportTaskRequest](x: Self) {
    
    inline def setCancelReason(value: String): Self = StObject.set(x, "CancelReason", value.asInstanceOf[js.Any])
    
    inline def setCancelReasonUndefined: Self = StObject.set(x, "CancelReason", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImportTaskId(value: ImportTaskId): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
  }
}
