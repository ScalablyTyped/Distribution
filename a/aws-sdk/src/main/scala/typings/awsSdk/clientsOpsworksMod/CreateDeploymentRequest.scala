package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * The app ID. This parameter is required for app deployments, but not for other deployment commands.
    */
  var AppId: js.UndefOr[String] = js.undefined
  
  /**
    * A DeploymentCommand object that specifies the deployment command and any associated arguments.
    */
  var Command: DeploymentCommand
  
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A string that contains user-defined, custom JSON. You can use this parameter to override some corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes and Overriding Attributes With Custom JSON.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  
  /**
    * The instance IDs for the deployment targets.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The layer IDs for the deployment targets.
    */
  var LayerIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object CreateDeploymentRequest {
  
  inline def apply(Command: DeploymentCommand, StackId: String): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  extension [Self <: CreateDeploymentRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setCommand(value: DeploymentCommand): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    inline def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    inline def setInstanceIds(value: Strings): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setLayerIds(value: Strings): Self = StObject.set(x, "LayerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "LayerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: String*): Self = StObject.set(x, "LayerIds", js.Array(value*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
