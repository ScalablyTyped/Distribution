package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingQueue Class */
@js.native
trait FaxOutgoingQueue extends js.Object {
  
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
  
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
  
  /** Is the queue paused */
  var Paused: Boolean = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Number of retries */
  var Retries: Double = js.native
  
  /** Retry delay */
  var RetryDelay: Double = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
  
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean = js.native
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
  
  @scala.inline
  implicit class FaxOutgoingQueueOps[Self <: FaxOutgoingQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgeLimit(value: Double): Self = this.set("AgeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPersonalCoverPages(value: Boolean): Self = this.set("AllowPersonalCoverPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked(value: Boolean): Self = this.set("Blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranding(value: Boolean): Self = this.set("Branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountRateEnd(value: VarDate): Self = this.set("DiscountRateEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountRateStart(value: VarDate): Self = this.set("DiscountRateStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutgoingQueue_typekey(value: FaxOutgoingQueue): Self = this.set("FAXCOMEXLib.FaxOutgoingQueue_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJob(value: String => IFaxOutgoingJob): Self = this.set("GetJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobs(value: () => FaxOutgoingJobs): Self = this.set("GetJobs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("Paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("RetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseDeviceTSID(value: Boolean): Self = this.set("UseDeviceTSID", value.asInstanceOf[js.Any])
  }
}
