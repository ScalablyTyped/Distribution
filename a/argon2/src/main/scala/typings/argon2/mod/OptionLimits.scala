package typings.argon2.mod

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
    val __obj = js.Dynamic.literal(hashLength = hashLength.asInstanceOf[js.Any], memoryCost = memoryCost.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], timeCost = timeCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionLimits]
  }
}

