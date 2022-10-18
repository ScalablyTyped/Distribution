package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationChannelsResponse extends StObject {
  
  /**
    *  An array that contains the requested notification channels. 
    */
  var Channels: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.Channels] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListNotificationChannelsResponse {
  
  inline def apply(): ListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationChannelsResponse]
  }
  
  extension [Self <: ListNotificationChannelsResponse](x: Self) {
    
    inline def setChannels(value: Channels): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: NotificationChannel*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
