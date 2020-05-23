package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLStorage extends js.Object {
  @JSName("MSHTML.IHTMLStorage_typekey")
  var MSHTMLDotIHTMLStorage_typekey: IHTMLStorage
  val length: Double
  val remainingSpace: Double
  def clear(): Unit
  def getItem(bstrKey: String): js.Any
  def key(lIndex: Double): String
  def removeItem(bstrKey: String): Unit
  def setItem(bstrKey: String, bstrValue: String): Unit
}

object IHTMLStorage {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLStorage_typekey: IHTMLStorage,
    clear: () => Unit,
    getItem: String => js.Any,
    key: Double => String,
    length: Double,
    remainingSpace: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): IHTMLStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], remainingSpace = remainingSpace.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.updateDynamic("MSHTML.IHTMLStorage_typekey")(MSHTMLDotIHTMLStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStorage]
  }
}

