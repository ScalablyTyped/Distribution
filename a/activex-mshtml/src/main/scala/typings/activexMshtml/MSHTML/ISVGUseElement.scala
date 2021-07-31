package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGUseElement extends StObject {
  
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
  
  @scala.inline
  implicit class ISVGUseElementMutableBuilder[Self <: ISVGUseElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedInstanceRoot(value: ISVGElementInstance): Self = StObject.set(x, "animatedInstanceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRoot(value: ISVGElementInstance): Self = StObject.set(x, "instanceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotISVGUseElement_typekey(value: ISVGUseElement): Self = StObject.set(x, "MSHTML.ISVGUseElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
