package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSourceServersRequest extends StObject {
  
  /**
    * Request to filter Source Servers list.
    */
  var filters: js.UndefOr[DescribeSourceServersRequestFilters] = js.undefined
  
  /**
    * Request to filter Source Servers list by maximum results.
    */
  var maxResults: js.UndefOr[MaxResultsType] = js.undefined
  
  /**
    * Request to filter Source Servers list by next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeSourceServersRequest {
  
  inline def apply(): DescribeSourceServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSourceServersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSourceServersRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DescribeSourceServersRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: MaxResultsType): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
