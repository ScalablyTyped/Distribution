package typings.activexLibreoffice.com_.sun.star.sdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * simplifies the accessing of data sources and their corresponding database document.
  *
  * The interface can be used to access the data source of the database document.
  * @see OfficeDatabaseDocument
  */
@js.native
trait XDocumentDataSource extends js.Object {
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
  var DatabaseDocument: XOfficeDatabaseDocument = js.native
}

object XDocumentDataSource {
  @scala.inline
  def apply(DatabaseDocument: XOfficeDatabaseDocument): XDocumentDataSource = {
    val __obj = js.Dynamic.literal(DatabaseDocument = DatabaseDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDocumentDataSource]
  }
  @scala.inline
  implicit class XDocumentDataSourceOps[Self <: XDocumentDataSource] (val x: Self) extends AnyVal {
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
    def setDatabaseDocument(value: XOfficeDatabaseDocument): Self = this.set("DatabaseDocument", value.asInstanceOf[js.Any])
  }
  
}

