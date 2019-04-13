package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDetailsErrorItem extends js.Object {
  /**
    * A message that describes the error.
    */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the error.
    */
  var errorName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[eventArn] = js.undefined
}

object EventDetailsErrorItem {
  @scala.inline
  def apply(
    errorMessage: java.lang.String = null,
    errorName: java.lang.String = null,
    eventArn: eventArn = null
  ): EventDetailsErrorItem = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (errorName != null) __obj.updateDynamic("errorName")(errorName)
    if (eventArn != null) __obj.updateDynamic("eventArn")(eventArn)
    __obj.asInstanceOf[EventDetailsErrorItem]
  }
}

