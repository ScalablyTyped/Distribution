package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegList extends js.Object {
  
  @JSName("MSHTML.SVGPathSegList_typekey")
  var MSHTMLDotSVGPathSegList_typekey: SVGPathSegList = js.native
  
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGPathSeg = js.native
  
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGPathSeg = js.native
  
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
}
object SVGPathSegList {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SVGPathSegListOps[Self <: SVGPathSegList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGPathSegList_typekey(value: SVGPathSegList): Self = this.set("MSHTML.SVGPathSegList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendItem(value: SVGPathSeg => SVGPathSeg): Self = this.set("appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGPathSeg): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGPathSeg => SVGPathSeg): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGPathSeg, Double) => SVGPathSeg): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGPathSeg): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGPathSeg, Double) => SVGPathSeg): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
}
