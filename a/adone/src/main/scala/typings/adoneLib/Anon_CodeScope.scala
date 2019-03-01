package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeScope extends js.Object {
  var code: java.lang.String
  var scope: js.Object
}

object Anon_CodeScope {
  @scala.inline
  def apply(code: java.lang.String, scope: js.Object): Anon_CodeScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_CodeScope]
  }
}

