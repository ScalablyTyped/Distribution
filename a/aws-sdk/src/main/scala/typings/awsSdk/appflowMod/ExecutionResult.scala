package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResult extends StObject {
  
  /**
    *  The total number of bytes processed by the flow run. 
    */
  var bytesProcessed: js.UndefOr[Long] = js.undefined
  
  /**
    *  The total number of bytes written as a result of the flow run. 
    */
  var bytesWritten: js.UndefOr[Long] = js.undefined
  
  /**
    *  Provides any error message information related to the flow run. 
    */
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  
  /**
    *  The number of records processed in the flow run. 
    */
  var recordsProcessed: js.UndefOr[Long] = js.undefined
}
object ExecutionResult {
  
  inline def apply(): ExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResult]
  }
  
  extension [Self <: ExecutionResult](x: Self) {
    
    inline def setBytesProcessed(value: Long): Self = StObject.set(x, "bytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setBytesProcessedUndefined: Self = StObject.set(x, "bytesProcessed", js.undefined)
    
    inline def setBytesWritten(value: Long): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    
    inline def setBytesWrittenUndefined: Self = StObject.set(x, "bytesWritten", js.undefined)
    
    inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setRecordsProcessed(value: Long): Self = StObject.set(x, "recordsProcessed", value.asInstanceOf[js.Any])
    
    inline def setRecordsProcessedUndefined: Self = StObject.set(x, "recordsProcessed", js.undefined)
  }
}
