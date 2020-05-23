package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountFolders Class */
trait FaxAccountFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountFolders_typekey")
  var FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders
  /** Incoming archive */
  val IncomingArchive: FaxAccountIncomingArchive
  /** Incoming queue */
  val IncomingQueue: FaxAccountIncomingQueue
  /** Outgoing archive */
  val OutgoingArchive: FaxAccountOutgoingArchive
  /** Outgoing queue */
  val OutgoingQueue: FaxAccountOutgoingQueue
}

object FaxAccountFolders {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders,
    IncomingArchive: FaxAccountIncomingArchive,
    IncomingQueue: FaxAccountIncomingQueue,
    OutgoingArchive: FaxAccountOutgoingArchive,
    OutgoingQueue: FaxAccountOutgoingQueue
  ): FaxAccountFolders = {
    val __obj = js.Dynamic.literal(IncomingArchive = IncomingArchive.asInstanceOf[js.Any], IncomingQueue = IncomingQueue.asInstanceOf[js.Any], OutgoingArchive = OutgoingArchive.asInstanceOf[js.Any], OutgoingQueue = OutgoingQueue.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountFolders_typekey")(FAXCOMEXLibDotFaxAccountFolders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountFolders]
  }
}

