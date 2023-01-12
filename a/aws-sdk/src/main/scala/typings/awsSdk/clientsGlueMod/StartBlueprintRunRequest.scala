package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBlueprintRunRequest extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: OrchestrationNameString
  
  /**
    * Specifies the parameters as a BlueprintParameters object.
    */
  var Parameters: js.UndefOr[BlueprintParameters] = js.undefined
  
  /**
    * Specifies the IAM role used to create the workflow.
    */
  var RoleArn: OrchestrationIAMRoleArn
}
object StartBlueprintRunRequest {
  
  inline def apply(BlueprintName: OrchestrationNameString, RoleArn: OrchestrationIAMRoleArn): StartBlueprintRunRequest = {
    val __obj = js.Dynamic.literal(BlueprintName = BlueprintName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBlueprintRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBlueprintRunRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: OrchestrationNameString): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: BlueprintParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setRoleArn(value: OrchestrationIAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
