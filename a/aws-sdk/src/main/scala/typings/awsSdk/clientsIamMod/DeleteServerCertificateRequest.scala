package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServerCertificateRequest extends StObject {
  
  /**
    * The name of the server certificate you want to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType
}
object DeleteServerCertificateRequest {
  
  inline def apply(ServerCertificateName: serverCertificateNameType): DeleteServerCertificateRequest = {
    val __obj = js.Dynamic.literal(ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServerCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
  }
}
