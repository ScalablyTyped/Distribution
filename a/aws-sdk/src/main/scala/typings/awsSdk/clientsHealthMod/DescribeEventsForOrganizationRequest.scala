package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsForOrganizationRequest extends StObject {
  
  /**
    * Values to narrow the results returned.
    */
  var filter: js.UndefOr[OrganizationEventFilter] = js.undefined
  
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.clientsHealthMod.locale] = js.undefined
  
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[maxResultsLowerRange] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsHealthMod.nextToken] = js.undefined
}
object DescribeEventsForOrganizationRequest {
  
  inline def apply(): DescribeEventsForOrganizationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsForOrganizationRequest]
  }
  
  extension [Self <: DescribeEventsForOrganizationRequest](x: Self) {
    
    inline def setFilter(value: OrganizationEventFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: maxResultsLowerRange): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
