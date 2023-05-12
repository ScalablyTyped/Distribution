package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationConstraint extends StObject {
  
  /**
    * Column in aggregation constraint for which there must be a minimum number of distinct values in an output row for it to be in the query output.
    */
  var columnName: AnalysisRuleColumnName
  
  /**
    * The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of distinct values for a specified column that must exist in an output row for it to be in the query output.
    */
  var minimum: AggregationConstraintMinimumInteger
  
  /**
    * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
    */
  var `type`: AggregationType
}
object AggregationConstraint {
  
  inline def apply(
    columnName: AnalysisRuleColumnName,
    minimum: AggregationConstraintMinimumInteger,
    `type`: AggregationType
  ): AggregationConstraint = {
    val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationConstraint] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: AnalysisRuleColumnName): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: AggregationConstraintMinimumInteger): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setType(value: AggregationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
