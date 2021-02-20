package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsHeight
import typings.antdMobileRn.anon.BackgroundColorFlexDirection
import typings.antdMobileRn.anon.FlexFlexDirection
import typings.antdMobileRn.anon.FontSizePaddingLeft
import typings.antdMobileRn.anon.PaddingRight
import typings.antdMobileRn.anon.TintColor
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.cancelText")
    @js.native
    def cancelText: FontSizePaddingLeft = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.cancelTextContainer")
    @js.native
    def cancelTextContainer: AlignItemsHeight = js.native
    @scala.inline
    def cancelTextContainer_=(x: AlignItemsHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelTextContainer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText_=(x: FontSizePaddingLeft): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.input")
    @js.native
    def input: PaddingRight = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.inputWrapper")
    @js.native
    def inputWrapper: FlexFlexDirection = js.native
    @scala.inline
    def inputWrapper_=(x: FlexFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def input_=(x: PaddingRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.search")
    @js.native
    def search: TintColor = js.native
    @scala.inline
    def search_=(x: TintColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("search")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/style/index.native", "default.wrapper")
    @js.native
    def wrapper: BackgroundColorFlexDirection = js.native
    @scala.inline
    def wrapper_=(x: BackgroundColorFlexDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISearchBarStyle extends StObject {
    
    var cancelText: TextStyle = js.native
    
    var cancelTextContainer: ViewStyle = js.native
    
    var input: TextStyle = js.native
    
    var inputWrapper: ViewStyle = js.native
    
    var search: ImageStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object ISearchBarStyle {
    
    @scala.inline
    def apply(
      cancelText: TextStyle,
      cancelTextContainer: ViewStyle,
      input: TextStyle,
      inputWrapper: ViewStyle,
      search: ImageStyle,
      wrapper: ViewStyle
    ): ISearchBarStyle = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchBarStyle]
    }
    
    @scala.inline
    implicit class ISearchBarStyleMutableBuilder[Self <: ISearchBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: TextStyle): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextContainer(value: ViewStyle): Self = StObject.set(x, "cancelTextContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: ImageStyle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
