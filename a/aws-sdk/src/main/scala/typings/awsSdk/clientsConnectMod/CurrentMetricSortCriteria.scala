package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMetricSortCriteria extends StObject {
  
  var SortByMetric: js.UndefOr[CurrentMetricName] = js.undefined
  
  /**
    * The way to sort.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsConnectMod.SortOrder] = js.undefined
}
object CurrentMetricSortCriteria {
  
  inline def apply(): CurrentMetricSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetricSortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentMetricSortCriteria] (val x: Self) extends AnyVal {
    
    inline def setSortByMetric(value: CurrentMetricName): Self = StObject.set(x, "SortByMetric", value.asInstanceOf[js.Any])
    
    inline def setSortByMetricUndefined: Self = StObject.set(x, "SortByMetric", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
