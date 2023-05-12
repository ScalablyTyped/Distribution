package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalculationExecutionResponse extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.CalculationExecutionId] = js.undefined
  
  /**
    * The description of the calculation execution.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Contains result information. This field is populated only if the calculation is completed.
    */
  var Result: js.UndefOr[CalculationResult] = js.undefined
  
  /**
    * The session ID that the calculation ran in.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
  
  /**
    * Contains information about the data processing unit (DPU) execution time and progress. This field is populated only when statistics are available.
    */
  var Statistics: js.UndefOr[CalculationStatistics] = js.undefined
  
  /**
    * Contains information about the status of the calculation.
    */
  var Status: js.UndefOr[CalculationStatus] = js.undefined
  
  /**
    * The Amazon S3 location in which calculation results are stored.
    */
  var WorkingDirectory: js.UndefOr[S3Uri] = js.undefined
}
object GetCalculationExecutionResponse {
  
  inline def apply(): GetCalculationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalculationExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalculationExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setCalculationExecutionIdUndefined: Self = StObject.set(x, "CalculationExecutionId", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setResult(value: CalculationResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStatistics(value: CalculationStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: CalculationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkingDirectory(value: S3Uri): Self = StObject.set(x, "WorkingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "WorkingDirectory", js.undefined)
  }
}
