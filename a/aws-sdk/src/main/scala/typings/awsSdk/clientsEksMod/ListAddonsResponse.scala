package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAddonsResponse extends StObject {
  
  /**
    * A list of available add-ons.
    */
  var addons: js.UndefOr[StringList] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListAddonsResponse where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListAddonsResponse {
  
  inline def apply(): ListAddonsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAddonsResponse]
  }
  
  extension [Self <: ListAddonsResponse](x: Self) {
    
    inline def setAddons(value: StringList): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    inline def setAddonsUndefined: Self = StObject.set(x, "addons", js.undefined)
    
    inline def setAddonsVarargs(value: String*): Self = StObject.set(x, "addons", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
