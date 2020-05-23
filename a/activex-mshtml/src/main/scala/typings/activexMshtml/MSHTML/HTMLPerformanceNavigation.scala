package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLPerformanceNavigation extends js.Object {
  @JSName("MSHTML.HTMLPerformanceNavigation_typekey")
  var MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation
  val redirectCount: Double
  val `type`: Double
  def toJSON(): js.Any
}

object HTMLPerformanceNavigation {
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): HTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformanceNavigation_typekey")(MSHTMLDotHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceNavigation]
  }
}

