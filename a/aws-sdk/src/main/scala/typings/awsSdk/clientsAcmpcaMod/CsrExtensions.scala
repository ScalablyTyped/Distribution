package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsrExtensions extends StObject {
  
  /**
    * Indicates the purpose of the certificate and of the key contained in the certificate.
    */
  var KeyUsage: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.KeyUsage] = js.undefined
  
  /**
    * For CA certificates, provides a path to additional information pertaining to the CA, such as revocation and policy. For more information, see Subject Information Access in RFC 5280.
    */
  var SubjectInformationAccess: js.UndefOr[AccessDescriptionList] = js.undefined
}
object CsrExtensions {
  
  inline def apply(): CsrExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsrExtensions]
  }
  
  extension [Self <: CsrExtensions](x: Self) {
    
    inline def setKeyUsage(value: KeyUsage): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setSubjectInformationAccess(value: AccessDescriptionList): Self = StObject.set(x, "SubjectInformationAccess", value.asInstanceOf[js.Any])
    
    inline def setSubjectInformationAccessUndefined: Self = StObject.set(x, "SubjectInformationAccess", js.undefined)
    
    inline def setSubjectInformationAccessVarargs(value: AccessDescription*): Self = StObject.set(x, "SubjectInformationAccess", js.Array(value*))
  }
}
