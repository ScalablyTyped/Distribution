package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfiguration extends js.Object {
  /**
    * The ARN for the SNS topic to which notifications should be published.
    */
  var NotificationTopicArn: js.UndefOr[NotificationTopicArn] = js.undefined
}

object NotificationConfiguration {
  @scala.inline
  def apply(NotificationTopicArn: NotificationTopicArn = null): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn)
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

