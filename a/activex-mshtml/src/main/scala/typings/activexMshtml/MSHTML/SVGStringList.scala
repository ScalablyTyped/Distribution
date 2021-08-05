package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGStringList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGStringList_typekey")
  var MSHTMLDotSVGStringList_typekey: SVGStringList
  
  def appendItem(newItem: String): String
  
  def clear(): Unit
  
  def getItem(index: Double): String
  
  def initialize(newItem: String): String
  
  def insertItemBefore(newItem: String, index: Double): String
  
  var numberOfItems: Double
  
  def removeItem(index: Double): String
  
  def replaceItem(newItem: String, index: Double): String
}
object SVGStringList {
  
  inline def apply(
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
  
  extension [Self <: SVGStringList](x: Self) {
    
    inline def setAppendItem(value: String => String): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: String => String): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInsertItemBefore(value: (String, Double) => String): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotSVGStringList_typekey(value: SVGStringList): Self = StObject.set(x, "MSHTML.SVGStringList_typekey", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: Double => String): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setReplaceItem(value: (String, Double) => String): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
