package typings
package awsDashSdkLib.libCloudfrontSignerMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerOptionsWithPolicy extends js.Object {
  /**
    * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
    */
  var policy: java.lang.String
}

object SignerOptionsWithPolicy {
  @scala.inline
  def apply(policy: java.lang.String): SignerOptionsWithPolicy = {
    val __obj = js.Dynamic.literal(policy = policy)
  
    __obj.asInstanceOf[SignerOptionsWithPolicy]
  }
}

