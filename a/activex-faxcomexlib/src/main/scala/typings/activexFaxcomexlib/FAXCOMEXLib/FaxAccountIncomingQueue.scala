package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountIncomingQueue Class */
trait FaxAccountIncomingQueue extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue
  
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob
  
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs
}
object FaxAccountIncomingQueue {
  
  inline def apply(
    FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs
  ): FaxAccountIncomingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")(FAXCOMEXLibDotFaxAccountIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountIncomingQueue]
  }
  
  extension [Self <: FaxAccountIncomingQueue](x: Self) {
    
    inline def setFAXCOMEXLibDotFaxAccountIncomingQueue_typekey(value: FaxAccountIncomingQueue): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountIncomingQueue_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetJob(value: String => FaxIncomingJob): Self = StObject.set(x, "GetJob", js.Any.fromFunction1(value))
    
    inline def setGetJobs(value: () => FaxIncomingJobs): Self = StObject.set(x, "GetJobs", js.Any.fromFunction0(value))
  }
}
