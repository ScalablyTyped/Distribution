package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link TransferInfo} structure to give some additional parameters for transfers. */
trait TransferInfo2 extends TransferInfo {
  /** contains the MIME type of the source of the action */
  var MimeType: java.lang.String
}

object TransferInfo2 {
  @scala.inline
  def apply(
    MimeType: java.lang.String,
    MoveData: scala.Boolean,
    NameClash: scala.Double,
    NewTitle: java.lang.String,
    SourceURL: java.lang.String
  ): TransferInfo2 = {
    val __obj = js.Dynamic.literal(MimeType = MimeType, MoveData = MoveData, NameClash = NameClash, NewTitle = NewTitle, SourceURL = SourceURL)
  
    __obj.asInstanceOf[TransferInfo2]
  }
}

