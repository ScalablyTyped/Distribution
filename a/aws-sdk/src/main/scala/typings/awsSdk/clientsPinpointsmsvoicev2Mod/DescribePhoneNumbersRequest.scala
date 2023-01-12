package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePhoneNumbersRequest extends StObject {
  
  /**
    * An array of PhoneNumberFilter objects to filter the results.
    */
  var Filters: js.UndefOr[PhoneNumberFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The unique identifier of phone numbers to find information about. This is an array of strings that can be either the PhoneNumberId or PhoneNumberArn.
    */
  var PhoneNumberIds: js.UndefOr[PhoneNumberIdList] = js.undefined
}
object DescribePhoneNumbersRequest {
  
  inline def apply(): DescribePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePhoneNumbersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: PhoneNumberFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: PhoneNumberFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberIds(value: PhoneNumberIdList): Self = StObject.set(x, "PhoneNumberIds", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdsUndefined: Self = StObject.set(x, "PhoneNumberIds", js.undefined)
    
    inline def setPhoneNumberIdsVarargs(value: PhoneNumberIdOrArn*): Self = StObject.set(x, "PhoneNumberIds", js.Array(value*))
  }
}
