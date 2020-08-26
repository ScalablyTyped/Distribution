package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPerformanceTiming extends js.Object {
  @JSName("MSHTML.HTMLPerformanceTiming_typekey")
  var MSHTMLDotHTMLPerformanceTiming_typekey: HTMLPerformanceTiming = js.native
  val connectEnd: Double = js.native
  val connectStart: Double = js.native
  val domComplete: Double = js.native
  val domContentLoadedEventEnd: Double = js.native
  val domContentLoadedEventStart: Double = js.native
  val domInteractive: Double = js.native
  val domLoading: Double = js.native
  val domainLookupEnd: Double = js.native
  val domainLookupStart: Double = js.native
  val fetchStart: Double = js.native
  val loadEventEnd: Double = js.native
  val loadEventStart: Double = js.native
  val msFirstPaint: Double = js.native
  val navigationStart: Double = js.native
  val redirectEnd: Double = js.native
  val redirectStart: Double = js.native
  val requestStart: Double = js.native
  val responseEnd: Double = js.native
  val responseStart: Double = js.native
  val unloadEventEnd: Double = js.native
  val unloadEventStart: Double = js.native
  def toJSON(): js.Any = js.native
}

object HTMLPerformanceTiming {
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformanceTiming_typekey: HTMLPerformanceTiming,
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
  ): HTMLPerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], msFirstPaint = msFirstPaint.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPerformanceTiming_typekey")(MSHTMLDotHTMLPerformanceTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceTiming]
  }
  @scala.inline
  implicit class HTMLPerformanceTimingOps[Self <: HTMLPerformanceTiming] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTMLPerformanceTiming_typekey(value: HTMLPerformanceTiming): Self = this.set("MSHTML.HTMLPerformanceTiming_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectEnd(value: Double): Self = this.set("connectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectStart(value: Double): Self = this.set("connectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomComplete(value: Double): Self = this.set("domComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = this.set("domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = this.set("domContentLoadedEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomInteractive(value: Double): Self = this.set("domInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomLoading(value: Double): Self = this.set("domLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = this.set("domainLookupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainLookupStart(value: Double): Self = this.set("domainLookupStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventEnd(value: Double): Self = this.set("loadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadEventStart(value: Double): Self = this.set("loadEventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsFirstPaint(value: Double): Self = this.set("msFirstPaint", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationStart(value: Double): Self = this.set("navigationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectEnd(value: Double): Self = this.set("redirectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectStart(value: Double): Self = this.set("redirectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestStart(value: Double): Self = this.set("requestStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseEnd(value: Double): Self = this.set("responseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseStart(value: Double): Self = this.set("responseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = this.set("unloadEventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnloadEventStart(value: Double): Self = this.set("unloadEventStart", value.asInstanceOf[js.Any])
  }
  
}

