package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
    */
  var RoleArn: __string
  /**
    * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions were exported to. This location is typically a folder that contains multiple files. The URL should be in the following format: s3://bucket-name/folder-name/.
    */
  var S3UrlPrefix: __string
  /**
    * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present, Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * The version of the segment that the endpoint definitions were exported from.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.undefined
}

object ExportJobResource {
  @scala.inline
  def apply(
    RoleArn: __string,
    S3UrlPrefix: __string,
    SegmentId: __string = null,
    SegmentVersion: js.UndefOr[__integer] = js.undefined
  ): ExportJobResource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, S3UrlPrefix = S3UrlPrefix)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion)
    __obj.asInstanceOf[ExportJobResource]
  }
}

