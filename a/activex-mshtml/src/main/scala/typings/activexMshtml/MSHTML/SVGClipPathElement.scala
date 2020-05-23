package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGClipPathElement extends js.Object {
  @JSName("MSHTML.SVGClipPathElement_typekey")
  var MSHTMLDotSVGClipPathElement_typekey: SVGClipPathElement
  val className: SVGAnimatedString
  var clipPathUnits: SVGAnimatedEnumeration
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
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  def hasExtension(extension: String): Boolean
}

object SVGClipPathElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGClipPathElement_typekey: SVGClipPathElement,
    className: SVGAnimatedString,
    clipPathUnits: SVGAnimatedEnumeration,
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
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGClipPathElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], clipPathUnits = clipPathUnits.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGClipPathElement_typekey")(MSHTMLDotSVGClipPathElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGClipPathElement]
  }
}

