package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
class FaxAccountOutgoingQueue protected () extends js.Object {
  var `FAXCOMEXLib.FaxAccountOutgoingQueue_typekey`: FaxAccountOutgoingQueue = js.native
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: java.lang.String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
}

