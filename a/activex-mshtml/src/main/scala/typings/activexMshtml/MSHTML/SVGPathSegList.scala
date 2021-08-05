package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegList_typekey")
  var MSHTMLDotSVGPathSegList_typekey: SVGPathSegList
  
  def appendItem(newItem: SVGPathSeg): SVGPathSeg
  
  def clear(): Unit
  
  def getItem(index: Double): SVGPathSeg
  
  def initialize(newItem: SVGPathSeg): SVGPathSeg
  
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg
  
  var numberOfItems: Double
  
  def removeItem(index: Double): SVGPathSeg
  
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg
}
object SVGPathSegList {
  
  inline def apply(
    MSHTMLDotSVGPathSegList_typekey: SVGPathSegList,
    appendItem: SVGPathSeg => SVGPathSeg,
    clear: () => Unit,
    getItem: Double => SVGPathSeg,
    initialize: SVGPathSeg => SVGPathSeg,
    insertItemBefore: (SVGPathSeg, Double) => SVGPathSeg,
    numberOfItems: Double,
    removeItem: Double => SVGPathSeg,
    replaceItem: (SVGPathSeg, Double) => SVGPathSeg
  ): SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGPathSegList_typekey")(MSHTMLDotSVGPathSegList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegList]
  }
  
  extension [Self <: SVGPathSegList](x: Self) {
    
    inline def setAppendItem(value: SVGPathSeg => SVGPathSeg): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => SVGPathSeg): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: SVGPathSeg => SVGPathSeg): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setInsertItemBefore(value: (SVGPathSeg, Double) => SVGPathSeg): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    inline def setMSHTMLDotSVGPathSegList_typekey(value: SVGPathSegList): Self = StObject.set(x, "MSHTML.SVGPathSegList_typekey", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: Double => SVGPathSeg): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setReplaceItem(value: (SVGPathSeg, Double) => SVGPathSeg): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
