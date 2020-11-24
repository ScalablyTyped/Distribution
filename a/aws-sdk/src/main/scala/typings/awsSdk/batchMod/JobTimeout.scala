package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTimeout extends js.Object {
  
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.native
}
object JobTimeout {
  
  @scala.inline
  def apply(): JobTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimeout]
  }
  
  @scala.inline
  implicit class JobTimeoutOps[Self <: JobTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttemptDurationSeconds(value: Integer): Self = this.set("attemptDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptDurationSeconds: Self = this.set("attemptDurationSeconds", js.undefined)
  }
}
