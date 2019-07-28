package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnsDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email events to. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName
}

object SnsDestination {
  @scala.inline
  def apply(TopicArn: AmazonResourceName): SnsDestination = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn)
  
    __obj.asInstanceOf[SnsDestination]
  }
}

