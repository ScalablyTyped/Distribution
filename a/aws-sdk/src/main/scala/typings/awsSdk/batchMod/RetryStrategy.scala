package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryStrategy extends js.Object {
  
  /**
    * The number of times to move a job to the RUNNABLE status. You may specify between 1 and 10 attempts. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value.
    */
  var attempts: js.UndefOr[Integer] = js.native
  
  /**
    * Array of up to 5 objects that specify conditions under which the job should be retried or failed. If this parameter is specified, then the attempts parameter must also be specified.
    */
  var evaluateOnExit: js.UndefOr[EvaluateOnExitList] = js.native
}
object RetryStrategy {
  
  @scala.inline
  def apply(): RetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryStrategy]
  }
  
  @scala.inline
  implicit class RetryStrategyOps[Self <: RetryStrategy] (val x: Self) extends AnyVal {
    
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
    def setAttempts(value: Integer): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    
    @scala.inline
    def setEvaluateOnExitVarargs(value: EvaluateOnExit*): Self = this.set("evaluateOnExit", js.Array(value :_*))
    
    @scala.inline
    def setEvaluateOnExit(value: EvaluateOnExitList): Self = this.set("evaluateOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluateOnExit: Self = this.set("evaluateOnExit", js.undefined)
  }
}
