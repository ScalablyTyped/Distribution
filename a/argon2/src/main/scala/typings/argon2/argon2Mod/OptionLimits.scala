package typings.argon2.argon2Mod

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
    val __obj = js.Dynamic.literal(hashLength = hashLength, memoryCost = memoryCost, parallelism = parallelism, timeCost = timeCost)
  
    __obj.asInstanceOf[OptionLimits]
  }
}

