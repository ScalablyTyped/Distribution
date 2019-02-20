package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a SMTP service abstraction.
  * @see com.sun.star.mail.XMailService
  * @see com.sun.star.mail.XMailMessage
  * @since OOo 2.0
  */
trait XSmtpService extends XMailService {
  /**
    * Send a mail message to its recipients.
    * @param xMailMessage [in] the mail message to be sent.
    * @see com.sun.star.mail.XMailMessage
    * @see com.sun.star.io.NotConnectedException
    * @see com.sun.star.mail.SendMailMessageFailedException
    * @see com.sun.star.mail.MailException
    * @see com.sun.star.datatransfer.UnsupportedFlavorException
    * @throws com::sun::star::io::NotConnectedException if no user is currently connected to the mail server.
    * @throws com::sun::star::mail::SendMailMessageFailedException if the message could not be sent because of invalid recipient addresses. The e-mail addresse
    * @throws com::sun::star::mail::MailException is thrown on other errors that may happen during sending. A possible reason may be for instance that a file a
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException is thrown when the body of the mail message is provided in an unsupported mime content t
    */
  def sendMailMessage(xMailMessage: XMailMessage): scala.Unit
}

