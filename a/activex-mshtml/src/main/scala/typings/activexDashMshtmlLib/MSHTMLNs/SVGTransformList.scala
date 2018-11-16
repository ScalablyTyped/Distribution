package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTransformList")
@js.native
class SVGTransformList protected () extends js.Object {
  var `MSHTML.SVGTransformList_typekey`: SVGTransformList = js.native
  var numberOfItems: scala.Double = js.native
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  def clear(): scala.Unit = js.native
  def consolidate(): SVGTransform = js.native
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform = js.native
  def getItem(index: scala.Double): SVGTransform = js.native
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  def insertItemBefore(newItem: SVGTransform, index: scala.Double): SVGTransform = js.native
  def removeItem(index: scala.Double): SVGTransform = js.native
  def replaceItem(newItem: SVGTransform, index: scala.Double): SVGTransform = js.native
}

