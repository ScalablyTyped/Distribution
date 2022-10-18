package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutWorkflowRunPropertiesRequest extends StObject {
  
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString
  
  /**
    * The ID of the workflow run for which the run properties should be updated.
    */
  var RunId: IdString
  
  /**
    * The properties to put for the specified run.
    */
  var RunProperties: WorkflowRunProperties
}
object PutWorkflowRunPropertiesRequest {
  
  inline def apply(Name: NameString, RunId: IdString, RunProperties: WorkflowRunProperties): PutWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any], RunProperties = RunProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWorkflowRunPropertiesRequest]
  }
  
  extension [Self <: PutWorkflowRunPropertiesRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "RunProperties", value.asInstanceOf[js.Any])
  }
}
