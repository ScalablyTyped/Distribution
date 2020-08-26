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
  @scala.inline
  implicit class GetClientCertificateRequestOps[Self <: GetClientCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientCertificateId(value: String): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
  }
  
}

