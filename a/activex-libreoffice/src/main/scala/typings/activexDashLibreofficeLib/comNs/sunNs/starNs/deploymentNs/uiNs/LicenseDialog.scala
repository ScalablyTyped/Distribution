package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link LicenseDialog} is used to display a license text.
  * @since OOo 2.0.4
  */
trait LicenseDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  /**
    * Create a GUI using the specific parent window and focus on the given context.
    * @param xParent parent window
    * @param extensionName the display name of the extension
    * @param licenseText text to be displayed
    */
  def create(
    xParent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    extensionName: java.lang.String,
    licenseText: java.lang.String
  ): scala.Unit
}

