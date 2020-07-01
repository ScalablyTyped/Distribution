package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.algoliaClientSearchStrings.remove
import typings.algoliaClientSearch.algoliaClientSearchStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  /**
    * Text or patterns to remove from the query string.
    */
  val delete: js.UndefOr[String] = js.undefined
  /**
    * Text that should be inserted in place of the removed text inside the query string.
    */
  val insert: js.UndefOr[String] = js.undefined
  /**
    * Type of edit.
    */
  val `type`: js.UndefOr[remove | replace] = js.undefined
}

object Delete {
  @scala.inline
  def apply(delete: String = null, insert: String = null, `type`: remove | replace = null): Delete = {
    val __obj = js.Dynamic.literal()
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

