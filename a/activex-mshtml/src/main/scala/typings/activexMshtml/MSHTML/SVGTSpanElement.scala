package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTSpanElement extends js.Object {
  @JSName("MSHTML.SVGTSpanElement_typekey")
  var MSHTMLDotSVGTSpanElement_typekey: SVGTSpanElement
  val className: SVGAnimatedString
  var dx: SVGAnimatedLengthList
  var dy: SVGAnimatedLengthList
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var lengthAdjust: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  var rotate: SVGAnimatedNumberList
  val systemLanguage: SVGStringList
  var textLength: SVGAnimatedLength
  var viewportElement: ISVGElement
  var x: SVGAnimatedLengthList
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y: SVGAnimatedLengthList
  def getCharNumAtPosition(point: SVGPoint): Double
  def getComputedTextLength(): Double
  def getEndPositionOfChar(charnum: Double): SVGPoint
  def getExtentOfChar(charnum: Double): SVGRect
  def getNumberOfChars(): Double
  def getRotationOfChar(charnum: Double): Double
  def getStartPositionOfChar(charnum: Double): SVGPoint
  def getSubStringLength(charnum: Double, nchars: Double): Double
  def hasExtension(extension: String): Boolean
  def selectSubString(charnum: Double, nchars: Double): Unit
}

object SVGTSpanElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGTSpanElement_typekey: SVGTSpanElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTSpanElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTSpanElement_typekey")(MSHTMLDotSVGTSpanElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTSpanElement]
  }
}

