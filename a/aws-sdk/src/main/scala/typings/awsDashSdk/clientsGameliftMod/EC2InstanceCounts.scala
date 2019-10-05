package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2InstanceCounts extends js.Object {
  /**
    * Actual number of active instances in the fleet.
    */
  var ACTIVE: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Ideal number of active instances in the fleet.
    */
  var DESIRED: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of active instances in the fleet that are not currently hosting a game session.
    */
  var IDLE: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Maximum value allowed for the fleet's instance count.
    */
  var MAXIMUM: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Minimum value allowed for the fleet's instance count.
    */
  var MINIMUM: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of instances in the fleet that are starting but not yet active.
    */
  var PENDING: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Number of instances in the fleet that are no longer active but haven't yet been terminated.
    */
  var TERMINATING: js.UndefOr[WholeNumber] = js.undefined
}

object EC2InstanceCounts {
  @scala.inline
  def apply(
    ACTIVE: Int | scala.Double = null,
    DESIRED: Int | scala.Double = null,
    IDLE: Int | scala.Double = null,
    MAXIMUM: Int | scala.Double = null,
    MINIMUM: Int | scala.Double = null,
    PENDING: Int | scala.Double = null,
    TERMINATING: Int | scala.Double = null
  ): EC2InstanceCounts = {
    val __obj = js.Dynamic.literal()
    if (ACTIVE != null) __obj.updateDynamic("ACTIVE")(ACTIVE.asInstanceOf[js.Any])
    if (DESIRED != null) __obj.updateDynamic("DESIRED")(DESIRED.asInstanceOf[js.Any])
    if (IDLE != null) __obj.updateDynamic("IDLE")(IDLE.asInstanceOf[js.Any])
    if (MAXIMUM != null) __obj.updateDynamic("MAXIMUM")(MAXIMUM.asInstanceOf[js.Any])
    if (MINIMUM != null) __obj.updateDynamic("MINIMUM")(MINIMUM.asInstanceOf[js.Any])
    if (PENDING != null) __obj.updateDynamic("PENDING")(PENDING.asInstanceOf[js.Any])
    if (TERMINATING != null) __obj.updateDynamic("TERMINATING")(TERMINATING.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2InstanceCounts]
  }
}

