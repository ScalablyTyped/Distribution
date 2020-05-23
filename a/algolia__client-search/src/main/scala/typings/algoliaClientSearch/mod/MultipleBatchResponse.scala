package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleBatchResponse extends js.Object {
  /**
    * The list of object ids.
    */
  var objectIDs: js.Array[String]
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Record[String, Double]
}

object MultipleBatchResponse {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Record[String, Double]): MultipleBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleBatchResponse]
  }
}

