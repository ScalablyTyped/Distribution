package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageStatisticsSortBy extends StObject {
  
  /**
    * The field to sort the results by.
    */
  var key: js.UndefOr[UsageStatisticsSortKey] = js.undefined
  
  /**
    * The sort order to apply to the results, based on the value for the field specified by the key property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object UsageStatisticsSortBy {
  
  inline def apply(): UsageStatisticsSortBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsSortBy]
  }
  
  extension [Self <: UsageStatisticsSortBy](x: Self) {
    
    inline def setKey(value: UsageStatisticsSortKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
