package typings.asn1.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrowthFactor extends js.Object {
  var growthFactor: Double = js.native
  var size: Double = js.native
}

object GrowthFactor {
  @scala.inline
  def apply(growthFactor: Double, size: Double): GrowthFactor = {
    val __obj = js.Dynamic.literal(growthFactor = growthFactor.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrowthFactor]
  }
  @scala.inline
  implicit class GrowthFactorOps[Self <: GrowthFactor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrowthFactor(value: Double): Self = this.set("growthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

