package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface lets a client set or get the information of a simple mail message. */
trait XSimpleMailMessage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  var Attachement: stdLib.SafeArray[java.lang.String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  var BccRecipient: stdLib.SafeArray[java.lang.String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  var CcRecipient: stdLib.SafeArray[java.lang.String]
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  var Originator: java.lang.String
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  var Recipient: java.lang.String
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  var Subject: java.lang.String
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  def getAttachement(): stdLib.SafeArray[java.lang.String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  def getBccRecipient(): stdLib.SafeArray[java.lang.String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  def getCcRecipient(): stdLib.SafeArray[java.lang.String]
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  def getOriginator(): java.lang.String
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  def getRecipient(): java.lang.String
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  def getSubject(): java.lang.String
  /**
    * To set an attachment of a simple mail message.
    * @param aAttachement Sets a sequence of file URLs specifying the files that should be attached to the mail. The given file URLs must conform to [Rfc1738]
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the given file URLs is invalid (doesn't conform to [Rfc1738]{@link url="http://
    */
  def setAttachement(aAttachement: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * To set the BCC recipient of a simple mail message.
    * @param aBccRecipient A sequence with the email addresses of one or more BCC recipients. An empty sequence means there are no BCC recipients.
    */
  def setBccRecipient(aBccRecipient: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * To set the cc recipients of a simple mail message.
    * @param aCcRecipient Sets a sequence with the email addresses of one or more cc recipients. The method does not check if the given addresses are valid. A
    */
  def setCcRecipient(aCcRecipient: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * To set the email address of the originator of a simple mail message.
    * @param aOriginator Sets the email address of the originator of the mail.
    */
  def setOriginator(aOriginator: java.lang.String): scala.Unit
  /**
    * To set the recipient of the simple mail message.
    * @param aRecipient The email address of a recipient. The method doesn't check if the given email address is valid.
    */
  def setRecipient(aRecipient: java.lang.String): scala.Unit
  /**
    * To set the subject of a simple mail message.
    * @param aSubject Sets the subject of the simple mail message.
    */
  def setSubject(aSubject: java.lang.String): scala.Unit
}

object XSimpleMailMessage {
  @scala.inline
  def apply(
    Attachement: stdLib.SafeArray[java.lang.String],
    BccRecipient: stdLib.SafeArray[java.lang.String],
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
  ): XSimpleMailMessage = {
    val __obj = js.Dynamic.literal(Attachement = Attachement, BccRecipient = BccRecipient, CcRecipient = CcRecipient, Originator = Originator, Recipient = Recipient, Subject = Subject, acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
  
    __obj.asInstanceOf[XSimpleMailMessage]
  }
}

