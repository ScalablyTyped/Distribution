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
  
  @scala.inline
  def apply(userIDs: js.Array[UserIDResponse]): ListUserIDsResponse = {
    val __obj = js.Dynamic.literal(userIDs = userIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserIDsResponse]
  }
  
  @scala.inline
  implicit class ListUserIDsResponseMutableBuilder[Self <: ListUserIDsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserIDs(value: js.Array[UserIDResponse]): Self = StObject.set(x, "userIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIDsVarargs(value: UserIDResponse*): Self = StObject.set(x, "userIDs", js.Array(value :_*))
  }
}
