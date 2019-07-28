package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActivityInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the activity to describe.
    */
  var activityArn: Arn
}

object DescribeActivityInput {
  @scala.inline
  def apply(activityArn: Arn): DescribeActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn)
  
    __obj.asInstanceOf[DescribeActivityInput]
  }
}

