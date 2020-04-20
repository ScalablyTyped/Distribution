package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsequencePromote extends js.Object {
  /**
    * Unique identifier of the object to promote.
    */
  val objectID: String
  /**
    * Promoted rank for the object (zero-based).
    */
  val position: Double
}

object ConsequencePromote {
  @scala.inline
  def apply(objectID: String, position: Double): ConsequencePromote = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequencePromote]
  }
}

