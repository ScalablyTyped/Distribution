package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLLocation")
@js.native
class HTMLLocation protected () extends js.Object {
  @JSName("MSHTML.HTMLLocation_typekey")
  var MSHTMLDotHTMLLocation_typekey: HTMLLocation = js.native
  val constructor: js.Any = js.native
  var hash: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var search: String = js.native
  def assign(bstr: String): Unit = js.native
  /** @param flag [flag=false] */
  def reload(): Unit = js.native
  def reload(flag: Boolean): Unit = js.native
  def replace(bstr: String): Unit = js.native
}

