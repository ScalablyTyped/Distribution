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
    __obj.updateDynamic("IsInstalled")(IsInstalled)
    __obj.updateDynamic("RemovePackageByFiles")(RemovePackageByFiles)
    __obj.updateDynamic("SearchFile")(SearchFile)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSyncDbusSessionHelper]
  }
}

