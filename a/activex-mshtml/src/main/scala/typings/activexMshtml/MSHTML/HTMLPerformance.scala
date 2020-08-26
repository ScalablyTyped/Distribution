package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPerformance extends js.Object {
  @JSName("MSHTML.HTMLPerformance_typekey")
  var MSHTMLDotHTMLPerformance_typekey: HTMLPerformance = js.native
  val navigation: IHTMLPerformanceNavigation = js.native
  val timing: IHTMLPerformanceTiming = js.native
  def toJSON(): js.Any = js.native
}

object HTMLPerformance {
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformance_typekey: HTMLPerformance,
    navigation: IHTMLPerformanceNavigation,
    timing: IHTMLPerformanceTiming,
    toJSON: () => js.Any
  ): HTMLPerformance = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformance_typekey")(MSHTMLDotHTMLPerformance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformance]
  }
  @scala.inline
  implicit class HTMLPerformanceOps[Self <: HTMLPerformance] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTMLPerformance_typekey(value: HTMLPerformance): Self = this.set("MSHTML.HTMLPerformance_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigation(value: IHTMLPerformanceNavigation): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiming(value: IHTMLPerformanceTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

