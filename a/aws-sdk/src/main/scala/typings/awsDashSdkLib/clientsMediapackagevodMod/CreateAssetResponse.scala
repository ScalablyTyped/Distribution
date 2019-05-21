package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAssetResponse extends js.Object {
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The list of egress endpoints available for the Asset.
    */
  var EgressEndpoints: js.UndefOr[__listOfEgressEndpoint] = js.undefined
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[__string] = js.undefined
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[__string] = js.undefined
  /**
    * The IAM role_arn used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[__string] = js.undefined
}

object CreateAssetResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    EgressEndpoints: __listOfEgressEndpoint = null,
    Id: __string = null,
    PackagingGroupId: __string = null,
    ResourceId: __string = null,
    SourceArn: __string = null,
    SourceRoleArn: __string = null
  ): CreateAssetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (EgressEndpoints != null) __obj.updateDynamic("EgressEndpoints")(EgressEndpoints)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn)
    if (SourceRoleArn != null) __obj.updateDynamic("SourceRoleArn")(SourceRoleArn)
    __obj.asInstanceOf[CreateAssetResponse]
  }
}

