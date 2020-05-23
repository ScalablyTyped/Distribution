package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bearer extends js.Object {
  var bearer: String
}

object Bearer {
  @scala.inline
  def apply(bearer: String): Bearer = {
    val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearer]
  }
}

