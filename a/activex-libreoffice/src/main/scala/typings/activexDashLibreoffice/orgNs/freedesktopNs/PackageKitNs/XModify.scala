package typings.activexDashLibreoffice.orgNs.freedesktopNs.PackageKitNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used for modifying the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
trait XModify extends XInterface {
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallCatalogs(xid: Double, files: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs fontconfig resources ( [in] usually fonts) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallFontconfigResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs GStreamer resources ( [in] usually codecs) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallGStreamerResources(xid: Double, resources: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs mimetype handlers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallMimeTypes(xid: Double, mimeTypes: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs local package sequence< string > files or service packs.
    * @since LibreOffice 4.0
    */
  def InstallPackageFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs sequence< string > packages from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPackageNames(xid: Double, packages: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs printer drivers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPrinterDrivers(xid: Double, files: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallProvideFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
  /**
    * Installs resources of a given type from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallResources(xid: Double, types: SeqEquiv[String], resources: SeqEquiv[String], interaction: String): Unit
  /**
    * Removes sequence< string > packages that provide the given local sequence< string > files.
    * @since LibreOffice 4.0
    */
  def RemovePackageByFiles(xid: Double, files: SeqEquiv[String], interaction: String): Unit
}

object XModify {
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
    RemovePackageByFiles: (Double, SeqEquiv[String], String) => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModify = {
    val __obj = js.Dynamic.literal(InstallCatalogs = js.Any.fromFunction3(InstallCatalogs), InstallFontconfigResources = js.Any.fromFunction3(InstallFontconfigResources), InstallGStreamerResources = js.Any.fromFunction3(InstallGStreamerResources), InstallMimeTypes = js.Any.fromFunction3(InstallMimeTypes), InstallPackageFiles = js.Any.fromFunction3(InstallPackageFiles), InstallPackageNames = js.Any.fromFunction3(InstallPackageNames), InstallPrinterDrivers = js.Any.fromFunction3(InstallPrinterDrivers), InstallProvideFiles = js.Any.fromFunction3(InstallProvideFiles), InstallResources = js.Any.fromFunction4(InstallResources), RemovePackageByFiles = js.Any.fromFunction3(RemovePackageByFiles), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XModify]
  }
}

