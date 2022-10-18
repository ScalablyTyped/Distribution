package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiplexProgramsRequest extends StObject {
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MaxResults] = js.undefined
  
  /**
    * The ID of the multiplex that the programs belong to.
    */
  var MultiplexId: string
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListMultiplexProgramsRequest {
  
  inline def apply(MultiplexId: string): ListMultiplexProgramsRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexProgramsRequest]
  }
  
  extension [Self <: ListMultiplexProgramsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
