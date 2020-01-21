package typings.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGrowthFactor extends js.Object {
  var growthFactor: Double
  var size: Double
}

object AnonGrowthFactor {
  @scala.inline
  def apply(growthFactor: Double, size: Double): AnonGrowthFactor = {
    val __obj = js.Dynamic.literal(growthFactor = growthFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGrowthFactor]
  }
}

