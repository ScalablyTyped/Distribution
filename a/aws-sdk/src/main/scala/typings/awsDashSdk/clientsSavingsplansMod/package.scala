package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSavingsplansMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.Hrs
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type Amount = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CNY
    - typings.awsDashSdk.awsDashSdkStrings.USD
    - java.lang.String
  */
  type CurrencyCode = _CurrencyCode | java.lang.String
  type CurrencyList = js.Array[CurrencyCode]
  type DurationsList = js.Array[SavingsPlansDuration]
  type EC2InstanceFamily = java.lang.String
  type FilterValuesList = js.Array[JsonSafeFilterValueString]
  type JsonSafeFilterValueString = java.lang.String
  type ListOfStrings = js.Array[String]
  type MaxResults = Double
  type PageSize = Double
  type PaginationToken = java.lang.String
  type Region = java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlanArnList = js.Array[SavingsPlanArn]
  type SavingsPlanDescription = java.lang.String
  type SavingsPlanDescriptionsList = js.Array[SavingsPlanDescription]
  type SavingsPlanFilterList = js.Array[SavingsPlanFilter]
  type SavingsPlanId = java.lang.String
  type SavingsPlanIdList = js.Array[SavingsPlanId]
  type SavingsPlanList = js.Array[SavingsPlan]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingFilterAttribute = _SavingsPlanOfferingFilterAttribute | java.lang.String
  type SavingsPlanOfferingFiltersList = js.Array[SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingPropertyKey = _SavingsPlanOfferingPropertyKey | java.lang.String
  type SavingsPlanOfferingPropertyList = js.Array[SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList = js.Array[SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList = js.Array[SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList = js.Array[SavingsPlanOffering]
  type SavingsPlanOperation = java.lang.String
  type SavingsPlanOperationList = js.Array[SavingsPlanOperation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`All Upfront`
    - typings.awsDashSdk.awsDashSdkStrings.`Partial Upfront`
    - typings.awsDashSdk.awsDashSdkStrings.`No Upfront`
    - java.lang.String
  */
  type SavingsPlanPaymentOption = _SavingsPlanPaymentOption | java.lang.String
  type SavingsPlanPaymentOptionList = js.Array[SavingsPlanPaymentOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EC2
    - typings.awsDashSdk.awsDashSdkStrings.Fargate_
    - java.lang.String
  */
  type SavingsPlanProductType = _SavingsPlanProductType | java.lang.String
  type SavingsPlanProductTypeList = js.Array[SavingsPlanProductType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.instanceFamily
    - typings.awsDashSdk.awsDashSdkStrings.instanceType_
    - typings.awsDashSdk.awsDashSdkStrings.productDescription
    - typings.awsDashSdk.awsDashSdkStrings.tenancy_
    - typings.awsDashSdk.awsDashSdkStrings.productId
    - java.lang.String
  */
  type SavingsPlanRateFilterAttribute = _SavingsPlanRateFilterAttribute | java.lang.String
  type SavingsPlanRateFilterList = js.Array[SavingsPlanRateFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.instanceType_
    - typings.awsDashSdk.awsDashSdkStrings.productDescription
    - typings.awsDashSdk.awsDashSdkStrings.tenancy_
    - typings.awsDashSdk.awsDashSdkStrings.productType_
    - typings.awsDashSdk.awsDashSdkStrings.serviceCode
    - typings.awsDashSdk.awsDashSdkStrings.usageType
    - typings.awsDashSdk.awsDashSdkStrings.operation_
    - java.lang.String
  */
  type SavingsPlanRateFilterName = _SavingsPlanRateFilterName | java.lang.String
  type SavingsPlanRateList = js.Array[SavingsPlanRate]
  type SavingsPlanRateOperation = java.lang.String
  type SavingsPlanRateOperationList = js.Array[SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.instanceType_
    - typings.awsDashSdk.awsDashSdkStrings.instanceFamily
    - typings.awsDashSdk.awsDashSdkStrings.productDescription
    - typings.awsDashSdk.awsDashSdkStrings.tenancy_
    - java.lang.String
  */
  type SavingsPlanRatePropertyKey = _SavingsPlanRatePropertyKey | java.lang.String
  type SavingsPlanRatePropertyList = js.Array[SavingsPlanRateProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AmazonEC2
    - typings.awsDashSdk.awsDashSdkStrings.AmazonECS
    - java.lang.String
  */
  type SavingsPlanRateServiceCode = _SavingsPlanRateServiceCode | java.lang.String
  type SavingsPlanRateServiceCodeList = js.Array[SavingsPlanRateServiceCode]
  type SavingsPlanRateUnit = Hrs | java.lang.String
  type SavingsPlanRateUsageType = java.lang.String
  type SavingsPlanRateUsageTypeList = js.Array[SavingsPlanRateUsageType]
  type SavingsPlanServiceCode = java.lang.String
  type SavingsPlanServiceCodeList = js.Array[SavingsPlanServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`payment-pending`
    - typings.awsDashSdk.awsDashSdkStrings.`payment-failed`
    - typings.awsDashSdk.awsDashSdkStrings.active__
    - typings.awsDashSdk.awsDashSdkStrings.retired
    - java.lang.String
  */
  type SavingsPlanState = _SavingsPlanState | java.lang.String
  type SavingsPlanStateList = js.Array[SavingsPlanState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Compute
    - typings.awsDashSdk.awsDashSdkStrings.EC2Instance
    - java.lang.String
  */
  type SavingsPlanType = _SavingsPlanType | java.lang.String
  type SavingsPlanTypeList = js.Array[SavingsPlanType]
  type SavingsPlanUsageType = java.lang.String
  type SavingsPlanUsageTypeList = js.Array[SavingsPlanUsageType]
  type SavingsPlansDuration = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.region__
    - typings.awsDashSdk.awsDashSdkStrings.`ec2-instance-family`
    - typings.awsDashSdk.awsDashSdkStrings.commitment
    - typings.awsDashSdk.awsDashSdkStrings.upfront
    - typings.awsDashSdk.awsDashSdkStrings.term
    - typings.awsDashSdk.awsDashSdkStrings.`savings-plan-type`
    - typings.awsDashSdk.awsDashSdkStrings.`payment-option`
    - typings.awsDashSdk.awsDashSdkStrings.start_
    - typings.awsDashSdk.awsDashSdkStrings.end_
    - java.lang.String
  */
  type SavingsPlansFilterName = _SavingsPlansFilterName | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type TermDurationInSeconds = Double
  type UUID = java.lang.String
  type UUIDs = js.Array[UUID]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-06-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
