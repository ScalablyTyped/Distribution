package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGLengthList")
@js.native
class SVGLengthList protected () extends js.Object {
  @JSName("MSHTML.SVGLengthList_typekey")
  var MSHTMLDotSVGLengthList_typekey: SVGLengthList = js.native
  var numberOfItems: Double = js.native
  def appendItem(newItem: SVGLength): SVGLength = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): SVGLength = js.native
  def initialize(newItem: SVGLength): SVGLength = js.native
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength = js.native
  def removeItem(index: Double): SVGLength = js.native
  def replaceItem(newItem: SVGLength, index: Double): SVGLength = js.native
}

