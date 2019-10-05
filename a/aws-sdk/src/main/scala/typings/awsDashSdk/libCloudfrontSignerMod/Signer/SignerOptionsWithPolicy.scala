package typings.awsDashSdk.libCloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerOptionsWithPolicy extends js.Object {
  /**
    * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
    */
  var policy: String
}

object SignerOptionsWithPolicy {
  @scala.inline
  def apply(policy: String): SignerOptionsWithPolicy = {
    val __obj = js.Dynamic.literal(policy = policy)
  
    __obj.asInstanceOf[SignerOptionsWithPolicy]
  }
}

