package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricSetDimensionFilter extends StObject {
  
  /**
    * The list of filters that you are applying.
    */
  var FilterList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.FilterList] = js.undefined
  
  /**
    * The dimension that you want to filter on.
    */
  var Name: js.UndefOr[ColumnName] = js.undefined
}
object MetricSetDimensionFilter {
  
  inline def apply(): MetricSetDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricSetDimensionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricSetDimensionFilter] (val x: Self) extends AnyVal {
    
    inline def setFilterList(value: FilterList): Self = StObject.set(x, "FilterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListUndefined: Self = StObject.set(x, "FilterList", js.undefined)
    
    inline def setFilterListVarargs(value: Filter*): Self = StObject.set(x, "FilterList", js.Array(value*))
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
