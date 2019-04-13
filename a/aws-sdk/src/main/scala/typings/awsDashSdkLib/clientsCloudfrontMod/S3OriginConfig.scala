package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3OriginConfig extends js.Object {
  /**
    * The CloudFront origin access identity to associate with the origin. Use an origin access identity to configure the origin so that viewers can only access objects in an Amazon S3 bucket through CloudFront. The format of the value is: origin-access-identity/cloudfront/ID-of-origin-access-identity  where  ID-of-origin-access-identity  is the value that CloudFront returned in the ID element when you created the origin access identity. If you want viewers to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify an empty OriginAccessIdentity element. To delete the origin access identity from an existing distribution, update the distribution configuration and include an empty OriginAccessIdentity element. To replace the origin access identity, update the distribution configuration and specify the new origin access identity. For more information about the origin access identity, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  var OriginAccessIdentity: java.lang.String
}

object S3OriginConfig {
  @scala.inline
  def apply(OriginAccessIdentity: java.lang.String): S3OriginConfig = {
    val __obj = js.Dynamic.literal(OriginAccessIdentity = OriginAccessIdentity)
  
    __obj.asInstanceOf[S3OriginConfig]
  }
}

