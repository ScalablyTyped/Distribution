package typings.antDesignReactNative.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/PopupPickerTypes.PopupPickerProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlyPopupPickerPropsR extends js.Object {
  
  val WrapComponent: js.UndefOr[js.Any] = js.native
  
  val actionTextActiveOpacity: js.UndefOr[Double] = js.native
  
  val actionTextUnderlayColor: js.UndefOr[String] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val content: js.UndefOr[ReactElement | String] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val dismissText: js.UndefOr[String | ReactElement] = js.native
  
  val maskTransitionName: js.UndefOr[String] = js.native
  
  val okText: js.UndefOr[String | ReactElement] = js.native
  
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  
  val picker: js.UndefOr[js.Any] = js.native
  
  val pickerValueChangeProp: js.UndefOr[String] = js.native
  
  val pickerValueProp: js.UndefOr[String] = js.native
  
  val popupTransitionName: js.UndefOr[String] = js.native
  
  val style: js.UndefOr[js.Any] = js.native
  
  val styles: js.UndefOr[js.Any] = js.native
  
  val title: js.UndefOr[String | ReactElement] = js.native
  
  val transitionName: js.UndefOr[String] = js.native
  
  val triggerType: js.UndefOr[String] = js.native
  
  val value: js.UndefOr[js.Any] = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
  
  val wrapStyle: js.UndefOr[CSSProperties] = js.native
}
object ReadonlyPopupPickerPropsR {
  
  @scala.inline
  def apply(): ReadonlyPopupPickerPropsR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPopupPickerPropsR]
  }
  
  @scala.inline
  implicit class ReadonlyPopupPickerPropsROps[Self <: ReadonlyPopupPickerPropsR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrapComponent(value: js.Any): Self = this.set("WrapComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapComponent: Self = this.set("WrapComponent", js.undefined)
    
    @scala.inline
    def setActionTextActiveOpacity(value: Double): Self = this.set("actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionTextActiveOpacity: Self = this.set("actionTextActiveOpacity", js.undefined)
    
    @scala.inline
    def setActionTextUnderlayColor(value: String): Self = this.set("actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionTextUnderlayColor: Self = this.set("actionTextUnderlayColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContent(value: ReactElement | String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDismissText(value: String | ReactElement): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissText: Self = this.set("dismissText", js.undefined)
    
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    
    @scala.inline
    def setOkText(value: String | ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    
    @scala.inline
    def setPicker(value: js.Any): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("picker", js.undefined)
    
    @scala.inline
    def setPickerValueChangeProp(value: String): Self = this.set("pickerValueChangeProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerValueChangeProp: Self = this.set("pickerValueChangeProp", js.undefined)
    
    @scala.inline
    def setPickerValueProp(value: String): Self = this.set("pickerValueProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerValueProp: Self = this.set("pickerValueProp", js.undefined)
    
    @scala.inline
    def setPopupTransitionName(value: String): Self = this.set("popupTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupTransitionName: Self = this.set("popupTransitionName", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    
    @scala.inline
    def setTriggerType(value: String): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWrapStyle(value: CSSProperties): Self = this.set("wrapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapStyle: Self = this.set("wrapStyle", js.undefined)
  }
}
