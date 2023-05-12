package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordCloudSortConfiguration extends StObject {
  
  /**
    * The limit on the number of groups that are displayed in a word cloud.
    */
  var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of group by fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object WordCloudSortConfiguration {
  
  inline def apply(): WordCloudSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordCloudSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordCloudSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "CategoryItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setCategoryItemsLimitUndefined: Self = StObject.set(x, "CategoryItemsLimit", js.undefined)
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
  }
}
