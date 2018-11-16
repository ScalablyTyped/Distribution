package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingQueue")
@js.native
class FaxOutgoingQueue protected () extends js.Object {
  /** How long the failed fax message is kept on the server */
  var AgeLimit: scala.Double = js.native
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: scala.Boolean = js.native
  /** Is the queue blocked */
  var Blocked: scala.Boolean = js.native
  /** Does the server generate a brand */
  var Branding: scala.Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: stdLib.VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: stdLib.VarDate = js.native
  var `FAXCOMEXLib.FaxOutgoingQueue_typekey`: FaxOutgoingQueue = js.native
  /** Is the queue paused */
  var Paused: scala.Boolean = js.native
  /** Number of retries */
  var Retries: scala.Double = js.native
  /** Retry delay */
  var RetryDelay: scala.Double = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: scala.Boolean = js.native
  /** Outgoing job by ID */
  def GetJob(bstrJobId: java.lang.String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

