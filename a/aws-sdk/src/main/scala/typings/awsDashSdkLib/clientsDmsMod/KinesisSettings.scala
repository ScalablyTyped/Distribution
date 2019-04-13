package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisSettings extends js.Object {
  /**
    * The output format for the records created on the endpoint. The message format is JSON.
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
    */
  var StreamArn: js.UndefOr[String] = js.undefined
}

object KinesisSettings {
  @scala.inline
  def apply(
    MessageFormat: MessageFormatValue = null,
    ServiceAccessRoleArn: String = null,
    StreamArn: String = null
  ): KinesisSettings = {
    val __obj = js.Dynamic.literal()
    if (MessageFormat != null) __obj.updateDynamic("MessageFormat")(MessageFormat.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (StreamArn != null) __obj.updateDynamic("StreamArn")(StreamArn)
    __obj.asInstanceOf[KinesisSettings]
  }
}

