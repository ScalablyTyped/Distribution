package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithObjectID extends js.Object {
  /**
    * The object id of the object.
    */
  val objectID: String
}

object ObjectWithObjectID {
  @scala.inline
  def apply(objectID: String): ObjectWithObjectID = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithObjectID]
  }
}

