package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingQueue Class */
trait FaxIncomingQueue extends js.Object {
  /** Is queue blocked */
  var Blocked: Boolean
  @JSName("FAXCOMEXLib.FaxIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxIncomingQueue {
  @scala.inline
  def apply(
    Blocked: Boolean,
    FAXCOMEXLibDotFaxIncomingQueue_typekey: FaxIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxIncomingQueue = {
    val __obj = js.Dynamic.literal(Blocked = Blocked.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs), Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingQueue_typekey")(FAXCOMEXLibDotFaxIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingQueue]
  }
}

