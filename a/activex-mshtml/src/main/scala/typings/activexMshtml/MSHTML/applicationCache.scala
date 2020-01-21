package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.applicationCache")
@js.native
class applicationCache protected () extends js.Object {
  @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache = js.native
  var oncached: js.Any = js.native
  var onchecking: js.Any = js.native
  var ondownloading: js.Any = js.native
  var onerror: js.Any = js.native
  var onnoupdate: js.Any = js.native
  var onobsolete: js.Any = js.native
  var onprogress: js.Any = js.native
  var onupdateready: js.Any = js.native
  val status: Double = js.native
  def abort(): Unit = js.native
  def swapCache(): Unit = js.native
  def update(): Unit = js.native
}

