package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X3DChartWindowProvider extends js.Object {
  def setWindow(window: Double): Unit = js.native
}

object X3DChartWindowProvider {
  @scala.inline
  def apply(setWindow: Double => Unit): X3DChartWindowProvider = {
    val __obj = js.Dynamic.literal(setWindow = js.Any.fromFunction1(setWindow))
    __obj.asInstanceOf[X3DChartWindowProvider]
  }
  @scala.inline
  implicit class X3DChartWindowProviderOps[Self <: X3DChartWindowProvider] (val x: Self) extends AnyVal {
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
    def setSetWindow(value: Double => Unit): Self = this.set("setWindow", js.Any.fromFunction1(value))
  }
  
}

