package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingTypesRequest extends StObject {
  
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object ListThingTypesRequest {
  
  inline def apply(): ListThingTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingTypesRequest]
  }
  
  extension [Self <: ListThingTypesRequest](x: Self) {
    
    inline def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
