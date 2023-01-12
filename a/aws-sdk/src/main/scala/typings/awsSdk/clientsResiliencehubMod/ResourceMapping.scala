package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceMapping extends StObject {
  
  /**
    * The name of the application this resource is mapped to.
    */
  var appRegistryAppName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the CloudFormation stack this resource is mapped to.
    */
  var logicalStackName: js.UndefOr[String255] = js.undefined
  
  /**
    * Specifies the type of resource mapping.  AppRegistryApp  The resource is mapped to another application. The name of the application is contained in the appRegistryAppName property.  CfnStack  The resource is mapped to a CloudFormation stack. The name of the CloudFormation stack is contained in the logicalStackName property.  Resource  The resource is mapped to another resource. The name of the resource is contained in the resourceName property.  ResourceGroup  The resource is mapped to a resource group. The name of the resource group is contained in the resourceGroupName property.  
    */
  var mappingType: ResourceMappingType
  
  /**
    * The identifier of this resource.
    */
  var physicalResourceId: PhysicalResourceId
  
  /**
    * The name of the resource group this resource is mapped to.
    */
  var resourceGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the resource this resource is mapped to.
    */
  var resourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    *  The short name of the Terraform source. 
    */
  var terraformSourceName: js.UndefOr[String255] = js.undefined
}
object ResourceMapping {
  
  inline def apply(mappingType: ResourceMappingType, physicalResourceId: PhysicalResourceId): ResourceMapping = {
    val __obj = js.Dynamic.literal(mappingType = mappingType.asInstanceOf[js.Any], physicalResourceId = physicalResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceMapping] (val x: Self) extends AnyVal {
    
    inline def setAppRegistryAppName(value: EntityName): Self = StObject.set(x, "appRegistryAppName", value.asInstanceOf[js.Any])
    
    inline def setAppRegistryAppNameUndefined: Self = StObject.set(x, "appRegistryAppName", js.undefined)
    
    inline def setLogicalStackName(value: String255): Self = StObject.set(x, "logicalStackName", value.asInstanceOf[js.Any])
    
    inline def setLogicalStackNameUndefined: Self = StObject.set(x, "logicalStackName", js.undefined)
    
    inline def setMappingType(value: ResourceMappingType): Self = StObject.set(x, "mappingType", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupName(value: EntityName): Self = StObject.set(x, "resourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "resourceGroupName", js.undefined)
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setTerraformSourceName(value: String255): Self = StObject.set(x, "terraformSourceName", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourceNameUndefined: Self = StObject.set(x, "terraformSourceName", js.undefined)
  }
}
