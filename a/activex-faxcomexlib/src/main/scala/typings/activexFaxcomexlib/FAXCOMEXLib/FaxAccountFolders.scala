package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountFolders Class */
@js.native
trait FaxAccountFolders extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountFolders_typekey")
  var FAXCOMEXLibDotFaxAccountFolders_typekey: FaxAccountFolders = js.native
  /** Incoming archive */
  val IncomingArchive: FaxAccountIncomingArchive = js.native
  /** Incoming queue */
  val IncomingQueue: FaxAccountIncomingQueue = js.native
  /** Outgoing archive */
  val OutgoingArchive: FaxAccountOutgoingArchive = js.native
  /** Outgoing queue */
  val OutgoingQueue: FaxAccountOutgoingQueue = js.native
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
  @scala.inline
  implicit class FaxAccountFoldersOps[Self <: FaxAccountFolders] (val x: Self) extends AnyVal {
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
    def setFAXCOMEXLibDotFaxAccountFolders_typekey(value: FaxAccountFolders): Self = this.set("FAXCOMEXLib.FaxAccountFolders_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingArchive(value: FaxAccountIncomingArchive): Self = this.set("IncomingArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncomingQueue(value: FaxAccountIncomingQueue): Self = this.set("IncomingQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingArchive(value: FaxAccountOutgoingArchive): Self = this.set("OutgoingArchive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutgoingQueue(value: FaxAccountOutgoingQueue): Self = this.set("OutgoingQueue", value.asInstanceOf[js.Any])
  }
  
}

