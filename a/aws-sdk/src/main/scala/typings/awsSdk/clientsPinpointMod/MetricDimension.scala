package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDimension extends StObject {
  
  /**
    * The operator to use when comparing metric values. Valid values are: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, and EQUAL.
    */
  var ComparisonOperator: string
  
  /**
    * The value to compare.
    */
  var Value: double
}
object MetricDimension {
  
  inline def apply(ComparisonOperator: string, Value: double): MetricDimension = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDimension] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: string): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
