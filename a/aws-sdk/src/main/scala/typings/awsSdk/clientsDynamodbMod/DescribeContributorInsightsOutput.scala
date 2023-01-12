package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContributorInsightsOutput extends StObject {
  
  /**
    * List of names of the associated contributor insights rules.
    */
  var ContributorInsightsRuleList: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ContributorInsightsRuleList] = js.undefined
  
  /**
    * Current status of contributor insights.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ContributorInsightsStatus] = js.undefined
  
  /**
    * Returns information about the last failure that was encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
    */
  var FailureException: js.UndefOr[typings.awsSdk.clientsDynamodbMod.FailureException] = js.undefined
  
  /**
    * The name of the global secondary index being described.
    */
  var IndexName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * Timestamp of the last time the status was changed.
    */
  var LastUpdateDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableName] = js.undefined
}
object DescribeContributorInsightsOutput {
  
  inline def apply(): DescribeContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContributorInsightsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContributorInsightsOutput] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = StObject.set(x, "ContributorInsightsRuleList", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsRuleListUndefined: Self = StObject.set(x, "ContributorInsightsRuleList", js.undefined)
    
    inline def setContributorInsightsRuleListVarargs(value: ContributorInsightsRule*): Self = StObject.set(x, "ContributorInsightsRuleList", js.Array(value*))
    
    inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    inline def setFailureException(value: FailureException): Self = StObject.set(x, "FailureException", value.asInstanceOf[js.Any])
    
    inline def setFailureExceptionUndefined: Self = StObject.set(x, "FailureException", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setLastUpdateDateTime(value: js.Date): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
