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
    SupportedConnectionTypes: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addConnectionListener: js.Function1[XConnectionListener, scala.Unit],
    connect: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext, 
      XAuthenticator, 
      scala.Unit
    ],
    disconnect: js.Function0[scala.Unit],
    getCurrentConnectionContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XCurrentContext],
    getSupportedConnectionTypes: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isConnected: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeConnectionListener: js.Function1[XConnectionListener, scala.Unit],
    sendMailMessage: js.Function1[XMailMessage, scala.Unit]
  ): XSmtpService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentConnectionContext")(CurrentConnectionContext)
    __obj.updateDynamic("SupportedConnectionTypes")(SupportedConnectionTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConnectionListener")(addConnectionListener)
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("getCurrentConnectionContext")(getCurrentConnectionContext)
    __obj.updateDynamic("getSupportedConnectionTypes")(getSupportedConnectionTypes)
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeConnectionListener")(removeConnectionListener)
    __obj.updateDynamic("sendMailMessage")(sendMailMessage)
    __obj.asInstanceOf[XSmtpService]
  }
}

