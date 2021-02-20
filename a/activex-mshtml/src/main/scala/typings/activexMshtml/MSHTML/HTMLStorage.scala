package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStorage extends StObject {
  
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
  implicit class HTMLStorageMutableBuilder[Self <: HTMLStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItem(value: String => js.Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIe9_setItem(value: (String, String) => Unit): Self = StObject.set(x, "ie9_setItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLStorage_typekey(value: HTMLStorage): Self = StObject.set(x, "MSHTML.HTMLStorage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingSpace(value: Double): Self = StObject.set(x, "remainingSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
