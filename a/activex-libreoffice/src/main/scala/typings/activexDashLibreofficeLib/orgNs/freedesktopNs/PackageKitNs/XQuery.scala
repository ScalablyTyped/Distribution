package typings
package activexDashLibreofficeLib.orgNs.freedesktopNs.PackageKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used for quering the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
trait XQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Installs local package files or service packs.
    * @since LibreOffice 4.0
    */
  def IsInstalled(packageName: java.lang.String, interaction: java.lang.String, installed: js.Array[scala.Boolean]): scala.Unit
  /**
    * Installs packages to provide files.
    * @since LibreOffice 4.0
    */
  def SearchFile(
    fileName: java.lang.String,
    interaction: java.lang.String,
    installed: js.Array[scala.Boolean],
    packageName: js.Array[java.lang.String]
  ): scala.Unit
}

object XQuery {
  @scala.inline
  def apply(
    IsInstalled: (java.lang.String, java.lang.String, js.Array[scala.Boolean]) => scala.Unit,
    SearchFile: (java.lang.String, java.lang.String, js.Array[scala.Boolean], js.Array[java.lang.String]) => scala.Unit,
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XQuery = {
    val __obj = js.Dynamic.literal(IsInstalled = js.Any.fromFunction3(IsInstalled), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XQuery]
  }
}

