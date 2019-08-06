package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishFindingToSnsParams extends js.Object {
  /**
    * The ARN of the topic to which you want to publish the findings.
    */
  var topicArn: SnsTopicArn
}

object PublishFindingToSnsParams {
  @scala.inline
  def apply(topicArn: SnsTopicArn): PublishFindingToSnsParams = {
    val __obj = js.Dynamic.literal(topicArn = topicArn)
  
    __obj.asInstanceOf[PublishFindingToSnsParams]
  }
}

