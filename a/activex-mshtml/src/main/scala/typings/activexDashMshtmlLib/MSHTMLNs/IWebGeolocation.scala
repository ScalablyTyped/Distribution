package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IWebGeolocation")
@js.native
class IWebGeolocation protected () extends js.Object {
  var `MSHTML.IWebGeolocation_typekey`: IWebGeolocation = js.native
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
  def getCurrentPosition(successCallback: js.Any): scala.Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any): scala.Unit = js.native
  def getCurrentPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): scala.Unit = js.native
  def watchPosition(successCallback: js.Any): scala.Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any): scala.Double = js.native
  def watchPosition(successCallback: js.Any, errorCallback: js.Any, options: js.Any): scala.Double = js.native
}

