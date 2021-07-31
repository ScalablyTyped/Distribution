package typings.antdMobileRn

import typings.antdMobileRn.anon.Align
import typings.antdMobileRn.flexPropsTypeMod.FlexPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/flex/Flex.native", JSImport.Default)
  @js.native
  class default () extends Flex
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/flex/Flex.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/flex/Flex.native", "default.Item")
    @js.native
    def Item: js.Any = js.native
    @scala.inline
    def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/flex/Flex.native", "default.defaultProps")
    @js.native
    def defaultProps: Align = js.native
    @scala.inline
    def defaultProps_=(x: Align): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Flex
    extends Component[FlexProps, js.Any, js.Any]
  
  trait FlexProps
    extends StObject
       with FlexPropsType {
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object FlexProps {
    
    @scala.inline
    def apply(): FlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexProps]
    }
    
    @scala.inline
    implicit class FlexPropsMutableBuilder[Self <: FlexProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
