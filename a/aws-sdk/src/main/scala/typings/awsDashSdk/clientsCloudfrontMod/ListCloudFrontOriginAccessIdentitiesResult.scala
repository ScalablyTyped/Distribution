package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
  /**
    * The CloudFrontOriginAccessIdentityList type. 
    */
  var CloudFrontOriginAccessIdentityList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityList] = js.undefined
}

object ListCloudFrontOriginAccessIdentitiesResult {
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityList: CloudFrontOriginAccessIdentityList = null): ListCloudFrontOriginAccessIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentityList != null) __obj.updateDynamic("CloudFrontOriginAccessIdentityList")(CloudFrontOriginAccessIdentityList)
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
  }
}

