package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This struct extends the one for transfers arguments by adding a Mime type and a Document Id property to it. */
trait GlobalTransferCommandArgument2 extends GlobalTransferCommandArgument {
  /** contains the DocumentId of the source object. */
  var DocumentId: String
  /** contains the MIME type of the source object. */
  var MimeType: String
}

object GlobalTransferCommandArgument2 {
  @scala.inline
  def apply(
    DocumentId: String,
    MimeType: String,
    NameClash: Double,
    NewTitle: String,
    Operation: TransferCommandOperation,
    SourceURL: String,
    TargetURL: String
  ): GlobalTransferCommandArgument2 = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], NameClash = NameClash.asInstanceOf[js.Any], NewTitle = NewTitle.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], SourceURL = SourceURL.asInstanceOf[js.Any], TargetURL = TargetURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTransferCommandArgument2]
  }
}

