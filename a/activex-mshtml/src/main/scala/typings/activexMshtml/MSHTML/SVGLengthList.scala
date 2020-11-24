package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGLengthList extends js.Object {
  
  @JSName("MSHTML.SVGLengthList_typekey")
  var MSHTMLDotSVGLengthList_typekey: SVGLengthList = js.native
  
  def appendItem(newItem: SVGLength): SVGLength = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGLength = js.native
  
  def initialize(newItem: SVGLength): SVGLength = js.native
  
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGLength = js.native
  
  def replaceItem(newItem: SVGLength, index: Double): SVGLength = js.native
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
  implicit class SVGLengthListOps[Self <: SVGLengthList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGLengthList_typekey(value: SVGLengthList): Self = this.set("MSHTML.SVGLengthList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendItem(value: SVGLength => SVGLength): Self = this.set("appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGLength): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGLength => SVGLength): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGLength, Double) => SVGLength): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGLength): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGLength, Double) => SVGLength): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
}
