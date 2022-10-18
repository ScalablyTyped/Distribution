package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmiAggregation extends StObject {
  
  /**
    * The IDs of AMIs to aggregate findings for.
    */
  var amis: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[AmiSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object AmiAggregation {
  
  inline def apply(): AmiAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiAggregation]
  }
  
  extension [Self <: AmiAggregation](x: Self) {
    
    inline def setAmis(value: StringFilterList): Self = StObject.set(x, "amis", value.asInstanceOf[js.Any])
    
    inline def setAmisUndefined: Self = StObject.set(x, "amis", js.undefined)
    
    inline def setAmisVarargs(value: StringFilter*): Self = StObject.set(x, "amis", js.Array(value*))
    
    inline def setSortBy(value: AmiSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
