package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAsProvisionedProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    * The unique identifier of the resource to be imported. It only currently supports CloudFormation stack IDs.
    */
  var PhysicalId: typings.awsSdk.clientsServicecatalogMod.PhysicalId
  
  /**
    * The product identifier.
    */
  var ProductId: Id
  
  /**
    * The user-friendly name of the provisioned product. The value must be unique for the Amazon Web Services account. The name cannot be updated after the product is provisioned. 
    */
  var ProvisionedProductName: typings.awsSdk.clientsServicecatalogMod.ProvisionedProductName
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id
}
object ImportAsProvisionedProductInput {
  
  inline def apply(
    IdempotencyToken: IdempotencyToken,
    PhysicalId: PhysicalId,
    ProductId: Id,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id
  ): ImportAsProvisionedProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PhysicalId = PhysicalId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAsProvisionedProductInput]
  }
  
  extension [Self <: ImportAsProvisionedProductInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setPhysicalId(value: PhysicalId): Self = StObject.set(x, "PhysicalId", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
  }
}
