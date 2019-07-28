package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClientCertificateRequest extends js.Object {
  /**
    * [Required] The identifier of the ClientCertificate resource to be deleted.
    */
  var clientCertificateId: String
}

object DeleteClientCertificateRequest {
  @scala.inline
  def apply(clientCertificateId: String): DeleteClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId)
  
    __obj.asInstanceOf[DeleteClientCertificateRequest]
  }
}

