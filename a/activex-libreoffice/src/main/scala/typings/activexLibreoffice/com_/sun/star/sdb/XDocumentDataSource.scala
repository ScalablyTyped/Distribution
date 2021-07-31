package typings.activexLibreoffice.com_.sun.star.sdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * simplifies the accessing of data sources and their corresponding database document.
  *
  * The interface can be used to access the data source of the database document.
  * @see OfficeDatabaseDocument
  */
trait XDocumentDataSource extends StObject {
  
  /**
    * provides access to the one and only {@link OfficeDatabaseDocument} which the data source is based on.
    *
    * The component returned by this attribute is an {@link OfficeDatabaseDocument} .
    *
    * Though there is a 1-to-1 relationship between database documents and data sources, each of the two can exist without its counterpart, but create this
    * counterpart on request only. As a consequence, the document obtained via this attribute might be newly created, which implies that the caller is now
    * responsible for it. In particular, the caller is responsible for calling {@link com.sun.star.util.XCloseable.close()} on the document as soon as it's
    * not needed anymore.
    *
    * Additionally, if the caller does long-lasting processing on the document, it's advised to add itself as {@link com.sun.star.util.XCloseListener} to
    * the document, to prevent closing as long as the processing lasts.
    */
  var DatabaseDocument: XOfficeDatabaseDocument
}
object XDocumentDataSource {
  
  @scala.inline
  def apply(DatabaseDocument: XOfficeDatabaseDocument): XDocumentDataSource = {
    val __obj = js.Dynamic.literal(DatabaseDocument = DatabaseDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDocumentDataSource]
  }
  
  @scala.inline
  implicit class XDocumentDataSourceMutableBuilder[Self <: XDocumentDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseDocument(value: XOfficeDatabaseDocument): Self = StObject.set(x, "DatabaseDocument", value.asInstanceOf[js.Any])
  }
}
