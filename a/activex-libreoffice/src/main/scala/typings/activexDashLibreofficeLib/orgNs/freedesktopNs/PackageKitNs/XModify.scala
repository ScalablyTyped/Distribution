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

object XModify {
  @scala.inline
  def apply(
    InstallCatalogs: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallFontconfigResources: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallGStreamerResources: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallMimeTypes: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallPackageFiles: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallPackageNames: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallPrinterDrivers: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallProvideFiles: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    InstallResources: js.Function4[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    RemovePackageByFiles: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XModify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InstallCatalogs")(InstallCatalogs)
    __obj.updateDynamic("InstallFontconfigResources")(InstallFontconfigResources)
    __obj.updateDynamic("InstallGStreamerResources")(InstallGStreamerResources)
    __obj.updateDynamic("InstallMimeTypes")(InstallMimeTypes)
    __obj.updateDynamic("InstallPackageFiles")(InstallPackageFiles)
    __obj.updateDynamic("InstallPackageNames")(InstallPackageNames)
    __obj.updateDynamic("InstallPrinterDrivers")(InstallPrinterDrivers)
    __obj.updateDynamic("InstallProvideFiles")(InstallProvideFiles)
    __obj.updateDynamic("InstallResources")(InstallResources)
    __obj.updateDynamic("RemovePackageByFiles")(RemovePackageByFiles)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XModify]
  }
}

