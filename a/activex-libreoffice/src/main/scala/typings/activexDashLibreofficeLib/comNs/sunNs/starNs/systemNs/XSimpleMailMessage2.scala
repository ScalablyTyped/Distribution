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
    Attachement: activexDashInteropLib.SafeArray[java.lang.String],
    BccRecipient: activexDashInteropLib.SafeArray[java.lang.String],
    Body: java.lang.String,
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
  ): XSimpleMailMessage2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachement")(Attachement)
    __obj.updateDynamic("BccRecipient")(BccRecipient)
    __obj.updateDynamic("Body")(Body)
    __obj.updateDynamic("CcRecipient")(CcRecipient)
    __obj.updateDynamic("Originator")(Originator)
    __obj.updateDynamic("Recipient")(Recipient)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAttachement")(getAttachement)
    __obj.updateDynamic("getBccRecipient")(getBccRecipient)
    __obj.updateDynamic("getCcRecipient")(getCcRecipient)
    __obj.updateDynamic("getOriginator")(getOriginator)
    __obj.updateDynamic("getRecipient")(getRecipient)
    __obj.updateDynamic("getSubject")(getSubject)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setAttachement")(setAttachement)
    __obj.updateDynamic("setBccRecipient")(setBccRecipient)
    __obj.updateDynamic("setCcRecipient")(setCcRecipient)
    __obj.updateDynamic("setOriginator")(setOriginator)
    __obj.updateDynamic("setRecipient")(setRecipient)
    __obj.updateDynamic("setSubject")(setSubject)
    __obj.asInstanceOf[XSimpleMailMessage2]
  }
}

