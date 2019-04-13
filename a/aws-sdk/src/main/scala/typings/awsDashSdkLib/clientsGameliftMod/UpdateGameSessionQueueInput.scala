package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGameSessionQueueInput extends js.Object {
  /**
    * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order. When updating this list, provide a complete list of destinations.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
  /**
    * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
    */
  var Name: GameSessionQueueName
  /**
    * Collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, it is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. When updating policies, provide a complete collection of policies.
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
  /**
    * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
}

object UpdateGameSessionQueueInput {
  @scala.inline
  def apply(
    Name: GameSessionQueueName,
    Destinations: GameSessionQueueDestinationList = null,
    PlayerLatencyPolicies: PlayerLatencyPolicyList = null,
    TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
  ): UpdateGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    if (PlayerLatencyPolicies != null) __obj.updateDynamic("PlayerLatencyPolicies")(PlayerLatencyPolicies)
    if (!js.isUndefined(TimeoutInSeconds)) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds)
    __obj.asInstanceOf[UpdateGameSessionQueueInput]
  }
}

