package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentInformation extends js.Object {
  /**
    * The name of the attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.undefined
}

object AttachmentInformation {
  @scala.inline
  def apply(Name: AttachmentName = null): AttachmentInformation = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AttachmentInformation]
  }
}

