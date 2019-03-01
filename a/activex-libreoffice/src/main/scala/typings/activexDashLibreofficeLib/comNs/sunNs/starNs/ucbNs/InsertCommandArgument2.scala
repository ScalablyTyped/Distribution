package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The argument for the command "insert" augmented with some properties */
trait InsertCommandArgument2 extends InsertCommandArgument {
  /** contains the Document Id of the document to insert */
  var DocumentId: java.lang.String
  /** contains the MIME type of the document to insert */
  var MimeType: java.lang.String
}

object InsertCommandArgument2 {
  @scala.inline
  def apply(
    Data: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    DocumentId: java.lang.String,
    MimeType: java.lang.String,
    ReplaceExisting: scala.Boolean
  ): InsertCommandArgument2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("DocumentId")(DocumentId)
    __obj.updateDynamic("MimeType")(MimeType)
    __obj.updateDynamic("ReplaceExisting")(ReplaceExisting)
    __obj.asInstanceOf[InsertCommandArgument2]
  }
}

