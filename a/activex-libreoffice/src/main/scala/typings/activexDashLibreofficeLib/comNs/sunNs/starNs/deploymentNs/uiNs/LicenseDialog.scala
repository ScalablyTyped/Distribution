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

object LicenseDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    create: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): LicenseDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, create = create, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[LicenseDialog]
  }
}

