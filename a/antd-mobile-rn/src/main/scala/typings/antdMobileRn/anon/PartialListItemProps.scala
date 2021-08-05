package typings.antdMobileRn.anon

import typings.antdMobileRn.antdMobileRnStrings._empty
import typings.antdMobileRn.antdMobileRnStrings.android
import typings.antdMobileRn.antdMobileRnStrings.bottom
import typings.antdMobileRn.antdMobileRnStrings.down
import typings.antdMobileRn.antdMobileRnStrings.empty
import typings.antdMobileRn.antdMobileRnStrings.horizontal
import typings.antdMobileRn.antdMobileRnStrings.ios
import typings.antdMobileRn.antdMobileRnStrings.middle
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.antdMobileRn.antdMobileRnStrings.up
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile-rn.antd-mobile-rn/lib/list/ListItem.native.ListItemProps> */
trait PartialListItemProps extends StObject {
  
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[ReactNode] = js.undefined
  
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var platform: js.UndefOr[android | ios] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var styles: js.UndefOr[Arrow] = js.undefined
  
  var thumb: js.UndefOr[ReactNode | Null] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object PartialListItemProps {
  
  inline def apply(): PartialListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemProps]
  }
  
  extension [Self <: PartialListItemProps](x: Self) {
    
    inline def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
    
    inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
    
    inline def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMultipleLine(value: Boolean): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
    
    inline def setMultipleLineUndefined: Self = StObject.set(x, "multipleLine", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnPressIn(value: () => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction0(value))
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: () => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction0(value))
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: Arrow): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbNull: Self = StObject.set(x, "thumb", null)
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
