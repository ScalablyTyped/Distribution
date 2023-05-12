package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  /**
    * The channel to use to filter the metrics.
    */
  var Channels: js.UndefOr[typings.awsSdk.clientsConnectMod.Channels] = js.undefined
  
  /**
    * The queues to use to filter the metrics. You should specify at least one queue, and can specify up to 100 queues per request. The GetCurrentMetricsData API in particular requires a queue when you include a Filter in your request. 
    */
  var Queues: js.UndefOr[typings.awsSdk.clientsConnectMod.Queues] = js.undefined
  
  /**
    * A list of up to 100 routing profile IDs or ARNs.
    */
  var RoutingProfiles: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfiles] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: Channels): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: QueueId*): Self = StObject.set(x, "Queues", js.Array(value*))
    
    inline def setRoutingProfiles(value: RoutingProfiles): Self = StObject.set(x, "RoutingProfiles", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfilesUndefined: Self = StObject.set(x, "RoutingProfiles", js.undefined)
    
    inline def setRoutingProfilesVarargs(value: RoutingProfileId*): Self = StObject.set(x, "RoutingProfiles", js.Array(value*))
  }
}
