package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventBusResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the event bus. Currently, this is always default.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The policy that enables the external account to send events to your account.
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object DescribeEventBusResponse {
  @scala.inline
  def apply(Arn: String = null, Name: String = null, Policy: String = null): DescribeEventBusResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[DescribeEventBusResponse]
  }
}

