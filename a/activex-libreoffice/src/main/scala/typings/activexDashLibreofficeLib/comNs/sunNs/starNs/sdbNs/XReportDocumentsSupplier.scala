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

