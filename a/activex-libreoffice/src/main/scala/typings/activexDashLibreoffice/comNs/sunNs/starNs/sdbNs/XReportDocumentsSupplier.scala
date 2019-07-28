package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to a container of database reports.
  * @see Reports
  */
trait XReportDocumentsSupplier extends XInterface {
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  val ReportDocuments: XNameAccess
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  def getReportDocuments(): XNameAccess
}

object XReportDocumentsSupplier {
  @scala.inline
  def apply(
    ReportDocuments: XNameAccess,
    acquire: () => Unit,
    getReportDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReportDocumentsSupplier = {
    val __obj = js.Dynamic.literal(ReportDocuments = ReportDocuments, acquire = js.Any.fromFunction0(acquire), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XReportDocumentsSupplier]
  }
}

