package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGImageElement extends js.Object {
  @JSName("MSHTML.SVGImageElement_typekey")
  var MSHTMLDotSVGImageElement_typekey: SVGImageElement
  val farthestViewportElement: ISVGElement
  var focusable: SVGAnimatedEnumeration
  var height: SVGAnimatedLength
  val href: SVGAnimatedString
  val nearestViewportElement: ISVGElement
  var ownerSVGElement: ISVGSVGElement
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  val transform: SVGAnimatedTransformList
  val viewBox: SVGAnimatedRect
  var viewportElement: ISVGElement
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var xmlbase: String
  var y: SVGAnimatedLength
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
}

object SVGImageElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGImageElement_typekey: SVGImageElement,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    transform: SVGAnimatedTransformList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    y: SVGAnimatedLength
  ): SVGImageElement = {
    val __obj = js.Dynamic.literal(farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGImageElement_typekey")(MSHTMLDotSVGImageElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGImageElement]
  }
}

