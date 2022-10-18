package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerCertificateRequest extends StObject {
  
  /**
    * The new path for the server certificate. Include this only if you are updating the server certificate's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.undefined
  
  /**
    * The new name for the server certificate. Include this only if you are updating the server certificate's name. The name of the certificate cannot contain any spaces. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var NewServerCertificateName: js.UndefOr[serverCertificateNameType] = js.undefined
  
  /**
    * The name of the server certificate that you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType
}
object UpdateServerCertificateRequest {
  
  inline def apply(ServerCertificateName: serverCertificateNameType): UpdateServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerCertificateRequest]
  }
  
  extension [Self <: UpdateServerCertificateRequest](x: Self) {
    
    inline def setNewPath(value: pathType): Self = StObject.set(x, "NewPath", value.asInstanceOf[js.Any])
    
    inline def setNewPathUndefined: Self = StObject.set(x, "NewPath", js.undefined)
    
    inline def setNewServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "NewServerCertificateName", value.asInstanceOf[js.Any])
    
    inline def setNewServerCertificateNameUndefined: Self = StObject.set(x, "NewServerCertificateName", js.undefined)
    
    inline def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
  }
}
