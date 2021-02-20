package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGStringList extends StObject {
  
  @JSName("MSHTML.SVGStringList_typekey")
  var MSHTMLDotSVGStringList_typekey: SVGStringList = js.native
  
  def appendItem(newItem: String): String = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): String = js.native
  
  def initialize(newItem: String): String = js.native
  
  def insertItemBefore(newItem: String, index: Double): String = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): String = js.native
  
  def replaceItem(newItem: String, index: Double): String = js.native
}
object SVGStringList {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGStringList_typekey: SVGStringList,
    appendItem: String => String,
    clear: () => Unit,
    getItem: Double => String,
    initialize: String => String,
    insertItemBefore: (String, Double) => String,
    numberOfItems: Double,
    removeItem: Double => String,
    replaceItem: (String, Double) => String
  ): SVGStringList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGStringList_typekey")(MSHTMLDotSVGStringList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStringList]
  }
  
  @scala.inline
  implicit class SVGStringListMutableBuilder[Self <: SVGStringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: String => String): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: String => String): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (String, Double) => String): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSHTMLDotSVGStringList_typekey(value: SVGStringList): Self = StObject.set(x, "MSHTML.SVGStringList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => String): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (String, Double) => String): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
