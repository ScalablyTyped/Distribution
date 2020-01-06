package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
  /**
    * The origin access identity's configuration information. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityConfig] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object GetCloudFrontOriginAccessIdentityConfigResult {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig = null,
    ETag: String = null
  ): GetCloudFrontOriginAccessIdentityConfigResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentityConfig != null) __obj.updateDynamic("CloudFrontOriginAccessIdentityConfig")(CloudFrontOriginAccessIdentityConfig.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
  }
}

