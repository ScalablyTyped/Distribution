package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGNumberList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGNumberList_typekey")
  var MSHTMLDotSVGNumberList_typekey: SVGNumberList
  
  def appendItem(newItem: SVGNumber): SVGNumber
  
  def clear(): Unit
  
  def getItem(index: Double): SVGNumber
  
  def initialize(newItem: SVGNumber): SVGNumber
  
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber
  
  var numberOfItems: Double
  
  def removeItem(index: Double): SVGNumber
  
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber
}
object SVGNumberList {
  
  inline def apply(
    MSHTMLDotSVGNumberList_typekey: SVGNumberList,
    appendItem: SVGNumber => SVGNumber,
    clear: () => Unit,
    getItem: Double => SVGNumber,
    initialize: SVGNumber => SVGNumber,
    insertItemBefore: (SVGNumber, Double) => SVGNumber,
    numberOfItems: Double,
    removeItem: Double => SVGNumber,
    replaceItem: (SVGNumber, Double) => SVGNumber
  ): SVGNumberList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGNumberList_typekey")(MSHTMLDotSVGNumberList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumberList]
  }
  
  extension [Self <: SVGNumberList](x: Self) {
    
    inline def setAppendItem(value: SVGNumber => SVGNumber): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => SVGNumber): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: SVGNumber => SVGNumber): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInsertItemBefore(value: (SVGNumber, Double) => SVGNumber): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotSVGNumberList_typekey(value: SVGNumberList): Self = StObject.set(x, "MSHTML.SVGNumberList_typekey", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: Double => SVGNumber): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setReplaceItem(value: (SVGNumber, Double) => SVGNumber): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
