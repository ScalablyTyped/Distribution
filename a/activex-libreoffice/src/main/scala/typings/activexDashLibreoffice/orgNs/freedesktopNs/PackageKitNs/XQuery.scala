package typings.activexDashLibreoffice.orgNs.freedesktopNs.PackageKitNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used for quering the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
trait XQuery extends XInterface {
  /**
    * Installs local package files or service packs.
    * @since LibreOffice 4.0
    */
  def IsInstalled(packageName: String, interaction: String, installed: js.Array[Boolean]): Unit
  /**
    * Installs packages to provide files.
    * @since LibreOffice 4.0
    */
  def SearchFile(fileName: String, interaction: String, installed: js.Array[Boolean], packageName: js.Array[String]): Unit
}

object XQuery {
  @scala.inline
  def apply(
    IsInstalled: (String, String, js.Array[Boolean]) => Unit,
    SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQuery = {
    val __obj = js.Dynamic.literal(IsInstalled = js.Any.fromFunction3(IsInstalled), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XQuery]
  }
}

