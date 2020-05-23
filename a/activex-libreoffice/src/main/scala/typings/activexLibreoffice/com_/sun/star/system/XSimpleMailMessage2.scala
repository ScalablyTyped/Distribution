package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface extends {@link XSimpleMailMessage}
  * @since LibreOffice 4.2
  */
trait XSimpleMailMessage2 extends XSimpleMailMessage {
  var Body: String
}

object XSimpleMailMessage2 {
  @scala.inline
  def apply(
    Attachement: SafeArray[String],
    BccRecipient: SafeArray[String],
    Body: String,
    CcRecipient: SafeArray[String],
    Originator: String,
    Recipient: String,
    Subject: String,
    acquire: () => Unit,
    getAttachement: () => SafeArray[String],
    getBccRecipient: () => SafeArray[String],
    getCcRecipient: () => SafeArray[String],
    getOriginator: () => String,
    getRecipient: () => String,
    getSubject: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAttachement: SeqEquiv[String] => Unit,
    setBccRecipient: SeqEquiv[String] => Unit,
    setCcRecipient: SeqEquiv[String] => Unit,
    setOriginator: String => Unit,
    setRecipient: String => Unit,
    setSubject: String => Unit
  ): XSimpleMailMessage2 = {
    val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[XSimpleMailMessage2]
  }
}

