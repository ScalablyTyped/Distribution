package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGCircleElement extends js.Object {
  @JSName("MSHTML.SVGCircleElement_typekey")
  var MSHTMLDotSVGCircleElement_typekey: SVGCircleElement
  var cx: SVGAnimatedLength
  var cy: SVGAnimatedLength
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  var r: SVGAnimatedLength
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  val transform: SVGAnimatedTransformList
  var viewportElement: ISVGElement
  var xmlbase: String
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
}

object SVGCircleElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGCircleElement_typekey: SVGCircleElement,
    cx: SVGAnimatedLength,
    cy: SVGAnimatedLength,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    r: SVGAnimatedLength,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGCircleElement = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGCircleElement_typekey")(MSHTMLDotSVGCircleElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGCircleElement]
  }
}

