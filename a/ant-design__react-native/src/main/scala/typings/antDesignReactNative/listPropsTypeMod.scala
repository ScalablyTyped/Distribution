package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typings.antDesignReactNative.antDesignReactNativeStrings._empty
import typings.antDesignReactNative.antDesignReactNativeStrings.android
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.down
import typings.antDesignReactNative.antDesignReactNativeStrings.empty
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.ios
import typings.antDesignReactNative.antDesignReactNativeStrings.middle
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.antDesignReactNativeStrings.up
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPropsTypeMod {
  
  @js.native
  trait BriefProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var style: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object BriefProps {
    
    @scala.inline
    def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    @scala.inline
    implicit class BriefPropsMutableBuilder[Self <: BriefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ListItemPropsType extends StObject {
    
    var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var align: js.UndefOr[top | middle | bottom] = js.native
    
    var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var multipleLine: js.UndefOr[Boolean] = js.native
    
    var platform: js.UndefOr[android | ios] = js.native
    
    var thumb: js.UndefOr[ReactNode | Null] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object ListItemPropsType {
    
    @scala.inline
    def apply(): ListItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemPropsType]
    }
    
    @scala.inline
    implicit class ListItemPropsTypeMutableBuilder[Self <: ListItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setMultipleLine(value: Boolean): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleLineUndefined: Self = StObject.set(x, "multipleLine", js.undefined)
      
      @scala.inline
      def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ListPropsType extends StObject {
    
    var children: js.UndefOr[`false` | Element | js.Array[Element]] = js.native
    
    var renderFooter: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.native
    
    var renderHeader: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.native
  }
  object ListPropsType {
    
    @scala.inline
    def apply(): ListPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPropsType]
    }
    
    @scala.inline
    implicit class ListPropsTypeMutableBuilder[Self <: ListPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: `false` | Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setRenderFooter(value: js.Function0[ReactType[_]] | String | Element): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderFooterFunction0(value: () => ReactType[_]): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: js.Function0[ReactType[_]] | String | Element): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderHeaderFunction0(value: () => ReactType[_]): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    }
  }
}
