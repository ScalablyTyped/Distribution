package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link LicenseException} reflects the necessity of someone agreeing to a license.
  * @since OOo 2.0.4
  */
trait LicenseException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the value of the attribute `/description/registration/simple-license/@accept-by` from the description.xml */
  var AcceptBy: java.lang.String
  /**
    * name of the extension.
    *
    * The display name of the extension. See {@link XPackage.getDisplayName()}
    */
  var ExtensionName: java.lang.String
  /** contains the text of the license. */
  var Text: java.lang.String
}

