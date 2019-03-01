package typings
package awsDashSdkLib.libCloudfrontSignerMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPolicy extends js.Object {
  var `CloudFront-Key-Pair-Id`: java.lang.String
  var `CloudFront-Policy`: java.lang.String
  var `CloudFront-Signature`: java.lang.String
}

object CustomPolicy {
  @scala.inline
  def apply(
    `CloudFront-Key-Pair-Id`: java.lang.String,
    `CloudFront-Policy`: java.lang.String,
    `CloudFront-Signature`: java.lang.String
  ): CustomPolicy = {
    val __obj = js.Dynamic.literal(`CloudFront-Key-Pair-Id` = `CloudFront-Key-Pair-Id`, `CloudFront-Policy` = `CloudFront-Policy`, `CloudFront-Signature` = `CloudFront-Signature`)
  
    __obj.asInstanceOf[CustomPolicy]
  }
}

