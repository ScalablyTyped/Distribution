package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetRequest extends js.Object {
  /**
    * The unique identifier for the Asset.
    */
  var Id: __string = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: __string = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[__string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: __string = js.native
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: __string = js.native
}

object CreateAssetRequest {
  @scala.inline
  def apply(
    Id: __string,
    PackagingGroupId: __string,
    SourceArn: __string,
    SourceRoleArn: __string,
    ResourceId: __string = null
  ): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
}

