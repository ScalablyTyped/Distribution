package typings
package awsDashSdkLib.clientsGameliftMod

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
    MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined,
    PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
  ): PlayerLatencyPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaximumIndividualPlayerLatencyMilliseconds)) __obj.updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(MaximumIndividualPlayerLatencyMilliseconds)
    if (!js.isUndefined(PolicyDurationSeconds)) __obj.updateDynamic("PolicyDurationSeconds")(PolicyDurationSeconds)
    __obj.asInstanceOf[PlayerLatencyPolicy]
  }
}

