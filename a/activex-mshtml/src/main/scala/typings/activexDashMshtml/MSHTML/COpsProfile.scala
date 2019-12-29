package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.COpsProfile")
@js.native
class COpsProfile protected () extends js.Object {
  @JSName("MSHTML.COpsProfile_typekey")
  var MSHTMLDotCOpsProfile_typekey: COpsProfile = js.native
  def addReadRequest(name: String): Boolean = js.native
  def addReadRequest(name: String, reserved: js.Any): Boolean = js.native
  def addRequest(name: String): Boolean = js.native
  def addRequest(name: String, reserved: js.Any): Boolean = js.native
  def clearRequest(): Unit = js.native
  def commitChanges(): Boolean = js.native
  def doReadRequest(usage: js.Any): Unit = js.native
  def doReadRequest(usage: js.Any, fname: js.Any): Unit = js.native
  def doReadRequest(usage: js.Any, fname: js.Any, domain: js.Any): Unit = js.native
  def doReadRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any): Unit = js.native
  def doReadRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any, expire: js.Any): Unit = js.native
  def doReadRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any, expire: js.Any, reserved: js.Any): Unit = js.native
  def doRequest(usage: js.Any): Unit = js.native
  def doRequest(usage: js.Any, fname: js.Any): Unit = js.native
  def doRequest(usage: js.Any, fname: js.Any, domain: js.Any): Unit = js.native
  def doRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any): Unit = js.native
  def doRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any, expire: js.Any): Unit = js.native
  def doRequest(usage: js.Any, fname: js.Any, domain: js.Any, path: js.Any, expire: js.Any, reserved: js.Any): Unit = js.native
  def doWriteRequest(): Boolean = js.native
  def getAttribute(name: String): String = js.native
  def setAttribute(name: String, value: String): Boolean = js.native
  def setAttribute(name: String, value: String, prefs: js.Any): Boolean = js.native
}

