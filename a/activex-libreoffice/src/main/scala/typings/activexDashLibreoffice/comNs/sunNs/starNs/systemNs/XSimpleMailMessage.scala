package typings.activexDashLibreoffice.comNs.sunNs.starNs.systemNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface lets a client set or get the information of a simple mail message. */
trait XSimpleMailMessage extends XInterface {
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  var Attachement: SafeArray[String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  var BccRecipient: SafeArray[String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  var CcRecipient: SafeArray[String]
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  var Originator: String
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  var Recipient: String
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  var Subject: String
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  def getAttachement(): SafeArray[String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  def getBccRecipient(): SafeArray[String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  def getCcRecipient(): SafeArray[String]
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  def getOriginator(): String
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  def getRecipient(): String
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  def getSubject(): String
  /**
    * To set an attachment of a simple mail message.
    * @param aAttachement Sets a sequence of file URLs specifying the files that should be attached to the mail. The given file URLs must conform to [Rfc1738]
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the given file URLs is invalid (doesn't conform to [Rfc1738]{@link url="http://
    */
  def setAttachement(aAttachement: SeqEquiv[String]): Unit
  /**
    * To set the BCC recipient of a simple mail message.
    * @param aBccRecipient A sequence with the email addresses of one or more BCC recipients. An empty sequence means there are no BCC recipients.
    */
  def setBccRecipient(aBccRecipient: SeqEquiv[String]): Unit
  /**
    * To set the cc recipients of a simple mail message.
    * @param aCcRecipient Sets a sequence with the email addresses of one or more cc recipients. The method does not check if the given addresses are valid. A
    */
  def setCcRecipient(aCcRecipient: SeqEquiv[String]): Unit
  /**
    * To set the email address of the originator of a simple mail message.
    * @param aOriginator Sets the email address of the originator of the mail.
    */
  def setOriginator(aOriginator: String): Unit
  /**
    * To set the recipient of the simple mail message.
    * @param aRecipient The email address of a recipient. The method doesn't check if the given email address is valid.
    */
  def setRecipient(aRecipient: String): Unit
  /**
    * To set the subject of a simple mail message.
    * @param aSubject Sets the subject of the simple mail message.
    */
  def setSubject(aSubject: String): Unit
}

object XSimpleMailMessage {
  @scala.inline
  def apply(
    Attachement: SafeArray[String],
    BccRecipient: SafeArray[String],
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
  ): XSimpleMailMessage = {
    val __obj = js.Dynamic.literal(Attachement = Attachement, BccRecipient = BccRecipient, CcRecipient = CcRecipient, Originator = Originator, Recipient = Recipient, Subject = Subject, acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
  
    __obj.asInstanceOf[XSimpleMailMessage]
  }
}

