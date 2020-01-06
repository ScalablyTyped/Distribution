package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBus extends js.Object {
  /**
    * The ARN of the event bus.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the event bus.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
    */
  var Policy: js.UndefOr[String] = js.native
}

object EventBus {
  @scala.inline
  def apply(Arn: String = null, Name: String = null, Policy: String = null): EventBus = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBus]
  }
}

