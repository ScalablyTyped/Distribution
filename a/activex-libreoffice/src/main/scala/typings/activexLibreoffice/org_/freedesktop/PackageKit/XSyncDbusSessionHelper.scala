package typings.activexLibreoffice.org_.freedesktop.PackageKit

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSyncDbusSessionHelper
  extends XModify
     with XQuery

object XSyncDbusSessionHelper {
  @scala.inline
  def apply(
    InstallCatalogs: (Double, SeqEquiv[String], String) => Unit,
    InstallFontconfigResources: (Double, SeqEquiv[String], String) => Unit,
    InstallGStreamerResources: (Double, SeqEquiv[String], String) => Unit,
    InstallMimeTypes: (Double, SeqEquiv[String], String) => Unit,
    InstallPackageFiles: (Double, SeqEquiv[String], String) => Unit,
    InstallPackageNames: (Double, SeqEquiv[String], String) => Unit,
    InstallPrinterDrivers: (Double, SeqEquiv[String], String) => Unit,
    InstallProvideFiles: (Double, SeqEquiv[String], String) => Unit,
    InstallResources: (Double, SeqEquiv[String], SeqEquiv[String], String) => Unit,
    IsInstalled: (String, String, js.Array[Boolean]) => Unit,
    RemovePackageByFiles: (Double, SeqEquiv[String], String) => Unit,
    SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSyncDbusSessionHelper = {
    val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3(InstallCatalogs), InstallFontconfigResources = js.Any.fromFunction3(InstallFontconfigResources), InstallGStreamerResources = js.Any.fromFunction3(InstallGStreamerResources), InstallMimeTypes = js.Any.fromFunction3(InstallMimeTypes), InstallPackageFiles = js.Any.fromFunction3(InstallPackageFiles), InstallPackageNames = js.Any.fromFunction3(InstallPackageNames), InstallPrinterDrivers = js.Any.fromFunction3(InstallPrinterDrivers), InstallProvideFiles = js.Any.fromFunction3(InstallProvideFiles), InstallResources = js.Any.fromFunction4(InstallResources), IsInstalled = js.Any.fromFunction3(IsInstalled), RemovePackageByFiles = js.Any.fromFunction3(RemovePackageByFiles), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSyncDbusSessionHelper]
  }
}

