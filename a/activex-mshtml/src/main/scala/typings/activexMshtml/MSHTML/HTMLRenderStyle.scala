package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLRenderStyle extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLRenderStyle_typekey")
  var MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle
  
  var defaultTextSelection: String
  
  var renderingPriority: Double
  
  var textBackgroundColor: Any
  
  var textColor: Any
  
  var textDecoration: String
  
  var textDecorationColor: Any
  
  var textEffect: String
  
  var textLineThroughStyle: String
  
  var textUnderlineStyle: String
}
object HTMLRenderStyle {
  
  inline def apply(
    MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle,
    defaultTextSelection: String,
    renderingPriority: Double,
    textBackgroundColor: Any,
    textColor: Any,
    textDecoration: String,
    textDecorationColor: Any,
    textEffect: String,
    textLineThroughStyle: String,
    textUnderlineStyle: String
  ): HTMLRenderStyle = {
    val __obj = js.Dynamic.literal(defaultTextSelection = defaultTextSelection.asInstanceOf[js.Any], renderingPriority = renderingPriority.asInstanceOf[js.Any], textBackgroundColor = textBackgroundColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textEffect = textEffect.asInstanceOf[js.Any], textLineThroughStyle = textLineThroughStyle.asInstanceOf[js.Any], textUnderlineStyle = textUnderlineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLRenderStyle_typekey")(MSHTMLDotHTMLRenderStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRenderStyle]
  }
  
  extension [Self <: HTMLRenderStyle](x: Self) {
    
    inline def setDefaultTextSelection(value: String): Self = StObject.set(x, "defaultTextSelection", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLRenderStyle_typekey(value: HTMLRenderStyle): Self = StObject.set(x, "MSHTML.HTMLRenderStyle_typekey", value.asInstanceOf[js.Any])
    
    inline def setRenderingPriority(value: Double): Self = StObject.set(x, "renderingPriority", value.asInstanceOf[js.Any])
    
    inline def setTextBackgroundColor(value: Any): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationColor(value: Any): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    inline def setTextEffect(value: String): Self = StObject.set(x, "textEffect", value.asInstanceOf[js.Any])
    
    inline def setTextLineThroughStyle(value: String): Self = StObject.set(x, "textLineThroughStyle", value.asInstanceOf[js.Any])
    
    inline def setTextUnderlineStyle(value: String): Self = StObject.set(x, "textUnderlineStyle", value.asInstanceOf[js.Any])
  }
}
