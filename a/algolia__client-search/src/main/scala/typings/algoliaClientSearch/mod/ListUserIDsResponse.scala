package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserIDsResponse extends StObject {
  
  /**
    * List of users id.
    */
  var userIDs: js.Array[UserIDResponse]
}
object ListUserIDsResponse {
  
  inline def apply(userIDs: js.Array[UserIDResponse]): ListUserIDsResponse = {
    val __obj = js.Dynamic.literal(userIDs = userIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserIDsResponse]
  }
  
  extension [Self <: ListUserIDsResponse](x: Self) {
    
    inline def setUserIDs(value: js.Array[UserIDResponse]): Self = StObject.set(x, "userIDs", value.asInstanceOf[js.Any])
    
    inline def setUserIDsVarargs(value: UserIDResponse*): Self = StObject.set(x, "userIDs", js.Array(value :_*))
  }
}
