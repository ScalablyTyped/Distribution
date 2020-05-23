package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountIncomingQueue Class */
trait FaxAccountIncomingQueue extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs
}

object FaxAccountIncomingQueue {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs
  ): FaxAccountIncomingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")(FAXCOMEXLibDotFaxAccountIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountIncomingQueue]
  }
}

