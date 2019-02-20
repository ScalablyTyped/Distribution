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

