package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExtensionAssociationRequest extends StObject {
  
  /**
    * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
    */
  var ExtensionIdentifier: Identifier
  
  /**
    * The version number of the extension. If not specified, AppConfig uses the maximum version of the extension.
    */
  var ExtensionVersionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The parameter names and values defined in the extensions. Extension parameters marked Required must be entered for this field.
    */
  var Parameters: js.UndefOr[ParameterValueMap] = js.undefined
  
  /**
    * The ARN of an application, configuration profile, or environment.
    */
  var ResourceIdentifier: Identifier
  
  /**
    * Adds one or more tags for the specified extension association. Tags are metadata that help you categorize resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateExtensionAssociationRequest {
  
  inline def apply(ExtensionIdentifier: Identifier, ResourceIdentifier: Identifier): CreateExtensionAssociationRequest = {
    val __obj = js.Dynamic.literal(ExtensionIdentifier = ExtensionIdentifier.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExtensionAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExtensionAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setExtensionIdentifier(value: Identifier): Self = StObject.set(x, "ExtensionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionNumber(value: Integer): Self = StObject.set(x, "ExtensionVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionNumberUndefined: Self = StObject.set(x, "ExtensionVersionNumber", js.undefined)
    
    inline def setParameters(value: ParameterValueMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setResourceIdentifier(value: Identifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
