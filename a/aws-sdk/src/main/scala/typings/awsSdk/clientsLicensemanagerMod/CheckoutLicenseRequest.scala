package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutLicenseRequest extends StObject {
  
  /**
    * License beneficiary.
    */
  var Beneficiary: js.UndefOr[String] = js.undefined
  
  /**
    * Checkout type.
    */
  var CheckoutType: typings.awsSdk.clientsLicensemanagerMod.CheckoutType
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * License entitlements.
    */
  var Entitlements: EntitlementDataList
  
  /**
    * Key fingerprint identifying the license.
    */
  var KeyFingerprint: String
  
  /**
    * Node ID.
    */
  var NodeId: js.UndefOr[String] = js.undefined
  
  /**
    * Product SKU.
    */
  var ProductSKU: String
}
object CheckoutLicenseRequest {
  
  inline def apply(
    CheckoutType: CheckoutType,
    ClientToken: ClientToken,
    Entitlements: EntitlementDataList,
    KeyFingerprint: String,
    ProductSKU: String
  ): CheckoutLicenseRequest = {
    val __obj = js.Dynamic.literal(CheckoutType = CheckoutType.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], KeyFingerprint = KeyFingerprint.asInstanceOf[js.Any], ProductSKU = ProductSKU.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutLicenseRequest]
  }
  
  extension [Self <: CheckoutLicenseRequest](x: Self) {
    
    inline def setBeneficiary(value: String): Self = StObject.set(x, "Beneficiary", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryUndefined: Self = StObject.set(x, "Beneficiary", js.undefined)
    
    inline def setCheckoutType(value: CheckoutType): Self = StObject.set(x, "CheckoutType", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setEntitlements(value: EntitlementDataList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: EntitlementData*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    inline def setProductSKU(value: String): Self = StObject.set(x, "ProductSKU", value.asInstanceOf[js.Any])
  }
}
