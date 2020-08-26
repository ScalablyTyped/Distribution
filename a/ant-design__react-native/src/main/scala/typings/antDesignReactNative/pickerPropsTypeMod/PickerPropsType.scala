package typings.antDesignReactNative.pickerPropsTypeMod

import typings.antDesignReactNative.cascaderTypesMod.CascaderValue
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent utility-types.utility-types.Omit<@ant-design/react-native.@ant-design/react-native/lib/picker/PopupPickerTypes.PopupPickerProps, 'styles'> */
@js.native
trait PickerPropsType extends js.Object {
  var WrapComponent: js.UndefOr[js.Any] = js.native
  var actionTextActiveOpacity: js.UndefOr[Double] = js.native
  var actionTextUnderlayColor: js.UndefOr[String] = js.native
  var cascade: js.UndefOr[Boolean] = js.native
  var cols: js.UndefOr[Double] = js.native
  var content: js.UndefOr[ReactElement | String] = js.native
  var data: js.Array[js.Array[PickerData] | PickerData] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dismissText: js.UndefOr[String | ReactElement] = js.native
  var extra: js.UndefOr[String] = js.native
  var format: js.UndefOr[js.Function1[/* values */ js.Array[String], String]] = js.native
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var maskTransitionName: js.UndefOr[String] = js.native
  var okText: js.UndefOr[String | ReactElement] = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var picker: js.UndefOr[js.Any] = js.native
  var pickerValueChangeProp: js.UndefOr[String] = js.native
  var pickerValueProp: js.UndefOr[String] = js.native
  var popupTransitionName: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var triggerType: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String | Double]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wrapStyle: js.UndefOr[CSSProperties] = js.native
}

object PickerPropsType {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerPropsType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPropsType]
  }
  @scala.inline
  implicit class PickerPropsTypeOps[Self <: PickerPropsType] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = this.set("data", value.asInstanceOf[js.Any])
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
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
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFormat(value: /* values */ js.Array[String] => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setIndicatorStyleNull: Self = this.set("indicatorStyle", null)
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setMaskTransitionName(value: String): Self = this.set("maskTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTransitionName: Self = this.set("maskTransitionName", js.undefined)
    @scala.inline
    def setOkText(value: String | ReactElement): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnPickerChange(value: /* value */ CascaderValue => Unit): Self = this.set("onPickerChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPickerChange: Self = this.set("onPickerChange", js.undefined)
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
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String | Double]): Self = this.set("value", value.asInstanceOf[js.Any])
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

