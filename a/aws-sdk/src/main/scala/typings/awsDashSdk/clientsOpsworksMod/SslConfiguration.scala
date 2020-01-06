package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslConfiguration extends js.Object {
  /**
    * The contents of the certificate's domain.crt file.
    */
  var Certificate: String = js.native
  /**
    * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var Chain: js.UndefOr[String] = js.native
  /**
    * The private key; the contents of the certificate's domain.kex file.
    */
  var PrivateKey: String = js.native
}

object SslConfiguration {
  @scala.inline
  def apply(Certificate: String, PrivateKey: String, Chain: String = null): SslConfiguration = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    if (Chain != null) __obj.updateDynamic("Chain")(Chain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslConfiguration]
  }
}

