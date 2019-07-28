package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data. For more information, see Amazon Resource Names - AWS Key Management Service (AWS KMS).
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The key-value pairs to use for the tags.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, kmsKeyId: KmsKeyId = null, tags: Tags = null): CreateLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateLogGroupRequest]
  }
}

