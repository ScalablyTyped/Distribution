package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorValue extends js.Object {
  var error: String
  var value: String
}

object Anon_ErrorValue {
  @scala.inline
  def apply(error: String, value: String): Anon_ErrorValue = {
    val __obj = js.Dynamic.literal(error = error, value = value)
  
    __obj.asInstanceOf[Anon_ErrorValue]
  }
}

