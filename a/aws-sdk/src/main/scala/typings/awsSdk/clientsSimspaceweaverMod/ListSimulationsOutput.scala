package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSimulationsOutput extends StObject {
  
  /**
    * If SimSpace Weaver returns nextToken, then there are more results available. The value of nextToken is a unique pagination token for each page. To retrieve the next page, call the operation again using the returned token. Keep all other arguments unchanged. If no results remain, then nextToken is set to null. Each pagination token expires after 24 hours. If you provide a token that isn't valid, then you receive an HTTP 400 ValidationException error.
    */
  var NextToken: js.UndefOr[OptionalString] = js.undefined
  
  /**
    * The list of simulations.
    */
  var Simulations: js.UndefOr[SimulationList] = js.undefined
}
object ListSimulationsOutput {
  
  inline def apply(): ListSimulationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSimulationsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: OptionalString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSimulations(value: SimulationList): Self = StObject.set(x, "Simulations", value.asInstanceOf[js.Any])
    
    inline def setSimulationsUndefined: Self = StObject.set(x, "Simulations", js.undefined)
    
    inline def setSimulationsVarargs(value: SimulationMetadata*): Self = StObject.set(x, "Simulations", js.Array(value*))
  }
}
