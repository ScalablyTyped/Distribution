package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** simplifies the accessing of data sources, and it's corresponding database document and forms, and reports. */
trait XOfficeDatabaseDocument
  extends XFormDocumentsSupplier
     with XReportDocumentsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier {
  /** provides access to the one and only {@link DataSource} associated with this document */
  var DataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource
}

object XOfficeDatabaseDocument {
  @scala.inline
  def apply(
    DataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource,
    DocumentSubStoragesNames: stdLib.SafeArray[java.lang.String],
    FormDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    ReportDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: () => scala.Unit,
    getDocumentSubStorage: (java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    getDocumentSubStoragesNames: () => stdLib.SafeArray[java.lang.String],
    getFormDocuments: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getReportDocuments: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XOfficeDatabaseDocument = {
    val __obj = js.Dynamic.literal(DataSource = DataSource, DocumentSubStoragesNames = DocumentSubStoragesNames, FormDocuments = FormDocuments, ReportDocuments = ReportDocuments, acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getFormDocuments = js.Any.fromFunction0(getFormDocuments), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
}

