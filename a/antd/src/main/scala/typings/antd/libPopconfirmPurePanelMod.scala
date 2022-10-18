package typings.antd

import typings.antd.libButtonButtonMod.ButtonProps
import typings.antd.libButtonButtonMod.LegacyButtonType
import typings.antd.libUtilGetRenderPropValueMod.RenderFunction
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopconfirmPurePanelMod {
  
  @JSImport("antd/lib/popconfirm/PurePanel", "Overlay")
  @js.native
  val Overlay: FC[OverlayProps] = js.native
  
  /* Inlined parent std.Pick<antd.antd/lib/popconfirm.PopconfirmProps, 'icon' | 'okButtonProps' | 'cancelButtonProps' | 'cancelText' | 'okText' | 'okType' | 'showCancel' | 'title'> */
  trait OverlayProps extends StObject {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var close: js.UndefOr[js.Function] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var okText: js.UndefOr[ReactNode] = js.undefined
    
    var okType: js.UndefOr[LegacyButtonType] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onConfirm: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var prefixCls: String
    
    var showCancel: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactNode | RenderFunction
  }
  object OverlayProps {
    
    inline def apply(prefixCls: String): OverlayProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      inline def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      inline def setOkText(value: ReactNode): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      inline def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      inline def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      inline def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PopconfirmLocale extends StObject {
    
    var cancelText: String
    
    var okText: String
  }
  object PopconfirmLocale {
    
    inline def apply(cancelText: String, okText: String): PopconfirmLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopconfirmLocale]
    }
    
    extension [Self <: PopconfirmLocale](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
}
