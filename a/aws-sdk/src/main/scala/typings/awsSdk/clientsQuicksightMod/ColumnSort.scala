package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSort extends StObject {
  
  /**
    * The aggregation function that is defined in the column sort.
    */
  var AggregationFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AggregationFunction] = js.undefined
  
  /**
    * The sort direction.
    */
  var Direction: SortDirection
  
  var SortBy: ColumnIdentifier
}
object ColumnSort {
  
  inline def apply(Direction: SortDirection, SortBy: ColumnIdentifier): ColumnSort = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], SortBy = SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnSort] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setDirection(value: SortDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: ColumnIdentifier): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
  }
}
