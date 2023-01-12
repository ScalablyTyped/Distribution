package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeywordsRequest extends StObject {
  
  /**
    * An array of keyword filters to filter the results.
    */
  var Filters: js.UndefOr[KeywordFilterList] = js.undefined
  
  /**
    * An array of keywords to search for.
    */
  var Keywords: js.UndefOr[KeywordList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use DescribePhoneNumbers to find the values for PhoneNumberId and PhoneNumberArn while DescribeSenderIds can be used to get the values for SenderId and SenderIdArn.
    */
  var OriginationIdentity: PhoneOrPoolIdOrArn
}
object DescribeKeywordsRequest {
  
  inline def apply(OriginationIdentity: PhoneOrPoolIdOrArn): DescribeKeywordsRequest = {
    val __obj = js.Dynamic.literal(OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeywordsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeywordsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: KeywordFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: KeywordFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setKeywords(value: KeywordList): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: Keyword*): Self = StObject.set(x, "Keywords", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOriginationIdentity(value: PhoneOrPoolIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
  }
}
