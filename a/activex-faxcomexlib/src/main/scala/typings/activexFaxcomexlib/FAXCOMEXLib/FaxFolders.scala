package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxFolders Class */
@js.native
trait FaxFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxFolders_typekey")
  var FAXCOMEXLibDotFaxFolders_typekey: FaxFolders = js.native
  /** Incoming archive */
  val IncomingArchive: FaxIncomingArchive = js.native
  /** Incoming queue */
  val IncomingQueue: FaxIncomingQueue = js.native
  /** Outgoing archive */
  val OutgoingArchive: FaxOutgoingArchive = js.native
  /** Outgoing queue */
  val OutgoingQueue: FaxOutgoingQueue = js.native
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
  @scala.inline
  implicit class FaxFoldersOps[Self <: FaxFolders] (val x: Self) extends AnyVal {
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
    def setFAXCOMEXLibDotFaxFolders_typekey(value: FaxFolders): Self = this.set("FAXCOMEXLib.FaxFolders_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingArchive(value: FaxIncomingArchive): Self = this.set("IncomingArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingQueue(value: FaxIncomingQueue): Self = this.set("IncomingQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingArchive(value: FaxOutgoingArchive): Self = this.set("OutgoingArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingQueue(value: FaxOutgoingQueue): Self = this.set("OutgoingQueue", value.asInstanceOf[js.Any])
  }
  
}

