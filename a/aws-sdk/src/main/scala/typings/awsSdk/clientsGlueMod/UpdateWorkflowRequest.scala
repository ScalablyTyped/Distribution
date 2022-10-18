package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowRequest extends StObject {
  
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  
  /**
    * The description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * Name of the workflow to be updated.
    */
  var Name: NameString
}
object UpdateWorkflowRequest {
  
  inline def apply(Name: NameString): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
  
  extension [Self <: UpdateWorkflowRequest](x: Self) {
    
    inline def setDefaultRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "DefaultRunProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultRunPropertiesUndefined: Self = StObject.set(x, "DefaultRunProperties", js.undefined)
    
    inline def setDescription(value: GenericString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaxConcurrentRuns(value: NullableInteger): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
