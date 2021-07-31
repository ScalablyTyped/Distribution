package typings.antdMobileRn

import typings.antdMobileRn.anon.OnSelect
import typings.antdMobileRn.popoverPropsTypeMod.PopoverPropsType
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/popover/index.native", JSImport.Default)
  @js.native
  class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", "default.Item")
    @js.native
    def Item: js.Any = js.native
    @scala.inline
    def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", "default.defaultProps")
    @js.native
    def defaultProps: OnSelect = js.native
    @scala.inline
    def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover
    extends Component[PopoverProps, js.Any, js.Any] {
    
    var menuContextRef: js.Any = js.native
  }
  
  trait PopoverProps
    extends StObject
       with PopoverPropsType {
    
    var contextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var renderOverlayComponent: js.UndefOr[js.Function1[/* values */ js.Any, Element]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextStyleNull: Self = StObject.set(x, "contextStyle", null)
      
      @scala.inline
      def setContextStyleUndefined: Self = StObject.set(x, "contextStyle", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setRenderOverlayComponent(value: /* values */ js.Any => Element): Self = StObject.set(x, "renderOverlayComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderOverlayComponentUndefined: Self = StObject.set(x, "renderOverlayComponent", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTriggerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      @scala.inline
      def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
    }
  }
}
