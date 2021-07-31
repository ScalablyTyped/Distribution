package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGLengthList extends StObject {
  
  @JSName("MSHTML.SVGLengthList_typekey")
  var MSHTMLDotSVGLengthList_typekey: SVGLengthList
  
  def appendItem(newItem: SVGLength): SVGLength
  
  def clear(): Unit
  
  def getItem(index: Double): SVGLength
  
  def initialize(newItem: SVGLength): SVGLength
  
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength
  
  var numberOfItems: Double
  
  def removeItem(index: Double): SVGLength
  
  def replaceItem(newItem: SVGLength, index: Double): SVGLength
}
object SVGLengthList {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGLengthList_typekey: SVGLengthList,
    appendItem: SVGLength => SVGLength,
    clear: () => Unit,
    getItem: Double => SVGLength,
    initialize: SVGLength => SVGLength,
    insertItemBefore: (SVGLength, Double) => SVGLength,
    numberOfItems: Double,
    removeItem: Double => SVGLength,
    replaceItem: (SVGLength, Double) => SVGLength
  ): SVGLengthList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGLengthList_typekey")(MSHTMLDotSVGLengthList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLengthList]
  }
  
  @scala.inline
  implicit class SVGLengthListMutableBuilder[Self <: SVGLengthList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGLength => SVGLength): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGLength): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGLength => SVGLength): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGLength, Double) => SVGLength): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSHTMLDotSVGLengthList_typekey(value: SVGLengthList): Self = StObject.set(x, "MSHTML.SVGLengthList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGLength): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGLength, Double) => SVGLength): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
