package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogSubscription extends js.Object {
  /**
    * Identifier (ID) of the directory that you want to associate with the log subscription.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The name of the log group.
    */
  var LogGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The date and time that the log subscription was created.
    */
  var SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime] = js.undefined
}

object LogSubscription {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    LogGroupName: LogGroupName = null,
    SubscriptionCreatedDateTime: SubscriptionCreatedDateTime = null
  ): LogSubscription = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (SubscriptionCreatedDateTime != null) __obj.updateDynamic("SubscriptionCreatedDateTime")(SubscriptionCreatedDateTime)
    __obj.asInstanceOf[LogSubscription]
  }
}

