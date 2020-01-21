package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.WebGeolocation")
@js.native
class WebGeolocation protected () extends js.Object {
  @JSName("MSHTML.WebGeolocation_typekey")
  var MSHTMLDotWebGeolocation_typekey: WebGeolocation = js.native
  def clearWatch(watchId: Double): Unit = js.native
  def getCurrentPosition(successCallback: js.Any): Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): Unit = js.native
  def watchPosition(successCallback: js.Any): Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any): Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): Double = js.native
}

