package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventDetailsRequest extends js.Object {
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsDashSdk.clientsHealthMod.locale] = js.undefined
}

object DescribeEventDetailsRequest {
  @scala.inline
  def apply(eventArns: eventArnList, locale: locale = null): DescribeEventDetailsRequest = {
    val __obj = js.Dynamic.literal(eventArns = eventArns)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[DescribeEventDetailsRequest]
  }
}

