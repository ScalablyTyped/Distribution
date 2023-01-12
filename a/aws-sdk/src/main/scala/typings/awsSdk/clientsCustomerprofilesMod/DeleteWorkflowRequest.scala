package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkflowRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: string1To255
}
object DeleteWorkflowRequest {
  
  inline def apply(DomainName: name, WorkflowId: string1To255): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: string1To255): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
