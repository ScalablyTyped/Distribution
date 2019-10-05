package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingQueue")
@js.native
class FaxIncomingQueue protected () extends js.Object {
  /** Is queue blocked */
  var Blocked: Boolean = js.native
  var `FAXCOMEXLib.FaxIncomingQueue_typekey`: FaxIncomingQueue = js.native
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

