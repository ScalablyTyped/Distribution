package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLPerformanceNavigation extends js.Object {
  @JSName("MSHTML.IHTMLPerformanceNavigation_typekey")
  var MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation
  val redirectCount: Double
  val `type`: Double
  def toJSON(): js.Any
}

object IHTMLPerformanceNavigation {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): IHTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.IHTMLPerformanceNavigation_typekey")(MSHTMLDotIHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceNavigation]
  }
}

