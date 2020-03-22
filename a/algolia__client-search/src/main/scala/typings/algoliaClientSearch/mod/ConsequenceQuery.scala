package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.AnonDelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsequenceQuery extends js.Object {
  /**
    * List of edits.
    */
  val edits: js.UndefOr[js.Array[AnonDelete]] = js.undefined
  /**
    * List of removes.
    *
    */
  val remove: js.UndefOr[js.Array[String]] = js.undefined
}

object ConsequenceQuery {
  @scala.inline
  def apply(edits: js.Array[AnonDelete] = null, remove: js.Array[String] = null): ConsequenceQuery = {
    val __obj = js.Dynamic.literal()
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequenceQuery]
  }
}

