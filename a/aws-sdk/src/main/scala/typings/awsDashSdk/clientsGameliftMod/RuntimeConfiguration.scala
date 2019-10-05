package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeConfiguration extends js.Object {
  /**
    * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
    */
  var GameSessionActivationTimeoutSeconds: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionActivationTimeoutSeconds] = js.undefined
  /**
    * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
    */
  var MaxConcurrentGameSessionActivations: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.MaxConcurrentGameSessionActivations] = js.undefined
  /**
    * Collection of server process configurations that describe which server processes to run on each instance in a fleet.
    */
  var ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
}

object RuntimeConfiguration {
  @scala.inline
  def apply(
    GameSessionActivationTimeoutSeconds: Int | scala.Double = null,
    MaxConcurrentGameSessionActivations: Int | scala.Double = null,
    ServerProcesses: ServerProcessList = null
  ): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (GameSessionActivationTimeoutSeconds != null) __obj.updateDynamic("GameSessionActivationTimeoutSeconds")(GameSessionActivationTimeoutSeconds.asInstanceOf[js.Any])
    if (MaxConcurrentGameSessionActivations != null) __obj.updateDynamic("MaxConcurrentGameSessionActivations")(MaxConcurrentGameSessionActivations.asInstanceOf[js.Any])
    if (ServerProcesses != null) __obj.updateDynamic("ServerProcesses")(ServerProcesses)
    __obj.asInstanceOf[RuntimeConfiguration]
  }
}

