package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAttachment extends js.Object {
  /**
    * User-specified name for the attachment. This is required if the user wants to use this input in an input switch action.
    */
  var InputAttachmentName: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the input
    */
  var InputId: js.UndefOr[__string] = js.undefined
  /**
    * Settings of an input (caption selector, etc.)
    */
  var InputSettings: js.UndefOr[InputSettings] = js.undefined
}

object InputAttachment {
  @scala.inline
  def apply(
    InputAttachmentName: __string = null,
    InputId: __string = null,
    InputSettings: InputSettings = null
  ): InputAttachment = {
    val __obj = js.Dynamic.literal()
    if (InputAttachmentName != null) __obj.updateDynamic("InputAttachmentName")(InputAttachmentName)
    if (InputId != null) __obj.updateDynamic("InputId")(InputId)
    if (InputSettings != null) __obj.updateDynamic("InputSettings")(InputSettings)
    __obj.asInstanceOf[InputAttachment]
  }
}

