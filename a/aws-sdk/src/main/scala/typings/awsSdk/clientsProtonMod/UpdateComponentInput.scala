package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentInput extends StObject {
  
  /**
    * The deployment type. It defines the mode for updating a component, as follows:     NONE  In this mode, a deployment doesn't occur. Only the requested metadata parameters are updated. You can only specify description in this mode.     CURRENT_VERSION  In this mode, the component is deployed and updated with the new serviceSpec, templateSource, and/or type that you provide. Only requested parameters are updated.  
    */
  var deploymentType: ComponentDeploymentUpdateType
  
  /**
    * An optional customer-provided description of the component.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the component to update.
    */
  var name: ResourceName
  
  /**
    * The name of the service instance that you want to attach this component to. Don't specify to keep the component's current service instance attachment. Specify an empty string to detach the component from the service instance it's attached to. Specify non-empty values for both serviceInstanceName and serviceName or for neither of them.
    */
  var serviceInstanceName: js.UndefOr[ResourceNameOrEmpty] = js.undefined
  
  /**
    * The name of the service that serviceInstanceName is associated with. Don't specify to keep the component's current service instance attachment. Specify an empty string to detach the component from the service instance it's attached to. Specify non-empty values for both serviceInstanceName and serviceName or for neither of them.
    */
  var serviceName: js.UndefOr[ResourceNameOrEmpty] = js.undefined
  
  /**
    * The service spec that you want the component to use to access service inputs. Set this only when the component is attached to a service instance.
    */
  var serviceSpec: js.UndefOr[SpecContents] = js.undefined
  
  /**
    * A path to the Infrastructure as Code (IaC) file describing infrastructure that a custom component provisions.  Components support a single IaC file, even if you use Terraform as your template language. 
    */
  var templateFile: js.UndefOr[TemplateFileContents] = js.undefined
}
object UpdateComponentInput {
  
  inline def apply(deploymentType: ComponentDeploymentUpdateType, name: ResourceName): UpdateComponentInput = {
    val __obj = js.Dynamic.literal(deploymentType = deploymentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentInput]
  }
  
  extension [Self <: UpdateComponentInput](x: Self) {
    
    inline def setDeploymentType(value: ComponentDeploymentUpdateType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceName(value: ResourceNameOrEmpty): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceNameOrEmpty): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceSpec(value: SpecContents): Self = StObject.set(x, "serviceSpec", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecUndefined: Self = StObject.set(x, "serviceSpec", js.undefined)
    
    inline def setTemplateFile(value: TemplateFileContents): Self = StObject.set(x, "templateFile", value.asInstanceOf[js.Any])
    
    inline def setTemplateFileUndefined: Self = StObject.set(x, "templateFile", js.undefined)
  }
}
