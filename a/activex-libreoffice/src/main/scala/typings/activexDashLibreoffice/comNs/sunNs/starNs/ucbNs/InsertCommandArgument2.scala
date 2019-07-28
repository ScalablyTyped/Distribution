package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The argument for the command "insert" augmented with some properties */
trait InsertCommandArgument2 extends InsertCommandArgument {
  /** contains the Document Id of the document to insert */
  var DocumentId: String
  /** contains the MIME type of the document to insert */
  var MimeType: String
}

object InsertCommandArgument2 {
  @scala.inline
  def apply(Data: XInputStream, DocumentId: String, MimeType: String, ReplaceExisting: Boolean): InsertCommandArgument2 = {
    val __obj = js.Dynamic.literal(Data = Data, DocumentId = DocumentId, MimeType = MimeType, ReplaceExisting = ReplaceExisting)
  
    __obj.asInstanceOf[InsertCommandArgument2]
  }
}

