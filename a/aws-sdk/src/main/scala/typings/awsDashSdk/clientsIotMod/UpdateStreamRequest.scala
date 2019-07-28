package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStreamRequest extends js.Object {
  /**
    * The description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  /**
    * The files associated with the stream.
    */
  var files: js.UndefOr[StreamFiles] = js.undefined
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The stream ID.
    */
  var streamId: StreamId
}

object UpdateStreamRequest {
  @scala.inline
  def apply(
    streamId: StreamId,
    description: StreamDescription = null,
    files: StreamFiles = null,
    roleArn: RoleArn = null
  ): UpdateStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (files != null) __obj.updateDynamic("files")(files)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[UpdateStreamRequest]
  }
}

