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

