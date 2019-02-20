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

