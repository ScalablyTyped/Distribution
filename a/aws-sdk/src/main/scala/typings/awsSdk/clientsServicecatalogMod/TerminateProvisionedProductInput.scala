package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateProvisionedProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * If set to true, Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.IgnoreErrors] = js.undefined
  
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  
  /**
    * When this boolean parameter is set to true, the TerminateProvisionedProduct API deletes the Service Catalog provisioned product. However, it does not remove the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is false.
    */
  var RetainPhysicalResources: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.RetainPhysicalResources] = js.undefined
  
  /**
    * An idempotency token that uniquely identifies the termination request. This token is only valid during the termination process. After the provisioned product is terminated, subsequent requests to terminate the same provisioned product always return ResourceNotFound.
    */
  var TerminateToken: IdempotencyToken
}
object TerminateProvisionedProductInput {
  
  inline def apply(TerminateToken: IdempotencyToken): TerminateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(TerminateToken = TerminateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateProvisionedProductInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateProvisionedProductInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setIgnoreErrors(value: IgnoreErrors): Self = StObject.set(x, "IgnoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "IgnoreErrors", js.undefined)
    
    inline def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    inline def setProvisionedProductName(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    inline def setRetainPhysicalResources(value: RetainPhysicalResources): Self = StObject.set(x, "RetainPhysicalResources", value.asInstanceOf[js.Any])
    
    inline def setRetainPhysicalResourcesUndefined: Self = StObject.set(x, "RetainPhysicalResources", js.undefined)
    
    inline def setTerminateToken(value: IdempotencyToken): Self = StObject.set(x, "TerminateToken", value.asInstanceOf[js.Any])
  }
}
