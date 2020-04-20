package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsValidationContext extends js.Object {
  /**
    * A reference to an object that represents a TLS validation context trust.
    */
  var trust: TlsValidationContextTrust = js.native
}

object TlsValidationContext {
  @scala.inline
  def apply(trust: TlsValidationContextTrust): TlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContext]
  }
}

