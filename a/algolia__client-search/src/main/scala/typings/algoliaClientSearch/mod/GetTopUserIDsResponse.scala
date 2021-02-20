package typings.algoliaClientSearch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopUserIDsResponse extends StObject {
  
  /**
    * Mapping of cluster names to top users.
    */
  var topUsers: Record[String, js.Array[UserIDResponse]] = js.native
}
object GetTopUserIDsResponse {
  
  @scala.inline
  def apply(topUsers: Record[String, js.Array[UserIDResponse]]): GetTopUserIDsResponse = {
    val __obj = js.Dynamic.literal(topUsers = topUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopUserIDsResponse]
  }
  
  @scala.inline
  implicit class GetTopUserIDsResponseMutableBuilder[Self <: GetTopUserIDsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopUsers(value: Record[String, js.Array[UserIDResponse]]): Self = StObject.set(x, "topUsers", value.asInstanceOf[js.Any])
  }
}
