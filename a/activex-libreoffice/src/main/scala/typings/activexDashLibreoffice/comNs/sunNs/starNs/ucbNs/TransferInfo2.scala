package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link TransferInfo} structure to give some additional parameters for transfers. */
trait TransferInfo2 extends TransferInfo {
  /** contains the MIME type of the source of the action */
  var MimeType: String
}

object TransferInfo2 {
  @scala.inline
  def apply(MimeType: String, MoveData: Boolean, NameClash: Double, NewTitle: String, SourceURL: String): TransferInfo2 = {
    val __obj = js.Dynamic.literal(MimeType = MimeType, MoveData = MoveData, NameClash = NameClash, NewTitle = NewTitle, SourceURL = SourceURL)
  
    __obj.asInstanceOf[TransferInfo2]
  }
}

