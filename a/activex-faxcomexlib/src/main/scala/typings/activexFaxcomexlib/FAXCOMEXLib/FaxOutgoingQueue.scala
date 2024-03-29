package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingQueue Class */
trait FaxOutgoingQueue extends StObject {
  
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
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: FaxOutgoingQueue
  
  /** Outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob
  
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs
  
  /** Is the queue paused */
  var Paused: Boolean
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Number of retries */
  var Retries: Double
  
  /** Retry delay */
  var RetryDelay: Double
  
  /** Save the object */
  def Save(): Unit
  
  /** Is device Transmitting Station ID used */
  var UseDeviceTSID: Boolean
}
object FaxOutgoingQueue {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FaxOutgoingQueue] (val x: Self) extends AnyVal {
    
    inline def setAgeLimit(value: Double): Self = StObject.set(x, "AgeLimit", value.asInstanceOf[js.Any])
    
    inline def setAllowPersonalCoverPages(value: Boolean): Self = StObject.set(x, "AllowPersonalCoverPages", value.asInstanceOf[js.Any])
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBranding(value: Boolean): Self = StObject.set(x, "Branding", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateEnd(value: VarDate): Self = StObject.set(x, "DiscountRateEnd", value.asInstanceOf[js.Any])
    
    inline def setDiscountRateStart(value: VarDate): Self = StObject.set(x, "DiscountRateStart", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxOutgoingQueue_typekey(value: FaxOutgoingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingQueue_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetJob(value: String => IFaxOutgoingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    inline def setGetJobs(value: () => FaxOutgoingJobs): Self = StObject.set(x, "GetJobs", js.Any.fromFunction0(value))
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "Paused", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "RetryDelay", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    inline def setUseDeviceTSID(value: Boolean): Self = StObject.set(x, "UseDeviceTSID", value.asInstanceOf[js.Any])
  }
}
