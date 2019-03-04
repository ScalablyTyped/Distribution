package typings
package awsDashSdkLib.libCloudfrontSignerMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CannedPolicy extends js.Object {
  var `CloudFront-Expires`: scala.Double
  var `CloudFront-Key-Pair-Id`: java.lang.String
  var `CloudFront-Signature`: java.lang.String
}

object CannedPolicy {
  @scala.inline
  def apply(
    `CloudFront-Expires`: scala.Double,
    `CloudFront-Key-Pair-Id`: java.lang.String,
    `CloudFront-Signature`: java.lang.String
  ): CannedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CloudFront-Expires")(`CloudFront-Expires`)
    __obj.updateDynamic("CloudFront-Key-Pair-Id")(`CloudFront-Key-Pair-Id`)
    __obj.updateDynamic("CloudFront-Signature")(`CloudFront-Signature`)
    __obj.asInstanceOf[CannedPolicy]
  }
}

