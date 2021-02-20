package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorInfo extends StObject {
  
  /**
    *  Specifies the error message that appears if a flow fails. 
    */
  var executionMessage: js.UndefOr[ExecutionMessage] = js.native
  
  /**
    *  Specifies the failure count for the attempted flow. 
    */
  var putFailuresCount: js.UndefOr[Long] = js.native
}
object ErrorInfo {
  
  @scala.inline
  def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  @scala.inline
  implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionMessage(value: ExecutionMessage): Self = StObject.set(x, "executionMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionMessageUndefined: Self = StObject.set(x, "executionMessage", js.undefined)
    
    @scala.inline
    def setPutFailuresCount(value: Long): Self = StObject.set(x, "putFailuresCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutFailuresCountUndefined: Self = StObject.set(x, "putFailuresCount", js.undefined)
  }
}
