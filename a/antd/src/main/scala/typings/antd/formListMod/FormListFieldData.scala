package typings.antd.formListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormListFieldData extends js.Object {
  var fieldKey: Double = js.native
  var key: Double = js.native
  var name: Double = js.native
}

object FormListFieldData {
  @scala.inline
  def apply(fieldKey: Double, key: Double, name: Double): FormListFieldData = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormListFieldData]
  }
  @scala.inline
  implicit class FormListFieldDataOps[Self <: FormListFieldData] (val x: Self) extends AnyVal {
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
    def setFieldKey(value: Double): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Double): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

