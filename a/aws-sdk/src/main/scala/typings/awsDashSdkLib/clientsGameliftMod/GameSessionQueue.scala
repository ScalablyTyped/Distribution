package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueue extends js.Object {
  /**
    * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;:&lt;aws account&gt;:gamesessionqueue/&lt;queue name&gt;.
    */
  var GameSessionQueueArn: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
    */
  var Name: js.UndefOr[GameSessionQueueName] = js.undefined
  /**
    * Collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, it is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. 
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
  /**
    * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
}

object GameSessionQueue {
  @scala.inline
  def apply(
    Destinations: GameSessionQueueDestinationList = null,
    GameSessionQueueArn: ArnStringModel = null,
    Name: GameSessionQueueName = null,
    PlayerLatencyPolicies: PlayerLatencyPolicyList = null,
    TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
  ): GameSessionQueue = {
    val __obj = js.Dynamic.literal()
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations)
    if (GameSessionQueueArn != null) __obj.updateDynamic("GameSessionQueueArn")(GameSessionQueueArn)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (PlayerLatencyPolicies != null) __obj.updateDynamic("PlayerLatencyPolicies")(PlayerLatencyPolicies)
    if (!js.isUndefined(TimeoutInSeconds)) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds)
    __obj.asInstanceOf[GameSessionQueue]
  }
}

