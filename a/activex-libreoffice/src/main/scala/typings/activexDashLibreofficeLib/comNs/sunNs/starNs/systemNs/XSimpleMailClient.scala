package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for creating and sending email messages. */
trait XSimpleMailClient
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Create a simple mail message object that implements the interface {@link XSimpleMailMessage} .
    * @returns An object that implements the {@link XSimpleMailMessage} interface.
    */
  def createSimpleMailMessage(): XSimpleMailMessage
  /**
    * Sends a given simple mail message object that implements the interface {@link XSimpleMailMessage} .
    * @param xSimpleMailMessage Specifies a configured mail object to be sent.
    * @param aFlag Specifies different flags that control the send process if the flag NO_USER_INTERFACE is specified. A recipient address must have been spec
    * @see com.sun.star.system.XSimpleMailMessage
    * @see com.sun.star.system.SimpleMailClientFlags
    * @throws com::sun::star::lang::IllegalArgumentException If invalid or excluding flags have been specified.The flag NO_USER_INTERFACE is specified and no r
    * @throws com::sun::star::uno::Exception if an error occurs while sending the mail. The Message member of the exception may contain an error description.
    */
  def sendSimpleMailMessage(xSimpleMailMessage: XSimpleMailMessage, aFlag: scala.Double): scala.Unit
}

object XSimpleMailClient {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createSimpleMailMessage: js.Function0[XSimpleMailMessage],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    sendSimpleMailMessage: js.Function2[XSimpleMailMessage, scala.Double, scala.Unit]
  ): XSimpleMailClient = {
    val __obj = js.Dynamic.literal(acquire = acquire, createSimpleMailMessage = createSimpleMailMessage, queryInterface = queryInterface, release = release, sendSimpleMailMessage = sendSimpleMailMessage)
  
    __obj.asInstanceOf[XSimpleMailClient]
  }
}

