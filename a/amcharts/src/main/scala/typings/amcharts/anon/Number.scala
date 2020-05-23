package typings.amcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  var number: Double
  var prefix: String
}

object Number {
  @scala.inline
  def apply(number: Double, prefix: String): Number = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

