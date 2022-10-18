package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelActivity extends StObject {
  
  /**
    * The name of the channel from which the messages are processed.
    */
  var channelName: ChannelName
  
  /**
    * The name of the channel activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}
object ChannelActivity {
  
  inline def apply(channelName: ChannelName, name: ActivityName): ChannelActivity = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelActivity]
  }
  
  extension [Self <: ChannelActivity](x: Self) {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
