package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TipFormatter extends js.Object {
  def tipFormatter(value: scala.Double): java.lang.String
}

object Anon_TipFormatter {
  @scala.inline
  def apply(tipFormatter: scala.Double => java.lang.String): Anon_TipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter))
  
    __obj.asInstanceOf[Anon_TipFormatter]
  }
}

