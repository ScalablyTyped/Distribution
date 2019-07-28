package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontOriginAccessIdentityConfig extends js.Object {
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the CloudFrontOriginAccessIdentityConfig object), a new origin access identity is created. If the CallerReference is a value already sent in a previous identity request, and the content of the CloudFrontOriginAccessIdentityConfig is identical to the original request (ignoring white space), the response includes the same information returned to the original request.  If the CallerReference is a value you already sent in a previous request to create an identity, but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error. 
    */
  var CallerReference: String
  /**
    * Any comments you want to include about the origin access identity. 
    */
  var Comment: String
}

object CloudFrontOriginAccessIdentityConfig {
  @scala.inline
  def apply(CallerReference: String, Comment: String): CloudFrontOriginAccessIdentityConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, Comment = Comment)
  
    __obj.asInstanceOf[CloudFrontOriginAccessIdentityConfig]
  }
}

