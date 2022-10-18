package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
  
  /**
    * The distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    * The name of the product.
    */
  var Name: ProductViewName
  
  /**
    * The owner of the product.
    */
  var Owner: ProductViewOwner
  
  /**
    * The type of product.
    */
  var ProductType: typings.awsSdk.clientsServicecatalogMod.ProductType
  
  /**
    * The configuration of the provisioning artifact. 
    */
  var ProvisioningArtifactParameters: ProvisioningArtifactProperties
  
  /**
    * The support information about the product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportDescription] = js.undefined
  
  /**
    * The contact email for product support.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportEmail] = js.undefined
  
  /**
    * The contact URL for product support.  ^https?:\/\// / is the pattern used to validate SupportUrl.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportUrl] = js.undefined
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.undefined
}
object CreateProductInput {
  
  inline def apply(
    IdempotencyToken: IdempotencyToken,
    Name: ProductViewName,
    Owner: ProductViewOwner,
    ProductType: ProductType,
    ProvisioningArtifactParameters: ProvisioningArtifactProperties
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductInput]
  }
  
  extension [Self <: CreateProductInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setDescription(value: ProductViewShortDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDistributor(value: ProductViewOwner): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    inline def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setProductType(value: ProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactParameters(value: ProvisioningArtifactProperties): Self = StObject.set(x, "ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    
    inline def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    inline def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    inline def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
    
    inline def setTags(value: AddTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
