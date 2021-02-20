package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGNumberList extends StObject {
  
  @JSName("MSHTML.SVGNumberList_typekey")
  var MSHTMLDotSVGNumberList_typekey: SVGNumberList = js.native
  
  def appendItem(newItem: SVGNumber): SVGNumber = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGNumber = js.native
  
  def initialize(newItem: SVGNumber): SVGNumber = js.native
  
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGNumber = js.native
  
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber = js.native
}
object SVGNumberList {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGNumberListMutableBuilder[Self <: SVGNumberList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGNumber => SVGNumber): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGNumber): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGNumber => SVGNumber): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGNumber, Double) => SVGNumber): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSHTMLDotSVGNumberList_typekey(value: SVGNumberList): Self = StObject.set(x, "MSHTML.SVGNumberList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGNumber): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGNumber, Double) => SVGNumber): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
