package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExtensionRequest extends StObject {
  
  /**
    * The actions defined in the extension.
    */
  var Actions: js.UndefOr[ActionsMap] = js.undefined
  
  /**
    * Information about the extension.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.undefined
  
  /**
    * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
    */
  var ExtensionIdentifier: Identifier
  
  /**
    * One or more parameters for the actions called by the extension.
    */
  var Parameters: js.UndefOr[ParameterMap] = js.undefined
  
  /**
    * The extension version number.
    */
  var VersionNumber: js.UndefOr[Integer] = js.undefined
}
object UpdateExtensionRequest {
  
  inline def apply(ExtensionIdentifier: Identifier): UpdateExtensionRequest = {
    val __obj = js.Dynamic.literal(ExtensionIdentifier = ExtensionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExtensionRequest]
  }
  
  extension [Self <: UpdateExtensionRequest](x: Self) {
    
    inline def setActions(value: ActionsMap): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setVersionNumber(value: Integer): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
