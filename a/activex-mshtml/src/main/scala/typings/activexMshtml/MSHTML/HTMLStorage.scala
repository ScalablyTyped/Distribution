package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStorage extends js.Object {
  
  @JSName("MSHTML.HTMLStorage_typekey")
  var MSHTMLDotHTMLStorage_typekey: HTMLStorage = js.native
  
  def clear(): Unit = js.native
  
  val constructor: js.Any = js.native
  
  def getItem(bstrKey: String): js.Any = js.native
  
  def ie9_setItem(bstrKey: String, bstrValue: String): Unit = js.native
  
  def key(lIndex: Double): String = js.native
  
  val length: Double = js.native
  
  val remainingSpace: Double = js.native
  
  def removeItem(bstrKey: String): Unit = js.native
  
  def setItem(bstrKey: String, bstrValue: String): Unit = js.native
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
  
  @scala.inline
  implicit class HTMLStorageOps[Self <: HTMLStorage] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLStorage_typekey(value: HTMLStorage): Self = this.set("MSHTML.HTMLStorage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItem(value: String => js.Any): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIe9_setItem(value: (String, String) => Unit): Self = this.set("ie9_setItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKey(value: Double => String): Self = this.set("key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingSpace(value: Double): Self = this.set("remainingSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
