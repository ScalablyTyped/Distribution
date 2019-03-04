package typings
package activexDashLibreofficeLib.orgNs.freedesktopNs.PackageKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSyncDbusSessionHelper
  extends XModify
     with XQuery

object XSyncDbusSessionHelper {
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
    IsInstalled: js.Function3[java.lang.String, java.lang.String, js.Array[scala.Boolean], scala.Unit],
    RemovePackageByFiles: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      scala.Unit
    ],
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
  ): XSyncDbusSessionHelper = {
    val __obj = js.Dynamic.literal(InstallCatalogs = InstallCatalogs, InstallFontconfigResources = InstallFontconfigResources, InstallGStreamerResources = InstallGStreamerResources, InstallMimeTypes = InstallMimeTypes, InstallPackageFiles = InstallPackageFiles, InstallPackageNames = InstallPackageNames, InstallPrinterDrivers = InstallPrinterDrivers, InstallProvideFiles = InstallProvideFiles, InstallResources = InstallResources, IsInstalled = IsInstalled, RemovePackageByFiles = RemovePackageByFiles, SearchFile = SearchFile, acquire = acquire, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSyncDbusSessionHelper]
  }
}

