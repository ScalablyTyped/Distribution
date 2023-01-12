package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClientCertificateRequest extends StObject {
  
  /**
    * The identifier of the ClientCertificate resource to be described.
    */
  var clientCertificateId: String
}
object GetClientCertificateRequest {
  
  inline def apply(clientCertificateId: String): GetClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClientCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
  }
}
