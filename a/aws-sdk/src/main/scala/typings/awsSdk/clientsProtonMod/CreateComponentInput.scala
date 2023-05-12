package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentInput extends StObject {
  
  /**
    * The client token for the created component.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * An optional customer-provided description of the component.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the Proton environment that you want to associate this component with. You must specify this when you don't specify serviceInstanceName and serviceName.
    */
  var environmentName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A path to a manifest file that lists the Infrastructure as Code (IaC) file, template language, and rendering engine for infrastructure that a custom component provisions.
    */
  var manifest: TemplateManifestContents
  
  /**
    * The customer-provided name of the component.
    */
  var name: ResourceName
  
  /**
    * The name of the service instance that you want to attach this component to. If you don't specify this, the component isn't attached to any service instance. Specify both serviceInstanceName and serviceName or neither of them.
    */
  var serviceInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the service that serviceInstanceName is associated with. If you don't specify this, the component isn't attached to any service instance. Specify both serviceInstanceName and serviceName or neither of them.
    */
  var serviceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The service spec that you want the component to use to access service inputs. Set this only when you attach the component to a service instance.
    */
  var serviceSpec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * An optional list of metadata items that you can associate with the Proton component. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.  Components support a single IaC file, even if you use Terraform as your template language. 
    */
  var templateFile: TemplateFileContents
}
object CreateComponentInput {
  
  inline def apply(manifest: TemplateManifestContents, name: ResourceName, templateFile: TemplateFileContents): CreateComponentInput = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateFile = templateFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateComponentInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "environmentName", js.undefined)
    
    inline def setManifest(value: TemplateManifestContents): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceSpec(value: SpecContents): Self = StObject.set(x, "serviceSpec", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecUndefined: Self = StObject.set(x, "serviceSpec", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateFile(value: TemplateFileContents): Self = StObject.set(x, "templateFile", value.asInstanceOf[js.Any])
  }
}
