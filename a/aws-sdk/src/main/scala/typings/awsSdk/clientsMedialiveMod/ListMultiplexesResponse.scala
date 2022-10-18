package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultiplexesResponse extends StObject {
  
  /**
    * List of multiplexes.
    */
  var Multiplexes: js.UndefOr[listOfMultiplexSummary] = js.undefined
  
  /**
    * Token for the next ListMultiplexes request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListMultiplexesResponse {
  
  inline def apply(): ListMultiplexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexesResponse]
  }
  
  extension [Self <: ListMultiplexesResponse](x: Self) {
    
    inline def setMultiplexes(value: listOfMultiplexSummary): Self = StObject.set(x, "Multiplexes", value.asInstanceOf[js.Any])
    
    inline def setMultiplexesUndefined: Self = StObject.set(x, "Multiplexes", js.undefined)
    
    inline def setMultiplexesVarargs(value: MultiplexSummary*): Self = StObject.set(x, "Multiplexes", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
