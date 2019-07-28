package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IWebGeolocation")
@js.native
class IWebGeolocation protected () extends js.Object {
  var `MSHTML.IWebGeolocation_typekey`: IWebGeolocation = js.native
  def clearWatch(watchId: Double): Unit = js.native
  def getCurrentPosition(successCallback: js.Any): Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): Unit = js.native
  def watchPosition(successCallback: js.Any): Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any): Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): Double = js.native
}

