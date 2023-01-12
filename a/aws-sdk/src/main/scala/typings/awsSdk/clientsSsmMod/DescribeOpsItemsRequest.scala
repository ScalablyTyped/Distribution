package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOpsItemsRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[OpsItemMaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more filters to limit the response.   Key: CreatedTime Operations: GreaterThan, LessThan   Key: LastModifiedBy Operations: Contains, Equals   Key: LastModifiedTime Operations: GreaterThan, LessThan   Key: Priority Operations: Equals   Key: Source Operations: Contains, Equals   Key: Status Operations: Equals   Key: Title* Operations: Equals,Contains   Key: OperationalData** Operations: Equals   Key: OperationalDataKey Operations: Equals   Key: OperationalDataValue Operations: Equals, Contains   Key: OpsItemId Operations: Equals   Key: ResourceId Operations: Contains   Key: AutomationId Operations: Equals   *The Equals operator for Title matches the first 100 characters. If you specify more than 100 characters, they system returns an error that the filter value exceeds the length limit. **If you filter the response by using the OperationalData operator, specify a key-value pair by using the following JSON format: {"key":"key_name","value":"a_value"}
    */
  var OpsItemFilters: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemFilters] = js.undefined
}
object DescribeOpsItemsRequest {
  
  inline def apply(): DescribeOpsItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOpsItemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOpsItemsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: OpsItemMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOpsItemFilters(value: OpsItemFilters): Self = StObject.set(x, "OpsItemFilters", value.asInstanceOf[js.Any])
    
    inline def setOpsItemFiltersUndefined: Self = StObject.set(x, "OpsItemFilters", js.undefined)
    
    inline def setOpsItemFiltersVarargs(value: OpsItemFilter*): Self = StObject.set(x, "OpsItemFilters", js.Array(value*))
  }
}
