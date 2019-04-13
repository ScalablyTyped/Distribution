package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobResource extends js.Object {
  /**
    * Sets whether the endpoints create a segment when they are imported.
    */
  var DefineSegment: js.UndefOr[__boolean] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[__string] = js.undefined
  /**
    * The format of the files that contain the endpoint definitions.
  Valid values: CSV, JSON
    */
  var Format: js.UndefOr[Format] = js.undefined
  /**
    * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
    */
  var RegisterEndpoints: js.UndefOr[__boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
  Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
    */
  var S3Url: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the segment to update if the import job is meant to update an existing segment.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * A custom name for the segment created by the import job. Use if DefineSegment is true.
    */
  var SegmentName: js.UndefOr[__string] = js.undefined
}

object ImportJobResource {
  @scala.inline
  def apply(
    DefineSegment: js.UndefOr[__boolean] = js.undefined,
    ExternalId: __string = null,
    Format: Format = null,
    RegisterEndpoints: js.UndefOr[__boolean] = js.undefined,
    RoleArn: __string = null,
    S3Url: __string = null,
    SegmentId: __string = null,
    SegmentName: __string = null
  ): ImportJobResource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefineSegment)) __obj.updateDynamic("DefineSegment")(DefineSegment)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (!js.isUndefined(RegisterEndpoints)) __obj.updateDynamic("RegisterEndpoints")(RegisterEndpoints)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (SegmentName != null) __obj.updateDynamic("SegmentName")(SegmentName)
    __obj.asInstanceOf[ImportJobResource]
  }
}

