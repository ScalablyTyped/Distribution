package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGStringList extends js.Object {
  @JSName("MSHTML.SVGStringList_typekey")
  var MSHTMLDotSVGStringList_typekey: SVGStringList
  var numberOfItems: Double
  def appendItem(newItem: String): String
  def clear(): Unit
  def getItem(index: Double): String
  def initialize(newItem: String): String
  def insertItemBefore(newItem: String, index: Double): String
  def removeItem(index: Double): String
  def replaceItem(newItem: String, index: Double): String
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
}

