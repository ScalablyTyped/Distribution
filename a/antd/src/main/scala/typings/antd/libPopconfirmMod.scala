package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libButtonButtonMod.ButtonProps
import typings.antd.libButtonButtonMod.LegacyButtonType
import typings.antd.libTooltipMod.AbstractTooltipProps
import typings.antd.libUtilGetRenderPropValueMod.RenderFunction
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopconfirmMod extends Shortcut {
  
  @JSImport("antd/lib/popconfirm", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]] = js.native
  
  trait PopconfirmProps
    extends StObject
       with AbstractTooltipProps {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var okText: js.UndefOr[ReactNode] = js.undefined
    
    var okType: js.UndefOr[LegacyButtonType] = js.undefined
    
    var onCancel: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    var onConfirm: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    @JSName("onOpenChange")
    var onOpenChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* open */ Boolean, 
          /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @deprecated `onVisibleChange` is deprecated which will be removed in next major version. Please
      *   use `onOpenChange` instead.
      */
    @JSName("onVisibleChange")
    var onVisibleChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* visible */ Boolean, 
          /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]], 
          Unit
        ]
      ] = js.undefined
    
    var showCancel: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactNode | RenderFunction
  }
  object PopconfirmProps {
    
    inline def apply(): PopconfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopconfirmProps] (val x: Self) extends AnyVal {
      
      inline def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      inline def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      inline def setOkText(value: ReactNode): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      inline def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      inline def setOnCancel(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnOpenChange(
        value: (/* open */ Boolean, /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]]) => Unit
      ): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(
        value: (/* visible */ Boolean, /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]]) => Unit
      ): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction2(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      inline def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PopconfirmState extends StObject {
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object PopconfirmState {
    
    inline def apply(): PopconfirmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopconfirmState] (val x: Self) extends AnyVal {
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPopconfirmMod.foo` */
  override def _to: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]] = default
}
