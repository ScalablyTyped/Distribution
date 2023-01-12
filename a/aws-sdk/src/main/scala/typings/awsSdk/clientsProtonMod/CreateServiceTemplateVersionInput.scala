package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceTemplateVersionInput extends StObject {
  
  /**
    * When included, if two identical requests are made with the same client token, Proton returns the service template version that the first request created.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * An array of environment template objects that are compatible with the new service template version. A service instance based on this service template version can run in environments based on compatible templates.
    */
  var compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateInputList
  
  /**
    * A description of the new version of a service template.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * To create a new minor version of the service template, include a major Version. To create a new major and minor version of the service template, exclude major Version.
    */
  var majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * An object that includes the template bundle S3 bucket path and name for the new version of a service template.
    */
  var source: TemplateVersionSourceInput
  
  /**
    * An array of supported component sources. Components with supported sources can be attached to service instances based on this service template version. For more information about components, see Proton components in the Proton User Guide.
    */
  var supportedComponentSources: js.UndefOr[ServiceTemplateSupportedComponentSourceInputList] = js.undefined
  
  /**
    * An optional list of metadata items that you can associate with the Proton service template version. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object CreateServiceTemplateVersionInput {
  
  inline def apply(
    compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateInputList,
    source: TemplateVersionSourceInput,
    templateName: ResourceName
  ): CreateServiceTemplateVersionInput = {
    val __obj = js.Dynamic.literal(compatibleEnvironmentTemplates = compatibleEnvironmentTemplates.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceTemplateVersionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceTemplateVersionInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCompatibleEnvironmentTemplates(value: CompatibleEnvironmentTemplateInputList): Self = StObject.set(x, "compatibleEnvironmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setCompatibleEnvironmentTemplatesVarargs(value: CompatibleEnvironmentTemplateInput*): Self = StObject.set(x, "compatibleEnvironmentTemplates", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setSource(value: TemplateVersionSourceInput): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSupportedComponentSources(value: ServiceTemplateSupportedComponentSourceInputList): Self = StObject.set(x, "supportedComponentSources", value.asInstanceOf[js.Any])
    
    inline def setSupportedComponentSourcesUndefined: Self = StObject.set(x, "supportedComponentSources", js.undefined)
    
    inline def setSupportedComponentSourcesVarargs(value: ServiceTemplateSupportedComponentSourceType*): Self = StObject.set(x, "supportedComponentSources", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
