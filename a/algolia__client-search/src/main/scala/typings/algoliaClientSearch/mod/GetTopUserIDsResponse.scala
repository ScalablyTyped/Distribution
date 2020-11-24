package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopUserIDsResponse extends js.Object {
  
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
  implicit class GetTopUserIDsResponseOps[Self <: GetTopUserIDsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTopUsers(value: Record[String, js.Array[UserIDResponse]]): Self = this.set("topUsers", value.asInstanceOf[js.Any])
  }
}
