package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGTSpanElement")
@js.native
class SVGTSpanElement protected () extends js.Object {
  @JSName("MSHTML.SVGTSpanElement_typekey")
  var MSHTMLDotSVGTSpanElement_typekey: SVGTSpanElement = js.native
  val className: SVGAnimatedString = js.native
  var dx: SVGAnimatedLengthList = js.native
  var dy: SVGAnimatedLengthList = js.native
  val externalResourcesRequired: SVGAnimatedBoolean = js.native
  var focusable: SVGAnimatedEnumeration = js.native
  var lengthAdjust: SVGAnimatedEnumeration = js.native
  var ownerSVGElement: ISVGSVGElement = js.native
  val requiredExtensions: SVGStringList = js.native
  val requiredFeatures: SVGStringList = js.native
  var rotate: SVGAnimatedNumberList = js.native
  val systemLanguage: SVGStringList = js.native
  var textLength: SVGAnimatedLength = js.native
  var viewportElement: ISVGElement = js.native
  var x: SVGAnimatedLengthList = js.native
  var xmlbase: String = js.native
  var xmllang: String = js.native
  var xmlspace: String = js.native
  var y: SVGAnimatedLengthList = js.native
  def getCharNumAtPosition(point: SVGPoint): Double = js.native
  def getComputedTextLength(): Double = js.native
  def getEndPositionOfChar(charnum: Double): SVGPoint = js.native
  def getExtentOfChar(charnum: Double): SVGRect = js.native
  def getNumberOfChars(): Double = js.native
  def getRotationOfChar(charnum: Double): Double = js.native
  def getStartPositionOfChar(charnum: Double): SVGPoint = js.native
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  def hasExtension(extension: String): Boolean = js.native
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
}

