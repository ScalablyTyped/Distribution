package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginCustomHeader extends js.Object {
  /**
    * The name of a header that you want CloudFront to forward to your origin. For more information, see Forwarding Custom Headers to Your Origin (Web Distributions Only) in the  Amazon CloudFront Developer Guide.
    */
  var HeaderName: java.lang.String
  /**
    * The value for the header that you specified in the HeaderName field.
    */
  var HeaderValue: java.lang.String
}

object OriginCustomHeader {
  @scala.inline
  def apply(HeaderName: java.lang.String, HeaderValue: java.lang.String): OriginCustomHeader = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName, HeaderValue = HeaderValue)
  
    __obj.asInstanceOf[OriginCustomHeader]
  }
}

