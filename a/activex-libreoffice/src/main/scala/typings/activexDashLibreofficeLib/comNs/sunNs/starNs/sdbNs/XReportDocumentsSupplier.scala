package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to a container of database reports.
  * @see Reports
  */
trait XReportDocumentsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  val ReportDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  def getReportDocuments(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XReportDocumentsSupplier {
  @scala.inline
  def apply(
    ReportDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getReportDocuments: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XReportDocumentsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ReportDocuments")(ReportDocuments)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getReportDocuments")(getReportDocuments)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XReportDocumentsSupplier]
  }
}

