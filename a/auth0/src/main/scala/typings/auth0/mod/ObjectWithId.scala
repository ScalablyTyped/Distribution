package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithId extends js.Object {
  var id: String
}

object ObjectWithId {
  @scala.inline
  def apply(id: String): ObjectWithId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectWithId]
  }
}

