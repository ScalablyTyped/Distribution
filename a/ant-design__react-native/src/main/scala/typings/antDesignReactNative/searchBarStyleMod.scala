package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarStyleMod {
  
  @JSImport("@ant-design/react-native/lib/search-bar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): SearchBarStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[SearchBarStyle]
  
  trait SearchBarStyle extends StObject {
    
    var cancelText: TextStyle
    
    var cancelTextContainer: ViewStyle
    
    var input: TextStyle
    
    var inputWrapper: ViewStyle
    
    var search: TextStyle
    
    var wrapper: ViewStyle
  }
  object SearchBarStyle {
    
    @scala.inline
    def apply(
      cancelText: TextStyle,
      cancelTextContainer: ViewStyle,
      input: TextStyle,
      inputWrapper: ViewStyle,
      search: TextStyle,
      wrapper: ViewStyle
    ): SearchBarStyle = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarStyle]
    }
    
    @scala.inline
    implicit class SearchBarStyleMutableBuilder[Self <: SearchBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: TextStyle): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextContainer(value: ViewStyle): Self = StObject.set(x, "cancelTextContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: TextStyle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
