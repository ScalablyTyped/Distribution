package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslConfiguration extends js.Object {
  /**
    * The contents of the certificate's domain.crt file.
    */
  var Certificate: String
  /**
    * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var Chain: js.UndefOr[String] = js.undefined
  /**
    * The private key; the contents of the certificate's domain.kex file.
    */
  var PrivateKey: String
}

object SslConfiguration {
  @scala.inline
  def apply(Certificate: String, PrivateKey: String, Chain: String = null): SslConfiguration = {
    val __obj = js.Dynamic.literal(Certificate = Certificate, PrivateKey = PrivateKey)
    if (Chain != null) __obj.updateDynamic("Chain")(Chain)
    __obj.asInstanceOf[SslConfiguration]
  }
}

