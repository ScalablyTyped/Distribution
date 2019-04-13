package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
  /**
    * The origin access identity's configuration information. 
    */
  var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
}

object GetCloudFrontOriginAccessIdentityConfigResult {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig = null,
    ETag: java.lang.String = null
  ): GetCloudFrontOriginAccessIdentityConfigResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentityConfig != null) __obj.updateDynamic("CloudFrontOriginAccessIdentityConfig")(CloudFrontOriginAccessIdentityConfig)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigResult]
  }
}

