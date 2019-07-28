package typings.androiduix.androidNs.widgetNs.NumberPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  def format(value: Double): String
}

object Formatter {
  @scala.inline
  def apply(format: Double => String): Formatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format))
  
    __obj.asInstanceOf[Formatter]
  }
}

