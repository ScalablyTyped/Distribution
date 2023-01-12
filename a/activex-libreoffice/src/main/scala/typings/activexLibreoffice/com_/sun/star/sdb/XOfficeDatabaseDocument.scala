package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.document.XDocumentSubStorageSupplier
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** simplifies the accessing of data sources, and it's corresponding database document and forms, and reports. */
trait XOfficeDatabaseDocument
  extends StObject
     with XFormDocumentsSupplier
     with XReportDocumentsSupplier
     with XDocumentSubStorageSupplier {
  
  /** provides access to the one and only {@link DataSource} associated with this document */
  var DataSource: XDataSource
}
object XOfficeDatabaseDocument {
  
  inline def apply(
    DataSource: XDataSource,
    DocumentSubStoragesNames: SafeArray[String],
    FormDocuments: XNameAccess,
    ReportDocuments: XNameAccess,
    acquire: () => Unit,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    getFormDocuments: () => XNameAccess,
    getReportDocuments: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XOfficeDatabaseDocument = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], FormDocuments = FormDocuments.asInstanceOf[js.Any], ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getFormDocuments = js.Any.fromFunction0(getFormDocuments), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XOfficeDatabaseDocument] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: XDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
  }
}
