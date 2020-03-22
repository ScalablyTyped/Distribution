package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResponse extends js.Object {
  /**
    * The object ids created/updated by the batch request.
    */
  val objectIDs: js.Array[String]
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object BatchResponse {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Double): BatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchResponse]
  }
}

