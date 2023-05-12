package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuerySuggestionsConfigResponse extends StObject {
  
  /**
    * Configuration information for the document fields/attributes that you want to base query suggestions on.
    */
  var AttributeSuggestionsConfig: js.UndefOr[AttributeSuggestionsDescribeConfig] = js.undefined
  
  /**
    *  TRUE to use all queries, otherwise use only queries that include user information to generate the query suggestions.
    */
  var IncludeQueriesWithoutUserInformation: js.UndefOr[ObjectBoolean] = js.undefined
  
  /**
    * The Unix timestamp when query suggestions for an index was last cleared. After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the time you cleared suggestions. 
    */
  var LastClearTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix timestamp when query suggestions for an index was last updated. Amazon Kendra automatically updates suggestions every 24 hours, after you change a setting or after you apply a block list.
    */
  var LastSuggestionsBuildTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to your users.
    */
  var MinimumNumberOfQueryingUsers: js.UndefOr[typings.awsSdk.clientsKendraMod.MinimumNumberOfQueryingUsers] = js.undefined
  
  /**
    * The minimum number of times a query must be searched in order for the query to be eligible to suggest to your users.
    */
  var MinimumQueryCount: js.UndefOr[typings.awsSdk.clientsKendraMod.MinimumQueryCount] = js.undefined
  
  /**
    * Whether query suggestions are currently in ENABLED mode or LEARN_ONLY mode. By default, Amazon Kendra enables query suggestions.LEARN_ONLY turns off query suggestions for your users. You can change the mode using the UpdateQuerySuggestionsConfig API.
    */
  var Mode: js.UndefOr[typings.awsSdk.clientsKendraMod.Mode] = js.undefined
  
  /**
    * How recent your queries are in your query log time window (in days).
    */
  var QueryLogLookBackWindowInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether the status of query suggestions settings is currently ACTIVE or UPDATING. Active means the current settings apply and Updating means your changed settings are in the process of applying.
    */
  var Status: js.UndefOr[QuerySuggestionsStatus] = js.undefined
  
  /**
    * The current total count of query suggestions for an index. This count can change when you update your query suggestions settings, if you filter out certain queries from suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to learn from. If the count is much lower than you expected, it could be because Amazon Kendra needs more queries in the query history to learn from or your current query suggestions settings are too strict.
    */
  var TotalSuggestionsCount: js.UndefOr[Integer] = js.undefined
}
object DescribeQuerySuggestionsConfigResponse {
  
  inline def apply(): DescribeQuerySuggestionsConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQuerySuggestionsConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQuerySuggestionsConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setAttributeSuggestionsConfig(value: AttributeSuggestionsDescribeConfig): Self = StObject.set(x, "AttributeSuggestionsConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributeSuggestionsConfigUndefined: Self = StObject.set(x, "AttributeSuggestionsConfig", js.undefined)
    
    inline def setIncludeQueriesWithoutUserInformation(value: ObjectBoolean): Self = StObject.set(x, "IncludeQueriesWithoutUserInformation", value.asInstanceOf[js.Any])
    
    inline def setIncludeQueriesWithoutUserInformationUndefined: Self = StObject.set(x, "IncludeQueriesWithoutUserInformation", js.undefined)
    
    inline def setLastClearTime(value: js.Date): Self = StObject.set(x, "LastClearTime", value.asInstanceOf[js.Any])
    
    inline def setLastClearTimeUndefined: Self = StObject.set(x, "LastClearTime", js.undefined)
    
    inline def setLastSuggestionsBuildTime(value: js.Date): Self = StObject.set(x, "LastSuggestionsBuildTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuggestionsBuildTimeUndefined: Self = StObject.set(x, "LastSuggestionsBuildTime", js.undefined)
    
    inline def setMinimumNumberOfQueryingUsers(value: MinimumNumberOfQueryingUsers): Self = StObject.set(x, "MinimumNumberOfQueryingUsers", value.asInstanceOf[js.Any])
    
    inline def setMinimumNumberOfQueryingUsersUndefined: Self = StObject.set(x, "MinimumNumberOfQueryingUsers", js.undefined)
    
    inline def setMinimumQueryCount(value: MinimumQueryCount): Self = StObject.set(x, "MinimumQueryCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumQueryCountUndefined: Self = StObject.set(x, "MinimumQueryCount", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setQueryLogLookBackWindowInDays(value: Integer): Self = StObject.set(x, "QueryLogLookBackWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setQueryLogLookBackWindowInDaysUndefined: Self = StObject.set(x, "QueryLogLookBackWindowInDays", js.undefined)
    
    inline def setStatus(value: QuerySuggestionsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTotalSuggestionsCount(value: Integer): Self = StObject.set(x, "TotalSuggestionsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalSuggestionsCountUndefined: Self = StObject.set(x, "TotalSuggestionsCount", js.undefined)
  }
}
