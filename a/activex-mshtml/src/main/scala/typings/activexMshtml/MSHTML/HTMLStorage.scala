package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLStorage extends js.Object {
  @JSName("MSHTML.HTMLStorage_typekey")
  var MSHTMLDotHTMLStorage_typekey: HTMLStorage
  val constructor: js.Any
  val length: Double
  val remainingSpace: Double
  def clear(): Unit
  def getItem(bstrKey: String): js.Any
  def ie9_setItem(bstrKey: String, bstrValue: String): Unit
  def key(lIndex: Double): String
  def removeItem(bstrKey: String): Unit
  def setItem(bstrKey: String, bstrValue: String): Unit
}

object HTMLStorage {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStorage_typekey: HTMLStorage,
    clear: () => Unit,
    constructor: js.Any,
    getItem: String => js.Any,
    ie9_setItem: (String, String) => Unit,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): HTMLStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), constructor = constructor.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), ie9_setItem = js.Any.fromFunction2(ie9_setItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.updateDynamic("MSHTML.HTMLStorage_typekey")(MSHTMLDotHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStorage]
  }
}

