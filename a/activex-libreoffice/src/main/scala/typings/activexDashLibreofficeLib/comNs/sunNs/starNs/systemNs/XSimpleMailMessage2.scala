package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface extends {@link XSimpleMailMessage}
  * @since LibreOffice 4.2
  */
trait XSimpleMailMessage2 extends XSimpleMailMessage {
  var Body: java.lang.String
}

object XSimpleMailMessage2 {
  @scala.inline
  def apply(
    Attachement: stdLib.SafeArray[java.lang.String],
    BccRecipient: stdLib.SafeArray[java.lang.String],
    Body: java.lang.String,
    CcRecipient: stdLib.SafeArray[java.lang.String],
    Originator: java.lang.String,
    Recipient: java.lang.String,
    Subject: java.lang.String,
    acquire: () => scala.Unit,
    getAttachement: () => stdLib.SafeArray[java.lang.String],
    getBccRecipient: () => stdLib.SafeArray[java.lang.String],
    getCcRecipient: () => stdLib.SafeArray[java.lang.String],
    getOriginator: () => java.lang.String,
    getRecipient: () => java.lang.String,
    getSubject: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setAttachement: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setBccRecipient: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setCcRecipient: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setOriginator: java.lang.String => scala.Unit,
    setRecipient: java.lang.String => scala.Unit,
    setSubject: java.lang.String => scala.Unit
  ): XSimpleMailMessage2 = {
    val __obj = js.Dynamic.literal(Attachement = Attachement, BccRecipient = BccRecipient, Body = Body, CcRecipient = CcRecipient, Originator = Originator, Recipient = Recipient, Subject = Subject, acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
  
    __obj.asInstanceOf[XSimpleMailMessage2]
  }
}

