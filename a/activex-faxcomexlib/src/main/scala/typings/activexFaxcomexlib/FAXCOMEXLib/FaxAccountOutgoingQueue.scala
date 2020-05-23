package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
trait FaxAccountOutgoingQueue extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs
}

object FaxAccountOutgoingQueue {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: () => FaxOutgoingJobs
  ): FaxAccountOutgoingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")(FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountOutgoingQueue]
  }
}

