package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomPluginsRequest extends StObject {
  
  /**
    * The maximum number of custom plugins to list in one response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where the previous operation left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListCustomPluginsRequest {
  
  inline def apply(): ListCustomPluginsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomPluginsRequest]
  }
  
  extension [Self <: ListCustomPluginsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
