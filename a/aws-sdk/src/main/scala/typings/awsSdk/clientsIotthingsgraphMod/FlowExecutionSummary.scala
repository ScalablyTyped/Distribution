package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowExecutionSummary extends StObject {
  
  /**
    * The date and time when the flow execution summary was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined
  
  /**
    * The ID of the flow.
    */
  var flowTemplateId: js.UndefOr[Urn] = js.undefined
  
  /**
    * The current status of the flow execution.
    */
  var status: js.UndefOr[FlowExecutionStatus] = js.undefined
  
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: js.UndefOr[Urn] = js.undefined
  
  /**
    * The date and time when the flow execution summary was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object FlowExecutionSummary {
  
  inline def apply(): FlowExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowExecutionSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFlowExecutionId(value: FlowExecutionId): Self = StObject.set(x, "flowExecutionId", value.asInstanceOf[js.Any])
    
    inline def setFlowExecutionIdUndefined: Self = StObject.set(x, "flowExecutionId", js.undefined)
    
    inline def setFlowTemplateId(value: Urn): Self = StObject.set(x, "flowTemplateId", value.asInstanceOf[js.Any])
    
    inline def setFlowTemplateIdUndefined: Self = StObject.set(x, "flowTemplateId", js.undefined)
    
    inline def setStatus(value: FlowExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSystemInstanceId(value: Urn): Self = StObject.set(x, "systemInstanceId", value.asInstanceOf[js.Any])
    
    inline def setSystemInstanceIdUndefined: Self = StObject.set(x, "systemInstanceId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
