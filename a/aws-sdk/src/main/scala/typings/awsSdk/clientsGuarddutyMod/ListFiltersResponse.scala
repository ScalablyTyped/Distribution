package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFiltersResponse extends StObject {
  
  /**
    * A list of filter names.
    */
  var FilterNames: typings.awsSdk.clientsGuarddutyMod.FilterNames
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFiltersResponse {
  
  inline def apply(FilterNames: FilterNames): ListFiltersResponse = {
    val __obj = js.Dynamic.literal(FilterNames = FilterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFiltersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFiltersResponse] (val x: Self) extends AnyVal {
    
    inline def setFilterNames(value: FilterNames): Self = StObject.set(x, "FilterNames", value.asInstanceOf[js.Any])
    
    inline def setFilterNamesVarargs(value: FilterName*): Self = StObject.set(x, "FilterNames", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
