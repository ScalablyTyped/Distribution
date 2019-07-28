package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginCustomHeader extends js.Object {
  /**
    * The name of a header that you want CloudFront to forward to your origin. For more information, see Forwarding Custom Headers to Your Origin (Web Distributions Only) in the  Amazon CloudFront Developer Guide.
    */
  var HeaderName: String
  /**
    * The value for the header that you specified in the HeaderName field.
    */
  var HeaderValue: String
}

object OriginCustomHeader {
  @scala.inline
  def apply(HeaderName: String, HeaderValue: String): OriginCustomHeader = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName, HeaderValue = HeaderValue)
  
    __obj.asInstanceOf[OriginCustomHeader]
  }
}

