package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationSortConfiguration extends StObject {
  
  /**
    * The function that aggregates the values in Column.
    */
  var AggregationFunction: typings.awsSdk.clientsQuicksightMod.AggregationFunction
  
  /**
    * The column that determines the sort order of aggregated values.
    */
  var Column: ColumnIdentifier
  
  /**
    * The sort direction of values.    ASC: Sort in ascending order.    DESC: Sort in descending order.  
    */
  var SortDirection: typings.awsSdk.clientsQuicksightMod.SortDirection
}
object AggregationSortConfiguration {
  
  inline def apply(AggregationFunction: AggregationFunction, Column: ColumnIdentifier, SortDirection: SortDirection): AggregationSortConfiguration = {
    val __obj = js.Dynamic.literal(AggregationFunction = AggregationFunction.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setSortDirection(value: SortDirection): Self = StObject.set(x, "SortDirection", value.asInstanceOf[js.Any])
  }
}
