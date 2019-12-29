package typings.activexDashFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingQueue")
@js.native
class FaxOutgoingQueue protected () extends js.Object {
  /** How long the failed fax message is kept on the server */
  var AgeLimit: Double = js.native
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean = js.native
  /** Is the queue blocked */
  var Blocked: Boolean = js.native
  /** Does the server generate a brand */
  var Branding: Boolean = js.native
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate = js.native
  @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue = js.native
  /** Is the queue paused */
  var Paused: Boolean = js.native
  /** Number of retries */
  var Retries: Double = js.native
  /** Retry delay */
  var RetryDelay: Double = js.native
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

