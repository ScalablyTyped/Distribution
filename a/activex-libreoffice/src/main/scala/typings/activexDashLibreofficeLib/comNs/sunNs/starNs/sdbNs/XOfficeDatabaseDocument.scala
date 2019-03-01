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
    DocumentSubStoragesNames: activexDashInteropLib.SafeArray[java.lang.String],
    FormDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    ReportDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getDocumentSubStorage: js.Function2[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
    ],
    getDocumentSubStoragesNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getFormDocuments: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getReportDocuments: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XOfficeDatabaseDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataSource")(DataSource)
    __obj.updateDynamic("DocumentSubStoragesNames")(DocumentSubStoragesNames)
    __obj.updateDynamic("FormDocuments")(FormDocuments)
    __obj.updateDynamic("ReportDocuments")(ReportDocuments)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDocumentSubStorage")(getDocumentSubStorage)
    __obj.updateDynamic("getDocumentSubStoragesNames")(getDocumentSubStoragesNames)
    __obj.updateDynamic("getFormDocuments")(getFormDocuments)
    __obj.updateDynamic("getReportDocuments")(getReportDocuments)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
}

