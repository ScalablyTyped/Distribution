package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
class FaxAccountOutgoingQueue protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue = js.native
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
}

