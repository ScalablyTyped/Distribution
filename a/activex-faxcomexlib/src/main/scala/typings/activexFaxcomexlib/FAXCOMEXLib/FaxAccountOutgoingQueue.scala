package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountOutgoingQueue Class */
@js.native
trait FaxAccountOutgoingQueue extends StObject {
  
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue = js.native
  
  /** Get outgoing job by ID */
  def GetJob(bstrJobId: String): IFaxOutgoingJob = js.native
  
  /** Collection of outgoing jobs */
  def GetJobs(): FaxOutgoingJobs = js.native
}
object FaxAccountOutgoingQueue {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: FaxAccountOutgoingQueue,
    GetJob: String => IFaxOutgoingJob,
    GetJobs: () => FaxOutgoingJobs
  ): FaxAccountOutgoingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")(FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountOutgoingQueue]
  }
  
  @scala.inline
  implicit class FaxAccountOutgoingQueueMutableBuilder[Self <: FaxAccountOutgoingQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxAccountOutgoingQueue_typekey(value: FaxAccountOutgoingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountOutgoingQueue_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJob(value: String => IFaxOutgoingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobs(value: () => FaxOutgoingJobs): Self = StObject.set(x, "GetJobs", js.Any.fromFunction0(value))
  }
}
