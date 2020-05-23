package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLPerformance extends js.Object {
  @JSName("MSHTML.HTMLPerformance_typekey")
  var MSHTMLDotHTMLPerformance_typekey: HTMLPerformance
  val navigation: IHTMLPerformanceNavigation
  val timing: IHTMLPerformanceTiming
  def toJSON(): js.Any
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
}

