package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleBatchResponse extends js.Object {
  /**
    * The list of object ids.
    */
  var objectIDs: js.Array[String] = js.native
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Record[String, Double] = js.native
}

object MultipleBatchResponse {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Record[String, Double]): MultipleBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleBatchResponse]
  }
  @scala.inline
  implicit class MultipleBatchResponseOps[Self <: MultipleBatchResponse] (val x: Self) extends AnyVal {
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
    def setObjectIDsVarargs(value: String*): Self = this.set("objectIDs", js.Array(value :_*))
    @scala.inline
    def setObjectIDs(value: js.Array[String]): Self = this.set("objectIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskID(value: Record[String, Double]): Self = this.set("taskID", value.asInstanceOf[js.Any])
  }
  
}

