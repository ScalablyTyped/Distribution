package typings
package activexDashLibreofficeLib.orgNs.freedesktopNs.PackageKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used for modifying the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
trait XModify
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallCatalogs(
    xid: scala.Double,
    files: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs fontconfig resources ( [in] usually fonts) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallFontconfigResources(
    xid: scala.Double,
    resources: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs GStreamer resources ( [in] usually codecs) from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallGStreamerResources(
    xid: scala.Double,
    resources: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs mimetype handlers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallMimeTypes(
    xid: scala.Double,
    mimeTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs local package sequence< string > files or service packs.
    * @since LibreOffice 4.0
    */
  def InstallPackageFiles(
    xid: scala.Double,
    files: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs sequence< string > packages from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPackageNames(
    xid: scala.Double,
    packages: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs printer drivers from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallPrinterDrivers(
    xid: scala.Double,
    files: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs sequence< string > packages to provide sequence< string > files.
    * @since LibreOffice 4.0
    */
  def InstallProvideFiles(
    xid: scala.Double,
    files: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Installs resources of a given type from a configured software source.
    * @since LibreOffice 4.0
    */
  def InstallResources(
    xid: scala.Double,
    types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    resources: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
  /**
    * Removes sequence< string > packages that provide the given local sequence< string > files.
    * @since LibreOffice 4.0
    */
  def RemovePackageByFiles(
    xid: scala.Double,
    files: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    interaction: java.lang.String
  ): scala.Unit
}

