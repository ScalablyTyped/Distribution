package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSCost = java.lang.String

type AccountAssociationsList = js.Array[AccountAssociationsListElement]

type AccountEmail = java.lang.String

type AccountId = java.lang.String

type AccountIdList = js.Array[AccountId]

type AccountName = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVALID_ARN
  - typings.awsSdk.awsSdkStrings.SERVICE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ILLEGAL_CUSTOMLINEITEM
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_EXCEPTION
  - java.lang.String
*/
type AssociateResourceErrorReason = _AssociateResourceErrorReason | java.lang.String

type AssociateResourcesResponseList = js.Array[AssociateResourceResponseElement]

type Association = java.lang.String

type BillingGroupArn = java.lang.String

type BillingGroupArnList = js.Array[BillingGroupArn]

type BillingGroupCostReportList = js.Array[BillingGroupCostReportElement]

type BillingGroupDescription = java.lang.String

type BillingGroupFullArn = java.lang.String

type BillingGroupList = js.Array[BillingGroupListElement]

type BillingGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.PRIMARY_ACCOUNT_MISSING
  - java.lang.String
*/
type BillingGroupStatus = _BillingGroupStatus | java.lang.String

type BillingGroupStatusReason = java.lang.String

type BillingPeriod = java.lang.String

type ClientToken = java.lang.String

type Currency = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USD
  - typings.awsSdk.awsSdkStrings.CNY
  - java.lang.String
*/
type CurrencyCode = _CurrencyCode | java.lang.String

type CustomLineItemArn = java.lang.String

type CustomLineItemArns = js.Array[CustomLineItemArn]

type CustomLineItemAssociationElement = java.lang.String

type CustomLineItemAssociationsList = js.Array[CustomLineItemAssociationElement]

type CustomLineItemBatchAssociationsList = js.Array[CustomLineItemAssociationElement]

type CustomLineItemBatchDisassociationsList = js.Array[CustomLineItemAssociationElement]

type CustomLineItemChargeValue = Double

type CustomLineItemDescription = java.lang.String

type CustomLineItemList = js.Array[CustomLineItemListElement]

type CustomLineItemName = java.lang.String

type CustomLineItemNameList = js.Array[CustomLineItemName]

type CustomLineItemPercentageChargeValue = Double

type CustomLineItemProductCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PARENT
  - typings.awsSdk.awsSdkStrings.CHILD
  - java.lang.String
*/
type CustomLineItemRelationship = _CustomLineItemRelationship | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREDIT
  - typings.awsSdk.awsSdkStrings.FEE
  - java.lang.String
*/
type CustomLineItemType = _CustomLineItemType | java.lang.String

type DisassociateResourcesResponseList = js.Array[DisassociateResourceResponseElement]

type Instant = Double

type ListResourcesAssociatedToCustomLineItemResponseList = js.Array[ListResourcesAssociatedToCustomLineItemResponseElement]

type Margin = java.lang.String

type MarginPercentage = java.lang.String

type MaxBillingGroupResults = Double

type MaxCustomLineItemResults = Double

type MaxPricingPlanResults = Double

type MaxPricingRuleResults = Double

type ModifierPercentage = Double

type NumberOfAccounts = Double

type NumberOfAssociatedPricingRules = Double

type NumberOfAssociations = Double

type NumberOfPricingPlansAssociatedWith = Double

type PricingPlanArn = java.lang.String

type PricingPlanArns = js.Array[PricingPlanArn]

type PricingPlanDescription = java.lang.String

type PricingPlanFullArn = java.lang.String

type PricingPlanList = js.Array[PricingPlanListElement]

type PricingPlanName = java.lang.String

type PricingRuleArn = java.lang.String

type PricingRuleArns = js.Array[PricingRuleArn]

type PricingRuleArnsInput = js.Array[PricingRuleArn]

type PricingRuleArnsNonEmptyInput = js.Array[PricingRuleArn]

type PricingRuleDescription = java.lang.String

type PricingRuleList = js.Array[PricingRuleListElement]

type PricingRuleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GLOBAL
  - typings.awsSdk.awsSdkStrings.SERVICE
  - java.lang.String
*/
type PricingRuleScope = _PricingRuleScope | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MARKUP
  - typings.awsSdk.awsSdkStrings.DISCOUNT
  - java.lang.String
*/
type PricingRuleType = _PricingRuleType | java.lang.String

type ProformaCost = java.lang.String

type Service = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-07-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
