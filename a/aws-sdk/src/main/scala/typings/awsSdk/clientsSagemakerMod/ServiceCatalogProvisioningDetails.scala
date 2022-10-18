package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCatalogProvisioningDetails extends StObject {
  
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. 
    */
  var PathId: js.UndefOr[ServiceCatalogEntityId] = js.undefined
  
  /**
    * The ID of the product to provision.
    */
  var ProductId: ServiceCatalogEntityId
  
  /**
    * The ID of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[ServiceCatalogEntityId] = js.undefined
  
  /**
    * A list of key value pairs that you specify when you provision a product.
    */
  var ProvisioningParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProvisioningParameters] = js.undefined
}
object ServiceCatalogProvisioningDetails {
  
  inline def apply(ProductId: ServiceCatalogEntityId): ServiceCatalogProvisioningDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCatalogProvisioningDetails]
  }
  
  extension [Self <: ServiceCatalogProvisioningDetails](x: Self) {
    
    inline def setPathId(value: ServiceCatalogEntityId): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    inline def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    inline def setProductId(value: ServiceCatalogEntityId): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactId(value: ServiceCatalogEntityId): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    inline def setProvisioningParameters(value: ProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    inline def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    inline def setProvisioningParametersVarargs(value: ProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value*))
  }
}
