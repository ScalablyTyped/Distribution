package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionInput extends StObject {
  
  var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
  
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
  
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
  
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.undefined
  
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.undefined
  
  /**
    * Configuration data for an action execution with all variable references replaced with their real values for the execution.
    */
  var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.undefined
  
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object ActionExecutionInput {
  
  inline def apply(): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    inline def setActionTypeIdUndefined: Self = StObject.set(x, "actionTypeId", js.undefined)
    
    inline def setConfiguration(value: ActionConfigurationMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setInputArtifacts(value: ArtifactDetailList): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
    
    inline def setInputArtifactsVarargs(value: ArtifactDetail*): Self = StObject.set(x, "inputArtifacts", js.Array(value*))
    
    inline def setNamespace(value: ActionNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRegion(value: AWSRegionName): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResolvedConfiguration(value: ResolvedActionConfigurationMap): Self = StObject.set(x, "resolvedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResolvedConfigurationUndefined: Self = StObject.set(x, "resolvedConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
