package typings.antd.checkboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroupProps extends AbstractCheckboxGroupProps {
  var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.native
  var value: js.UndefOr[js.Array[CheckboxValueType]] = js.native
}

object CheckboxGroupProps {
  @scala.inline
  def apply(): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxGroupProps]
  }
  @scala.inline
  implicit class CheckboxGroupPropsOps[Self <: CheckboxGroupProps] (val x: Self) extends AnyVal {
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
    def setDefaultValueVarargs(value: CheckboxValueType*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[CheckboxValueType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* checkedValue */ js.Array[CheckboxValueType] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setValueVarargs(value: CheckboxValueType*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[CheckboxValueType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

