package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopAction extends js.Object {
  /**
    * The name of the RuleSet that is being stopped.
    */
  var Scope: StopScope
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object StopAction {
  @scala.inline
  def apply(Scope: StopScope, TopicArn: AmazonResourceName = null): StopAction = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[StopAction]
  }
}

