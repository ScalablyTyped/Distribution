package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectWithIdentifier extends js.Object {
  var identifier: String
}

object ObjectWithIdentifier {
  @scala.inline
  def apply(identifier: String): ObjectWithIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectWithIdentifier]
  }
}

