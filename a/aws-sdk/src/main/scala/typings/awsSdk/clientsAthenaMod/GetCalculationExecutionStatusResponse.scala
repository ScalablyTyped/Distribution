package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalculationExecutionStatusResponse extends StObject {
  
  /**
    * Contains information about the DPU execution time and progress.
    */
  var Statistics: js.UndefOr[CalculationStatistics] = js.undefined
  
  /**
    * Contains information about the calculation execution status.
    */
  var Status: js.UndefOr[CalculationStatus] = js.undefined
}
object GetCalculationExecutionStatusResponse {
  
  inline def apply(): GetCalculationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalculationExecutionStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCalculationExecutionStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setStatistics(value: CalculationStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: CalculationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
