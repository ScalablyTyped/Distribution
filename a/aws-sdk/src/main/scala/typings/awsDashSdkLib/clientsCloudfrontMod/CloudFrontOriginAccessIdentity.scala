package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontOriginAccessIdentity extends js.Object {
  /**
    * The current configuration information for the identity. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
  /**
    * The ID for the origin access identity, for example, E74FTE3AJFJ256A. 
    */
  var Id: java.lang.String
  /**
    * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin access identity read permission to an object in Amazon S3. 
    */
  var S3CanonicalUserId: java.lang.String
}

object CloudFrontOriginAccessIdentity {
  @scala.inline
  def apply(
    Id: java.lang.String,
    S3CanonicalUserId: java.lang.String,
    CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig = null
  ): CloudFrontOriginAccessIdentity = {
    val __obj = js.Dynamic.literal(Id = Id, S3CanonicalUserId = S3CanonicalUserId)
    if (CloudFrontOriginAccessIdentityConfig != null) __obj.updateDynamic("CloudFrontOriginAccessIdentityConfig")(CloudFrontOriginAccessIdentityConfig)
    __obj.asInstanceOf[CloudFrontOriginAccessIdentity]
  }
}

