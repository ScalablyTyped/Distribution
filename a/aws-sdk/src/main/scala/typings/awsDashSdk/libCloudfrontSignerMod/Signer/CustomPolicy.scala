package typings.awsDashSdk.libCloudfrontSignerMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPolicy extends js.Object {
  var `CloudFront-Key-Pair-Id`: String
  var `CloudFront-Policy`: String
  var `CloudFront-Signature`: String
}

object CustomPolicy {
  @scala.inline
  def apply(`CloudFront-Key-Pair-Id`: String, `CloudFront-Policy`: String, `CloudFront-Signature`: String): CustomPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`)
    __obj.updateDynamic("CloudFront-Policy")(`CloudFront-Policy`)
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`)
    __obj.asInstanceOf[CustomPolicy]
  }
}

