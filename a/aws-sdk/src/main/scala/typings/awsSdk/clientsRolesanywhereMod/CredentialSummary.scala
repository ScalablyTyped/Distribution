package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialSummary extends StObject {
  
  /**
    * Indicates whether the credential is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the CreateSession operation was successful. 
    */
  var failed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fully qualified domain name of the issuing certificate for the presented end-entity certificate.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The ISO-8601 time stamp of when the certificate was last used in a CreateSession operation.
    */
  var seenAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The serial number of the certificate.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The PEM-encoded data of the certificate.
    */
  var x509CertificateData: js.UndefOr[String] = js.undefined
}
object CredentialSummary {
  
  inline def apply(): CredentialSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialSummary]
  }
  
  extension [Self <: CredentialSummary](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSeenAt(value: js.Date): Self = StObject.set(x, "seenAt", value.asInstanceOf[js.Any])
    
    inline def setSeenAtUndefined: Self = StObject.set(x, "seenAt", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setX509CertificateData(value: String): Self = StObject.set(x, "x509CertificateData", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateDataUndefined: Self = StObject.set(x, "x509CertificateData", js.undefined)
  }
}
