package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID that will publish status messages to the SNS topic.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The SNS topic name to which the directory will publish status messages. This SNS topic must be in the same region as the specified Directory ID.
    */
  var TopicName: typings.awsDashSdk.clientsDirectoryserviceMod.TopicName
}

object RegisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): RegisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, TopicName = TopicName)
  
    __obj.asInstanceOf[RegisterEventTopicRequest]
  }
}

