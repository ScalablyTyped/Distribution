package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsRequest extends StObject {
  
  /**
    * The engine type for the environment.
    */
  var engineType: js.UndefOr[EngineType] = js.undefined
  
  /**
    * The maximum number of environments to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name of the environment.
    */
  var names: js.UndefOr[EntityNameList] = js.undefined
  
  /**
    * A pagination token to control the number of environments displayed in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEnvironmentsRequest {
  
  inline def apply(): ListEnvironmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsRequest]
  }
  
  extension [Self <: ListEnvironmentsRequest](x: Self) {
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNames(value: EntityNameList): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: EntityName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
