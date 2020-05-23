package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remove extends js.Object {
  /**
    * Tokens (literals or placeholders) from the query pattern
    * that should be removed from the query string.
    */
  var remove: js.Array[String]
}

object Remove {
  @scala.inline
  def apply(remove: js.Array[String]): Remove = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
}

