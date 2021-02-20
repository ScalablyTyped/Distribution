package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/search-bar/style.SearchBarStyle> */
@js.native
trait PartialSearchBarStyle extends StObject {
  
  var cancelText: js.UndefOr[TextStyle] = js.native
  
  var cancelTextContainer: js.UndefOr[ViewStyle] = js.native
  
  var input: js.UndefOr[TextStyle] = js.native
  
  var inputWrapper: js.UndefOr[ViewStyle] = js.native
  
  var search: js.UndefOr[TextStyle] = js.native
  
  var wrapper: js.UndefOr[ViewStyle] = js.native
}
object PartialSearchBarStyle {
  
  @scala.inline
  def apply(): PartialSearchBarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBarStyle]
  }
  
  @scala.inline
  implicit class PartialSearchBarStyleMutableBuilder[Self <: PartialSearchBarStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelText(value: TextStyle): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextContainer(value: ViewStyle): Self = StObject.set(x, "cancelTextContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextContainerUndefined: Self = StObject.set(x, "cancelTextContainer", js.undefined)
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputWrapperUndefined: Self = StObject.set(x, "inputWrapper", js.undefined)
    
    @scala.inline
    def setSearch(value: TextStyle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
