package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link LicenseException} reflects the necessity of someone agreeing to a license.
  * @since OOo 2.0.4
  */
trait LicenseException extends Exception {
  /** contains the value of the attribute `/description/registration/simple-license/@accept-by` from the description.xml */
  var AcceptBy: String
  /**
    * name of the extension.
    *
    * The display name of the extension. See {@link XPackage.getDisplayName()}
    */
  var ExtensionName: String
  /** contains the text of the license. */
  var Text: String
}

object LicenseException {
  @scala.inline
  def apply(AcceptBy: String, Context: XInterface, ExtensionName: String, Message: String, Text: String): LicenseException = {
    val __obj = js.Dynamic.literal(AcceptBy = AcceptBy, Context = Context, ExtensionName = ExtensionName, Message = Message, Text = Text)
  
    __obj.asInstanceOf[LicenseException]
  }
}

