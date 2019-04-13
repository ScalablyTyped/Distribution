package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeadLetterConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[ResourceArn] = js.undefined
}

object DeadLetterConfig {
  @scala.inline
  def apply(TargetArn: ResourceArn = null): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetArn != null) __obj.updateDynamic("TargetArn")(TargetArn)
    __obj.asInstanceOf[DeadLetterConfig]
  }
}

