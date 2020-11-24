package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGUseElement extends js.Object {
  
  @JSName("MSHTML.ISVGUseElement_typekey")
  var MSHTMLDotISVGUseElement_typekey: ISVGUseElement = js.native
  
  var animatedInstanceRoot: ISVGElementInstance = js.native
  
  var height: SVGAnimatedLength = js.native
  
  var instanceRoot: ISVGElementInstance = js.native
  
  var width: SVGAnimatedLength = js.native
  
  var x: SVGAnimatedLength = js.native
  
  var y: SVGAnimatedLength = js.native
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
  
  @scala.inline
  implicit class ISVGUseElementOps[Self <: ISVGUseElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotISVGUseElement_typekey(value: ISVGUseElement): Self = this.set("MSHTML.ISVGUseElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedInstanceRoot(value: ISVGElementInstance): Self = this.set("animatedInstanceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRoot(value: ISVGElementInstance): Self = this.set("instanceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
