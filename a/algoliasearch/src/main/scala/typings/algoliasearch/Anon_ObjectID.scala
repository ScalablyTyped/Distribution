package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectID extends js.Object {
  /**
    * Unique identifier of the object to promote
    */
  var objectID: String
  /**
    *  Promoted rank for the object (zero-based)
    */
  var position: Double
}

object Anon_ObjectID {
  @scala.inline
  def apply(objectID: String, position: Double): Anon_ObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID, position = position)
  
    __obj.asInstanceOf[Anon_ObjectID]
  }
}

