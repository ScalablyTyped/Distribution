package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricComparisonComputation extends StObject {
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The field that is used in a metric comparison from value setup.
    */
  var FromValue: MeasureField
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The field that is used in a metric comparison to value setup.
    */
  var TargetValue: MeasureField
  
  /**
    * The time field that is used in a computation.
    */
  var Time: DimensionField
}
object MetricComparisonComputation {
  
  inline def apply(
    ComputationId: ShortRestrictiveResourceId,
    FromValue: MeasureField,
    TargetValue: MeasureField,
    Time: DimensionField
  ): MetricComparisonComputation = {
    val __obj = js.Dynamic.literal(ComputationId = ComputationId.asInstanceOf[js.Any], FromValue = FromValue.asInstanceOf[js.Any], TargetValue = TargetValue.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricComparisonComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricComparisonComputation] (val x: Self) extends AnyVal {
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setFromValue(value: MeasureField): Self = StObject.set(x, "FromValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTargetValue(value: MeasureField): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DimensionField): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
