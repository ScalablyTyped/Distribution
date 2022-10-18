package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignReactNative.anon.PartialListItemProps
import typings.antDesignReactNative.anon.PickListStyleBriefBriefTe
import typings.antDesignReactNative.libListPropsTypeMod.ListItemPropsType
import typings.antDesignReactNative.libListStyleMod.ListStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListListItemMod {
  
  @JSImport("@ant-design/react-native/lib/list/ListItem", JSImport.Default)
  @js.native
  open class default () extends Item
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/list/ListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/list/ListItem", "default.Brief")
    @js.native
    def Brief: Instantiable0[typings.antDesignReactNative.libListListItemMod.Brief] = js.native
    inline def Brief_=(x: Instantiable0[Brief]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/list/ListItem", "default.defaultProps")
    @js.native
    def defaultProps: PartialListItemProps = js.native
    inline def defaultProps_=(x: PartialListItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/list/ListItem", "Brief")
  @js.native
  open class Brief protected () extends Component[BriefProps, Any, Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: Any) = this()
  }
  
  trait BriefProps
    extends StObject
       with typings.antDesignReactNative.libListPropsTypeMod.BriefProps
       with WithThemeStyles[PickListStyleBriefBriefTe]
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
  }
  
  @js.native
  trait Item extends Component[ListItemProps, Any, Any]
  
  trait ListItemProps
    extends StObject
       with ListItemPropsType
       with WithThemeStyles[ListStyle] {
    
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
