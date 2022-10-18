package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSigningCertificateRequest extends StObject {
  
  /**
    * The contents of the signing certificate. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var CertificateBody: certificateBodyType
  
  /**
    * The name of the user the signing certificate is for. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}
object UploadSigningCertificateRequest {
  
  inline def apply(CertificateBody: certificateBodyType): UploadSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSigningCertificateRequest]
  }
  
  extension [Self <: UploadSigningCertificateRequest](x: Self) {
    
    inline def setCertificateBody(value: certificateBodyType): Self = StObject.set(x, "CertificateBody", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
