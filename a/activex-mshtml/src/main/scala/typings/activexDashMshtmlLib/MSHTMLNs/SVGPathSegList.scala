package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGPathSegList")
@js.native
class SVGPathSegList protected () extends js.Object {
  var `MSHTML.SVGPathSegList_typekey`: SVGPathSegList = js.native
  var numberOfItems: scala.Double = js.native
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  def clear(): scala.Unit = js.native
  def getItem(index: scala.Double): SVGPathSeg = js.native
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  def insertItemBefore(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg = js.native
  def removeItem(index: scala.Double): SVGPathSeg = js.native
  def replaceItem(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg = js.native
}

