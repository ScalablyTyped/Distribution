package typings.argon2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLimit extends js.Object {
  var max: Double
  var min: Double
}

object NumericLimit {
  @scala.inline
  def apply(max: Double, min: Double): NumericLimit = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumericLimit]
  }
}

