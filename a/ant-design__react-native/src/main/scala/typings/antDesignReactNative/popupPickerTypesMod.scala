package typings.antDesignReactNative

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPickerTypesMod {
  
  trait PopupPickerProps extends StObject {
    
    var WrapComponent: js.UndefOr[js.Any] = js.undefined
    
    var actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
    
    var actionTextUnderlayColor: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactElement | String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dismissText: js.UndefOr[String | ReactElement] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var okText: js.UndefOr[String | ReactElement] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var picker: js.UndefOr[js.Any] = js.undefined
    
    var pickerValueChangeProp: js.UndefOr[String] = js.undefined
    
    var pickerValueProp: js.UndefOr[String] = js.undefined
    
    var popupTransitionName: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var title: js.UndefOr[String | ReactElement] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var triggerType: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var wrapStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object PopupPickerProps {
    
    @scala.inline
    def apply(): PopupPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupPickerProps]
    }
    
    @scala.inline
    implicit class PopupPickerPropsMutableBuilder[Self <: PopupPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      @scala.inline
      def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      @scala.inline
      def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
}
