package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRuleAggregation extends StObject {
  
  /**
    * The columns that query runners are allowed to use in aggregation queries.
    */
  var aggregateColumns: AnalysisRuleAggregationAggregateColumnsList
  
  /**
    * The columns that query runners are allowed to select, group by, or filter by.
    */
  var dimensionColumns: AnalysisRuleColumnList
  
  /**
    * Columns in configured table that can be used in join statements and/or as aggregate columns. They can never be outputted directly.
    */
  var joinColumns: AnalysisRuleColumnList
  
  /**
    * Control that requires member who runs query to do a join with their configured table and/or other configured table in query
    */
  var joinRequired: js.UndefOr[JoinRequiredOption] = js.undefined
  
  /**
    * Columns that must meet a specific threshold value (after an aggregation function is applied to it) for each output row to be returned.
    */
  var outputConstraints: AggregationConstraints
  
  /**
    * Set of scalar functions that are allowed to be used on dimension columns and the output of aggregation of metrics.
    */
  var scalarFunctions: ScalarFunctionsList
}
object AnalysisRuleAggregation {
  
  inline def apply(
    aggregateColumns: AnalysisRuleAggregationAggregateColumnsList,
    dimensionColumns: AnalysisRuleColumnList,
    joinColumns: AnalysisRuleColumnList,
    outputConstraints: AggregationConstraints,
    scalarFunctions: ScalarFunctionsList
  ): AnalysisRuleAggregation = {
    val __obj = js.Dynamic.literal(aggregateColumns = aggregateColumns.asInstanceOf[js.Any], dimensionColumns = dimensionColumns.asInstanceOf[js.Any], joinColumns = joinColumns.asInstanceOf[js.Any], outputConstraints = outputConstraints.asInstanceOf[js.Any], scalarFunctions = scalarFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisRuleAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisRuleAggregation] (val x: Self) extends AnyVal {
    
    inline def setAggregateColumns(value: AnalysisRuleAggregationAggregateColumnsList): Self = StObject.set(x, "aggregateColumns", value.asInstanceOf[js.Any])
    
    inline def setAggregateColumnsVarargs(value: AggregateColumn*): Self = StObject.set(x, "aggregateColumns", js.Array(value*))
    
    inline def setDimensionColumns(value: AnalysisRuleColumnList): Self = StObject.set(x, "dimensionColumns", value.asInstanceOf[js.Any])
    
    inline def setDimensionColumnsVarargs(value: AnalysisRuleColumnName*): Self = StObject.set(x, "dimensionColumns", js.Array(value*))
    
    inline def setJoinColumns(value: AnalysisRuleColumnList): Self = StObject.set(x, "joinColumns", value.asInstanceOf[js.Any])
    
    inline def setJoinColumnsVarargs(value: AnalysisRuleColumnName*): Self = StObject.set(x, "joinColumns", js.Array(value*))
    
    inline def setJoinRequired(value: JoinRequiredOption): Self = StObject.set(x, "joinRequired", value.asInstanceOf[js.Any])
    
    inline def setJoinRequiredUndefined: Self = StObject.set(x, "joinRequired", js.undefined)
    
    inline def setOutputConstraints(value: AggregationConstraints): Self = StObject.set(x, "outputConstraints", value.asInstanceOf[js.Any])
    
    inline def setOutputConstraintsVarargs(value: AggregationConstraint*): Self = StObject.set(x, "outputConstraints", js.Array(value*))
    
    inline def setScalarFunctions(value: ScalarFunctionsList): Self = StObject.set(x, "scalarFunctions", value.asInstanceOf[js.Any])
    
    inline def setScalarFunctionsVarargs(value: ScalarFunctions*): Self = StObject.set(x, "scalarFunctions", js.Array(value*))
  }
}
