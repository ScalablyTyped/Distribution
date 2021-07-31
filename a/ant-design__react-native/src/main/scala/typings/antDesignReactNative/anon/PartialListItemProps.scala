package typings.antDesignReactNative.anon

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
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/ListItem.ListItemProps> */
trait PartialListItemProps extends StObject {
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[ReactNode] = js.undefined
  
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var platform: js.UndefOr[android | ios] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var styles: js.UndefOr[PartialListStyle] = js.undefined
  
  var thumb: js.UndefOr[ReactNode | Null] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object PartialListItemProps {
  
  @scala.inline
  def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  
  @scala.inline
  implicit class PartialListItemPropsMutableBuilder[Self <: PartialListItemProps] (val x: Self) extends AnyVal {
    
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
    def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
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
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialListStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
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
