package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTextElement extends js.Object {
  @JSName("MSHTML.SVGTextElement_typekey")
  var MSHTMLDotSVGTextElement_typekey: SVGTextElement
  val className: SVGAnimatedString
  var dx: SVGAnimatedLengthList
  var dy: SVGAnimatedLengthList
  val externalResourcesRequired: SVGAnimatedBoolean
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  var lengthAdjust: SVGAnimatedEnumeration
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  var rotate: SVGAnimatedNumberList
  val systemLanguage: SVGStringList
  var textLength: SVGAnimatedLength
  val transform: SVGAnimatedTransformList
  var viewportElement: ISVGElement
  var x: SVGAnimatedLengthList
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y: SVGAnimatedLengthList
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getCharNumAtPosition(point: SVGPoint): Double
  def getComputedTextLength(): Double
  def getEndPositionOfChar(charnum: Double): SVGPoint
  def getExtentOfChar(charnum: Double): SVGRect
  def getNumberOfChars(): Double
  def getRotationOfChar(charnum: Double): Double
  def getScreenCTM(): SVGMatrix
  def getStartPositionOfChar(charnum: Double): SVGPoint
  def getSubStringLength(charnum: Double, nchars: Double): Double
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
  def selectSubString(charnum: Double, nchars: Double): Unit
}

object SVGTextElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGTextElement_typekey: SVGTextElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getScreenCTM: () => SVGMatrix,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Unit,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTextElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextElement_typekey")(MSHTMLDotSVGTextElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextElement]
  }
}

