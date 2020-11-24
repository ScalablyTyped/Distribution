package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGStringList extends js.Object {
  
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
  implicit class SVGStringListOps[Self <: SVGStringList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGStringList_typekey(value: SVGStringList): Self = this.set("MSHTML.SVGStringList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendItem(value: String => String): Self = this.set("appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => String): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: String => String): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (String, Double) => String): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => String): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (String, Double) => String): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
}
