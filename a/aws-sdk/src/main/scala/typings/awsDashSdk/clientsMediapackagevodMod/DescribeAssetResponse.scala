package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetResponse extends js.Object {
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The time the Asset was initially submitted for Ingest.
    */
  var CreatedAt: js.UndefOr[__string] = js.native
  /**
    * The list of egress endpoints available for the Asset.
    */
  var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.native
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[__string] = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[__string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[__string] = js.native
  /**
    * The IAM role_arn used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[__string] = js.native
}

object DescribeAssetResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreatedAt: __string = null,
    EgressEndpoints: __listOfEgressEndpoint = null,
    Id: __string = null,
    PackagingGroupId: __string = null,
    ResourceId: __string = null,
    SourceArn: __string = null,
    SourceRoleArn: __string = null
  ): DescribeAssetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (EgressEndpoints != null) __obj.updateDynamic("EgressEndpoints")(EgressEndpoints.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (SourceRoleArn != null) __obj.updateDynamic("SourceRoleArn")(SourceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetResponse]
  }
}

