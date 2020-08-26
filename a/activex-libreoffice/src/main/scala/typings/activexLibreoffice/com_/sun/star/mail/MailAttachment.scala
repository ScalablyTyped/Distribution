package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link MailAttachment} specifies a mail message attachment.
  * @see com.sun.star.mail.XMailMessage
  * @since OOo 2.0
  */
@js.native
trait MailAttachment extends js.Object {
  /**
    * The actual data which should be attached to a mail message. It is expected that the transferable delivers the data as sequence of bytes. Although a
    * transferable may support multiple data flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the type
    * of the data is a sequence of bytes.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Data: XTransferable = js.native
  /** The name of the attachment as seen by the recipient of the mail message. ReadableName must not be empty. */
  var ReadableName: String = js.native
}

object MailAttachment {
  @scala.inline
  def apply(Data: XTransferable, ReadableName: String): MailAttachment = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], ReadableName = ReadableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailAttachment]
  }
  @scala.inline
  implicit class MailAttachmentOps[Self <: MailAttachment] (val x: Self) extends AnyVal {
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
    def setData(value: XTransferable): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadableName(value: String): Self = this.set("ReadableName", value.asInstanceOf[js.Any])
  }
  
}

