package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGMaskElement extends js.Object {
  @JSName("MSHTML.SVGMaskElement_typekey")
  var MSHTMLDotSVGMaskElement_typekey: SVGMaskElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var height: SVGAnimatedLength
  var maskContentUnits: SVGAnimatedEnumeration
  var maskUnits: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  val systemLanguage: SVGStringList
  var viewportElement: ISVGElement
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  var y: SVGAnimatedLength
  def hasExtension(extension: String): Boolean
}

object SVGMaskElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGMaskElement_typekey: SVGMaskElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    maskContentUnits: SVGAnimatedEnumeration,
    maskUnits: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    systemLanguage: SVGStringList,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength
  ): SVGMaskElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], maskContentUnits = maskContentUnits.asInstanceOf[js.Any], maskUnits = maskUnits.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMaskElement_typekey")(MSHTMLDotSVGMaskElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMaskElement]
  }
}

