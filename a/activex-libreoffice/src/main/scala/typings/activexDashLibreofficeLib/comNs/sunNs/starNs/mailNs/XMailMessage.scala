package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mail message.
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
trait XMailMessage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  val Attachments: activexDashInteropLib.SafeArray[MailAttachment]
  /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
  val BccRecipients: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * The body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support multiple data
    * flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the data will be provided as a string.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Body: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
  val CcRecipients: activexDashInteropLib.SafeArray[java.lang.String]
  /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
  val Recipients: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * The e-mail address where replies on this mail message should be sent to. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message later will fail. If no ReplyToAddress is set replies go to the SenderAddress.
    */
  var ReplyToAddress: java.lang.String
  /**
    * The e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} .
    */
  var SenderAddress: java.lang.String
  /** The display name of the sender of this mail message. */
  var SenderName: java.lang.String
  /** The subject of a mail message. */
  var Subject: java.lang.String
  /**
    * Add a file attachment to a mail message.
    *
    * param aMailAttachment [in] specifies a file which should be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  def addAttachment(aMailAttachment: MailAttachment): scala.Unit
  /**
    * Add an BCC recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the BCC recipient.
    */
  def addBccRecipient(sRecipientAddress: java.lang.String): scala.Unit
  /**
    * Add an Cc recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the Cc recipient.
    */
  def addCcRecipient(sRecipientAddress: java.lang.String): scala.Unit
  /**
    * Add an recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the recipient.
    */
  def addRecipient(sRecipientAddress: java.lang.String): scala.Unit
  /**
    * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  def getAttachments(): activexDashInteropLib.SafeArray[MailAttachment]
  /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
  def getBccRecipients(): activexDashInteropLib.SafeArray[java.lang.String]
  /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
  def getCcRecipients(): activexDashInteropLib.SafeArray[java.lang.String]
  /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
  def getRecipients(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XMailMessage {
  @scala.inline
  def apply(
    Attachments: activexDashInteropLib.SafeArray[MailAttachment],
    BccRecipients: activexDashInteropLib.SafeArray[java.lang.String],
    Body: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    CcRecipients: activexDashInteropLib.SafeArray[java.lang.String],
    Recipients: activexDashInteropLib.SafeArray[java.lang.String],
    ReplyToAddress: java.lang.String,
    SenderAddress: java.lang.String,
    SenderName: java.lang.String,
    Subject: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addAttachment: js.Function1[MailAttachment, scala.Unit],
    addBccRecipient: js.Function1[java.lang.String, scala.Unit],
    addCcRecipient: js.Function1[java.lang.String, scala.Unit],
    addRecipient: js.Function1[java.lang.String, scala.Unit],
    getAttachments: js.Function0[activexDashInteropLib.SafeArray[MailAttachment]],
    getBccRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getCcRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getRecipients: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("BccRecipients")(BccRecipients)
    __obj.updateDynamic("Body")(Body)
    __obj.updateDynamic("CcRecipients")(CcRecipients)
    __obj.updateDynamic("Recipients")(Recipients)
    __obj.updateDynamic("ReplyToAddress")(ReplyToAddress)
    __obj.updateDynamic("SenderAddress")(SenderAddress)
    __obj.updateDynamic("SenderName")(SenderName)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAttachment")(addAttachment)
    __obj.updateDynamic("addBccRecipient")(addBccRecipient)
    __obj.updateDynamic("addCcRecipient")(addCcRecipient)
    __obj.updateDynamic("addRecipient")(addRecipient)
    __obj.updateDynamic("getAttachments")(getAttachments)
    __obj.updateDynamic("getBccRecipients")(getBccRecipients)
    __obj.updateDynamic("getCcRecipients")(getCcRecipients)
    __obj.updateDynamic("getRecipients")(getRecipients)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMailMessage]
  }
}

