package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIndexResponse extends js.Object {
  /**
    * The unique identifier of the index. Use this identifier when you query an index, set up a data source, or index a document.
    */
  var Id: js.UndefOr[IndexId] = js.native
}

object CreateIndexResponse {
  @scala.inline
  def apply(Id: IndexId = null): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexResponse]
  }
}

