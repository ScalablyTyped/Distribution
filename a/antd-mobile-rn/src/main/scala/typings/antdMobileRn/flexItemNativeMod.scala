package typings.antdMobileRn

import typings.antdMobileRn.anon.FlexNumber
import typings.antdMobileRn.flexPropsTypeMod.FlexItemPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexItemNativeMod {
  
  @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
  @js.native
  class default () extends FlexItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", "default.defaultProps")
    @js.native
    def defaultProps: FlexNumber = js.native
    inline def defaultProps_=(x: FlexNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FlexItem
    extends Component[FlexItemProps, js.Any, js.Any]
  
  trait FlexItemProps
    extends StObject
       with FlexItemPropsType {
    
    var flex: js.UndefOr[Double] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object FlexItemProps {
    
    inline def apply(): FlexItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemProps]
    }
    
    extension [Self <: FlexItemProps](x: Self) {
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
