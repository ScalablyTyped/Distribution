package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLineElement extends js.Object {
  @JSName("MSHTML.SVGLineElement_typekey")
  var MSHTMLDotSVGLineElement_typekey: SVGLineElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  val transform: SVGAnimatedTransformList
  var viewportElement: ISVGElement
  var x1: SVGAnimatedLength
  var x2: SVGAnimatedLength
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y1: SVGAnimatedLength
  var y2: SVGAnimatedLength
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
}

object SVGLineElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGLineElement_typekey: SVGLineElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    x1: SVGAnimatedLength,
    x2: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y1: SVGAnimatedLength,
    y2: SVGAnimatedLength
  ): SVGLineElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLineElement_typekey")(MSHTMLDotSVGLineElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLineElement]
  }
}

