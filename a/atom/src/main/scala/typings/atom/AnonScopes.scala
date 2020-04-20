package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopes extends js.Object {
  var scopes: js.Array[String]
  var value: String
}

object AnonScopes {
  @scala.inline
  def apply(scopes: js.Array[String], value: String): AnonScopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
}

