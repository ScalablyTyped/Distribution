package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldType extends js.Object {
  var id: String = js.native
  var value: FieldValueType = js.native
}

object FieldType {
  @scala.inline
  def apply(id: String, value: FieldValueType): FieldType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  @scala.inline
  implicit class FieldTypeOps[Self <: FieldType] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Object*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: FieldValueType): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

