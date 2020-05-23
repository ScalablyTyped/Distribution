package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scopes extends js.Object {
  var scopes: js.Array[String]
  var value: String
}

object Scopes {
  @scala.inline
  def apply(scopes: js.Array[String], value: String): Scopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
}

