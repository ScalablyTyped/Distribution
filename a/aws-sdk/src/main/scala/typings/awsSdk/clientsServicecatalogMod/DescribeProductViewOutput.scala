package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProductViewOutput extends StObject {
  
  /**
    * Summary information about the product.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  
  /**
    * Information about the provisioning artifacts for the product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifacts] = js.undefined
}
object DescribeProductViewOutput {
  
  inline def apply(): DescribeProductViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductViewOutput]
  }
  
  extension [Self <: DescribeProductViewOutput](x: Self) {
    
    inline def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    inline def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    inline def setProvisioningArtifacts(value: ProvisioningArtifacts): Self = StObject.set(x, "ProvisioningArtifacts", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactsUndefined: Self = StObject.set(x, "ProvisioningArtifacts", js.undefined)
    
    inline def setProvisioningArtifactsVarargs(value: ProvisioningArtifact*): Self = StObject.set(x, "ProvisioningArtifacts", js.Array(value*))
  }
}
