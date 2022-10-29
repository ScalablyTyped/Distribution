package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaybackConfigurationsResponse extends StObject {
  
  /**
    * Array of playback configurations. This might be all the available configurations or a subset, depending on the settings that you provide and the total number of configurations stored.
    */
  var Items: js.UndefOr[listOfPlaybackConfiguration] = js.undefined
  
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[_String] = js.undefined
}
object ListPlaybackConfigurationsResponse {
  
  inline def apply(): ListPlaybackConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackConfigurationsResponse]
  }
  
  extension [Self <: ListPlaybackConfigurationsResponse](x: Self) {
    
    inline def setItems(value: listOfPlaybackConfiguration): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: PlaybackConfiguration*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: _String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
