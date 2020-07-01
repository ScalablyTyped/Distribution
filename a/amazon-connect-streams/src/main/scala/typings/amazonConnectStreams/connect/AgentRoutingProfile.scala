package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRoutingProfile extends js.Object {
  /** See `agent.getChannelConcurrency()` for more info. */
  val channelConcurrencyMap: AgentChannelConcurrencyMap
  /** The default queue which should be associated with outbound contacts. */
  val defaultOutboundQueue: Queue
  /** The name of the routing profile. */
  val name: String
  /** The queues contained in the routing profile. */
  val queues: js.Array[Queue]
  /** The routing profile ARN. */
  val routingProfileARN: String
  /** Alias for `routingProfileARN`. */
  val routingProfileId: String
}

object AgentRoutingProfile {
  @scala.inline
  def apply(
    channelConcurrencyMap: AgentChannelConcurrencyMap,
    defaultOutboundQueue: Queue,
    name: String,
    queues: js.Array[Queue],
    routingProfileARN: String,
    routingProfileId: String
  ): AgentRoutingProfile = {
    val __obj = js.Dynamic.literal(channelConcurrencyMap = channelConcurrencyMap.asInstanceOf[js.Any], defaultOutboundQueue = defaultOutboundQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any], routingProfileARN = routingProfileARN.asInstanceOf[js.Any], routingProfileId = routingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRoutingProfile]
  }
}

