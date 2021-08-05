package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPointList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPointList_typekey")
  var MSHTMLDotSVGPointList_typekey: SVGPointList
  
  def appendItem(pNewItem: SVGPoint): SVGPoint
  
  def clear(): Unit
  
  def getItem(index: Double): SVGPoint
  
  def initialize(pNewItem: SVGPoint): SVGPoint
  
  def insertItemBefore(pNewItem: SVGPoint, index: Double): SVGPoint
  
  var numberOfItems: Double
  
  def removeItem(index: Double): SVGPoint
  
  def replaceItem(pNewItem: SVGPoint, index: Double): SVGPoint
}
object SVGPointList {
  
  inline def apply(
    MSHTMLDotSVGPointList_typekey: SVGPointList,
    appendItem: SVGPoint => SVGPoint,
    clear: () => Unit,
    getItem: Double => SVGPoint,
    initialize: SVGPoint => SVGPoint,
    insertItemBefore: (SVGPoint, Double) => SVGPoint,
    numberOfItems: Double,
    removeItem: Double => SVGPoint,
    replaceItem: (SVGPoint, Double) => SVGPoint
  ): SVGPointList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGPointList_typekey")(MSHTMLDotSVGPointList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPointList]
  }
  
  extension [Self <: SVGPointList](x: Self) {
    
    inline def setAppendItem(value: SVGPoint => SVGPoint): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => SVGPoint): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: SVGPoint => SVGPoint): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInsertItemBefore(value: (SVGPoint, Double) => SVGPoint): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotSVGPointList_typekey(value: SVGPointList): Self = StObject.set(x, "MSHTML.SVGPointList_typekey", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: Double => SVGPoint): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setReplaceItem(value: (SVGPoint, Double) => SVGPoint): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
