package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationStatistics extends StObject {
  
  /**
    * The data processing unit execution time in milliseconds for the calculation.
    */
  var DpuExecutionInMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The progress of the calculation.
    */
  var Progress: js.UndefOr[DescriptionString] = js.undefined
}
object CalculationStatistics {
  
  inline def apply(): CalculationStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculationStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationStatistics] (val x: Self) extends AnyVal {
    
    inline def setDpuExecutionInMillis(value: Long): Self = StObject.set(x, "DpuExecutionInMillis", value.asInstanceOf[js.Any])
    
    inline def setDpuExecutionInMillisUndefined: Self = StObject.set(x, "DpuExecutionInMillis", js.undefined)
    
    inline def setProgress(value: DescriptionString): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
  }
}
