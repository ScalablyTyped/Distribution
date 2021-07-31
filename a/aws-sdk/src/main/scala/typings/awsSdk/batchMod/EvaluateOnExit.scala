package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateOnExit extends StObject {
  
  /**
    * Specifies the action to take if all of the specified conditions (onStatusReason, onReason, and onExitCode) are met.
    */
  var action: RetryAction
  
  /**
    * Contains a glob pattern to match against the decimal representation of the ExitCode returned for a job. The patten can be up to 512 characters long, can contain only numbers, and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onExitCode: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a glob pattern to match against the Reason returned for a job. The patten can be up to 512 characters long, can contain letters, numbers, periods (.), colons (:), and whitespace (spaces, tabs), and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onReason: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a glob pattern to match against the StatusReason returned for a job. The patten can be up to 512 characters long, can contain letters, numbers, periods (.), colons (:), and whitespace (spaces, tabs). and can optionally end with an asterisk (*) so that only the start of the string needs to be an exact match.
    */
  var onStatusReason: js.UndefOr[String] = js.undefined
}
object EvaluateOnExit {
  
  @scala.inline
  def apply(action: RetryAction): EvaluateOnExit = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnExit]
  }
  
  @scala.inline
  implicit class EvaluateOnExitMutableBuilder[Self <: EvaluateOnExit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RetryAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitCode(value: String): Self = StObject.set(x, "onExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExitCodeUndefined: Self = StObject.set(x, "onExitCode", js.undefined)
    
    @scala.inline
    def setOnReason(value: String): Self = StObject.set(x, "onReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReasonUndefined: Self = StObject.set(x, "onReason", js.undefined)
    
    @scala.inline
    def setOnStatusReason(value: String): Self = StObject.set(x, "onStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStatusReasonUndefined: Self = StObject.set(x, "onStatusReason", js.undefined)
  }
}
