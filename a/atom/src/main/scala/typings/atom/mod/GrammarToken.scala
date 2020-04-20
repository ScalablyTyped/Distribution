package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarToken extends js.Object {
  var scopes: js.Array[String]
  var value: String
}

object GrammarToken {
  @scala.inline
  def apply(scopes: js.Array[String], value: String): GrammarToken = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarToken]
  }
}

