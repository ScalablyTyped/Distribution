package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOnDemandAuditTaskResponse extends StObject {
  
  /**
    * The ID of the on-demand audit you started.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
}
object StartOnDemandAuditTaskResponse {
  
  inline def apply(): StartOnDemandAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartOnDemandAuditTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
