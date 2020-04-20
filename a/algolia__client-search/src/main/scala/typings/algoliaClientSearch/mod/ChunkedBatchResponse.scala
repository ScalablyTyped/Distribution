package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkedBatchResponse extends js.Object {
  /**
    * The object ids created/updated/deleted by the multiple requests.
    */
  val objectIDs: js.Array[String]
  /**
    * The operations task ids. May be used to perform a wait task.
    */
  val taskIDs: js.Array[Double]
}

object ChunkedBatchResponse {
  @scala.inline
  def apply(objectIDs: js.Array[String], taskIDs: js.Array[Double]): ChunkedBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskIDs = taskIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkedBatchResponse]
  }
}

