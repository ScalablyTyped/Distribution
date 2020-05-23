package typings.asn1.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrowthFactor extends js.Object {
  var growthFactor: Double
  var size: Double
}

object GrowthFactor {
  @scala.inline
  def apply(growthFactor: Double, size: Double): GrowthFactor = {
    val __obj = js.Dynamic.literal(growthFactor = growthFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrowthFactor]
  }
}

