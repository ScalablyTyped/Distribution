package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorValue extends js.Object {
  var error: java.lang.String
  var value: java.lang.String
}

object Anon_ErrorValue {
  @scala.inline
  def apply(error: java.lang.String, value: java.lang.String): Anon_ErrorValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ErrorValue]
  }
}

