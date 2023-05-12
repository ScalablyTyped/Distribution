package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsInput extends StObject {
  
  /**
    * The name of the domain that you want to list apps for.
    */
  var Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
  
  /**
    * The maximum number of apps to list.
    */
  var MaxResults: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * If SimSpace Weaver returns nextToken, then there are more results available. The value of nextToken is a unique pagination token for each page. To retrieve the next page, call the operation again using the returned token. Keep all other arguments unchanged. If no results remain, then nextToken is set to null. Each pagination token expires after 24 hours. If you provide a token that isn't valid, then you receive an HTTP 400 ValidationException error.
    */
  var NextToken: js.UndefOr[OptionalString] = js.undefined
  
  /**
    * The name of the simulation that you want to list apps for.
    */
  var Simulation: SimSpaceWeaverResourceName
}
object ListAppsInput {
  
  inline def apply(Simulation: SimSpaceWeaverResourceName): ListAppsInput = {
    val __obj = js.Dynamic.literal(Simulation = Simulation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppsInput] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setMaxResults(value: PositiveInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: OptionalString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSimulation(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Simulation", value.asInstanceOf[js.Any])
  }
}
