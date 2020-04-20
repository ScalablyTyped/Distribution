package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectID extends js.Object {
  /**
    * Unique identifier of the object to promote
    */
  var objectID: String
  /**
    *  Promoted rank for the object (zero-based)
    */
  var position: Double
}

object AnonObjectID {
  @scala.inline
  def apply(objectID: String, position: Double): AnonObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectID]
  }
}

