package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerCertificateIdentifier extends StObject {
  
  /**
    * The issuer certificate serial number.
    */
  var issuerCertificateSerialNumber: js.UndefOr[IssuerCertificateSerialNumber] = js.undefined
  
  /**
    * The subject of the issuer certificate.
    */
  var issuerCertificateSubject: js.UndefOr[IssuerCertificateSubject] = js.undefined
  
  /**
    * The issuer ID.
    */
  var issuerId: js.UndefOr[IssuerId] = js.undefined
}
object IssuerCertificateIdentifier {
  
  inline def apply(): IssuerCertificateIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerCertificateIdentifier]
  }
  
  extension [Self <: IssuerCertificateIdentifier](x: Self) {
    
    inline def setIssuerCertificateSerialNumber(value: IssuerCertificateSerialNumber): Self = StObject.set(x, "issuerCertificateSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificateSerialNumberUndefined: Self = StObject.set(x, "issuerCertificateSerialNumber", js.undefined)
    
    inline def setIssuerCertificateSubject(value: IssuerCertificateSubject): Self = StObject.set(x, "issuerCertificateSubject", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificateSubjectUndefined: Self = StObject.set(x, "issuerCertificateSubject", js.undefined)
    
    inline def setIssuerId(value: IssuerId): Self = StObject.set(x, "issuerId", value.asInstanceOf[js.Any])
    
    inline def setIssuerIdUndefined: Self = StObject.set(x, "issuerId", js.undefined)
  }
}
