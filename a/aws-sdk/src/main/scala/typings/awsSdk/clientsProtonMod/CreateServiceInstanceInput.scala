package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceInstanceInput extends StObject {
  
  /**
    * The client token of the service instance to create.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The name of the service instance to create.
    */
  var name: ResourceName
  
  /**
    * The name of the service the service instance is added to.
    */
  var serviceName: ResourceName
  
  /**
    * The spec for the service instance you want to create.
    */
  var spec: SpecContents
  
  /**
    * An optional list of metadata items that you can associate with the Proton service instance. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * To create a new major and minor version of the service template, exclude major Version.
    */
  var templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * To create a new minor version of the service template, include a major Version.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
}
object CreateServiceInstanceInput {
  
  inline def apply(name: ResourceName, serviceName: ResourceName, spec: SpecContents): CreateServiceInstanceInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
