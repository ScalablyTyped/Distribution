package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.WorkflowExport
import typings.awsSdk.clientsOmicsMod.WorkflowExportList
import typings.awsSdk.clientsOmicsMod.WorkflowId
import typings.awsSdk.clientsOmicsMod.WorkflowType
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetWorkflowRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetWorkflowRequestwaiterW extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
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
object GetWorkflowRequestwaiterW {
  
  inline def apply(id: WorkflowId): GetWorkflowRequestwaiterW = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRequestwaiterW]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowRequestwaiterW] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setExport(value: WorkflowExportList): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: WorkflowExport*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
