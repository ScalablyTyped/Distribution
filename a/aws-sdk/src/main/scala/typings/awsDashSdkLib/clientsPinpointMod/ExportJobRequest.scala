package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
    */
  var RoleArn: js.UndefOr[__string] = js.undefined
  /**
    * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
  The URL should follow this format: s3://bucket-name/folder-name/
  Amazon Pinpoint will export endpoints to this location.
    */
  var S3UrlPrefix: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * The version of the segment to export if specified.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.undefined
}

object ExportJobRequest {
  @scala.inline
  def apply(
    RoleArn: __string = null,
    S3UrlPrefix: __string = null,
    SegmentId: __string = null,
    SegmentVersion: js.UndefOr[__integer] = js.undefined
  ): ExportJobRequest = {
    val __obj = js.Dynamic.literal()
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (S3UrlPrefix != null) __obj.updateDynamic("S3UrlPrefix")(S3UrlPrefix)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion)
    __obj.asInstanceOf[ExportJobRequest]
  }
}

