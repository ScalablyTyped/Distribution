package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventTrackerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the event tracker to describe.
    */
  var eventTrackerArn: Arn
}

object DescribeEventTrackerRequest {
  @scala.inline
  def apply(eventTrackerArn: Arn): DescribeEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn)
  
    __obj.asInstanceOf[DescribeEventTrackerRequest]
  }
}

