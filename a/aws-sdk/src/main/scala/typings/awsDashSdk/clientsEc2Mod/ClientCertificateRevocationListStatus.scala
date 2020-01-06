package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateRevocationListStatus extends js.Object {
  /**
    * The state of the client certificate revocation list.
    */
  var Code: js.UndefOr[ClientCertificateRevocationListStatusCode] = js.native
  /**
    * A message about the status of the client certificate revocation list, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientCertificateRevocationListStatus {
  @scala.inline
  def apply(Code: ClientCertificateRevocationListStatusCode = null, Message: String = null): ClientCertificateRevocationListStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateRevocationListStatus]
  }
}

