package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePartnerEventSourceResponse extends js.Object {
  /**
    * The ARN of the event source.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the event source.
    */
  var Name: js.UndefOr[String] = js.native
}

object DescribePartnerEventSourceResponse {
  @scala.inline
  def apply(Arn: String = null, Name: String = null): DescribePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePartnerEventSourceResponse]
  }
}

