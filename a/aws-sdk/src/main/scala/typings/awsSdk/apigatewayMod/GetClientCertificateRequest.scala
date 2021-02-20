package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClientCertificateRequest extends StObject {
  
  /**
    * [Required] The identifier of the ClientCertificate resource to be described.
    */
  var clientCertificateId: String = js.native
}
object GetClientCertificateRequest {
  
  @scala.inline
  def apply(clientCertificateId: String): GetClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientCertificateRequest]
  }
  
  @scala.inline
  implicit class GetClientCertificateRequestMutableBuilder[Self <: GetClientCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientCertificateId(value: String): Self = StObject.set(x, "clientCertificateId", value.asInstanceOf[js.Any])
  }
}
