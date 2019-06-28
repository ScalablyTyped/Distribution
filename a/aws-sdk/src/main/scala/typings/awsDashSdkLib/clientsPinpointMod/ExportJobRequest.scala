package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location where you want to export endpoint definitions to.
    */
  var RoleArn: __string
  /**
    * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where you want to export endpoint definitions to. This location is typically a folder that contains multiple files. The URL should be in the following format: s3://bucket-name/folder-name/.
    */
  var S3UrlPrefix: __string
  /**
    * The identifier for the segment to export endpoint definitions from. If you don't specify this value, Amazon Pinpoint exports definitions for all the endpoints that are associated with the application.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * The version of the segment to export endpoint definitions from, if specified.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.undefined
}

object ExportJobRequest {
  @scala.inline
  def apply(
    RoleArn: __string,
    S3UrlPrefix: __string,
    SegmentId: __string = null,
    SegmentVersion: js.UndefOr[__integer] = js.undefined
  ): ExportJobRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, S3UrlPrefix = S3UrlPrefix)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion)
    __obj.asInstanceOf[ExportJobRequest]
  }
}

