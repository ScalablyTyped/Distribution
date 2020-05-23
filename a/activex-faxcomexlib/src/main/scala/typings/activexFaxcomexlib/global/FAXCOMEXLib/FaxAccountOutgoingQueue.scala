package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
class FaxAccountOutgoingQueue protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  override var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue = js.native
  /** Get outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
}

