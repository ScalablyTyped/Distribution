package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDimensionValuesRequest extends StObject {
  
  /**
    * The context for the call to GetDimensionValues. This can be RESERVATIONS or COST_AND_USAGE. The default value is COST_AND_USAGE. If the context is set to RESERVATIONS, the resulting dimension values can be used in the GetReservationUtilization operation. If the context is set to COST_AND_USAGE, the resulting dimension values can be used in the GetCostAndUsage operation. If you set the context to COST_AND_USAGE, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   BILLING_ENTITY - The Amazon Web Services seller that your account is with. Possible values are the following: - Amazon Web Services(Amazon Web Services): The entity that sells Amazon Web Services. - AISPL (Amazon Internet Services Pvt. Ltd.): The local Indian entity that's an acting reseller for Amazon Web Services in India. - Amazon Web Services Marketplace: The entity that supports the sale of solutions that are built on Amazon Web Services by third-party software providers.   CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.   DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are SingleAZ and MultiAZ.   DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   INSTANCE_TYPE_FAMILY - A family of instance types optimized to fit different use cases. Examples are Compute Optimized (for example, C4, C5, C6g, and C7g), Memory Optimization (for example, R4, R5n, R5b, and R6g).   INVOICING_ENTITY - The name of the entity that issues the Amazon Web Services invoice.   LEGAL_ENTITY_NAME - The name of the organization that sells you Amazon Web Services services, such as Amazon Web Services.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.   OPERATION - The action performed. Examples include RunInstance and CreateBucket.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   PURCHASE_TYPE - The reservation type of the purchase that this usage is related to. Examples include On-Demand Instances and Standard Reserved Instances.   RESERVATION_ID - The unique identifier for an Amazon Web Services Reservation Instance.   SAVINGS_PLAN_ARN - The unique identifier for your Savings Plans.   SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute).   SERVICE - The Amazon Web Services service such as Amazon DynamoDB.   TENANCY - The tenancy of a resource. Examples are shared or dedicated.   USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the GetDimensionValues operation includes a unit attribute. Examples include GB and Hrs.   USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The response for this operation includes a unit attribute.   REGION - The Amazon Web Services Region.   RECORD_TYPE - The different types of charges such as Reserved Instance (RI) fees, usage costs, tax refunds, and credits.   RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14 days for EC2-Compute Service.   If you set the context to RESERVATIONS, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.   DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are SingleAZ and MultiAZ.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   REGION - The Amazon Web Services Region.   SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability Zone.   TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).   TENANCY - The tenancy of a resource. Examples are shared or dedicated.   If you set the context to SAVINGS_PLANS, you can use the following dimensions for searching:   SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)   PAYMENT_OPTION - The payment option for the given Savings Plans (for example, All Upfront)   REGION - The Amazon Web Services Region.   INSTANCE_TYPE_FAMILY - The family of instances (For example, m5)   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   SAVINGS_PLAN_ARN - The unique identifier for your Savings Plans.  
    */
  var Context: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Context] = js.undefined
  
  /**
    * The name of the dimension. Each Dimension is available for a different Context. For more information, see Context. LINK_ACCOUNT_NAME and SERVICE_CODE can only be used in CostCategoryRule. 
    */
  var Dimension: typings.awsSdk.clientsCostexplorerMod.Dimension
  
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * This field is only used when SortBy is provided in the request. The maximum number of objects that are returned for this request. If MaxResults isn't specified with SortBy, the request returns 1000 results as the default value for this parameter. For GetDimensionValues, MaxResults has an upper limit of 1000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The value that you want to search the filter values for.
    */
  var SearchString: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.SearchString] = js.undefined
  
  /**
    * The value that you want to sort the data by. The key represents cost and usage metrics. The following values are supported:    BlendedCost     UnblendedCost     AmortizedCost     NetAmortizedCost     NetUnblendedCost     UsageQuantity     NormalizedUsageAmount    The supported values for the SortOrder key are ASCENDING or DESCENDING. When you specify a SortBy paramater, the context must be COST_AND_USAGE. Further, when using SortBy, NextPageToken and SearchString aren't supported.
    */
  var SortBy: js.UndefOr[SortDefinitions] = js.undefined
  
  /**
    * The start date and end date for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}
object GetDimensionValuesRequest {
  
  inline def apply(Dimension: Dimension, TimePeriod: DateInterval): GetDimensionValuesRequest = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDimensionValuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDimensionValuesRequest] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Context): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setDimension(value: Dimension): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setSearchString(value: SearchString): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "SearchString", js.undefined)
    
    inline def setSortBy(value: SortDefinitions): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortByVarargs(value: SortDefinition*): Self = StObject.set(x, "SortBy", js.Array(value*))
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
