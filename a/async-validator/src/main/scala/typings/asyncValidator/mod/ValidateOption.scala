package typings.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOption extends js.Object {
  // when the first validation rule generates an error stop processed
  var first: js.UndefOr[Boolean] = js.native
  // when the first validation rule of the specified field generates an error stop the field processed, 'true' means all fields.
  var firstFields: js.UndefOr[Boolean | js.Array[String]] = js.native
  // whether to suppress internal warning
  var suppressWarning: js.UndefOr[Boolean] = js.native
}

object ValidateOption {
  @scala.inline
  def apply(): ValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOption]
  }
  @scala.inline
  implicit class ValidateOptionOps[Self <: ValidateOption] (val x: Self) extends AnyVal {
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
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setFirstFieldsVarargs(value: String*): Self = this.set("firstFields", js.Array(value :_*))
    @scala.inline
    def setFirstFields(value: Boolean | js.Array[String]): Self = this.set("firstFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstFields: Self = this.set("firstFields", js.undefined)
    @scala.inline
    def setSuppressWarning(value: Boolean): Self = this.set("suppressWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressWarning: Self = this.set("suppressWarning", js.undefined)
  }
  
}

