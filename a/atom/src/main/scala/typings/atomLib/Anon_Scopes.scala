package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopes extends js.Object {
  var scopes: js.Array[java.lang.String]
  var value: java.lang.String
}

object Anon_Scopes {
  @scala.inline
  def apply(scopes: js.Array[java.lang.String], value: java.lang.String): Anon_Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Scopes]
  }
}

