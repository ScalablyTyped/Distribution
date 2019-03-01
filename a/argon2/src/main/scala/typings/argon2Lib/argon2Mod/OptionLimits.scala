package typings
package argon2Lib.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionLimits extends js.Object {
  var hashLength: NumericLimit
  var memoryCost: NumericLimit
  var parallelism: NumericLimit
  var timeCost: NumericLimit
}

object OptionLimits {
  @scala.inline
  def apply(
    hashLength: NumericLimit,
    memoryCost: NumericLimit,
    parallelism: NumericLimit,
    timeCost: NumericLimit
  ): OptionLimits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashLength")(hashLength)
    __obj.updateDynamic("memoryCost")(memoryCost)
    __obj.updateDynamic("parallelism")(parallelism)
    __obj.updateDynamic("timeCost")(timeCost)
    __obj.asInstanceOf[OptionLimits]
  }
}

