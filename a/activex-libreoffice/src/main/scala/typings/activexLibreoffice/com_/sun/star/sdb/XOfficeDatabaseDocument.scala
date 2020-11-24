package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.document.XDocumentSubStorageSupplier
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** simplifies the accessing of data sources, and it's corresponding database document and forms, and reports. */
@js.native
trait XOfficeDatabaseDocument
  extends XFormDocumentsSupplier
     with XReportDocumentsSupplier
     with XDocumentSubStorageSupplier {
  
  /** provides access to the one and only {@link DataSource} associated with this document */
  var DataSource: XDataSource = js.native
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
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], FormDocuments = FormDocuments.asInstanceOf[js.Any], ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), getFormDocuments = js.Any.fromFunction0(getFormDocuments), getReportDocuments = js.Any.fromFunction0(getReportDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
  
  @scala.inline
  implicit class XOfficeDatabaseDocumentOps[Self <: XOfficeDatabaseDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSource(value: XDataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
  }
}
