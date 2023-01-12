package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClientCertificateRequest extends StObject {
  
  /**
    * The identifier of the ClientCertificate resource to be deleted.
    */
  var clientCertificateId: String
}
object DeleteClientCertificateRequest {
  
  inline def apply(clientCertificateId: String): DeleteClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClientCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
  }
}
