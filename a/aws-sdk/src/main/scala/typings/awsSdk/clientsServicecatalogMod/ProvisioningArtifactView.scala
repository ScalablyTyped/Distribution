package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactView extends StObject {
  
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifact] = js.undefined
}
object ProvisioningArtifactView {
  
  inline def apply(): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
  
  extension [Self <: ProvisioningArtifactView](x: Self) {
    
    inline def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    inline def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    inline def setProvisioningArtifact(value: ProvisioningArtifact): Self = StObject.set(x, "ProvisioningArtifact", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactUndefined: Self = StObject.set(x, "ProvisioningArtifact", js.undefined)
  }
}
