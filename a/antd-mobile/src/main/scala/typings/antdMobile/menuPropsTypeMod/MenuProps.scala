package typings.antdMobile.menuPropsTypeMod

import typings.antdMobile.antdMobileNumbers.`1`
import typings.antdMobile.antdMobileNumbers.`2`
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProps extends js.Object {
  var MenuSelectContanerPrefixCls: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[DataItem]] = js.native
  var defaultValue: js.UndefOr[ValueType] = js.native
  var height: js.UndefOr[Double] = js.native
  var level: js.UndefOr[`1` | `2`] = js.native
  var multiSelect: js.UndefOr[Boolean] = js.native
  var multiSelectMenuBtnsCls: js.UndefOr[String] = js.native
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.native
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var radioPrefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subMenuPrefixCls: js.UndefOr[String] = js.native
  var value: js.UndefOr[ValueType] = js.native
}

object MenuProps {
  @scala.inline
  def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
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
    def setMenuSelectContanerPrefixCls(value: String): Self = this.set("MenuSelectContanerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuSelectContanerPrefixCls: Self = this.set("MenuSelectContanerPrefixCls", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataVarargs(value: DataItem*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: (String | js.Array[String])*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: ValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLevel(value: `1` | `2`): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setMultiSelectMenuBtnsCls(value: String): Self = this.set("multiSelectMenuBtnsCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectMenuBtnsCls: Self = this.set("multiSelectMenuBtnsCls", js.undefined)
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[ValueType] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnOk(value: /* value */ js.UndefOr[ValueType] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRadioPrefixCls(value: String): Self = this.set("radioPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioPrefixCls: Self = this.set("radioPrefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubMenuPrefixCls(value: String): Self = this.set("subMenuPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuPrefixCls: Self = this.set("subMenuPrefixCls", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | js.Array[String])*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: ValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

