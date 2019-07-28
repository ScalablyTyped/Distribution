package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamInfo extends js.Object {
  /**
    * The date when the stream was created.
    */
  var createdAt: js.UndefOr[DateType] = js.undefined
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  /**
    * The files to stream.
    */
  var files: js.UndefOr[StreamFiles] = js.undefined
  /**
    * The date when the stream was last updated.
    */
  var lastUpdatedAt: js.UndefOr[DateType] = js.undefined
  /**
    * An IAM role AWS IoT assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.undefined
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.undefined
}

object StreamInfo {
  @scala.inline
  def apply(
    createdAt: DateType = null,
    description: StreamDescription = null,
    files: StreamFiles = null,
    lastUpdatedAt: DateType = null,
    roleArn: RoleArn = null,
    streamArn: StreamArn = null,
    streamId: StreamId = null,
    streamVersion: js.UndefOr[StreamVersion] = js.undefined
  ): StreamInfo = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (description != null) __obj.updateDynamic("description")(description)
    if (files != null) __obj.updateDynamic("files")(files)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (streamArn != null) __obj.updateDynamic("streamArn")(streamArn)
    if (streamId != null) __obj.updateDynamic("streamId")(streamId)
    if (!js.isUndefined(streamVersion)) __obj.updateDynamic("streamVersion")(streamVersion)
    __obj.asInstanceOf[StreamInfo]
  }
}

