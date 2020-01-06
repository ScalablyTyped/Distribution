package typings.awsDashSdk.libCloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerOptionsWithoutPolicy extends js.Object {
  /**
    * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
    */
  var expires: Double = js.native
  /**
    * The URL to which the signature will grant access. Required unless you pass in a full policy.
    */
  var url: String = js.native
}

object SignerOptionsWithoutPolicy {
  @scala.inline
  def apply(expires: Double, url: String): SignerOptionsWithoutPolicy = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignerOptionsWithoutPolicy]
  }
}

