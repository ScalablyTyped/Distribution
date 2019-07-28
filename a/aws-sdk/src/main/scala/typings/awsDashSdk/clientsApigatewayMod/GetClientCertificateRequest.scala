package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientCertificateRequest extends js.Object {
  /**
    * [Required] The identifier of the ClientCertificate resource to be described.
    */
  var clientCertificateId: String
}

object GetClientCertificateRequest {
  @scala.inline
  def apply(clientCertificateId: String): GetClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId)
  
    __obj.asInstanceOf[GetClientCertificateRequest]
  }
}

