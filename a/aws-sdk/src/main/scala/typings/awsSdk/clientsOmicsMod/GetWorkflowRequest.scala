package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRequest extends StObject {
  
  /**
    * The export format for the workflow.
    */
  var `export`: js.UndefOr[WorkflowExportList] = js.undefined
  
  /**
    * The workflow's ID.
    */
  var id: WorkflowId
  
  /**
    * The workflow's type.
    */
  var `type`: js.UndefOr[WorkflowType] = js.undefined
}
object GetWorkflowRequest {
  
  inline def apply(id: WorkflowId): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setExport(value: WorkflowExportList): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: WorkflowExport*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
