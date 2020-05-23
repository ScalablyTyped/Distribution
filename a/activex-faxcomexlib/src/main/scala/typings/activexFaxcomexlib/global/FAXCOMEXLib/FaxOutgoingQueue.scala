package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingQueue")
@js.native
class FaxOutgoingQueue protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingQueue {
  /** How long the failed fax message is kept on the server */
  /* CompleteClass */
  override var AgeLimit: Double = js.native
  /** Are personal cover pages allowed */
  /* CompleteClass */
  override var AllowPersonalCoverPages: Boolean = js.native
  /** Is the queue blocked */
  /* CompleteClass */
  override var Blocked: Boolean = js.native
  /** Does the server generate a brand */
  /* CompleteClass */
  override var Branding: Boolean = js.native
  /** End of the discount rate period */
  /* CompleteClass */
  override var DiscountRateEnd: VarDate = js.native
  /** Start of the discount rate period */
  /* CompleteClass */
  override var DiscountRateStart: VarDate = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  override var FAXCOMEXLibDotFaxOutgoingQueue_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingQueue = js.native
  /** Is the queue paused */
  /* CompleteClass */
  override var Paused: Boolean = js.native
  /** Number of retries */
  /* CompleteClass */
  override var Retries: Double = js.native
  /** Retry delay */
  /* CompleteClass */
  override var RetryDelay: Double = js.native
  /** Is device Transmitting Station ID used */
  /* CompleteClass */
  override var UseDeviceTSID: Boolean = js.native
  /** Outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

