package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveDraftAppVersionResourceMappingsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The names of the registered applications you want to remove from the resource mappings.
    */
  var appRegistryAppNames: js.UndefOr[EntityNameList] = js.undefined
  
  /**
    * The names of the Amazon Elastic Kubernetes Service clusters and namespaces you want to remove from the resource mappings.  This parameter accepts values in "eks-cluster/namespace" format. 
    */
  var eksSourceNames: js.UndefOr[String255List] = js.undefined
  
  /**
    * The names of the CloudFormation stacks you want to remove from the resource mappings.
    */
  var logicalStackNames: js.UndefOr[String255List] = js.undefined
  
  /**
    * The names of the resource groups you want to remove from the resource mappings.
    */
  var resourceGroupNames: js.UndefOr[EntityNameList] = js.undefined
  
  /**
    * The names of the resources you want to remove from the resource mappings.
    */
  var resourceNames: js.UndefOr[EntityNameList] = js.undefined
  
  /**
    * The names of the Terraform sources you want to remove from the resource mappings.
    */
  var terraformSourceNames: js.UndefOr[String255List] = js.undefined
}
object RemoveDraftAppVersionResourceMappingsRequest {
  
  inline def apply(appArn: Arn): RemoveDraftAppVersionResourceMappingsRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDraftAppVersionResourceMappingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveDraftAppVersionResourceMappingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppRegistryAppNames(value: EntityNameList): Self = StObject.set(x, "appRegistryAppNames", value.asInstanceOf[js.Any])
    
    inline def setAppRegistryAppNamesUndefined: Self = StObject.set(x, "appRegistryAppNames", js.undefined)
    
    inline def setAppRegistryAppNamesVarargs(value: EntityName*): Self = StObject.set(x, "appRegistryAppNames", js.Array(value*))
    
    inline def setEksSourceNames(value: String255List): Self = StObject.set(x, "eksSourceNames", value.asInstanceOf[js.Any])
    
    inline def setEksSourceNamesUndefined: Self = StObject.set(x, "eksSourceNames", js.undefined)
    
    inline def setEksSourceNamesVarargs(value: String255*): Self = StObject.set(x, "eksSourceNames", js.Array(value*))
    
    inline def setLogicalStackNames(value: String255List): Self = StObject.set(x, "logicalStackNames", value.asInstanceOf[js.Any])
    
    inline def setLogicalStackNamesUndefined: Self = StObject.set(x, "logicalStackNames", js.undefined)
    
    inline def setLogicalStackNamesVarargs(value: String255*): Self = StObject.set(x, "logicalStackNames", js.Array(value*))
    
    inline def setResourceGroupNames(value: EntityNameList): Self = StObject.set(x, "resourceGroupNames", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNamesUndefined: Self = StObject.set(x, "resourceGroupNames", js.undefined)
    
    inline def setResourceGroupNamesVarargs(value: EntityName*): Self = StObject.set(x, "resourceGroupNames", js.Array(value*))
    
    inline def setResourceNames(value: EntityNameList): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: EntityName*): Self = StObject.set(x, "resourceNames", js.Array(value*))
    
    inline def setTerraformSourceNames(value: String255List): Self = StObject.set(x, "terraformSourceNames", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourceNamesUndefined: Self = StObject.set(x, "terraformSourceNames", js.undefined)
    
    inline def setTerraformSourceNamesVarargs(value: String255*): Self = StObject.set(x, "terraformSourceNames", js.Array(value*))
  }
}
