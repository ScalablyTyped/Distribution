package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLatencyPolicy extends js.Object {
  /**
    * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for this property.
    */
  var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for this property means that the policy is enforced until the queue times out.
    */
  var PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
}

object PlayerLatencyPolicy {
  @scala.inline
  def apply(
    MaximumIndividualPlayerLatencyMilliseconds: Int | scala.Double = null,
    PolicyDurationSeconds: Int | scala.Double = null
  ): PlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal()
    if (MaximumIndividualPlayerLatencyMilliseconds != null) __obj.updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(MaximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (PolicyDurationSeconds != null) __obj.updateDynamic("PolicyDurationSeconds")(PolicyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerLatencyPolicy]
  }
}

