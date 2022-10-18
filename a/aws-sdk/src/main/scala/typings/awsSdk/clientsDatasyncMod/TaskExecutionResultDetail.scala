package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskExecutionResultDetail extends StObject {
  
  /**
    * Errors that DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[String] = js.undefined
  
  /**
    * The total time in milliseconds that DataSync spent in the PREPARING phase. 
    */
  var PrepareDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The status of the PREPARING phase.
    */
  var PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined
  
  /**
    * The total time in milliseconds that DataSync took to transfer the file from the source to the destination location.
    */
  var TotalDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The total time in milliseconds that DataSync spent in the TRANSFERRING phase.
    */
  var TransferDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The status of the TRANSFERRING phase.
    */
  var TransferStatus: js.UndefOr[PhaseStatus] = js.undefined
  
  /**
    * The total time in milliseconds that DataSync spent in the VERIFYING phase.
    */
  var VerifyDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The status of the VERIFYING phase.
    */
  var VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined
}
object TaskExecutionResultDetail {
  
  inline def apply(): TaskExecutionResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskExecutionResultDetail]
  }
  
  extension [Self <: TaskExecutionResultDetail](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorDetail(value: String): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setPrepareDuration(value: Duration): Self = StObject.set(x, "PrepareDuration", value.asInstanceOf[js.Any])
    
    inline def setPrepareDurationUndefined: Self = StObject.set(x, "PrepareDuration", js.undefined)
    
    inline def setPrepareStatus(value: PhaseStatus): Self = StObject.set(x, "PrepareStatus", value.asInstanceOf[js.Any])
    
    inline def setPrepareStatusUndefined: Self = StObject.set(x, "PrepareStatus", js.undefined)
    
    inline def setTotalDuration(value: Duration): Self = StObject.set(x, "TotalDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationUndefined: Self = StObject.set(x, "TotalDuration", js.undefined)
    
    inline def setTransferDuration(value: Duration): Self = StObject.set(x, "TransferDuration", value.asInstanceOf[js.Any])
    
    inline def setTransferDurationUndefined: Self = StObject.set(x, "TransferDuration", js.undefined)
    
    inline def setTransferStatus(value: PhaseStatus): Self = StObject.set(x, "TransferStatus", value.asInstanceOf[js.Any])
    
    inline def setTransferStatusUndefined: Self = StObject.set(x, "TransferStatus", js.undefined)
    
    inline def setVerifyDuration(value: Duration): Self = StObject.set(x, "VerifyDuration", value.asInstanceOf[js.Any])
    
    inline def setVerifyDurationUndefined: Self = StObject.set(x, "VerifyDuration", js.undefined)
    
    inline def setVerifyStatus(value: PhaseStatus): Self = StObject.set(x, "VerifyStatus", value.asInstanceOf[js.Any])
    
    inline def setVerifyStatusUndefined: Self = StObject.set(x, "VerifyStatus", js.undefined)
  }
}
