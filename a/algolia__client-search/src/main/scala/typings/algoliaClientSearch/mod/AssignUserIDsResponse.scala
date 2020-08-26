package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignUserIDsResponse extends js.Object {
  /**
    * Date of creation of the userId
    */
  var createdAt: String = js.native
}

object AssignUserIDsResponse {
  @scala.inline
  def apply(createdAt: String): AssignUserIDsResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignUserIDsResponse]
  }
  @scala.inline
  implicit class AssignUserIDsResponseOps[Self <: AssignUserIDsResponse] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
  }
  
}

