package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  /**
    *  Specifies the error message that appears if a flow fails. 
    */
  var executionMessage: js.UndefOr[ExecutionMessage] = js.undefined
  
  /**
    *  Specifies the failure count for the attempted flow. 
    */
  var putFailuresCount: js.UndefOr[Long] = js.undefined
}
object ErrorInfo {
  
  inline def apply(): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setExecutionMessage(value: ExecutionMessage): Self = StObject.set(x, "executionMessage", value.asInstanceOf[js.Any])
    
    inline def setExecutionMessageUndefined: Self = StObject.set(x, "executionMessage", js.undefined)
    
    inline def setPutFailuresCount(value: Long): Self = StObject.set(x, "putFailuresCount", value.asInstanceOf[js.Any])
    
    inline def setPutFailuresCountUndefined: Self = StObject.set(x, "putFailuresCount", js.undefined)
  }
}
