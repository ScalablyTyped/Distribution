package typings.arangodb.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  def abort(): Unit = js.native
  
  var created: Double = js.native
  
  var data: js.Any = js.native
  
  var delayUntil: Double = js.native
  
  var failure: js.UndefOr[String] = js.native
  
  var failures: js.Array[js.Object] = js.native
  
  var maxFailures: Double = js.native
  
  var modified: Double = js.native
  
  var queue: String = js.native
  
  var repeatDelay: Double = js.native
  
  var repeatTimes: Double = js.native
  
  var repeatUntil: Double = js.native
  
  var runFailures: Double = js.native
  
  var runs: Double = js.native
  
  var status: String = js.native
  
  var success: js.UndefOr[String] = js.native
  
  var `type`: Script = js.native
}
object Job {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    created: Double,
    data: js.Any,
    delayUntil: Double,
    failures: js.Array[js.Object],
    maxFailures: Double,
    modified: Double,
    queue: String,
    repeatDelay: Double,
    repeatTimes: Double,
    repeatUntil: Double,
    runFailures: Double,
    runs: Double,
    status: String,
    `type`: Script
  ): Job = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delayUntil = delayUntil.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], maxFailures = maxFailures.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], repeatTimes = repeatTimes.asInstanceOf[js.Any], repeatUntil = repeatUntil.asInstanceOf[js.Any], runFailures = runFailures.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUntil(value: Double): Self = this.set("delayUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresVarargs(value: js.Object*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[js.Object]): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFailures(value: Double): Self = this.set("maxFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: Double): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatTimes(value: Double): Self = this.set("repeatTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUntil(value: Double): Self = this.set("repeatUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunFailures(value: Double): Self = this.set("runFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: Double): Self = this.set("runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Script): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure(value: String): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
