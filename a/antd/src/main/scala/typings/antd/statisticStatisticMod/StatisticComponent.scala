package typings.antd.statisticStatisticMod

import typings.antd.anon.TypeofCountdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticComponent extends js.Object {
  var Countdown: TypeofCountdown = js.native
}

object StatisticComponent {
  @scala.inline
  def apply(Countdown: TypeofCountdown): StatisticComponent = {
    val __obj = js.Dynamic.literal(Countdown = Countdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticComponent]
  }
  @scala.inline
  implicit class StatisticComponentOps[Self <: StatisticComponent] (val x: Self) extends AnyVal {
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
    def setCountdown(value: TypeofCountdown): Self = this.set("Countdown", value.asInstanceOf[js.Any])
  }
  
}

