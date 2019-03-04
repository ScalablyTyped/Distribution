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
  var Attachement: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  var BccRecipient: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  var CcRecipient: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getAttachement(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * To get the BCC recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
    */
  def getBccRecipient(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * To get the cc recipients of a simple mail message.
    * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
    */
  def getCcRecipient(): activexDashInteropLib.SafeArray[java.lang.String]
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
    Attachement: activexDashInteropLib.SafeArray[java.lang.String],
    BccRecipient: activexDashInteropLib.SafeArray[java.lang.String],
    CcRecipient: activexDashInteropLib.SafeArray[java.lang.String],
    Originator: java.lang.String,
    Recipient: java.lang.String,
    Subject: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAttachement: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getBccRecipient: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getCcRecipient: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getOriginator: js.Function0[java.lang.String],
    getRecipient: js.Function0[java.lang.String],
    getSubject: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setAttachement: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setBccRecipient: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setCcRecipient: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setOriginator: js.Function1[java.lang.String, scala.Unit],
    setRecipient: js.Function1[java.lang.String, scala.Unit],
    setSubject: js.Function1[java.lang.String, scala.Unit]
  ): XSimpleMailMessage = {
    val __obj = js.Dynamic.literal(Attachement = Attachement, BccRecipient = BccRecipient, CcRecipient = CcRecipient, Originator = Originator, Recipient = Recipient, Subject = Subject, acquire = acquire, getAttachement = getAttachement, getBccRecipient = getBccRecipient, getCcRecipient = getCcRecipient, getOriginator = getOriginator, getRecipient = getRecipient, getSubject = getSubject, queryInterface = queryInterface, release = release, setAttachement = setAttachement, setBccRecipient = setBccRecipient, setCcRecipient = setCcRecipient, setOriginator = setOriginator, setRecipient = setRecipient, setSubject = setSubject)
  
    __obj.asInstanceOf[XSimpleMailMessage]
  }
}

