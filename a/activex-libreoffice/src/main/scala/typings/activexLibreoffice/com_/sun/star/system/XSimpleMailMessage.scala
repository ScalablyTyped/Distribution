package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface lets a client set or get the information of a simple mail message. */
@js.native
trait XSimpleMailMessage extends XInterface {
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  var Attachement: SafeArray[String] = js.native
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  var BccRecipient: SafeArray[String] = js.native
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  var CcRecipient: SafeArray[String] = js.native
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  var Originator: String = js.native
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  var Recipient: String = js.native
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  var Subject: String = js.native
  /**
    * To get the attachment of a simple mail message.
    * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
    */
  def getAttachement(): SafeArray[String] = js.native
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  def getBccRecipient(): SafeArray[String] = js.native
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  def getCcRecipient(): SafeArray[String] = js.native
  /**
    * To get the email address of the originator of a simple mail message.
    * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
    */
  def getOriginator(): String = js.native
  /**
    * To get the recipient of the simple mail message.
    * @returns The specified email address of a recipient if any has been specified or an empty string.
    */
  def getRecipient(): String = js.native
  /**
    * To get the subject of a simple mail message.
    * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
    */
  def getSubject(): String = js.native
  /**
    * To set an attachment of a simple mail message.
    * @param aAttachement Sets a sequence of file URLs specifying the files that should be attached to the mail. The given file URLs must conform to [Rfc1738]
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the given file URLs is invalid (doesn't conform to [Rfc1738]{@link url="http://
    */
  def setAttachement(aAttachement: SeqEquiv[String]): Unit = js.native
  /**
    * To set the BCC recipient of a simple mail message.
    * @param aBccRecipient A sequence with the email addresses of one or more BCC recipients. An empty sequence means there are no BCC recipients.
    */
  def setBccRecipient(aBccRecipient: SeqEquiv[String]): Unit = js.native
  /**
    * To set the cc recipients of a simple mail message.
    * @param aCcRecipient Sets a sequence with the email addresses of one or more cc recipients. The method does not check if the given addresses are valid. A
    */
  def setCcRecipient(aCcRecipient: SeqEquiv[String]): Unit = js.native
  /**
    * To set the email address of the originator of a simple mail message.
    * @param aOriginator Sets the email address of the originator of the mail.
    */
  def setOriginator(aOriginator: String): Unit = js.native
  /**
    * To set the recipient of the simple mail message.
    * @param aRecipient The email address of a recipient. The method doesn't check if the given email address is valid.
    */
  def setRecipient(aRecipient: String): Unit = js.native
  /**
    * To set the subject of a simple mail message.
    * @param aSubject Sets the subject of the simple mail message.
    */
  def setSubject(aSubject: String): Unit = js.native
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
    val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[XSimpleMailMessage]
  }
  @scala.inline
  implicit class XSimpleMailMessageOps[Self <: XSimpleMailMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachement(value: SafeArray[String]): Self = this.set("Attachement", value.asInstanceOf[js.Any])
    @scala.inline
    def setBccRecipient(value: SafeArray[String]): Self = this.set("BccRecipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setCcRecipient(value: SafeArray[String]): Self = this.set("CcRecipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginator(value: String): Self = this.set("Originator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipient(value: String): Self = this.set("Recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAttachement(value: () => SafeArray[String]): Self = this.set("getAttachement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBccRecipient(value: () => SafeArray[String]): Self = this.set("getBccRecipient", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCcRecipient(value: () => SafeArray[String]): Self = this.set("getCcRecipient", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOriginator(value: () => String): Self = this.set("getOriginator", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecipient(value: () => String): Self = this.set("getRecipient", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAttachement(value: SeqEquiv[String] => Unit): Self = this.set("setAttachement", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBccRecipient(value: SeqEquiv[String] => Unit): Self = this.set("setBccRecipient", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCcRecipient(value: SeqEquiv[String] => Unit): Self = this.set("setCcRecipient", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOriginator(value: String => Unit): Self = this.set("setOriginator", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRecipient(value: String => Unit): Self = this.set("setRecipient", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
  }
  
}

