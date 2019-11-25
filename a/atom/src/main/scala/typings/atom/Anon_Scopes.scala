package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopes extends js.Object {
  var scopes: js.Array[String]
  var value: String
}

object Anon_Scopes {
  @scala.inline
  def apply(scopes: js.Array[String], value: String): Anon_Scopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Scopes]
  }
}

