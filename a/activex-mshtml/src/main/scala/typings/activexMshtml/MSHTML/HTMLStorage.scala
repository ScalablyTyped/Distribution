package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLStorage")
@js.native
class HTMLStorage protected () extends js.Object {
  @JSName("MSHTML.HTMLStorage_typekey")
  var MSHTMLDotHTMLStorage_typekey: HTMLStorage = js.native
  val constructor: js.Any = js.native
  val length: Double = js.native
  val remainingSpace: Double = js.native
  def clear(): Unit = js.native
  def getItem(bstrKey: String): js.Any = js.native
  def ie9_setItem(bstrKey: String, bstrValue: String): Unit = js.native
  def key(lIndex: Double): String = js.native
  def removeItem(bstrKey: String): Unit = js.native
  def setItem(bstrKey: String, bstrValue: String): Unit = js.native
}

