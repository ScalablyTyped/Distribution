package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  /**
    * Tokens (literals or placeholders) from the query pattern
    * that should be removed from the query string.
    */
  var remove: js.Array[String]
}

object AnonRemove {
  @scala.inline
  def apply(remove: js.Array[String]): AnonRemove = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRemove]
  }
}

