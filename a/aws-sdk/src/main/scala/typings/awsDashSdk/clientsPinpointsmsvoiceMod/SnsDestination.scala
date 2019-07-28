package typings.awsDashSdk.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnsDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
    */
  var TopicArn: js.UndefOr[String] = js.undefined
}

object SnsDestination {
  @scala.inline
  def apply(TopicArn: String = null): SnsDestination = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[SnsDestination]
  }
}

