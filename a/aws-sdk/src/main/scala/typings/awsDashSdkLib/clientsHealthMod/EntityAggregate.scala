package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAggregate extends js.Object {
  /**
    * The number entities that match the criteria for the specified events.
    */
  var count: js.UndefOr[count] = js.undefined
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[eventArn] = js.undefined
}

object EntityAggregate {
  @scala.inline
  def apply(count: js.UndefOr[count] = js.undefined, eventArn: eventArn = null): EntityAggregate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn)
    __obj.asInstanceOf[EntityAggregate]
  }
}

