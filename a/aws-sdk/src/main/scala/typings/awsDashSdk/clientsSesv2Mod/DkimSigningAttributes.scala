package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DkimSigningAttributes extends js.Object {
  /**
    * A private key that's used to generate a DKIM signature. The private key must use 1024-bit RSA encryption, and must be encoded using base64 encoding.
    */
  var DomainSigningPrivateKey: PrivateKey = js.native
  /**
    * A string that's used to identify a public key in the DNS configuration for a domain.
    */
  var DomainSigningSelector: Selector = js.native
}

object DkimSigningAttributes {
  @scala.inline
  def apply(DomainSigningPrivateKey: PrivateKey, DomainSigningSelector: Selector): DkimSigningAttributes = {
    val __obj = js.Dynamic.literal(DomainSigningPrivateKey = DomainSigningPrivateKey.asInstanceOf[js.Any], DomainSigningSelector = DomainSigningSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DkimSigningAttributes]
  }
}

