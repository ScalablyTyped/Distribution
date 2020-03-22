package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleBatchRequest extends js.Object {
  /**
    * The action used.
    */
  val action: BatchActionType
  /**
    * The body associated with the request.
    */
  val body: Record[String, _]
  /**
    * The index name where the multiple batch are going to be applied.
    */
  val indexName: String
}

object MultipleBatchRequest {
  @scala.inline
  def apply(action: BatchActionType, body: Record[String, _], indexName: String): MultipleBatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultipleBatchRequest]
  }
}

