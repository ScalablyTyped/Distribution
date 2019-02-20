package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link MailAttachment} specifies a mail message attachment.
  * @see com.sun.star.mail.XMailMessage
  * @since OOo 2.0
  */
trait MailAttachment extends js.Object {
  /**
    * The actual data which should be attached to a mail message. It is expected that the transferable delivers the data as sequence of bytes. Although a
    * transferable may support multiple data flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the type
    * of the data is a sequence of bytes.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Data: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  /** The name of the attachment as seen by the recipient of the mail message. ReadableName must not be empty. */
  var ReadableName: java.lang.String
}

