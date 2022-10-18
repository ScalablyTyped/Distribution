package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSigningCertificateRequest extends StObject {
  
  /**
    * The ID of the signing certificate to delete. The format of this parameter, as described by its regex pattern, is a string of characters that can be upper- or lower-cased letters or digits.
    */
  var CertificateId: certificateIdType
  
  /**
    * The name of the user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object DeleteSigningCertificateRequest {
  
  inline def apply(CertificateId: certificateIdType): DeleteSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSigningCertificateRequest]
  }
  
  extension [Self <: DeleteSigningCertificateRequest](x: Self) {
    
    inline def setCertificateId(value: certificateIdType): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
