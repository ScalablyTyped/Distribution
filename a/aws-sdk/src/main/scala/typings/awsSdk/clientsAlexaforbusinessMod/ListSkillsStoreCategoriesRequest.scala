package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkillsStoreCategoriesRequest extends StObject {
  
  /**
    * The maximum number of categories returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListSkillsStoreCategoriesRequest {
  
  inline def apply(): ListSkillsStoreCategoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreCategoriesRequest]
  }
  
  extension [Self <: ListSkillsStoreCategoriesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
