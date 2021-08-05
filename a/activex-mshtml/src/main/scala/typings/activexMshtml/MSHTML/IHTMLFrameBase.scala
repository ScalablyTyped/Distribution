package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLFrameBase extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLFrameBase_typekey")
  var MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase
  
  var border: js.Any
  
  var frameBorder: String
  
  var frameSpacing: js.Any
  
  var marginHeight: js.Any
  
  var marginWidth: js.Any
  
  var name: String
  
  var noResize: Boolean
  
  var scrolling: String
  
  var src: String
}
object IHTMLFrameBase {
  
  inline def apply(
    MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase,
    border: js.Any,
    frameBorder: String,
    frameSpacing: js.Any,
    marginHeight: js.Any,
    marginWidth: js.Any,
    name: String,
    noResize: Boolean,
    scrolling: String,
    src: String
  ): IHTMLFrameBase = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], frameBorder = frameBorder.asInstanceOf[js.Any], frameSpacing = frameSpacing.asInstanceOf[js.Any], marginHeight = marginHeight.asInstanceOf[js.Any], marginWidth = marginWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noResize = noResize.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLFrameBase_typekey")(MSHTMLDotIHTMLFrameBase_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLFrameBase]
  }
  
  extension [Self <: IHTMLFrameBase](x: Self) {
    
    inline def setBorder(value: js.Any): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setFrameBorder(value: String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    inline def setFrameSpacing(value: js.Any): Self = StObject.set(x, "frameSpacing", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLFrameBase_typekey(value: IHTMLFrameBase): Self = StObject.set(x, "MSHTML.IHTMLFrameBase_typekey", value.asInstanceOf[js.Any])
    
    inline def setMarginHeight(value: js.Any): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    inline def setMarginWidth(value: js.Any): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoResize(value: Boolean): Self = StObject.set(x, "noResize", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
