package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentSubStorageSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XDataSource
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** simplifies the accessing of data sources, and it's corresponding database document and forms, and reports. */
trait XOfficeDatabaseDocument
  extends XFormDocumentsSupplier
     with XReportDocumentsSupplier
     with XDocumentSubStorageSupplier {
  /** provides access to the one and only {@link DataSource} associated with this document */
  var DataSource: XDataSource
}

object XOfficeDatabaseDocument {
  @scala.inline
  def apply(
    DataSource: XDataSource,
    DocumentSubStoragesNames: SafeArray[String],
    FormDocuments: XNameAccess,
    ReportDocuments: XNameAccess,
    acquire: () => Unit,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    getFormDocuments: () => XNameAccess,
    getReportDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XOfficeDatabaseDocument = {
    val __obj = js.Dynamic.literal(DataSource = DataSource, DocumentSubStoragesNames = DocumentSubStoragesNames, FormDocuments = FormDocuments, ReportDocuments = ReportDocuments, acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getFormDocuments = js.Any.fromFunction0(getFormDocuments), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
}

