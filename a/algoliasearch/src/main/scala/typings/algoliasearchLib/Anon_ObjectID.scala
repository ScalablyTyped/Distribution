package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectID extends js.Object {
  /**
    * Unique identifier of the object to promote
    */
  var objectID: java.lang.String
  /**
    *  Promoted rank for the object (zero-based)
    */
  var position: scala.Double
}

object Anon_ObjectID {
  @scala.inline
  def apply(objectID: java.lang.String, position: scala.Double): Anon_ObjectID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_ObjectID]
  }
}

