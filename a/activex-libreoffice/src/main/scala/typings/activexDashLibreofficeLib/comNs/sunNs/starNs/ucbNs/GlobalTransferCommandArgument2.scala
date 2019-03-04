package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct extends the one for transfers arguments by adding a Mime type and a Document Id property to it. */
trait GlobalTransferCommandArgument2 extends GlobalTransferCommandArgument {
  /** contains the DocumentId of the source object. */
  var DocumentId: java.lang.String
  /** contains the MIME type of the source object. */
  var MimeType: java.lang.String
}

object GlobalTransferCommandArgument2 {
  @scala.inline
  def apply(
    DocumentId: java.lang.String,
    MimeType: java.lang.String,
    NameClash: scala.Double,
    NewTitle: java.lang.String,
    Operation: TransferCommandOperation,
    SourceURL: java.lang.String,
    TargetURL: java.lang.String
  ): GlobalTransferCommandArgument2 = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, MimeType = MimeType, NameClash = NameClash, NewTitle = NewTitle, Operation = Operation, SourceURL = SourceURL, TargetURL = TargetURL)
  
    __obj.asInstanceOf[GlobalTransferCommandArgument2]
  }
}

