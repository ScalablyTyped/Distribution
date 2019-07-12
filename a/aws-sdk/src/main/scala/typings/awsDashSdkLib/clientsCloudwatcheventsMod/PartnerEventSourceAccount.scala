package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerEventSourceAccount extends js.Object {
  /**
    * The AWS account ID that the partner event source was offered to.
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  /**
    * The date and time when the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time when the event source will expire if the AWS account doesn't create a matching event bus for it.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The state of the event source. If it's ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it's PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it's DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.undefined
}

object PartnerEventSourceAccount {
  @scala.inline
  def apply(
    Account: AccountId = null,
    CreationTime: Timestamp = null,
    ExpirationTime: Timestamp = null,
    State: EventSourceState = null
  ): PartnerEventSourceAccount = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerEventSourceAccount]
  }
}

