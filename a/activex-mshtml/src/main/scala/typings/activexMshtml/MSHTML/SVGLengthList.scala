package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLengthList extends js.Object {
  @JSName("MSHTML.SVGLengthList_typekey")
  var MSHTMLDotSVGLengthList_typekey: SVGLengthList
  var numberOfItems: Double
  def appendItem(newItem: SVGLength): SVGLength
  def clear(): Unit
  def getItem(index: Double): SVGLength
  def initialize(newItem: SVGLength): SVGLength
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength
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
}

