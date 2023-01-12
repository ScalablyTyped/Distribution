package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
trait PartialAccordionStyle extends StObject {
  
  var arrow: js.UndefOr[TextStyle] = js.undefined
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var content: js.UndefOr[ViewStyle] = js.undefined
  
  var contentText: js.UndefOr[TextStyle] = js.undefined
  
  var header: js.UndefOr[ViewStyle] = js.undefined
  
  var headerText: js.UndefOr[TextStyle] = js.undefined
  
  var headerWrap: js.UndefOr[ViewStyle] = js.undefined
}
object PartialAccordionStyle {
  
  inline def apply(): PartialAccordionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAccordionStyle] (val x: Self) extends AnyVal {
    
    inline def setArrow(value: TextStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentText(value: TextStyle): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
    
    inline def setContentTextUndefined: Self = StObject.set(x, "contentText", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderText(value: TextStyle): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    
    inline def setHeaderWrapUndefined: Self = StObject.set(x, "headerWrap", js.undefined)
  }
}
