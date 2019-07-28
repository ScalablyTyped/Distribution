package typings.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GrowthFactor extends js.Object {
  var growthFactor: Double
  var size: Double
}

object Anon_GrowthFactor {
  @scala.inline
  def apply(growthFactor: Double, size: Double): Anon_GrowthFactor = {
    val __obj = js.Dynamic.literal(growthFactor = growthFactor, size = size)
  
    __obj.asInstanceOf[Anon_GrowthFactor]
  }
}

