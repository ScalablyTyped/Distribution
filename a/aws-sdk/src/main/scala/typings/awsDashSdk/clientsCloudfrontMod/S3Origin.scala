package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Origin extends js.Object {
  /**
    * The DNS name of the Amazon S3 origin. 
    */
  var DomainName: String
  /**
    * The CloudFront origin access identity to associate with the distribution. Use an origin access identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront. If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify an empty OriginAccessIdentity element. To delete the origin access identity from an existing distribution, update the distribution configuration and include an empty OriginAccessIdentity element. To replace the origin access identity, update the distribution configuration and specify the new origin access identity. For more information, see Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content in the  Amazon CloudFront Developer Guide.
    */
  var OriginAccessIdentity: String
}

object S3Origin {
  @scala.inline
  def apply(DomainName: String, OriginAccessIdentity: String): S3Origin = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, OriginAccessIdentity = OriginAccessIdentity)
  
    __obj.asInstanceOf[S3Origin]
  }
}

