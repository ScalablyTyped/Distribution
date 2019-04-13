package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentImportResource extends js.Object {
  /**
    * The number of channel types in the imported segment.
    */
  var ChannelCounts: js.UndefOr[MapOf__integer] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[__string] = js.undefined
  /**
    * The format of the endpoint files that were imported to create this segment.
  Valid values: CSV, JSON
    */
  var Format: js.UndefOr[Format] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * The URL of the S3 bucket that the segment was imported from.
    */
  var S3Url: js.UndefOr[__string] = js.undefined
  /**
    * The number of endpoints that were successfully imported to create this segment.
    */
  var Size: js.UndefOr[__integer] = js.undefined
}

object SegmentImportResource {
  @scala.inline
  def apply(
    ChannelCounts: MapOf__integer = null,
    ExternalId: __string = null,
    Format: Format = null,
    RoleArn: __string = null,
    S3Url: __string = null,
    Size: js.UndefOr[__integer] = js.undefined
  ): SegmentImportResource = {
    val __obj = js.Dynamic.literal()
    if (ChannelCounts != null) __obj.updateDynamic("ChannelCounts")(ChannelCounts)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[SegmentImportResource]
  }
}

