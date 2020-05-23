package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGNumberList extends js.Object {
  @JSName("MSHTML.SVGNumberList_typekey")
  var MSHTMLDotSVGNumberList_typekey: SVGNumberList
  var numberOfItems: Double
  def appendItem(newItem: SVGNumber): SVGNumber
  def clear(): Unit
  def getItem(index: Double): SVGNumber
  def initialize(newItem: SVGNumber): SVGNumber
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber
  def removeItem(index: Double): SVGNumber
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber
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
}

