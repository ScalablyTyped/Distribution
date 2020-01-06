package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentInformation extends js.Object {
  /**
    * The name of the attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.native
}

object AttachmentInformation {
  @scala.inline
  def apply(Name: AttachmentName = null): AttachmentInformation = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentInformation]
  }
}

