package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPolicy extends js.Object {
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[ClientPolicyTls] = js.native
}

object ClientPolicy {
  @scala.inline
  def apply(tls: ClientPolicyTls = null): ClientPolicy = {
    val __obj = js.Dynamic.literal()
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPolicy]
  }
}

