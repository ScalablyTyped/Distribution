package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPointList extends js.Object {
  @JSName("MSHTML.SVGPointList_typekey")
  var MSHTMLDotSVGPointList_typekey: SVGPointList
  var numberOfItems: Double
  def appendItem(pNewItem: SVGPoint): SVGPoint
  def clear(): Unit
  def getItem(index: Double): SVGPoint
  def initialize(pNewItem: SVGPoint): SVGPoint
  def insertItemBefore(pNewItem: SVGPoint, index: Double): SVGPoint
  def removeItem(index: Double): SVGPoint
  def replaceItem(pNewItem: SVGPoint, index: Double): SVGPoint
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
}

