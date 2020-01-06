package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDigestResponse extends js.Object {
  /**
    * The 256-bit hash value representing the digest returned by a GetDigest request.
    */
  var Digest: typings.awsDashSdk.clientsQldbMod.Digest = js.native
  /**
    * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo.
    */
  var DigestTipAddress: ValueHolder = js.native
}

object GetDigestResponse {
  @scala.inline
  def apply(Digest: Digest, DigestTipAddress: ValueHolder): GetDigestResponse = {
    val __obj = js.Dynamic.literal(Digest = Digest.asInstanceOf[js.Any], DigestTipAddress = DigestTipAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDigestResponse]
  }
}

