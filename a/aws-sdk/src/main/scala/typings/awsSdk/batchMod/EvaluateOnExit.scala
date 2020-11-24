package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluateOnExit extends js.Object {
  
  /**
    * Specifies the action to take if all of the specified conditions (onStatusReason, onReason, and onExitCode) are met.
    */
  var action: RetryAction = js.native
  
  /**
    * Contains a glob pattern to match against the decimal representation of the ExitCode returned for a job. The patten can be up to 512 characters long, can contain only numbers, and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onExitCode: js.UndefOr[String] = js.native
  
  /**
    * Contains a glob pattern to match against the Reason returned for a job. The patten can be up to 512 characters long, can contain letters, numbers, periods (.), colons (:), and whitespace (spaces, tabs), and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onReason: js.UndefOr[String] = js.native
  
  /**
    * Contains a glob pattern to match against the StatusReason returned for a job. The patten can be up to 512 characters long, can contain letters, numbers, periods (.), colons (:), and whitespace (spaces, tabs). and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onStatusReason: js.UndefOr[String] = js.native
}
object EvaluateOnExit {
  
  @scala.inline
  def apply(action: RetryAction): EvaluateOnExit = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnExit]
  }
  
  @scala.inline
  implicit class EvaluateOnExitOps[Self <: EvaluateOnExit] (val x: Self) extends AnyVal {
    
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
    def setAction(value: RetryAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitCode(value: String): Self = this.set("onExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExitCode: Self = this.set("onExitCode", js.undefined)
    
    @scala.inline
    def setOnReason(value: String): Self = this.set("onReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReason: Self = this.set("onReason", js.undefined)
    
    @scala.inline
    def setOnStatusReason(value: String): Self = this.set("onStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStatusReason: Self = this.set("onStatusReason", js.undefined)
  }
}
