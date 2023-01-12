package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate. Example: arn:aws:rds:us-east-1::cert:rds-ca-2019 
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique key that identifies a certificate. Example: rds-ca-2019 
    */
  var CertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the certificate. Example: CA 
    */
  var CertificateType: js.UndefOr[String] = js.undefined
  
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.undefined
  
  /**
    * The starting date-time from which the certificate is valid. Example: 2019-07-31T17:57:09Z 
    */
  var ValidFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date-time after which the certificate is no longer valid. Example: 2024-07-31T17:57:09Z 
    */
  var ValidTill: js.UndefOr[js.Date] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    inline def setCertificateType(value: String): Self = StObject.set(x, "CertificateType", value.asInstanceOf[js.Any])
    
    inline def setCertificateTypeUndefined: Self = StObject.set(x, "CertificateType", js.undefined)
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "Thumbprint", js.undefined)
    
    inline def setValidFrom(value: js.Date): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    inline def setValidTill(value: js.Date): Self = StObject.set(x, "ValidTill", value.asInstanceOf[js.Any])
    
    inline def setValidTillUndefined: Self = StObject.set(x, "ValidTill", js.undefined)
  }
}
