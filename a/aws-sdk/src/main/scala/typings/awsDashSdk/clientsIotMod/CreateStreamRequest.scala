package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamRequest extends js.Object {
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.native
  /**
    * The files to stream.
    */
  var files: StreamFiles = js.native
  /**
    * An IAM role that allows the IoT service principal assumes to access your S3 files.
    */
  var roleArn: RoleArn = js.native
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
  /**
    * Metadata which can be used to manage streams.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateStreamRequest {
  @scala.inline
  def apply(
    files: StreamFiles,
    roleArn: RoleArn,
    streamId: StreamId,
    description: StreamDescription = null,
    tags: TagList = null
  ): CreateStreamRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamRequest]
  }
}

