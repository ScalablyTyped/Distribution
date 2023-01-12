package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTypeDeclaration extends StObject {
  
  /**
    * The description for the action type to be updated.
    */
  var description: js.UndefOr[ActionTypeDescription] = js.undefined
  
  /**
    * Information about the executor for an action type that was created with any supported integration model.
    */
  var executor: ActionTypeExecutor
  
  /**
    * The action category, owner, provider, and version of the action type to be updated.
    */
  var id: ActionTypeIdentifier
  
  /**
    * Details for the artifacts, such as application files, to be worked on by the action. For example, the minimum and maximum number of input artifacts allowed.
    */
  var inputArtifactDetails: ActionTypeArtifactDetails
  
  /**
    * Details for the output artifacts, such as a built application, that are the result of the action. For example, the minimum and maximum number of output artifacts allowed.
    */
  var outputArtifactDetails: ActionTypeArtifactDetails
  
  /**
    * Details identifying the accounts with permissions to use the action type.
    */
  var permissions: js.UndefOr[ActionTypePermissions] = js.undefined
  
  /**
    * The properties of the action type to be updated.
    */
  var properties: js.UndefOr[ActionTypeProperties] = js.undefined
  
  /**
    * The links associated with the action type to be updated.
    */
  var urls: js.UndefOr[ActionTypeUrls] = js.undefined
}
object ActionTypeDeclaration {
  
  inline def apply(
    executor: ActionTypeExecutor,
    id: ActionTypeIdentifier,
    inputArtifactDetails: ActionTypeArtifactDetails,
    outputArtifactDetails: ActionTypeArtifactDetails
  ): ActionTypeDeclaration = {
    val __obj = js.Dynamic.literal(executor = executor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTypeDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ActionTypeDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExecutor(value: ActionTypeExecutor): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
    
    inline def setId(value: ActionTypeIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactDetails(value: ActionTypeArtifactDetails): Self = StObject.set(x, "inputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactDetails(value: ActionTypeArtifactDetails): Self = StObject.set(x, "outputArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ActionTypePermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setProperties(value: ActionTypeProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: ActionTypeProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setUrls(value: ActionTypeUrls): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
  }
}
