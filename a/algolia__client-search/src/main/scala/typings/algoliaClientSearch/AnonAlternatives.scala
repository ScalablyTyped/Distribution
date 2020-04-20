package typings.algoliaClientSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlternatives extends js.Object {
  /**
    * The explain query match alternatives.
    */
  val alternatives: js.Array[AnonLength]
}

object AnonAlternatives {
  @scala.inline
  def apply(alternatives: js.Array[AnonLength]): AnonAlternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlternatives]
  }
}

