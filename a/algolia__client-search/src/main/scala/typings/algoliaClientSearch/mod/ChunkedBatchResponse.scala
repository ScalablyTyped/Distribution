package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkedBatchResponse extends js.Object {
  /**
    * The object ids created/updated/deleted by the multiple requests.
    */
  var objectIDs: js.Array[String] = js.native
  /**
    * The operations task ids. May be used to perform a wait task.
    */
  var taskIDs: js.Array[Double] = js.native
}

object ChunkedBatchResponse {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskIDs: js.Array[Double]): ChunkedBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskIDs = taskIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkedBatchResponse]
  }
  @scala.inline
  implicit class ChunkedBatchResponseOps[Self <: ChunkedBatchResponse] (val x: Self) extends AnyVal {
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
    def setTaskIDsVarargs(value: Double*): Self = this.set("taskIDs", js.Array(value :_*))
    @scala.inline
    def setTaskIDs(value: js.Array[Double]): Self = this.set("taskIDs", value.asInstanceOf[js.Any])
  }
  
}

