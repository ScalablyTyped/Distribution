package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConcurrency extends StObject {
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var Channel: typings.awsSdk.clientsConnectMod.Channel
  
  /**
    * The number of contacts an agent can have on a channel simultaneously. Valid Range for VOICE: Minimum value of 1. Maximum value of 1. Valid Range for CHAT: Minimum value of 1. Maximum value of 10. Valid Range for TASK: Minimum value of 1. Maximum value of 10.
    */
  var Concurrency: typings.awsSdk.clientsConnectMod.Concurrency
  
  /**
    * Defines the cross-channel routing behavior for each channel that is enabled for this Routing Profile. For example, this allows you to offer an agent a different contact from another channel when they are currently working with a contact from a Voice channel.
    */
  var CrossChannelBehavior: js.UndefOr[typings.awsSdk.clientsConnectMod.CrossChannelBehavior] = js.undefined
}
object MediaConcurrency {
  
  inline def apply(Channel: Channel, Concurrency: Concurrency): MediaConcurrency = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Concurrency = Concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConcurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaConcurrency] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setConcurrency(value: Concurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
    
    inline def setCrossChannelBehavior(value: CrossChannelBehavior): Self = StObject.set(x, "CrossChannelBehavior", value.asInstanceOf[js.Any])
    
    inline def setCrossChannelBehaviorUndefined: Self = StObject.set(x, "CrossChannelBehavior", js.undefined)
  }
}
