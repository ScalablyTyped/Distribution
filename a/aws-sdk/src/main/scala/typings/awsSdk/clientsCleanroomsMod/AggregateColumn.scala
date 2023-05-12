package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateColumn extends StObject {
  
  /**
    * Column names in configured table of aggregate columns.
    */
  var columnNames: AggregateColumnColumnNamesList
  
  /**
    * Aggregation function that can be applied to aggregate column in query.
    */
  var function: AggregateFunctionName
}
object AggregateColumn {
  
  inline def apply(columnNames: AggregateColumnColumnNamesList, function: AggregateFunctionName): AggregateColumn = {
    val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateColumn] (val x: Self) extends AnyVal {
    
    inline def setColumnNames(value: AggregateColumnColumnNamesList): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
    
    inline def setColumnNamesVarargs(value: AnalysisRuleColumnName*): Self = StObject.set(x, "columnNames", js.Array(value*))
    
    inline def setFunction(value: AggregateFunctionName): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
  }
}
