package typings.antd.anon

import typings.antd.antdBooleans.`false`
import typings.antd.buttonButtonMod.ButtonProps
import typings.antd.buttonButtonMod.LegacyButtonType
import typings.antd.modalModalMod.getContainerFunc
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/modal/Modal.ModalProps> */
@js.native
trait PartialModalProps extends StObject {
  
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
  
  var cancelText: js.UndefOr[ReactNode] = js.native
  
  var centered: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[ReactNode] = js.native
  
  var confirmLoading: js.UndefOr[Boolean] = js.native
  
  var destroyOnClose: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactNode] = js.native
  
  var forceRender: js.UndefOr[Boolean] = js.native
  
  var getContainer: js.UndefOr[String | HTMLElement | getContainerFunc | `false` | Null] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var mask: js.UndefOr[Boolean] = js.native
  
  var maskClosable: js.UndefOr[Boolean] = js.native
  
  var maskStyle: js.UndefOr[CSSProperties] = js.native
  
  var maskTransitionName: js.UndefOr[String] = js.native
  
  var modalRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.native
  
  var okButtonProps: js.UndefOr[ButtonProps] = js.native
  
  var okText: js.UndefOr[ReactNode] = js.native
  
  var okType: js.UndefOr[LegacyButtonType] = js.native
  
  var onCancel: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  
  var onOk: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactNode | String] = js.native
  
  var transitionName: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var wrapClassName: js.UndefOr[String] = js.native
  
  var wrapProps: js.UndefOr[js.Any] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PartialModalProps {
  
  @scala.inline
  def apply(): PartialModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalProps]
  }
  
  @scala.inline
  implicit class PartialModalPropsMutableBuilder[Self <: PartialModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    @scala.inline
    def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setConfirmLoading(value: Boolean): Self = StObject.set(x, "confirmLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmLoadingUndefined: Self = StObject.set(x, "confirmLoading", js.undefined)
    
    @scala.inline
    def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    
    @scala.inline
    def setGetContainer(value: String | HTMLElement | getContainerFunc | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
    
    @scala.inline
    def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
    
    @scala.inline
    def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    @scala.inline
    def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setModalRender(value: /* node */ ReactNode => ReactNode): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
    
    @scala.inline
    def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
    
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
    def setOnCancel(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnOk(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
    
    @scala.inline
    def setWrapProps(value: js.Any): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
