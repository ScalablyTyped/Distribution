package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricsInput extends StObject {
  
  /**
    * The dimensions to filter against. Only the dimensions that match exactly will be returned.
    */
  var Dimensions: js.UndefOr[DimensionFilters] = js.undefined
  
  /**
    * If you are using this operation in a monitoring account, specify true to include metrics from source accounts in the returned data. The default is false.
    */
  var IncludeLinkedAccounts: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.IncludeLinkedAccounts] = js.undefined
  
  /**
    * The name of the metric to filter against. Only the metrics with names that match exactly will be returned.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * The metric namespace to filter against. Only the namespace that matches exactly will be returned.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
  
  /**
    * When you use this operation in a monitoring account, use this field to return metrics only from one source account. To do so, specify that source account ID in this field, and also specify true for IncludeLinkedAccounts.
    */
  var OwningAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    * To filter the results to show only metrics that have had data points published in the past three hours, specify this parameter with a value of PT3H. This is the only valid value for this parameter. The results that are returned are an approximation of the value you specify. There is a low probability that the returned results include metrics with last published data as much as 40 minutes more than the specified time interval.
    */
  var RecentlyActive: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.RecentlyActive] = js.undefined
}
object ListMetricsInput {
  
  inline def apply(): ListMetricsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricsInput] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: DimensionFilters): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: DimensionFilter*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setIncludeLinkedAccounts(value: IncludeLinkedAccounts): Self = StObject.set(x, "IncludeLinkedAccounts", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinkedAccountsUndefined: Self = StObject.set(x, "IncludeLinkedAccounts", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwningAccount(value: AccountId): Self = StObject.set(x, "OwningAccount", value.asInstanceOf[js.Any])
    
    inline def setOwningAccountUndefined: Self = StObject.set(x, "OwningAccount", js.undefined)
    
    inline def setRecentlyActive(value: RecentlyActive): Self = StObject.set(x, "RecentlyActive", value.asInstanceOf[js.Any])
    
    inline def setRecentlyActiveUndefined: Self = StObject.set(x, "RecentlyActive", js.undefined)
  }
}
