package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsResponse extends StObject {
  
  /**
    * A list of Channel records.
    */
  var Channels: js.UndefOr[listOfChannel] = js.undefined
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListChannelsResponse {
  
  inline def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  extension [Self <: ListChannelsResponse](x: Self) {
    
    inline def setChannels(value: listOfChannel): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
