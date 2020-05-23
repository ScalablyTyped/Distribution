package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for creating and sending email messages. */
trait XSimpleMailClient extends XInterface {
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
  def sendSimpleMailMessage(xSimpleMailMessage: XSimpleMailMessage, aFlag: Double): Unit
}

object XSimpleMailClient {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSimpleMailMessage: () => XSimpleMailMessage,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    sendSimpleMailMessage: (XSimpleMailMessage, Double) => Unit
  ): XSimpleMailClient = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSimpleMailMessage = js.Any.fromFunction0(createSimpleMailMessage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sendSimpleMailMessage = js.Any.fromFunction2(sendSimpleMailMessage))
    __obj.asInstanceOf[XSimpleMailClient]
  }
}

