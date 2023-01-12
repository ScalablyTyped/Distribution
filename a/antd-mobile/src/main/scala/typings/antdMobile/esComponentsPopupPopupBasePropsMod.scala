package typings.antdMobile

import typings.antdMobile.anon.CSSPropertiesPartialRecorAlignmentBaseline
import typings.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typings.antdMobile.esUtilsWithStopPropagationMod.PropagationEvent
import typings.react.mod.CSSProperties
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPopupPopupBasePropsMod {
  
  object defaultPopupBaseProps {
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.closeOnMaskClick")
    @js.native
    def closeOnMaskClick: Boolean = js.native
    inline def closeOnMaskClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeOnMaskClick")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.destroyOnClose")
    @js.native
    def destroyOnClose: Boolean = js.native
    inline def destroyOnClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyOnClose")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.disableBodyScroll")
    @js.native
    def disableBodyScroll: Boolean = js.native
    inline def disableBodyScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableBodyScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.forceRender")
    @js.native
    def forceRender: Boolean = js.native
    inline def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
    
    inline def getContainer(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")().asInstanceOf[HTMLElement]
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.mask")
    @js.native
    def mask: Boolean = js.native
    inline def mask_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mask")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.showCloseButton")
    @js.native
    def showCloseButton: Boolean = js.native
    inline def showCloseButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.stopPropagation")
    @js.native
    def stopPropagation: js.Array[String] = js.native
    inline def stopPropagation_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popup/popup-base-props", "defaultPopupBaseProps.visible")
    @js.native
    def visible: Boolean = js.native
    inline def visible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
  }
  
  trait PopupBaseProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var bodyClassName: js.UndefOr[String] = js.undefined
    
    var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var closeOnMaskClick: js.UndefOr[Boolean] = js.undefined
    
    var destroyOnClose: js.UndefOr[Boolean] = js.undefined
    
    var disableBodyScroll: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskStyle: js.UndefOr[CSSPropertiesPartialRecorAlignmentBaseline] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMaskClick: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
      ] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Array[PropagationEvent]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PopupBaseProps {
    
    inline def apply(): PopupBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupBaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupBaseProps] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterShow(value: () => Unit): Self = StObject.set(x, "afterShow", js.Any.fromFunction0(value))
      
      inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
      
      inline def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setCloseOnMaskClick(value: Boolean): Self = StObject.set(x, "closeOnMaskClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnMaskClickUndefined: Self = StObject.set(x, "closeOnMaskClick", js.undefined)
      
      inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      inline def setDisableBodyScroll(value: Boolean): Self = StObject.set(x, "disableBodyScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableBodyScrollUndefined: Self = StObject.set(x, "disableBodyScroll", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskStyle(value: CSSPropertiesPartialRecorAlignmentBaseline): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnClick(value: /* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMaskClick(value: /* event */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit): Self = StObject.set(x, "onMaskClick", js.Any.fromFunction1(value))
      
      inline def setOnMaskClickUndefined: Self = StObject.set(x, "onMaskClick", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStopPropagation(value: js.Array[PropagationEvent]): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setStopPropagationVarargs(value: PropagationEvent*): Self = StObject.set(x, "stopPropagation", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
