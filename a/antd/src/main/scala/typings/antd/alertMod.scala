package typings.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.error
import typings.antd.antdStrings.info
import typings.antd.antdStrings.success
import typings.antd.antdStrings.warning
import typings.antd.errorBoundaryMod.default
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/alert", JSImport.Default)
    @js.native
    val ^ : AlertInterface = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/alert", "default.ErrorBoundary")
    @js.native
    class ErrorBoundary ()
      extends typings.antd.errorBoundaryMod.default
    
    type _To = AlertInterface
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AlertInterface = ^
  }
  
  @js.native
  trait AlertInterface
    extends StObject
       with FunctionComponent[AlertProps] {
    
    var ErrorBoundary: Instantiable0[default] = js.native
  }
  
  trait AlertProps extends StObject {
    
    /** Trigger when animation ending of Alert */
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var banner: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether Alert can be closed */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** Close text to show */
    var closeText: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional content of Alert */
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /** Content of Alert */
    var message: ReactNode
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /** Callback when close Alert */
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** https://www.w3.org/TR/2014/REC-html5-20141028/dom.html#aria-role-attribute */
    var role: js.UndefOr[String] = js.undefined
    
    /** Whether to show icon */
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Type of Alert styles, options:`success`, `info`, `warning`, `error`
      */
    var `type`: js.UndefOr[success | info | warning | error] = js.undefined
  }
  object AlertProps {
    
    inline def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    extension [Self <: AlertProps](x: Self) {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setBanner(value: Boolean): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseText(value: ReactNode): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: success | info | warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
