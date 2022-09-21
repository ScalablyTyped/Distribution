package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionInvocation extends StObject {
  
  /**
    * The name of the action.
    */
  var ActionName: js.UndefOr[Name] = js.undefined
  
  /**
    * The error code when an extension invocation fails.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message when an extension invocation fails.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
    */
  var ExtensionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A system-generated ID for this invocation.
    */
  var InvocationId: js.UndefOr[Id] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
    */
  var Uri: js.UndefOr[typings.awsSdk.appconfigMod.Uri] = js.undefined
}
object ActionInvocation {
  
  inline def apply(): ActionInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionInvocation]
  }
  
  extension [Self <: ActionInvocation](x: Self) {
    
    inline def setActionName(value: Name): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdentifierUndefined: Self = StObject.set(x, "ExtensionIdentifier", js.undefined)
    
    inline def setInvocationId(value: Id): Self = StObject.set(x, "InvocationId", value.asInstanceOf[js.Any])
    
    inline def setInvocationIdUndefined: Self = StObject.set(x, "InvocationId", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setUri(value: Uri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "Uri", js.undefined)
  }
}
