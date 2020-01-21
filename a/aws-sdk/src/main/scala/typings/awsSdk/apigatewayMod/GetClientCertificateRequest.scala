package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClientCertificateRequest extends js.Object {
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
}

