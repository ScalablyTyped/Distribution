package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLRenderStyle extends StObject {
  
  @JSName("MSHTML.IHTMLRenderStyle_typekey")
  var MSHTMLDotIHTMLRenderStyle_typekey: IHTMLRenderStyle
  
  var defaultTextSelection: String
  
  var renderingPriority: Double
  
  var textBackgroundColor: js.Any
  
  var textColor: js.Any
  
  var textDecoration: String
  
  var textDecorationColor: js.Any
  
  var textEffect: String
  
  var textLineThroughStyle: String
  
  var textUnderlineStyle: String
}
object IHTMLRenderStyle {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLRenderStyle_typekey: IHTMLRenderStyle,
    defaultTextSelection: String,
    renderingPriority: Double,
    textBackgroundColor: js.Any,
    textColor: js.Any,
    textDecoration: String,
    textDecorationColor: js.Any,
    textEffect: String,
    textLineThroughStyle: String,
    textUnderlineStyle: String
  ): IHTMLRenderStyle = {
    val __obj = js.Dynamic.literal(defaultTextSelection = defaultTextSelection.asInstanceOf[js.Any], renderingPriority = renderingPriority.asInstanceOf[js.Any], textBackgroundColor = textBackgroundColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textEffect = textEffect.asInstanceOf[js.Any], textLineThroughStyle = textLineThroughStyle.asInstanceOf[js.Any], textUnderlineStyle = textUnderlineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRenderStyle_typekey")(MSHTMLDotIHTMLRenderStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRenderStyle]
  }
  
  @scala.inline
  implicit class IHTMLRenderStyleMutableBuilder[Self <: IHTMLRenderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTextSelection(value: String): Self = StObject.set(x, "defaultTextSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLRenderStyle_typekey(value: IHTMLRenderStyle): Self = StObject.set(x, "MSHTML.IHTMLRenderStyle_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingPriority(value: Double): Self = StObject.set(x, "renderingPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBackgroundColor(value: js.Any): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: js.Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationColor(value: js.Any): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEffect(value: String): Self = StObject.set(x, "textEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLineThroughStyle(value: String): Self = StObject.set(x, "textLineThroughStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUnderlineStyle(value: String): Self = StObject.set(x, "textUnderlineStyle", value.asInstanceOf[js.Any])
  }
}
