package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPointList extends StObject {
  
  @JSName("MSHTML.SVGPointList_typekey")
  var MSHTMLDotSVGPointList_typekey: SVGPointList = js.native
  
  def appendItem(pNewItem: SVGPoint): SVGPoint = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGPoint = js.native
  
  def initialize(pNewItem: SVGPoint): SVGPoint = js.native
  
  def insertItemBefore(pNewItem: SVGPoint, index: Double): SVGPoint = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGPoint = js.native
  
  def replaceItem(pNewItem: SVGPoint, index: Double): SVGPoint = js.native
}
object SVGPointList {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGPointListMutableBuilder[Self <: SVGPointList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGPoint => SVGPoint): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGPoint): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGPoint => SVGPoint): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGPoint, Double) => SVGPoint): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSHTMLDotSVGPointList_typekey(value: SVGPointList): Self = StObject.set(x, "MSHTML.SVGPointList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGPoint): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGPoint, Double) => SVGPoint): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
