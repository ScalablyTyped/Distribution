package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The identity's configuration information.
    */
  var CloudFrontOriginAccessIdentityConfig: awsDashSdkLib.clientsCloudfrontMod.CloudFrontOriginAccessIdentityConfig
  /**
    * The identity's id.
    */
  var Id: java.lang.String
  /**
    * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig,
    Id: java.lang.String,
    IfMatch: java.lang.String = null
  ): UpdateCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(CloudFrontOriginAccessIdentityConfig = CloudFrontOriginAccessIdentityConfig, Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateCloudFrontOriginAccessIdentityRequest]
  }
}

