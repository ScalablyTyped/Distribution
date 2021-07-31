package typings.antdMobileRn

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.NativeEvent
import typings.antdMobileRn.anon.OnBlur
import typings.antdMobileRn.searchBarPropsTypeMod.SearchBarPropsType
import typings.antdMobileRn.searchBarPropsTypeMod.SearchBarState
import typings.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInput
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/search-bar/index.native", JSImport.Default)
  @js.native
  class default protected () extends SearchBar {
    def this(props: SearchBarNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/search-bar/index.native", "default.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    @scala.inline
    def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SearchBar
    extends Component[SearchBarNativeProps, SearchBarState, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): Unit = js.native
    
    var inputRef: TextInput | Null = js.native
    
    def onBlur(): Unit = js.native
    
    def onCancel(): Unit = js.native
    
    def onChangeText(value: String): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onSubmit(_underscore: NativeEvent): Unit = js.native
  }
  
  trait SearchBarNativeProps
    extends StObject
       with SearchBarPropsType {
    
    var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
    
    var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    @JSName("styles")
    var styles_SearchBarNativeProps: ISearchBarStyle
  }
  object SearchBarNativeProps {
    
    @scala.inline
    def apply(styles: ISearchBarStyle): SearchBarNativeProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarNativeProps]
    }
    
    @scala.inline
    implicit class SearchBarNativePropsMutableBuilder[Self <: SearchBarNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnSubmitEditing(value: /* event */ NativeEvent => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ISearchBarStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
