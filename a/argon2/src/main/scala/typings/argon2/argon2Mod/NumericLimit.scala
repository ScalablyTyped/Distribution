package typings.argon2.argon2Mod

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
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[NumericLimit]
  }
}

