package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsInput extends StObject {
  
  /**
    * Filters the list for AWS or CUSTOM locations.
    */
  var Filters: js.UndefOr[LocationFilterList] = js.undefined
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[ListLocationsLimit] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListLocationsInput {
  
  inline def apply(): ListLocationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLocationsInput] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: LocationFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: LocationFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLimit(value: ListLocationsLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
