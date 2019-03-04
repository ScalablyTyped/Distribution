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
  def apply(tipFormatter: js.Function1[scala.Double, java.lang.String]): Anon_TipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = tipFormatter)
  
    __obj.asInstanceOf[Anon_TipFormatter]
  }
}

