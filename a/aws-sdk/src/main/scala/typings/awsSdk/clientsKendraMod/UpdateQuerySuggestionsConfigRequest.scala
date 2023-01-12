package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQuerySuggestionsConfigRequest extends StObject {
  
  /**
    *  TRUE to include queries without user information (i.e. all queries, irrespective of the user), otherwise FALSE to only include queries with user information. If you pass user information to Amazon Kendra along with the queries, you can set this flag to FALSE and instruct Amazon Kendra to only consider queries with user information. If you set to FALSE, Amazon Kendra only considers queries searched at least MinimumQueryCount times across MinimumNumberOfQueryingUsers unique users for suggestions. If you set to TRUE, Amazon Kendra ignores all user information and learns from all queries.
    */
  var IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean] = js.undefined
  
  /**
    *  The identifier of the index with query suggestions you want to update.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to your users. Increasing this number might decrease the number of suggestions. However, this ensures a query is searched by many users and is truly popular to suggest to users. How you tune this setting depends on your specific needs.
    */
  var MinimumNumberOfQueryingUsers: js.UndefOr[typings.awsSdk.clientsKendraMod.MinimumNumberOfQueryingUsers] = js.undefined
  
  /**
    * The the minimum number of times a query must be searched in order to be eligible to suggest to your users. Decreasing this number increases the number of suggestions. However, this affects the quality of suggestions as it sets a low bar for a query to be considered popular to suggest to users. How you tune this setting depends on your specific needs.
    */
  var MinimumQueryCount: js.UndefOr[typings.awsSdk.clientsKendraMod.MinimumQueryCount] = js.undefined
  
  /**
    * Set the mode to ENABLED or LEARN_ONLY. By default, Amazon Kendra enables query suggestions. LEARN_ONLY mode allows you to turn off query suggestions. You can to update this at any time. In LEARN_ONLY mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date for when you are ready to switch to ENABLED mode again.
    */
  var Mode: js.UndefOr[typings.awsSdk.clientsKendraMod.Mode] = js.undefined
  
  /**
    * How recent your queries are in your query log time window. The time window is the number of days from current day to past days. By default, Amazon Kendra sets this to 180.
    */
  var QueryLogLookBackWindowInDays: js.UndefOr[Integer] = js.undefined
}
object UpdateQuerySuggestionsConfigRequest {
  
  inline def apply(IndexId: IndexId): UpdateQuerySuggestionsConfigRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuerySuggestionsConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateQuerySuggestionsConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeQueriesWithoutUserInformation(value: ObjectBoolean): Self = StObject.set(x, "IncludeQueriesWithoutUserInformation", value.asInstanceOf[js.Any])
    
    inline def setIncludeQueriesWithoutUserInformationUndefined: Self = StObject.set(x, "IncludeQueriesWithoutUserInformation", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfQueryingUsers(value: MinimumNumberOfQueryingUsers): Self = StObject.set(x, "MinimumNumberOfQueryingUsers", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfQueryingUsersUndefined: Self = StObject.set(x, "MinimumNumberOfQueryingUsers", js.undefined)
    
    inline def setMinimumQueryCount(value: MinimumQueryCount): Self = StObject.set(x, "MinimumQueryCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumQueryCountUndefined: Self = StObject.set(x, "MinimumQueryCount", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setQueryLogLookBackWindowInDays(value: Integer): Self = StObject.set(x, "QueryLogLookBackWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setQueryLogLookBackWindowInDaysUndefined: Self = StObject.set(x, "QueryLogLookBackWindowInDays", js.undefined)
  }
}
