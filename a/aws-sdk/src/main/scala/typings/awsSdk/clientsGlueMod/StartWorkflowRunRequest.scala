package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkflowRunRequest extends StObject {
  
  /**
    * The name of the workflow to start.
    */
  var Name: NameString
  
  /**
    * The workflow run properties for the new workflow run.
    */
  var RunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
}
object StartWorkflowRunRequest {
  
  inline def apply(Name: NameString): StartWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkflowRunRequest]
  }
  
  extension [Self <: StartWorkflowRunRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "RunProperties", value.asInstanceOf[js.Any])
    
    inline def setRunPropertiesUndefined: Self = StObject.set(x, "RunProperties", js.undefined)
  }
}
