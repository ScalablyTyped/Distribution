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

object XSmtpService {
  @scala.inline
  def apply(
    CurrentConnectionContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext,
    SupportedConnectionTypes: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addConnectionListener: XConnectionListener => scala.Unit,
    connect: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext, XAuthenticator) => scala.Unit,
    disconnect: () => scala.Unit,
    getCurrentConnectionContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext,
    getSupportedConnectionTypes: () => stdLib.SafeArray[java.lang.String],
    isConnected: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeConnectionListener: XConnectionListener => scala.Unit,
    sendMailMessage: XMailMessage => scala.Unit
  ): XSmtpService = {
    val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext, SupportedConnectionTypes = SupportedConnectionTypes, acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener), sendMailMessage = js.Any.fromFunction1(sendMailMessage))
  
    __obj.asInstanceOf[XSmtpService]
  }
}

