package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTipFormatter extends js.Object {
  def tipFormatter(value: Double): String
}

object AnonTipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => String): AnonTipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter))
    __obj.asInstanceOf[AnonTipFormatter]
  }
}

