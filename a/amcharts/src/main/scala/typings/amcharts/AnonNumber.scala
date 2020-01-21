package typings.amcharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumber extends js.Object {
  var number: Double
  var prefix: String
}

object AnonNumber {
  @scala.inline
  def apply(number: Double, prefix: String): AnonNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNumber]
  }
}

