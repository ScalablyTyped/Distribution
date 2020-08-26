package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFields extends js.Object {
  var canBeContacted: Boolean = js.native
  var description: String = js.native
  var enrollInResearchGroup: Boolean = js.native
  var `type`: SelectValue = js.native
}

object FormFields {
  @scala.inline
  def apply(canBeContacted: Boolean, description: String, enrollInResearchGroup: Boolean, `type`: SelectValue): FormFields = {
    val __obj = js.Dynamic.literal(canBeContacted = canBeContacted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enrollInResearchGroup = enrollInResearchGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
  @scala.inline
  implicit class FormFieldsOps[Self <: FormFields] (val x: Self) extends AnyVal {
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
    def setCanBeContacted(value: Boolean): Self = this.set("canBeContacted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnrollInResearchGroup(value: Boolean): Self = this.set("enrollInResearchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SelectValue): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

