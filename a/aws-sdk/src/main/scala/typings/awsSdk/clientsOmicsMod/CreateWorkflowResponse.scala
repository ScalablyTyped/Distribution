package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowResponse extends StObject {
  
  /**
    * The workflow's ARN.
    */
  var arn: js.UndefOr[WorkflowArn] = js.undefined
  
  /**
    * The workflow's ID.
    */
  var id: js.UndefOr[WorkflowId] = js.undefined
  
  /**
    * The workflow's status.
    */
  var status: js.UndefOr[WorkflowStatus] = js.undefined
  
  /**
    * The workflow's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateWorkflowResponse {
  
  inline def apply(): CreateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkflowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkflowResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WorkflowArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: WorkflowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
