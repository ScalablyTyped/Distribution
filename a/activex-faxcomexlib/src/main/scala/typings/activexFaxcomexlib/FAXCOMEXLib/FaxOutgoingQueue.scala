package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingQueue Class */
trait FaxOutgoingQueue extends js.Object {
  /** How long the failed fax message is kept on the server */
  var AgeLimit: Double
  /** Are personal cover pages allowed */
  var AllowPersonalCoverPages: Boolean
  /** Is the queue blocked */
  var Blocked: Boolean
  /** Does the server generate a brand */
  var Branding: Boolean
  /** End of the discount rate period */
  var DiscountRateEnd: VarDate
  /** Start of the discount rate period */
  var DiscountRateStart: VarDate
  @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue
  /** Is the queue paused */
  var Paused: Boolean
  /** Number of retries */
  var Retries: Double
  /** Retry delay */
  var RetryDelay: Double
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxOutgoingQueue {
  @scala.inline
  def apply(
    AgeLimit: Double,
    AllowPersonalCoverPages: Boolean,
    Blocked: Boolean,
    Branding: Boolean,
    DiscountRateEnd: VarDate,
    DiscountRateStart: VarDate,
    FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: () => FaxOutgoingJobs,
    Paused: Boolean,
    Refresh: () => Unit,
    Retries: Double,
    RetryDelay: Double,
    Save: () => Unit,
    UseDeviceTSID: Boolean
  ): FaxOutgoingQueue = {
    val __obj = js.Dynamic.literal(AgeLimit = AgeLimit.asInstanceOf[js.Any], AllowPersonalCoverPages = AllowPersonalCoverPages.asInstanceOf[js.Any], Blocked = Blocked.asInstanceOf[js.Any], Branding = Branding.asInstanceOf[js.Any], DiscountRateEnd = DiscountRateEnd.asInstanceOf[js.Any], DiscountRateStart = DiscountRateStart.asInstanceOf[js.Any], GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs), Paused = Paused.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RetryDelay = RetryDelay.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), UseDeviceTSID = UseDeviceTSID.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingQueue_typekey")(FAXCOMEXLibDotFaxOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingQueue]
  }
}

