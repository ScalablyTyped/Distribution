package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /**
    * An array of strings, where each string is the unique identifier for a finding that meets the filter criteria specified in the request.
    */
  var findingIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListFindingsResponse {
  
  inline def apply(): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    
    inline def setFindingIds(value: listOfString): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsUndefined: Self = StObject.set(x, "findingIds", js.undefined)
    
    inline def setFindingIdsVarargs(value: string*): Self = StObject.set(x, "findingIds", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
