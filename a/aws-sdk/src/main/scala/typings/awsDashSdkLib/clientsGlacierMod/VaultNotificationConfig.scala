package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultNotificationConfig extends js.Object {
  /**
    * A list of one or more events for which Amazon S3 Glacier will send a notification to the specified Amazon SNS topic.
    */
  var Events: js.UndefOr[NotificationEventList] = js.undefined
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
    */
  var SNSTopic: js.UndefOr[java.lang.String] = js.undefined
}

object VaultNotificationConfig {
  @scala.inline
  def apply(Events: NotificationEventList = null, SNSTopic: java.lang.String = null): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic)
    __obj.asInstanceOf[VaultNotificationConfig]
  }
}

