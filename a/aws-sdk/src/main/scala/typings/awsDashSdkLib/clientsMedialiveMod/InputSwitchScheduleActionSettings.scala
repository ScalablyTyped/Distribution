package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSwitchScheduleActionSettings extends js.Object {
  /**
    * The name of the input attachment that should be switched to by this action.
    */
  var InputAttachmentNameReference: __string
}

object InputSwitchScheduleActionSettings {
  @scala.inline
  def apply(InputAttachmentNameReference: __string): InputSwitchScheduleActionSettings = {
    val __obj = js.Dynamic.literal(InputAttachmentNameReference = InputAttachmentNameReference)
  
    __obj.asInstanceOf[InputSwitchScheduleActionSettings]
  }
}

