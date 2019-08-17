package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMarketplacecommerceanalyticsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomerDefinedValues = StringDictionary[OptionalValue]
  type DataSetPublicationDate = Date
  type DataSetRequestId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.customer_subscriber_hourly_monthly_subscriptions
    - typings.awsDashSdk.awsDashSdkStrings.customer_subscriber_annual_subscriptions
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_usage_by_instance_type
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_fees
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_free_trial_conversions
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_new_instances
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_new_product_subscribers
    - typings.awsDashSdk.awsDashSdkStrings.daily_business_canceled_product_subscribers
    - typings.awsDashSdk.awsDashSdkStrings.monthly_revenue_billing_and_revenue_data
    - typings.awsDashSdk.awsDashSdkStrings.monthly_revenue_annual_subscriptions
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_product
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_product_with_uncollected_funds
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_instance_hours
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_customer_geo
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_age_of_uncollected_funds
    - typings.awsDashSdk.awsDashSdkStrings.disbursed_amount_by_age_of_disbursed_funds
    - typings.awsDashSdk.awsDashSdkStrings.customer_profile_by_industry
    - typings.awsDashSdk.awsDashSdkStrings.customer_profile_by_revenue
    - typings.awsDashSdk.awsDashSdkStrings.customer_profile_by_geography
    - typings.awsDashSdk.awsDashSdkStrings.sales_compensation_billed_revenue
    - typings.awsDashSdk.awsDashSdkStrings.us_sales_and_use_tax_records
    - java.lang.String
  */
  type DataSetType = _DataSetType | String
  type DestinationS3BucketName = String
  type DestinationS3Prefix = String
  type FromDate = Date
  type OptionalKey = String
  type OptionalValue = String
  type RoleNameArn = String
  type SnsTopicArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.customer_support_contacts_data
    - typings.awsDashSdk.awsDashSdkStrings.test_customer_support_contacts_data
    - java.lang.String
  */
  type SupportDataSetType = _SupportDataSetType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-07-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
