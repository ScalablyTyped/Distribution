package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingQueue")
@js.native
/* private */ open class FaxOutgoingQueue ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingQueue {
  
  /** How long the failed fax message is kept on the server */
  /* CompleteClass */
  var AgeLimit: Double = js.native
  
  /** Are personal cover pages allowed */
  /* CompleteClass */
  var AllowPersonalCoverPages: Boolean = js.native
  
  /** Is the queue blocked */
  /* CompleteClass */
  var Blocked: Boolean = js.native
  
  /** Does the server generate a brand */
  /* CompleteClass */
  var Branding: Boolean = js.native
  
  /** End of the discount rate period */
  /* CompleteClass */
  var DiscountRateEnd: VarDate = js.native
  
  /** Start of the discount rate period */
  /* CompleteClass */
  var DiscountRateStart: VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxOutgoingQueue_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingQueue = js.native
  
  /** Outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
  
  /** Is the queue paused */
  /* CompleteClass */
  var Paused: Boolean = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Number of retries */
  /* CompleteClass */
  var Retries: Double = js.native
  
  /** Retry delay */
  /* CompleteClass */
  var RetryDelay: Double = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Is device Transmitting Station ID used */
  /* CompleteClass */
  var UseDeviceTSID: Boolean = js.native
}
