package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMarketplacecommerceanalyticsMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CustomerDefinedValues = org.scalablytyped.runtime.StringDictionary[OptionalValue]
  type DataSetPublicationDate = stdLib.Date
  type DataSetRequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.customer_subscriber_hourly_monthly_subscriptions
    - awsDashSdkLib.awsDashSdkLibStrings.customer_subscriber_annual_subscriptions
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_usage_by_instance_type
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_fees
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_free_trial_conversions
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_new_instances
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_new_product_subscribers
    - awsDashSdkLib.awsDashSdkLibStrings.daily_business_canceled_product_subscribers
    - awsDashSdkLib.awsDashSdkLibStrings.monthly_revenue_billing_and_revenue_data
    - awsDashSdkLib.awsDashSdkLibStrings.monthly_revenue_annual_subscriptions
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_product
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_product_with_uncollected_funds
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_instance_hours
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_customer_geo
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_age_of_uncollected_funds
    - awsDashSdkLib.awsDashSdkLibStrings.disbursed_amount_by_age_of_disbursed_funds
    - awsDashSdkLib.awsDashSdkLibStrings.customer_profile_by_industry
    - awsDashSdkLib.awsDashSdkLibStrings.customer_profile_by_revenue
    - awsDashSdkLib.awsDashSdkLibStrings.customer_profile_by_geography
    - awsDashSdkLib.awsDashSdkLibStrings.sales_compensation_billed_revenue
    - awsDashSdkLib.awsDashSdkLibStrings.us_sales_and_use_tax_records
    - java.lang.String
  */
  type DataSetType = _DataSetType | java.lang.String
  type DestinationS3BucketName = java.lang.String
  type DestinationS3Prefix = java.lang.String
  type FromDate = stdLib.Date
  type OptionalKey = java.lang.String
  type OptionalValue = java.lang.String
  type RoleNameArn = java.lang.String
  type SnsTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.customer_support_contacts_data
    - awsDashSdkLib.awsDashSdkLibStrings.test_customer_support_contacts_data
    - java.lang.String
  */
  type SupportDataSetType = _SupportDataSetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-07-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
