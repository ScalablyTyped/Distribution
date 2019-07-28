package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TipFormatter extends js.Object {
  def tipFormatter(value: Double): String
}

object Anon_TipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => String): Anon_TipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter))
  
    __obj.asInstanceOf[Anon_TipFormatter]
  }
}

