package typings
package argon2Lib.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericLimit extends js.Object {
  var max: scala.Double
  var min: scala.Double
}

object NumericLimit {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): NumericLimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[NumericLimit]
  }
}

