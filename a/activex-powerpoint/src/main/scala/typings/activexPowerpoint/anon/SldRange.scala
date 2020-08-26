package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.SlideRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SldRange extends js.Object {
  val SldRange: SlideRange = js.native
}

object SldRange {
  @scala.inline
  def apply(SldRange: SlideRange): SldRange = {
    val __obj = js.Dynamic.literal(SldRange = SldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SldRange]
  }
  @scala.inline
  implicit class SldRangeOps[Self <: SldRange] (val x: Self) extends AnyVal {
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
    def setSldRange(value: SlideRange): Self = this.set("SldRange", value.asInstanceOf[js.Any])
  }
  
}

