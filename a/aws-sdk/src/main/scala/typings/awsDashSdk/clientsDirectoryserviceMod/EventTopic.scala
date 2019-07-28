package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTopic extends js.Object {
  /**
    * The date and time of when you associated your directory with the SNS topic.
    */
  var CreatedDateTime: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.CreatedDateTime] = js.undefined
  /**
    * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The topic registration status.
    */
  var Status: js.UndefOr[TopicStatus] = js.undefined
  /**
    * The SNS topic ARN (Amazon Resource Name).
    */
  var TopicArn: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TopicArn] = js.undefined
  /**
    * The name of an AWS SNS topic the receives status messages from the directory.
    */
  var TopicName: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TopicName] = js.undefined
}

object EventTopic {
  @scala.inline
  def apply(
    CreatedDateTime: CreatedDateTime = null,
    DirectoryId: DirectoryId = null,
    Status: TopicStatus = null,
    TopicArn: TopicArn = null,
    TopicName: TopicName = null
  ): EventTopic = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    if (TopicName != null) __obj.updateDynamic("TopicName")(TopicName)
    __obj.asInstanceOf[EventTopic]
  }
}

