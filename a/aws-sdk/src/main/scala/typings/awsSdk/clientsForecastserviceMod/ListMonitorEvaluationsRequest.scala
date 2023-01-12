package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitorEvaluationsRequest extends StObject {
  
  /**
    * An array of filters. For each filter, provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude the resources that match the statement from the list. The match statement consists of a key and a value.  Filter properties     Condition - The condition to apply. Valid values are IS and IS_NOT.    Key - The name of the parameter to filter on. The only valid value is EvaluationState.    Value - The value to match. Valid values are only SUCCESS or FAILURE.   For example, to list only successful monitor evaluations, you would specify:  "Filters": [ { "Condition": "IS", "Key": "EvaluationState", "Value": "SUCCESS" } ] 
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Filters] = js.undefined
  
  /**
    * The maximum number of monitoring results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.MaxResults] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource to get results from.
    */
  var MonitorArn: Arn
  
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.NextToken] = js.undefined
}
object ListMonitorEvaluationsRequest {
  
  inline def apply(MonitorArn: Arn): ListMonitorEvaluationsRequest = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitorEvaluationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMonitorEvaluationsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
