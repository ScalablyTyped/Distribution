package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesResponse extends StObject {
  
  /**
    * A list of objects that contain information about the entities.
    */
  var entitySummaries: js.UndefOr[EntitySummaries] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEntitiesResponse {
  
  inline def apply(): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setEntitySummaries(value: EntitySummaries): Self = StObject.set(x, "entitySummaries", value.asInstanceOf[js.Any])
    
    inline def setEntitySummariesUndefined: Self = StObject.set(x, "entitySummaries", js.undefined)
    
    inline def setEntitySummariesVarargs(value: EntitySummary*): Self = StObject.set(x, "entitySummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
