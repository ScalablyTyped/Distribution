package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalAggregationComputation extends StObject {
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The value field that is used in a computation.
    */
  var Value: MeasureField
}
object TotalAggregationComputation {
  
  inline def apply(ComputationId: ShortRestrictiveResourceId, Value: MeasureField): TotalAggregationComputation = {
    val __obj = js.Dynamic.literal(ComputationId = ComputationId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalAggregationComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalAggregationComputation] (val x: Self) extends AnyVal {
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: MeasureField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
