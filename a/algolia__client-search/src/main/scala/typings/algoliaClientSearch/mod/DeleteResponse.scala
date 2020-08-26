package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
}

object DeleteResponse {
  @scala.inline
  def apply(taskID: Double): DeleteResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponse]
  }
  @scala.inline
  implicit class DeleteResponseOps[Self <: DeleteResponse] (val x: Self) extends AnyVal {
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
    def setTaskID(value: Double): Self = this.set("taskID", value.asInstanceOf[js.Any])
  }
  
}

