package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerDetails extends StObject {
  
  /**
    * Issuer key fingerprint.
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Issuer name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Asymmetric KMS key from Key Management Service. The KMS key must have a key usage of sign and verify, and support the RSASSA-PSS SHA-256 signing algorithm.
    */
  var SignKey: js.UndefOr[String] = js.undefined
}
object IssuerDetails {
  
  inline def apply(): IssuerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuerDetails] (val x: Self) extends AnyVal {
    
    inline def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setKeyFingerprintUndefined: Self = StObject.set(x, "KeyFingerprint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSignKey(value: String): Self = StObject.set(x, "SignKey", value.asInstanceOf[js.Any])
    
    inline def setSignKeyUndefined: Self = StObject.set(x, "SignKey", js.undefined)
  }
}
