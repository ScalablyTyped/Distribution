package typings.awsDashSdk.libCloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: Double
  var `CloudFront-Key-Pair-Id`: String
  var `CloudFront-Signature`: String
}

object CannedPolicy {
  @scala.inline
  def apply(`CloudFront-Expires`: Double, `CloudFront-Key-Pair-Id`: String, `CloudFront-Signature`: String): CannedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`)
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`)
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`)
    __obj.asInstanceOf[CannedPolicy]
  }
}

