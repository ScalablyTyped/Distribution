package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxFolders Class */
trait FaxFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxFolders_typekey")
  var FAXCOMEXLibDotFaxFolders_typekey: FaxFolders
  /** Incoming archive */
  val IncomingArchive: FaxIncomingArchive
  /** Incoming queue */
  val IncomingQueue: FaxIncomingQueue
  /** Outgoing archive */
  val OutgoingArchive: FaxOutgoingArchive
  /** Outgoing queue */
  val OutgoingQueue: FaxOutgoingQueue
}

object FaxFolders {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxFolders_typekey: FaxFolders,
    IncomingArchive: FaxIncomingArchive,
    IncomingQueue: FaxIncomingQueue,
    OutgoingArchive: FaxOutgoingArchive,
    OutgoingQueue: FaxOutgoingQueue
  ): FaxFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxFolders_typekey")(FAXCOMEXLibDotFaxFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxFolders]
  }
}

