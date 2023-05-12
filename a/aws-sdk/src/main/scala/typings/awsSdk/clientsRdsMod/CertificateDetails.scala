package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateDetails extends StObject {
  
  /**
    * The CA identifier of the CA certificate used for the DB instance's server certificate.
    */
  var CAIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The expiration date of the DB instance’s server certificate.
    */
  var ValidTill: js.UndefOr[js.Date] = js.undefined
}
object CertificateDetails {
  
  inline def apply(): CertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateDetails] (val x: Self) extends AnyVal {
    
    inline def setCAIdentifier(value: String): Self = StObject.set(x, "CAIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCAIdentifierUndefined: Self = StObject.set(x, "CAIdentifier", js.undefined)
    
    inline def setValidTill(value: js.Date): Self = StObject.set(x, "ValidTill", value.asInstanceOf[js.Any])
    
    inline def setValidTillUndefined: Self = StObject.set(x, "ValidTill", js.undefined)
  }
}
