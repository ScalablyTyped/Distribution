package typings.antDesignReactNative.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/PopupPickerTypes.PopupPickerProps> */
trait ReadonlyPopupPickerProps extends StObject {
  
  val WrapComponent: js.UndefOr[js.Any] = js.undefined
  
  val actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
  
  val actionTextUnderlayColor: js.UndefOr[String] = js.undefined
  
  val content: js.UndefOr[ReactElement | String] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val dismissText: js.UndefOr[String | ReactElement] = js.undefined
  
  val maskTransitionName: js.UndefOr[String] = js.undefined
  
  val okText: js.UndefOr[String | ReactElement] = js.undefined
  
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  
  val picker: js.UndefOr[js.Any] = js.undefined
  
  val pickerValueChangeProp: js.UndefOr[String] = js.undefined
  
  val pickerValueProp: js.UndefOr[String] = js.undefined
  
  val popupTransitionName: js.UndefOr[String] = js.undefined
  
  val style: js.UndefOr[js.Any] = js.undefined
  
  val styles: js.UndefOr[js.Any] = js.undefined
  
  val title: js.UndefOr[String | ReactElement] = js.undefined
  
  val transitionName: js.UndefOr[String] = js.undefined
  
  val triggerType: js.UndefOr[String] = js.undefined
  
  val value: js.UndefOr[js.Any] = js.undefined
  
  val visible: js.UndefOr[Boolean] = js.undefined
  
  val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
}
object ReadonlyPopupPickerProps {
  
  inline def apply(): ReadonlyPopupPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPopupPickerProps]
  }
  
  extension [Self <: ReadonlyPopupPickerProps](x: Self) {
    
    inline def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
    
    inline def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    inline def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
    
    inline def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    inline def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
    
    inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
    
    inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
    
    inline def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
    
    inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    
    inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
    
    inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
    
    inline def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    
    inline def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
    
    inline def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
    
    inline def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
    
    inline def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
    
    inline def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
    
    inline def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    inline def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
    
    inline def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
    
    inline def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
  }
}
