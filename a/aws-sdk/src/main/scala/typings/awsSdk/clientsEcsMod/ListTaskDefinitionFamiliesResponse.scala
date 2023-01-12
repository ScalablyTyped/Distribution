package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTaskDefinitionFamiliesResponse extends StObject {
  
  /**
    * The list of task definition family names that match the ListTaskDefinitionFamilies request.
    */
  var families: js.UndefOr[StringList] = js.undefined
  
  /**
    * The nextToken value to include in a future ListTaskDefinitionFamilies request. When the results of a ListTaskDefinitionFamilies request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListTaskDefinitionFamiliesResponse {
  
  inline def apply(): ListTaskDefinitionFamiliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionFamiliesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTaskDefinitionFamiliesResponse] (val x: Self) extends AnyVal {
    
    inline def setFamilies(value: StringList): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
    
    inline def setFamiliesUndefined: Self = StObject.set(x, "families", js.undefined)
    
    inline def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
