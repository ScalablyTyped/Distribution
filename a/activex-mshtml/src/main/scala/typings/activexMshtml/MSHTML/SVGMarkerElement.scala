package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGMarkerElement extends js.Object {
  @JSName("MSHTML.SVGMarkerElement_typekey")
  var MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  var markerHeight: SVGAnimatedLength
  var markerUnits: SVGAnimatedEnumeration
  var markerWidth: SVGAnimatedLength
  var orientAngle: SVGAnimatedAngle
  var orientType: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  var refX: SVGAnimatedLength
  var refY: SVGAnimatedLength
  val viewBox: SVGAnimatedRect
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  def setOrientToAngle(pSVGAngle: SVGAngle): Unit
  def setOrientToAuto(): Unit
}

object SVGMarkerElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGMarkerElement_typekey: SVGMarkerElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    markerHeight: SVGAnimatedLength,
    markerUnits: SVGAnimatedEnumeration,
    markerWidth: SVGAnimatedLength,
    orientAngle: SVGAnimatedAngle,
    orientType: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    refX: SVGAnimatedLength,
    refY: SVGAnimatedLength,
    setOrientToAngle: SVGAngle => Unit,
    setOrientToAuto: () => Unit,
    viewBox: SVGAnimatedRect,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGMarkerElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerUnits = markerUnits.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], orientAngle = orientAngle.asInstanceOf[js.Any], orientType = orientType.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], refX = refX.asInstanceOf[js.Any], refY = refY.asInstanceOf[js.Any], setOrientToAngle = js.Any.fromFunction1(setOrientToAngle), setOrientToAuto = js.Any.fromFunction0(setOrientToAuto), viewBox = viewBox.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGMarkerElement_typekey")(MSHTMLDotSVGMarkerElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMarkerElement]
  }
}

