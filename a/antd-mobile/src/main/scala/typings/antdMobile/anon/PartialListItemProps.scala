package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings._empty
import typings.antdMobile.antdMobileStrings.android
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.down
import typings.antdMobile.antdMobileStrings.empty
import typings.antdMobile.antdMobileStrings.horizontal
import typings.antdMobile.antdMobileStrings.ios
import typings.antdMobile.antdMobileStrings.middle
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.antdMobileStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd-mobile.antd-mobile/lib/list/ListItem.ListItemProps> */
trait PartialListItemProps extends StObject {
  
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var extra: js.UndefOr[ReactNode] = js.undefined
  
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  
  var platform: js.UndefOr[android | ios] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
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
    def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
    
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
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
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
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
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
