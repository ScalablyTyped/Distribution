package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutBorrowLicenseRequest extends StObject {
  
  /**
    * Information about constraints.
    */
  var CheckoutMetadata: js.UndefOr[MetadataList] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * Digital signature method. The possible value is JSON Web Signature (JWS) algorithm PS384. For more information, see RFC 7518 Digital Signature with RSASSA-PSS.
    */
  var DigitalSignatureMethod: typings.awsSdk.clientsLicensemanagerMod.DigitalSignatureMethod
  
  /**
    * License entitlements. Partial checkouts are not supported.
    */
  var Entitlements: EntitlementDataList
  
  /**
    * Amazon Resource Name (ARN) of the license. The license must use the borrow consumption configuration.
    */
  var LicenseArn: Arn
  
  /**
    * Node ID.
    */
  var NodeId: js.UndefOr[String] = js.undefined
}
object CheckoutBorrowLicenseRequest {
  
  inline def apply(
    ClientToken: ClientToken,
    DigitalSignatureMethod: DigitalSignatureMethod,
    Entitlements: EntitlementDataList,
    LicenseArn: Arn
  ): CheckoutBorrowLicenseRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DigitalSignatureMethod = DigitalSignatureMethod.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutBorrowLicenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutBorrowLicenseRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckoutMetadata(value: MetadataList): Self = StObject.set(x, "CheckoutMetadata", value.asInstanceOf[js.Any])
    
    inline def setCheckoutMetadataUndefined: Self = StObject.set(x, "CheckoutMetadata", js.undefined)
    
    inline def setCheckoutMetadataVarargs(value: Metadata*): Self = StObject.set(x, "CheckoutMetadata", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDigitalSignatureMethod(value: DigitalSignatureMethod): Self = StObject.set(x, "DigitalSignatureMethod", value.asInstanceOf[js.Any])
    
    inline def setEntitlements(value: EntitlementDataList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: EntitlementData*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
  }
}
