package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentRoutingProfile extends StObject {
  
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
  implicit class AgentRoutingProfileMutableBuilder[Self <: AgentRoutingProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelConcurrencyMap(value: AgentChannelConcurrencyMap): Self = StObject.set(x, "channelConcurrencyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOutboundQueue(value: Queue): Self = StObject.set(x, "defaultOutboundQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueues(value: js.Array[Queue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "queues", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileARN(value: String): Self = StObject.set(x, "routingProfileARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: String): Self = StObject.set(x, "routingProfileId", value.asInstanceOf[js.Any])
  }
}
