package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountIncomingQueue Class */
@js.native
trait FaxAccountIncomingQueue extends js.Object {
  
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue = js.native
  
  /** Get incoming job by ID */
  def GetJob(bstrJobId: String): FaxIncomingJob = js.native
  
  /** Collection of incoming jobs */
  def GetJobs(): FaxIncomingJobs = js.native
}
object FaxAccountIncomingQueue {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: FaxAccountIncomingQueue,
    GetJob: String => FaxIncomingJob,
    GetJobs: () => FaxIncomingJobs
  ): FaxAccountIncomingQueue = {
    val __obj = js.Dynamic.literal(GetJob = js.Any.fromFunction1(GetJob), GetJobs = js.Any.fromFunction0(GetJobs))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")(FAXCOMEXLibDotFaxAccountIncomingQueue_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountIncomingQueue]
  }
  
  @scala.inline
  implicit class FaxAccountIncomingQueueOps[Self <: FaxAccountIncomingQueue] (val x: Self) extends AnyVal {
    
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
    def setFAXCOMEXLibDotFaxAccountIncomingQueue_typekey(value: FaxAccountIncomingQueue): Self = this.set("FAXCOMEXLib.FaxAccountIncomingQueue_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJob(value: String => FaxIncomingJob): Self = this.set("GetJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJobs(value: () => FaxIncomingJobs): Self = this.set("GetJobs", js.Any.fromFunction0(value))
  }
}
