package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssetRequest extends js.Object {
  /**
    * The unique identifier for the Asset.
    */
  var Id: __string
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: __string
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: __string
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: __string
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
    val __obj = js.Dynamic.literal(Id = Id, PackagingGroupId = PackagingGroupId, SourceArn = SourceArn, SourceRoleArn = SourceRoleArn)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[CreateAssetRequest]
  }
}

