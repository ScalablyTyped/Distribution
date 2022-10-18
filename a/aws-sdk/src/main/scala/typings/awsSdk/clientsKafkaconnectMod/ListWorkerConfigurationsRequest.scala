package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerConfigurationsRequest extends StObject {
  
  /**
    * The maximum number of worker configurations to list in one response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response of a ListWorkerConfigurations operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where the previous operation left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListWorkerConfigurationsRequest {
  
  inline def apply(): ListWorkerConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerConfigurationsRequest]
  }
  
  extension [Self <: ListWorkerConfigurationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
