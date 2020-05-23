package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternatives extends js.Object {
  /**
    * The explain query match alternatives.
    */
  var alternatives: js.Array[Length]
}

object Alternatives {
  @scala.inline
  def apply(alternatives: js.Array[Length]): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
}

