package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNotificationChannelRequest extends StObject {
  
  /**
    * The id of the channel that we want to stop receiving notifications.
    */
  var channelId: ChannelId
  
  /**
    * The name of the profiling group we want to change notification configuration for.
    */
  var profilingGroupName: ProfilingGroupName
}
object RemoveNotificationChannelRequest {
  
  inline def apply(channelId: ChannelId, profilingGroupName: ProfilingGroupName): RemoveNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNotificationChannelRequest]
  }
  
  extension [Self <: RemoveNotificationChannelRequest](x: Self) {
    
    inline def setChannelId(value: ChannelId): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
