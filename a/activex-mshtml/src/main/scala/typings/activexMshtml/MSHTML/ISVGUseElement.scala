package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGUseElement extends js.Object {
  @JSName("MSHTML.ISVGUseElement_typekey")
  var MSHTMLDotISVGUseElement_typekey: ISVGUseElement
  var animatedInstanceRoot: ISVGElementInstance
  var height: SVGAnimatedLength
  var instanceRoot: ISVGElementInstance
  var width: SVGAnimatedLength
  var x: SVGAnimatedLength
  var y: SVGAnimatedLength
}

object ISVGUseElement {
  @scala.inline
  def apply(
    MSHTMLDotISVGUseElement_typekey: ISVGUseElement,
    animatedInstanceRoot: ISVGElementInstance,
    height: SVGAnimatedLength,
    instanceRoot: ISVGElementInstance,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    y: SVGAnimatedLength
  ): ISVGUseElement = {
    val __obj = js.Dynamic.literal(animatedInstanceRoot = animatedInstanceRoot.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], instanceRoot = instanceRoot.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGUseElement_typekey")(MSHTMLDotISVGUseElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGUseElement]
  }
}

