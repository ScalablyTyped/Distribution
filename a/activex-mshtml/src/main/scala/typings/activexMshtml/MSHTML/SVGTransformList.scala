package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTransformList")
@js.native
class SVGTransformList protected () extends js.Object {
  @JSName("MSHTML.SVGTransformList_typekey")
  var MSHTMLDotSVGTransformList_typekey: SVGTransformList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  def clear(): Unit = js.native
  def consolidate(): SVGTransform = js.native
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform = js.native
  def getItem(index: Double): SVGTransform = js.native
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  def removeItem(index: Double): SVGTransform = js.native
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}

