package typings.awsSdk.clientsIotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTunnelsRequest extends StObject {
  
  /**
    * The maximum number of results to return at once.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the IoT thing associated with the destination device.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object ListTunnelsRequest {
  
  inline def apply(): ListTunnelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelsRequest]
  }
  
  extension [Self <: ListTunnelsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
