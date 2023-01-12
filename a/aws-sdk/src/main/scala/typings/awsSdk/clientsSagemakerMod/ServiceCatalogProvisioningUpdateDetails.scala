package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCatalogProvisioningUpdateDetails extends StObject {
  
  /**
    * The ID of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[ServiceCatalogEntityId] = js.undefined
  
  /**
    * A list of key value pairs that you specify when you provision a product.
    */
  var ProvisioningParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProvisioningParameters] = js.undefined
}
object ServiceCatalogProvisioningUpdateDetails {
  
  inline def apply(): ServiceCatalogProvisioningUpdateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceCatalogProvisioningUpdateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceCatalogProvisioningUpdateDetails] (val x: Self) extends AnyVal {
    
    inline def setProvisioningArtifactId(value: ServiceCatalogEntityId): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    inline def setProvisioningParameters(value: ProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    inline def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    inline def setProvisioningParametersVarargs(value: ProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value*))
  }
}
