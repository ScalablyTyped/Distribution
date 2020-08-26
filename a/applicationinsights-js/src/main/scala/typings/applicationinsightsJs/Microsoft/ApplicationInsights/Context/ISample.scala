package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISample extends js.Object {
  /**
    * Sample rate
    */
  var sampleRate: Double = js.native
}

object ISample {
  @scala.inline
  def apply(sampleRate: Double): ISample = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISample]
  }
  @scala.inline
  implicit class ISampleOps[Self <: ISample] (val x: Self) extends AnyVal {
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
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
  }
  
}

