package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClientCertificateRequest extends js.Object {
  /**
    * [Required] The identifier of the ClientCertificate resource to be deleted.
    */
  var clientCertificateId: String = js.native
}

object DeleteClientCertificateRequest {
  @scala.inline
  def apply(clientCertificateId: String): DeleteClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClientCertificateRequest]
  }
}

