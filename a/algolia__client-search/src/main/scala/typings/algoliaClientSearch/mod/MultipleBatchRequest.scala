package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleBatchRequest extends js.Object {
  /**
    * The action used.
    */
  val action: BatchActionType = js.native
  /**
    * The body associated with the request.
    */
  val body: Record[String, _] = js.native
  /**
    * The index name where the multiple batch are going to be applied.
    */
  val indexName: String = js.native
}

object MultipleBatchRequest {
  @scala.inline
  def apply(action: BatchActionType, body: Record[String, _], indexName: String): MultipleBatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleBatchRequest]
  }
  @scala.inline
  implicit class MultipleBatchRequestOps[Self <: MultipleBatchRequest] (val x: Self) extends AnyVal {
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
    def setAction(value: BatchActionType): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Record[String, _]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
  }
  
}

