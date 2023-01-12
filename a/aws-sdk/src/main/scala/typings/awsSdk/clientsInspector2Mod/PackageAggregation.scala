package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageAggregation extends StObject {
  
  /**
    * The names of packages to aggregate findings on.
    */
  var packageNames: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[PackageSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object PackageAggregation {
  
  inline def apply(): PackageAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageAggregation] (val x: Self) extends AnyVal {
    
    inline def setPackageNames(value: StringFilterList): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: StringFilter*): Self = StObject.set(x, "packageNames", js.Array(value*))
    
    inline def setSortBy(value: PackageSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
