package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPatternElement extends js.Object {
  @JSName("MSHTML.SVGPatternElement_typekey")
  var MSHTMLDotSVGPatternElement_typekey: SVGPatternElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var height: SVGAnimatedLength
  val href: SVGAnimatedString
  var ownerSVGElement: ISVGSVGElement
  var patternContentUnits: SVGAnimatedEnumeration
  var patternTransform: SVGAnimatedTransformList
  var patternUnits: SVGAnimatedEnumeration
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  val viewBox: SVGAnimatedRect
  var viewportElement: ISVGElement
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y: SVGAnimatedLength
  def hasExtension(extension: String): Boolean
}

object SVGPatternElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGPatternElement_typekey: SVGPatternElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    href: SVGAnimatedString,
    ownerSVGElement: ISVGSVGElement,
    patternContentUnits: SVGAnimatedEnumeration,
    patternTransform: SVGAnimatedTransformList,
    patternUnits: SVGAnimatedEnumeration,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGPatternElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], patternContentUnits = patternContentUnits.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], patternUnits = patternUnits.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPatternElement_typekey")(MSHTMLDotSVGPatternElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPatternElement]
  }
}

