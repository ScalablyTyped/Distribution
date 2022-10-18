package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectorsRequest extends StObject {
  
  /**
    * The name prefix that you want to use to search for and list connectors.
    */
  var connectorNamePrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of connectors to list in one response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where the previous operation left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListConnectorsRequest {
  
  inline def apply(): ListConnectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorsRequest]
  }
  
  extension [Self <: ListConnectorsRequest](x: Self) {
    
    inline def setConnectorNamePrefix(value: string): Self = StObject.set(x, "connectorNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setConnectorNamePrefixUndefined: Self = StObject.set(x, "connectorNamePrefix", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
