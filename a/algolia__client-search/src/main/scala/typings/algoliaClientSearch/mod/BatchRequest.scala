package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRequest extends js.Object {
  /**
    * The batch action.
    */
  val action: BatchActionType
  /**
    * The body of the given `action`. Note that, bodies difer
    * depending of the action.
    */
  val body: Record[String, _]
}

object BatchRequest {
  @scala.inline
  def apply(action: BatchActionType, body: Record[String, _]): BatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequest]
  }
}

