package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remove extends js.Object {
  /**
    * Tokens (literals or placeholders) from the query pattern
    * that should be removed from the query string.
    */
  var remove: js.Array[java.lang.String]
}

object Anon_Remove {
  @scala.inline
  def apply(remove: js.Array[java.lang.String]): Anon_Remove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_Remove]
  }
}

