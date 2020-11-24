package typings.antdMobile.pickerViewPickerViewMod

import typings.antdMobile.pickerPropsTypeMod.PickerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerView extends js.Object {
  
  var cascade: js.UndefOr[Boolean] = js.native
  
  var cols: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.native
  
  var indicatorStyle: js.UndefOr[js.Any] = js.native
  
  var itemStyle: js.UndefOr[js.Any] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  var pickerPrefixCls: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object IPickerView {
  
  @scala.inline
  def apply(): IPickerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickerView]
  }
  
  @scala.inline
  implicit class IPickerViewOps[Self <: IPickerView] (val x: Self) extends AnyVal {
    
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: js.Any): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    
    @scala.inline
    def setItemStyle(value: js.Any): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("onScrollChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerPrefixCls: Self = this.set("pickerPrefixCls", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
