package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsResponse extends StObject {
  
  /**
    *  The list of channels in the account. 
    */
  var Channels: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Channels] = js.undefined
  
  /**
    * The token to use to get the next page of results after a previous API call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListChannelsResponse {
  
  inline def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: Channels): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
