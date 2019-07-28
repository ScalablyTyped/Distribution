package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontOriginAccessIdentitySummary extends js.Object {
  /**
    * The comment for this origin access identity, as originally specified when created.
    */
  var Comment: String
  /**
    * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
    */
  var Id: String
  /**
    * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access identity read permission to an object in Amazon S3.
    */
  var S3CanonicalUserId: String
}

object CloudFrontOriginAccessIdentitySummary {
  @scala.inline
  def apply(Comment: String, Id: String, S3CanonicalUserId: String): CloudFrontOriginAccessIdentitySummary = {
    val __obj = js.Dynamic.literal(Comment = Comment, Id = Id, S3CanonicalUserId = S3CanonicalUserId)
  
    __obj.asInstanceOf[CloudFrontOriginAccessIdentitySummary]
  }
}

