package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationSummary extends StObject {
  
  /**
    * The calculation execution UUID.
    */
  var CalculationExecutionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.CalculationExecutionId] = js.undefined
  
  /**
    * A description of the calculation.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Contains information about the status of the calculation.
    */
  var Status: js.UndefOr[CalculationStatus] = js.undefined
}
object CalculationSummary {
  
  inline def apply(): CalculationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculationSummary] (val x: Self) extends AnyVal {
    
    inline def setCalculationExecutionId(value: CalculationExecutionId): Self = StObject.set(x, "CalculationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setCalculationExecutionIdUndefined: Self = StObject.set(x, "CalculationExecutionId", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setStatus(value: CalculationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
