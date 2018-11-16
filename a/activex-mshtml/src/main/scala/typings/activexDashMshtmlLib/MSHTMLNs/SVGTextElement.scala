package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTextElement")
@js.native
class SVGTextElement protected () extends js.Object {
  var `MSHTML.SVGTextElement_typekey`: SVGTextElement = js.native
  val className: SVGAnimatedString = js.native
  var dx: SVGAnimatedLengthList = js.native
  var dy: SVGAnimatedLengthList = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  val farthestViewportElement: ISVGElement = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  val nearestViewportElement: ISVGElement = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var rotate: SVGAnimatedNumberList = js.native
  val systemLanguage: SVGStringList = js.native
  var textLength: SVGAnimatedLength = js.native
  val transform: SVGAnimatedTransformList = js.native
  var viewportElement: ISVGElement = js.native
  var x: SVGAnimatedLengthList = js.native
  var xmlbase: java.lang.String = js.native
  var xmllang: java.lang.String = js.native
  var xmlspace: java.lang.String = js.native
  var y: SVGAnimatedLengthList = js.native
  def getBBox(): SVGRect = js.native
  def getCTM(): SVGMatrix = js.native
  def getCharNumAtPosition(point: SVGPoint): scala.Double = js.native
  def getComputedTextLength(): scala.Double = js.native
  def getEndPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getExtentOfChar(charnum: scala.Double): SVGRect = js.native
  def getNumberOfChars(): scala.Double = js.native
  def getRotationOfChar(charnum: scala.Double): scala.Double = js.native
  def getScreenCTM(): SVGMatrix = js.native
  def getStartPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getSubStringLength(charnum: scala.Double, nchars: scala.Double): scala.Double = js.native
  def getTransformToElement(pElement: ISVGElement): SVGMatrix = js.native
  def hasExtension(extension: java.lang.String): scala.Boolean = js.native
  def selectSubString(charnum: scala.Double, nchars: scala.Double): scala.Unit = js.native
}

