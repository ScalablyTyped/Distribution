package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountIncomingQueue")
@js.native
class FaxAccountIncomingQueue protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue = js.native
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
}

