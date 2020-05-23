package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGEllipseElement extends js.Object {
  @JSName("MSHTML.SVGEllipseElement_typekey")
  var MSHTMLDotSVGEllipseElement_typekey: SVGEllipseElement
  var cx: SVGAnimatedLength
  var cy: SVGAnimatedLength
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  var rx: SVGAnimatedLength
  var ry: SVGAnimatedLength
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

object SVGEllipseElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGEllipseElement_typekey: SVGEllipseElement,
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
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rx: SVGAnimatedLength,
    ry: SVGAnimatedLength,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    xmlbase: String
  ): SVGEllipseElement = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGEllipseElement_typekey")(MSHTMLDotSVGEllipseElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGEllipseElement]
  }
}

