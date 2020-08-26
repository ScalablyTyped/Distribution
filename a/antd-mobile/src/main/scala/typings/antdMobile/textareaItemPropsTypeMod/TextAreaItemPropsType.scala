package typings.antdMobile.textareaItemPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaItemPropsType extends js.Object {
  var autoHeight: js.UndefOr[Boolean] = js.native
  var clear: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var labelNumber: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[TextAreaEventHandle] = js.native
  var onChange: js.UndefOr[TextAreaEventHandle] = js.native
  var onErrorClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[TextAreaEventHandle] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var rows: js.UndefOr[Double] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var value: js.UndefOr[String] = js.native
}

object TextAreaItemPropsType {
  @scala.inline
  def apply(): TextAreaItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaItemPropsType]
  }
  @scala.inline
  implicit class TextAreaItemPropsTypeOps[Self <: TextAreaItemPropsType] (val x: Self) extends AnyVal {
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
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setLabelNumber(value: Double): Self = this.set("labelNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelNumber: Self = this.set("labelNumber", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* val */ js.UndefOr[String] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* val */ js.UndefOr[String] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnErrorClick(value: () => Unit): Self = this.set("onErrorClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnErrorClick: Self = this.set("onErrorClick", js.undefined)
    @scala.inline
    def setOnFocus(value: /* val */ js.UndefOr[String] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

