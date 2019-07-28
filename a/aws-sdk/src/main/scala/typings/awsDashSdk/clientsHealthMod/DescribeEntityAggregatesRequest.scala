package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntityAggregatesRequest extends js.Object {
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[EventArnsList] = js.undefined
}

object DescribeEntityAggregatesRequest {
  @scala.inline
  def apply(eventArns: EventArnsList = null): DescribeEntityAggregatesRequest = {
    val __obj = js.Dynamic.literal()
    if (eventArns != null) __obj.updateDynamic("eventArns")(eventArns)
    __obj.asInstanceOf[DescribeEntityAggregatesRequest]
  }
}

