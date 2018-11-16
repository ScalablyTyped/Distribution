package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingQueue")
@js.native
class FaxIncomingQueue protected () extends js.Object {
  /** Is queue blocked */
  var Blocked: scala.Boolean = js.native
  var `FAXCOMEXLib.FaxIncomingQueue_typekey`: FaxIncomingQueue = js.native
  /** Get incoming job by ID */
  def GetJob(bstrJobId: java.lang.String): FaxIncomingJob = js.native
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

