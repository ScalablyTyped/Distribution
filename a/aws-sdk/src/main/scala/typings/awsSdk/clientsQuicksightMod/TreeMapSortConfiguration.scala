package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMapSortConfiguration extends StObject {
  
  /**
    * The limit on the number of groups that are displayed.
    */
  var TreeMapGroupItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of group by fields.
    */
  var TreeMapSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object TreeMapSortConfiguration {
  
  inline def apply(): TreeMapSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeMapSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTreeMapGroupItemsLimitConfiguration(value: ItemsLimitConfiguration): Self = StObject.set(x, "TreeMapGroupItemsLimitConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTreeMapGroupItemsLimitConfigurationUndefined: Self = StObject.set(x, "TreeMapGroupItemsLimitConfiguration", js.undefined)
    
    inline def setTreeMapSort(value: FieldSortOptionsList): Self = StObject.set(x, "TreeMapSort", value.asInstanceOf[js.Any])
    
    inline def setTreeMapSortUndefined: Self = StObject.set(x, "TreeMapSort", js.undefined)
    
    inline def setTreeMapSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "TreeMapSort", js.Array(value*))
  }
}
