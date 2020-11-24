package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentRoutingProfile extends js.Object {
  
  /** See `agent.getChannelConcurrency()` for more info. */
  val channelConcurrencyMap: AgentChannelConcurrencyMap = js.native
  
  /** The default queue which should be associated with outbound contacts. */
  val defaultOutboundQueue: Queue = js.native
  
  /** The name of the routing profile. */
  val name: String = js.native
  
  /** The queues contained in the routing profile. */
  val queues: js.Array[Queue] = js.native
  
  /** The routing profile ARN. */
  val routingProfileARN: String = js.native
  
  /** Alias for `routingProfileARN`. */
  val routingProfileId: String = js.native
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
  
  @scala.inline
  implicit class AgentRoutingProfileOps[Self <: AgentRoutingProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelConcurrencyMap(value: AgentChannelConcurrencyMap): Self = this.set("channelConcurrencyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOutboundQueue(value: Queue): Self = this.set("defaultOutboundQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = this.set("queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: js.Array[Queue]): Self = this.set("queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileARN(value: String): Self = this.set("routingProfileARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: String): Self = this.set("routingProfileId", value.asInstanceOf[js.Any])
  }
}
