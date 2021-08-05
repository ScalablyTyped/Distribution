package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/search-bar/style.SearchBarStyle> */
trait PartialSearchBarStyle extends StObject {
  
  var cancelText: js.UndefOr[TextStyle] = js.undefined
  
  var cancelTextContainer: js.UndefOr[ViewStyle] = js.undefined
  
  var input: js.UndefOr[TextStyle] = js.undefined
  
  var inputWrapper: js.UndefOr[ViewStyle] = js.undefined
  
  var search: js.UndefOr[TextStyle] = js.undefined
  
  var wrapper: js.UndefOr[ViewStyle] = js.undefined
}
object PartialSearchBarStyle {
  
  inline def apply(): PartialSearchBarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBarStyle]
  }
  
  extension [Self <: PartialSearchBarStyle](x: Self) {
    
    inline def setCancelText(value: TextStyle): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextContainer(value: ViewStyle): Self = StObject.set(x, "cancelTextContainer", value.asInstanceOf[js.Any])
    
    inline def setCancelTextContainerUndefined: Self = StObject.set(x, "cancelTextContainer", js.undefined)
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
    
    inline def setInputWrapperUndefined: Self = StObject.set(x, "inputWrapper", js.undefined)
    
    inline def setSearch(value: TextStyle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
