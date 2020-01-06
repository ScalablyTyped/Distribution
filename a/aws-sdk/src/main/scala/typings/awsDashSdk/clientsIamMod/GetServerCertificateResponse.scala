package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateResponse extends js.Object {
  /**
    * A structure containing details about the server certificate.
    */
  var ServerCertificate: typings.awsDashSdk.clientsIamMod.ServerCertificate = js.native
}

object GetServerCertificateResponse {
  @scala.inline
  def apply(ServerCertificate: ServerCertificate): GetServerCertificateResponse = {
    val __obj = js.Dynamic.literal(ServerCertificate = ServerCertificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServerCertificateResponse]
  }
}

