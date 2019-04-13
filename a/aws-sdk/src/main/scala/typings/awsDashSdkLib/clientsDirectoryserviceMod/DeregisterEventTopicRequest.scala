package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterEventTopicRequest extends js.Object {
  /**
    * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS topic.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The name of the SNS topic from which to remove the directory as a publisher.
    */
  var TopicName: awsDashSdkLib.clientsDirectoryserviceMod.TopicName
}

object DeregisterEventTopicRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, TopicName: TopicName): DeregisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, TopicName = TopicName)
  
    __obj.asInstanceOf[DeregisterEventTopicRequest]
  }
}

