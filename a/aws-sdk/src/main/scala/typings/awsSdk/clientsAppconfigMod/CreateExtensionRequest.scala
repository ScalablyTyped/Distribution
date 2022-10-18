package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExtensionRequest extends StObject {
  
  /**
    * The actions defined in the extension.
    */
  var Actions: ActionsMap
  
  /**
    * Information about the extension.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * You can omit this field when you create an extension. When you create a new version, specify the most recent current version number. For example, you create version 3, enter 2 for this field.
    */
  var LatestVersionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
    */
  var Name: typings.awsSdk.clientsAppconfigMod.Name
  
  /**
    * The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object.
    */
  var Parameters: js.UndefOr[ParameterMap] = js.undefined
  
  /**
    * Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateExtensionRequest {
  
  inline def apply(Actions: ActionsMap, Name: Name): CreateExtensionRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExtensionRequest]
  }
  
  extension [Self <: CreateExtensionRequest](x: Self) {
    
    inline def setActions(value: ActionsMap): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLatestVersionNumber(value: Integer): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
