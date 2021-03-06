package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.OnBlur
import typings.antdMobile.searchBarPropsTypeMod.SearchBarPropsType
import typings.antdMobile.searchBarPropsTypeMod.SearchBarState
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBarMod {
  
  @JSImport("antd-mobile/lib/search-bar", JSImport.Default)
  @js.native
  class default protected () extends SearchBar {
    def this(props: SearchBarProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/search-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/search-bar", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/search-bar", "default.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    @scala.inline
    def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SearchBar
    extends Component[SearchBarProps, SearchBarState, js.Any] {
    
    var blurFromOnClear: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSearchBar(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSearchBar(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSearchBar(): Unit = js.native
    
    def doClear(): Unit = js.native
    def doClear(blurFromOnClear: Boolean): Unit = js.native
    
    var firstFocus: Boolean = js.native
    
    def focus(): Unit = js.native
    
    var inputContainerRef: js.Any = js.native
    
    var inputRef: HTMLInputElement | Null = js.native
    
    def onBlur(): Unit = js.native
    
    var onBlurTimeout: Double | Null = js.native
    
    def onCancel(): Unit = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClear(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
    
    var rightBtnInitMarginleft: String | Null = js.native
    
    var rightBtnRef: js.Any = js.native
    
    var syntheticPhContainerRef: js.Any = js.native
    
    var syntheticPhRef: js.Any = js.native
  }
  
  @js.native
  trait SearchBarProps extends SearchBarPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SearchBarProps {
    
    @scala.inline
    def apply(): SearchBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarProps]
    }
    
    @scala.inline
    implicit class SearchBarPropsMutableBuilder[Self <: SearchBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
