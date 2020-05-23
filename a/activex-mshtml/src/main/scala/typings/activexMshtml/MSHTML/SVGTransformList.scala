package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTransformList extends js.Object {
  @JSName("MSHTML.SVGTransformList_typekey")
  var MSHTMLDotSVGTransformList_typekey: SVGTransformList
  var numberOfItems: Double
  def appendItem(newItem: SVGTransform): SVGTransform
  def clear(): Unit
  def consolidate(): SVGTransform
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform
  def getItem(index: Double): SVGTransform
  def initialize(newItem: SVGTransform): SVGTransform
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform
  def removeItem(index: Double): SVGTransform
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform
}

object SVGTransformList {
  @scala.inline
  def apply(
    MSHTMLDotSVGTransformList_typekey: SVGTransformList,
    appendItem: SVGTransform => SVGTransform,
    clear: () => Unit,
    consolidate: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGTransformList_typekey")(MSHTMLDotSVGTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransformList]
  }
}

