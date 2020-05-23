package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectID extends js.Object {
  /**
    * Unique identifier of the object to promote
    */
  var objectID: String
  /**
    *  Promoted rank for the object (zero-based)
    */
  var position: Double
}

object ObjectID {
  @scala.inline
  def apply(objectID: String, position: Double): ObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectID]
  }
}

