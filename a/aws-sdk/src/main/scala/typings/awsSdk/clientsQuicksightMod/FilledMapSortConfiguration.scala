package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapSortConfiguration extends StObject {
  
  /**
    * The sort configuration of the location fields.
    */
  var CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object FilledMapSortConfiguration {
  
  inline def apply(): FilledMapSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilledMapSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategorySort(value: FieldSortOptionsList): Self = StObject.set(x, "CategorySort", value.asInstanceOf[js.Any])
    
    inline def setCategorySortUndefined: Self = StObject.set(x, "CategorySort", js.undefined)
    
    inline def setCategorySortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "CategorySort", js.Array(value*))
  }
}
