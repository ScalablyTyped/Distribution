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
    IsInstalled: js.Function3[java.lang.String, java.lang.String, js.Array[scala.Boolean], scala.Unit],
    SearchFile: js.Function4[
      java.lang.String, 
      java.lang.String, 
      js.Array[scala.Boolean], 
      js.Array[java.lang.String], 
      scala.Unit
    ],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XQuery = {
    val __obj = js.Dynamic.literal(IsInstalled = IsInstalled, SearchFile = SearchFile, acquire = acquire, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XQuery]
  }
}

