package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
  /**
    * The CloudFrontOriginAccessIdentityList type. 
    */
  var CloudFrontOriginAccessIdentityList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CloudFrontOriginAccessIdentityList] = js.native
}

object ListCloudFrontOriginAccessIdentitiesResult {
  @scala.inline
  def apply(CloudFrontOriginAccessIdentityList: CloudFrontOriginAccessIdentityList = null): ListCloudFrontOriginAccessIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentityList != null) __obj.updateDynamic("CloudFrontOriginAccessIdentityList")(CloudFrontOriginAccessIdentityList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesResult]
  }
}

