package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLPerformanceTiming extends js.Object {
  @JSName("MSHTML.IHTMLPerformanceTiming_typekey")
  var MSHTMLDotIHTMLPerformanceTiming_typekey: IHTMLPerformanceTiming
  val connectEnd: Double
  val connectStart: Double
  val domComplete: Double
  val domContentLoadedEventEnd: Double
  val domContentLoadedEventStart: Double
  val domInteractive: Double
  val domLoading: Double
  val domainLookupEnd: Double
  val domainLookupStart: Double
  val fetchStart: Double
  val loadEventEnd: Double
  val loadEventStart: Double
  val msFirstPaint: Double
  val navigationStart: Double
  val redirectEnd: Double
  val redirectStart: Double
  val requestStart: Double
  val responseEnd: Double
  val responseStart: Double
  val unloadEventEnd: Double
  val unloadEventStart: Double
  def toJSON(): js.Any
}

object IHTMLPerformanceTiming {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLPerformanceTiming_typekey: IHTMLPerformanceTiming,
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    msFirstPaint: Double,
    navigationStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    toJSON: () => js.Any,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): IHTMLPerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], msFirstPaint = msFirstPaint.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLPerformanceTiming_typekey")(MSHTMLDotIHTMLPerformanceTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceTiming]
  }
}

