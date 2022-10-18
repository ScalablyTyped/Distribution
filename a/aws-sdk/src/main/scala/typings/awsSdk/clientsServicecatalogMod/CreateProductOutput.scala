package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProductOutput extends StObject {
  
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProductViewDetail] = js.undefined
  
  /**
    * Information about the provisioning artifact. 
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifactDetail] = js.undefined
  
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Tags] = js.undefined
}
object CreateProductOutput {
  
  inline def apply(): CreateProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProductOutput]
  }
  
  extension [Self <: CreateProductOutput](x: Self) {
    
    inline def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
    
    inline def setProductViewDetailUndefined: Self = StObject.set(x, "ProductViewDetail", js.undefined)
    
    inline def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = StObject.set(x, "ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactDetailUndefined: Self = StObject.set(x, "ProvisioningArtifactDetail", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
