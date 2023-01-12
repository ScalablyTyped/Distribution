package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisioningClaimResponse extends StObject {
  
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The provisioning claim certificate.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * The provisioning claim expiration time.
    */
  var expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The provisioning claim key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
}
object CreateProvisioningClaimResponse {
  
  inline def apply(): CreateProvisioningClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningClaimResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProvisioningClaimResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
