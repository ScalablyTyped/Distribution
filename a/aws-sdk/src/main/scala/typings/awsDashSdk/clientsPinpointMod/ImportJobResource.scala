package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportJobResource extends js.Object {
  /**
    * Specifies whether the import job creates a segment that contains the endpoints, when the endpoint definitions are imported.
    */
  var DefineSegment: js.UndefOr[__boolean] = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[__string] = js.native
  /**
    * The format of the files that contain the endpoint definitions to import. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format. If the files are stored in an Amazon S3 location and that location contains multiple files that use different formats, Amazon Pinpoint imports data only from the files that use the specified format.
    */
  var Format: typings.awsDashSdk.clientsPinpointMod.Format = js.native
  /**
    * Specifies whether the import job registers the endpoints with Amazon Pinpoint, when the endpoint definitions are imported.
    */
  var RegisterEndpoints: js.UndefOr[__boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: __string = js.native
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that contains the endpoint definitions to import. This location can be a folder or a single file. If the location is a folder, Amazon Pinpoint imports endpoint definitions from the files in this location, including any subfolders that the folder contains. The URL should be in the following format: s3://bucket-name/folder-name/file-name. The location can end with the key for an individual object or a prefix that qualifies multiple objects.
    */
  var S3Url: __string = js.native
  /**
    * The identifier for the segment that the import job updates or adds endpoint definitions to, if the import job updates an existing segment.
    */
  var SegmentId: js.UndefOr[__string] = js.native
  /**
    * The custom name for the segment that's created by the import job, if the value of the DefineSegment property is true.
    */
  var SegmentName: js.UndefOr[__string] = js.native
}

object ImportJobResource {
  @scala.inline
  def apply(
    Format: Format,
    RoleArn: __string,
    S3Url: __string,
    DefineSegment: js.UndefOr[Boolean] = js.undefined,
    ExternalId: __string = null,
    RegisterEndpoints: js.UndefOr[Boolean] = js.undefined,
    SegmentId: __string = null,
    SegmentName: __string = null
  ): ImportJobResource = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Url = S3Url.asInstanceOf[js.Any])
    if (!js.isUndefined(DefineSegment)) __obj.updateDynamic("DefineSegment")(DefineSegment.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (!js.isUndefined(RegisterEndpoints)) __obj.updateDynamic("RegisterEndpoints")(RegisterEndpoints.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentName != null) __obj.updateDynamic("SegmentName")(SegmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResource]
  }
}

