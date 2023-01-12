package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagesRequest extends StObject {
  
  /**
    * Only returns packages that match the DescribePackagesFilterList values.
    */
  var Filters: js.UndefOr[DescribePackagesFilterList] = js.undefined
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * If your initial DescribePackageFilters operation returns a nextToken, you can include the returned nextToken in subsequent DescribePackageFilters operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribePackagesRequest {
  
  inline def apply(): DescribePackagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackagesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DescribePackagesFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: DescribePackagesFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
