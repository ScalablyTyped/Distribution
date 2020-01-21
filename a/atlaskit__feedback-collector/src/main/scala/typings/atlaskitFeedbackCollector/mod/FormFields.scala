package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFields extends js.Object {
  var canBeContacted: Boolean
  var description: String
  var enrollInResearchGroup: Boolean
  var `type`: SelectValue
}

object FormFields {
  @scala.inline
  def apply(canBeContacted: Boolean, description: String, enrollInResearchGroup: Boolean, `type`: SelectValue): FormFields = {
    val __obj = js.Dynamic.literal(canBeContacted = canBeContacted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enrollInResearchGroup = enrollInResearchGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
}

