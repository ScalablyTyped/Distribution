package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.antd.buttonButtonMod.NativeButtonProps
import typings.antd.getRenderPropValueMod.RenderFunction
import typings.antd.tooltipMod.AbstractTooltipProps
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

object popconfirmMod extends Shortcut {
  
  @JSImport("antd/lib/popconfirm", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[js.Any]] = js.native
  
  trait PopconfirmLocale extends StObject {
    
    var cancelText: String
    
    var okText: String
  }
  object PopconfirmLocale {
    
    @scala.inline
    def apply(cancelText: String, okText: String): PopconfirmLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopconfirmLocale]
    }
    
    @scala.inline
    implicit class PopconfirmLocaleMutableBuilder[Self <: PopconfirmLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopconfirmProps
    extends StObject
       with AbstractTooltipProps {
    
    var cancelButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
    
    var cancelText: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var okButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
    
    var okText: js.UndefOr[ReactNode] = js.undefined
    
    var okType: js.UndefOr[LegacyButtonType] = js.undefined
    
    var onCancel: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    var onConfirm: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    @JSName("onVisibleChange")
    var onVisibleChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* visible */ Boolean, 
          /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]], 
          Unit
        ]
      ] = js.undefined
    
    var title: ReactNode | RenderFunction
  }
  object PopconfirmProps {
    
    @scala.inline
    def apply(): PopconfirmProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmProps]
    }
    
    @scala.inline
    implicit class PopconfirmPropsMutableBuilder[Self <: PopconfirmProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: NativeButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOkButtonProps(value: NativeButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      @scala.inline
      def setOkText(value: ReactNode): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(
        value: (/* visible */ Boolean, /* e */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement]]) => Unit
      ): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PopconfirmState extends StObject {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PopconfirmState {
    
    @scala.inline
    def apply(): PopconfirmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmState]
    }
    
    @scala.inline
    implicit class PopconfirmStateMutableBuilder[Self <: PopconfirmState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopconfirmProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `popconfirmMod.foo` */
  override def _to: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[js.Any]] = default
}
