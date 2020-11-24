package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveUserIDResponse extends js.Object {
  
  /**
    * When the given `userID` got removed.
    */
  var deletedAt: String = js.native
}
object RemoveUserIDResponse {
  
  @scala.inline
  def apply(deletedAt: String): RemoveUserIDResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveUserIDResponse]
  }
  
  @scala.inline
  implicit class RemoveUserIDResponseOps[Self <: RemoveUserIDResponse] (val x: Self) extends AnyVal {
    
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
    def setDeletedAt(value: String): Self = this.set("deletedAt", value.asInstanceOf[js.Any])
  }
}
