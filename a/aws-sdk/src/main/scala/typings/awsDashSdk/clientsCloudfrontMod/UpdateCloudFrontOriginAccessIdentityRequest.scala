package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The identity's configuration information.
    */
  var CloudFrontOriginAccessIdentityConfig: typings.awsDashSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityConfig = js.native
  /**
    * The identity's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig,
    Id: String,
    IfMatch: String = null
  ): UpdateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
  }
}

