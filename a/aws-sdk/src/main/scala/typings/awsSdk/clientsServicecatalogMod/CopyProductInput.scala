package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
    */
  var CopyOptions: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.CopyOptions] = js.undefined
  
  /**
    *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
    */
  var IdempotencyToken: typings.awsSdk.clientsServicecatalogMod.IdempotencyToken
  
  /**
    * The Amazon Resource Name (ARN) of the source product.
    */
  var SourceProductArn: ProductArn
  
  /**
    * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
    */
  var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined
  
  /**
    * The identifier of the target product. By default, a new product is created.
    */
  var TargetProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * A name for the target product. The default is the name of the source product.
    */
  var TargetProductName: js.UndefOr[ProductViewName] = js.undefined
}
object CopyProductInput {
  
  inline def apply(IdempotencyToken: IdempotencyToken, SourceProductArn: ProductArn): CopyProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], SourceProductArn = SourceProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyProductInput]
  }
  
  extension [Self <: CopyProductInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setCopyOptions(value: CopyOptions): Self = StObject.set(x, "CopyOptions", value.asInstanceOf[js.Any])
    
    inline def setCopyOptionsUndefined: Self = StObject.set(x, "CopyOptions", js.undefined)
    
    inline def setCopyOptionsVarargs(value: CopyOption*): Self = StObject.set(x, "CopyOptions", js.Array(value*))
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setSourceProductArn(value: ProductArn): Self = StObject.set(x, "SourceProductArn", value.asInstanceOf[js.Any])
    
    inline def setSourceProvisioningArtifactIdentifiers(value: SourceProvisioningArtifactProperties): Self = StObject.set(x, "SourceProvisioningArtifactIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setSourceProvisioningArtifactIdentifiersUndefined: Self = StObject.set(x, "SourceProvisioningArtifactIdentifiers", js.undefined)
    
    inline def setSourceProvisioningArtifactIdentifiersVarargs(value: SourceProvisioningArtifactPropertiesMap*): Self = StObject.set(x, "SourceProvisioningArtifactIdentifiers", js.Array(value*))
    
    inline def setTargetProductId(value: Id): Self = StObject.set(x, "TargetProductId", value.asInstanceOf[js.Any])
    
    inline def setTargetProductIdUndefined: Self = StObject.set(x, "TargetProductId", js.undefined)
    
    inline def setTargetProductName(value: ProductViewName): Self = StObject.set(x, "TargetProductName", value.asInstanceOf[js.Any])
    
    inline def setTargetProductNameUndefined: Self = StObject.set(x, "TargetProductName", js.undefined)
  }
}
