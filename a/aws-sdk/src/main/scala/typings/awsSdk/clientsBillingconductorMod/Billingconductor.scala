package typings.awsSdk.clientsBillingconductorMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Billingconductor
  extends StObject
     with typings.std.String {
  
  /**
    * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs must be a part of the consolidated billing family during the current month, and not already associated with another billing group. The maximum number of accounts that can be associated in one call is 30. 
    */
  def associateAccounts(): Request[AssociateAccountsOutput, AWSError] = js.native
  def associateAccounts(callback: js.Function2[/* err */ AWSError, /* data */ AssociateAccountsOutput, Unit]): Request[AssociateAccountsOutput, AWSError] = js.native
  /**
    * Connects an array of account IDs in a consolidated billing family to a predefined billing group. The account IDs must be a part of the consolidated billing family during the current month, and not already associated with another billing group. The maximum number of accounts that can be associated in one call is 30. 
    */
  def associateAccounts(params: AssociateAccountsInput): Request[AssociateAccountsOutput, AWSError] = js.native
  def associateAccounts(
    params: AssociateAccountsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateAccountsOutput, Unit]
  ): Request[AssociateAccountsOutput, AWSError] = js.native
  
  /**
    * Connects an array of PricingRuleArns to a defined PricingPlan. The maximum number PricingRuleArn that can be associated in one call is 30. 
    */
  def associatePricingRules(): Request[AssociatePricingRulesOutput, AWSError] = js.native
  def associatePricingRules(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePricingRulesOutput, Unit]): Request[AssociatePricingRulesOutput, AWSError] = js.native
  /**
    * Connects an array of PricingRuleArns to a defined PricingPlan. The maximum number PricingRuleArn that can be associated in one call is 30. 
    */
  def associatePricingRules(params: AssociatePricingRulesInput): Request[AssociatePricingRulesOutput, AWSError] = js.native
  def associatePricingRules(
    params: AssociatePricingRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePricingRulesOutput, Unit]
  ): Request[AssociatePricingRulesOutput, AWSError] = js.native
  
  /**
    *  Associates a batch of resources to a percentage custom line item. 
    */
  def batchAssociateResourcesToCustomLineItem(): Request[BatchAssociateResourcesToCustomLineItemOutput, AWSError] = js.native
  def batchAssociateResourcesToCustomLineItem(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateResourcesToCustomLineItemOutput, Unit]
  ): Request[BatchAssociateResourcesToCustomLineItemOutput, AWSError] = js.native
  /**
    *  Associates a batch of resources to a percentage custom line item. 
    */
  def batchAssociateResourcesToCustomLineItem(params: BatchAssociateResourcesToCustomLineItemInput): Request[BatchAssociateResourcesToCustomLineItemOutput, AWSError] = js.native
  def batchAssociateResourcesToCustomLineItem(
    params: BatchAssociateResourcesToCustomLineItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAssociateResourcesToCustomLineItemOutput, Unit]
  ): Request[BatchAssociateResourcesToCustomLineItemOutput, AWSError] = js.native
  
  /**
    *  Disassociates a batch of resources from a percentage custom line item. 
    */
  def batchDisassociateResourcesFromCustomLineItem(): Request[BatchDisassociateResourcesFromCustomLineItemOutput, AWSError] = js.native
  def batchDisassociateResourcesFromCustomLineItem(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateResourcesFromCustomLineItemOutput, 
      Unit
    ]
  ): Request[BatchDisassociateResourcesFromCustomLineItemOutput, AWSError] = js.native
  /**
    *  Disassociates a batch of resources from a percentage custom line item. 
    */
  def batchDisassociateResourcesFromCustomLineItem(params: BatchDisassociateResourcesFromCustomLineItemInput): Request[BatchDisassociateResourcesFromCustomLineItemOutput, AWSError] = js.native
  def batchDisassociateResourcesFromCustomLineItem(
    params: BatchDisassociateResourcesFromCustomLineItemInput,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateResourcesFromCustomLineItemOutput, 
      Unit
    ]
  ): Request[BatchDisassociateResourcesFromCustomLineItemOutput, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off of the predefined pricing plan computation. 
    */
  def createBillingGroup(): Request[CreateBillingGroupOutput, AWSError] = js.native
  def createBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateBillingGroupOutput, Unit]): Request[CreateBillingGroupOutput, AWSError] = js.native
  /**
    *  Creates a billing group that resembles a consolidated billing family that Amazon Web Services charges, based off of the predefined pricing plan computation. 
    */
  def createBillingGroup(params: CreateBillingGroupInput): Request[CreateBillingGroupOutput, AWSError] = js.native
  def createBillingGroup(
    params: CreateBillingGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBillingGroupOutput, Unit]
  ): Request[CreateBillingGroupOutput, AWSError] = js.native
  
  /**
    *  Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount. 
    */
  def createCustomLineItem(): Request[CreateCustomLineItemOutput, AWSError] = js.native
  def createCustomLineItem(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomLineItemOutput, Unit]): Request[CreateCustomLineItemOutput, AWSError] = js.native
  /**
    *  Creates a custom line item that can be used to create a one-time fixed charge that can be applied to a single billing group for the current or previous billing period. The one-time fixed charge is either a fee or discount. 
    */
  def createCustomLineItem(params: CreateCustomLineItemInput): Request[CreateCustomLineItemOutput, AWSError] = js.native
  def createCustomLineItem(
    params: CreateCustomLineItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomLineItemOutput, Unit]
  ): Request[CreateCustomLineItemOutput, AWSError] = js.native
  
  /**
    * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups. 
    */
  def createPricingPlan(): Request[CreatePricingPlanOutput, AWSError] = js.native
  def createPricingPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreatePricingPlanOutput, Unit]): Request[CreatePricingPlanOutput, AWSError] = js.native
  /**
    * Creates a pricing plan that is used for computing Amazon Web Services charges for billing groups. 
    */
  def createPricingPlan(params: CreatePricingPlanInput): Request[CreatePricingPlanOutput, AWSError] = js.native
  def createPricingPlan(
    params: CreatePricingPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePricingPlanOutput, Unit]
  ): Request[CreatePricingPlanOutput, AWSError] = js.native
  
  /**
    *  Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans. 
    */
  def createPricingRule(): Request[CreatePricingRuleOutput, AWSError] = js.native
  def createPricingRule(callback: js.Function2[/* err */ AWSError, /* data */ CreatePricingRuleOutput, Unit]): Request[CreatePricingRuleOutput, AWSError] = js.native
  /**
    *  Creates a pricing rule can be associated to a pricing plan, or a set of pricing plans. 
    */
  def createPricingRule(params: CreatePricingRuleInput): Request[CreatePricingRuleOutput, AWSError] = js.native
  def createPricingRule(
    params: CreatePricingRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePricingRuleOutput, Unit]
  ): Request[CreatePricingRuleOutput, AWSError] = js.native
  
  /**
    *  Deletes a billing group. 
    */
  def deleteBillingGroup(): Request[DeleteBillingGroupOutput, AWSError] = js.native
  def deleteBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBillingGroupOutput, Unit]): Request[DeleteBillingGroupOutput, AWSError] = js.native
  /**
    *  Deletes a billing group. 
    */
  def deleteBillingGroup(params: DeleteBillingGroupInput): Request[DeleteBillingGroupOutput, AWSError] = js.native
  def deleteBillingGroup(
    params: DeleteBillingGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBillingGroupOutput, Unit]
  ): Request[DeleteBillingGroupOutput, AWSError] = js.native
  
  /**
    *  Deletes the custom line item identified by the given ARN in the current, or previous billing period. 
    */
  def deleteCustomLineItem(): Request[DeleteCustomLineItemOutput, AWSError] = js.native
  def deleteCustomLineItem(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomLineItemOutput, Unit]): Request[DeleteCustomLineItemOutput, AWSError] = js.native
  /**
    *  Deletes the custom line item identified by the given ARN in the current, or previous billing period. 
    */
  def deleteCustomLineItem(params: DeleteCustomLineItemInput): Request[DeleteCustomLineItemOutput, AWSError] = js.native
  def deleteCustomLineItem(
    params: DeleteCustomLineItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomLineItemOutput, Unit]
  ): Request[DeleteCustomLineItemOutput, AWSError] = js.native
  
  /**
    * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
    */
  def deletePricingPlan(): Request[DeletePricingPlanOutput, AWSError] = js.native
  def deletePricingPlan(callback: js.Function2[/* err */ AWSError, /* data */ DeletePricingPlanOutput, Unit]): Request[DeletePricingPlanOutput, AWSError] = js.native
  /**
    * Deletes a pricing plan. The pricing plan must not be associated with any billing groups to delete successfully.
    */
  def deletePricingPlan(params: DeletePricingPlanInput): Request[DeletePricingPlanOutput, AWSError] = js.native
  def deletePricingPlan(
    params: DeletePricingPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePricingPlanOutput, Unit]
  ): Request[DeletePricingPlanOutput, AWSError] = js.native
  
  /**
    *  Deletes the pricing rule identified by the input Amazon Resource Name (ARN). 
    */
  def deletePricingRule(): Request[DeletePricingRuleOutput, AWSError] = js.native
  def deletePricingRule(callback: js.Function2[/* err */ AWSError, /* data */ DeletePricingRuleOutput, Unit]): Request[DeletePricingRuleOutput, AWSError] = js.native
  /**
    *  Deletes the pricing rule identified by the input Amazon Resource Name (ARN). 
    */
  def deletePricingRule(params: DeletePricingRuleInput): Request[DeletePricingRuleOutput, AWSError] = js.native
  def deletePricingRule(
    params: DeletePricingRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePricingRuleOutput, Unit]
  ): Request[DeletePricingRuleOutput, AWSError] = js.native
  
  /**
    * Removes the specified list of account IDs from the given billing group. 
    */
  def disassociateAccounts(): Request[DisassociateAccountsOutput, AWSError] = js.native
  def disassociateAccounts(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateAccountsOutput, Unit]): Request[DisassociateAccountsOutput, AWSError] = js.native
  /**
    * Removes the specified list of account IDs from the given billing group. 
    */
  def disassociateAccounts(params: DisassociateAccountsInput): Request[DisassociateAccountsOutput, AWSError] = js.native
  def disassociateAccounts(
    params: DisassociateAccountsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateAccountsOutput, Unit]
  ): Request[DisassociateAccountsOutput, AWSError] = js.native
  
  /**
    *  Disassociates a list of pricing rules from a pricing plan. 
    */
  def disassociatePricingRules(): Request[DisassociatePricingRulesOutput, AWSError] = js.native
  def disassociatePricingRules(callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePricingRulesOutput, Unit]): Request[DisassociatePricingRulesOutput, AWSError] = js.native
  /**
    *  Disassociates a list of pricing rules from a pricing plan. 
    */
  def disassociatePricingRules(params: DisassociatePricingRulesInput): Request[DisassociatePricingRulesOutput, AWSError] = js.native
  def disassociatePricingRules(
    params: DisassociatePricingRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePricingRulesOutput, Unit]
  ): Request[DisassociatePricingRulesOutput, AWSError] = js.native
  
  /**
    *   Amazon Web Services Billing Conductor is in beta release and is subject to change. Your use of Amazon Web Services Billing Conductor is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).    This is a paginated call to list linked accounts that are linked to the payer account for the specified time period. If no information is provided, the current billing period is used. The response will optionally include the billing group associated with the linked account.
    */
  def listAccountAssociations(): Request[ListAccountAssociationsOutput, AWSError] = js.native
  def listAccountAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssociationsOutput, Unit]): Request[ListAccountAssociationsOutput, AWSError] = js.native
  /**
    *   Amazon Web Services Billing Conductor is in beta release and is subject to change. Your use of Amazon Web Services Billing Conductor is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).    This is a paginated call to list linked accounts that are linked to the payer account for the specified time period. If no information is provided, the current billing period is used. The response will optionally include the billing group associated with the linked account.
    */
  def listAccountAssociations(params: ListAccountAssociationsInput): Request[ListAccountAssociationsOutput, AWSError] = js.native
  def listAccountAssociations(
    params: ListAccountAssociationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountAssociationsOutput, Unit]
  ): Request[ListAccountAssociationsOutput, AWSError] = js.native
  
  /**
    * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web Services charges based on the associated pricing plan of a billing group.
    */
  def listBillingGroupCostReports(): Request[ListBillingGroupCostReportsOutput, AWSError] = js.native
  def listBillingGroupCostReports(callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupCostReportsOutput, Unit]): Request[ListBillingGroupCostReportsOutput, AWSError] = js.native
  /**
    * A paginated call to retrieve a summary report of actual Amazon Web Services charges and the calculated Amazon Web Services charges based on the associated pricing plan of a billing group.
    */
  def listBillingGroupCostReports(params: ListBillingGroupCostReportsInput): Request[ListBillingGroupCostReportsOutput, AWSError] = js.native
  def listBillingGroupCostReports(
    params: ListBillingGroupCostReportsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupCostReportsOutput, Unit]
  ): Request[ListBillingGroupCostReportsOutput, AWSError] = js.native
  
  /**
    * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a billing group, the current billing period is used.
    */
  def listBillingGroups(): Request[ListBillingGroupsOutput, AWSError] = js.native
  def listBillingGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupsOutput, Unit]): Request[ListBillingGroupsOutput, AWSError] = js.native
  /**
    * A paginated call to retrieve a list of billing groups for the given billing period. If you don't provide a billing group, the current billing period is used.
    */
  def listBillingGroups(params: ListBillingGroupsInput): Request[ListBillingGroupsOutput, AWSError] = js.native
  def listBillingGroups(
    params: ListBillingGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBillingGroupsOutput, Unit]
  ): Request[ListBillingGroupsOutput, AWSError] = js.native
  
  /**
    *  A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't provide a billing period, the current billing period is used. 
    */
  def listCustomLineItems(): Request[ListCustomLineItemsOutput, AWSError] = js.native
  def listCustomLineItems(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomLineItemsOutput, Unit]): Request[ListCustomLineItemsOutput, AWSError] = js.native
  /**
    *  A paginated call to get a list of all custom line items (FFLIs) for the given billing period. If you don't provide a billing period, the current billing period is used. 
    */
  def listCustomLineItems(params: ListCustomLineItemsInput): Request[ListCustomLineItemsOutput, AWSError] = js.native
  def listCustomLineItems(
    params: ListCustomLineItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomLineItemsOutput, Unit]
  ): Request[ListCustomLineItemsOutput, AWSError] = js.native
  
  /**
    * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the current billing period is used. 
    */
  def listPricingPlans(): Request[ListPricingPlansOutput, AWSError] = js.native
  def listPricingPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListPricingPlansOutput, Unit]): Request[ListPricingPlansOutput, AWSError] = js.native
  /**
    * A paginated call to get pricing plans for the given billing period. If you don't provide a billing period, the current billing period is used. 
    */
  def listPricingPlans(params: ListPricingPlansInput): Request[ListPricingPlansOutput, AWSError] = js.native
  def listPricingPlans(
    params: ListPricingPlansInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingPlansOutput, Unit]
  ): Request[ListPricingPlansOutput, AWSError] = js.native
  
  /**
    *  A list of the pricing plans associated with a pricing rule. 
    */
  def listPricingPlansAssociatedWithPricingRule(): Request[ListPricingPlansAssociatedWithPricingRuleOutput, AWSError] = js.native
  def listPricingPlansAssociatedWithPricingRule(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingPlansAssociatedWithPricingRuleOutput, Unit]
  ): Request[ListPricingPlansAssociatedWithPricingRuleOutput, AWSError] = js.native
  /**
    *  A list of the pricing plans associated with a pricing rule. 
    */
  def listPricingPlansAssociatedWithPricingRule(params: ListPricingPlansAssociatedWithPricingRuleInput): Request[ListPricingPlansAssociatedWithPricingRuleOutput, AWSError] = js.native
  def listPricingPlansAssociatedWithPricingRule(
    params: ListPricingPlansAssociatedWithPricingRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingPlansAssociatedWithPricingRuleOutput, Unit]
  ): Request[ListPricingPlansAssociatedWithPricingRuleOutput, AWSError] = js.native
  
  /**
    *  Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans. 
    */
  def listPricingRules(): Request[ListPricingRulesOutput, AWSError] = js.native
  def listPricingRules(callback: js.Function2[/* err */ AWSError, /* data */ ListPricingRulesOutput, Unit]): Request[ListPricingRulesOutput, AWSError] = js.native
  /**
    *  Describes a pricing rule that can be associated to a pricing plan, or set of pricing plans. 
    */
  def listPricingRules(params: ListPricingRulesInput): Request[ListPricingRulesOutput, AWSError] = js.native
  def listPricingRules(
    params: ListPricingRulesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingRulesOutput, Unit]
  ): Request[ListPricingRulesOutput, AWSError] = js.native
  
  /**
    *  Lists the pricing rules associated with a pricing plan. 
    */
  def listPricingRulesAssociatedToPricingPlan(): Request[ListPricingRulesAssociatedToPricingPlanOutput, AWSError] = js.native
  def listPricingRulesAssociatedToPricingPlan(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingRulesAssociatedToPricingPlanOutput, Unit]
  ): Request[ListPricingRulesAssociatedToPricingPlanOutput, AWSError] = js.native
  /**
    *  Lists the pricing rules associated with a pricing plan. 
    */
  def listPricingRulesAssociatedToPricingPlan(params: ListPricingRulesAssociatedToPricingPlanInput): Request[ListPricingRulesAssociatedToPricingPlanOutput, AWSError] = js.native
  def listPricingRulesAssociatedToPricingPlan(
    params: ListPricingRulesAssociatedToPricingPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPricingRulesAssociatedToPricingPlanOutput, Unit]
  ): Request[ListPricingRulesAssociatedToPricingPlanOutput, AWSError] = js.native
  
  /**
    *  List the resources associated to a custom line item. 
    */
  def listResourcesAssociatedToCustomLineItem(): Request[ListResourcesAssociatedToCustomLineItemOutput, AWSError] = js.native
  def listResourcesAssociatedToCustomLineItem(
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesAssociatedToCustomLineItemOutput, Unit]
  ): Request[ListResourcesAssociatedToCustomLineItemOutput, AWSError] = js.native
  /**
    *  List the resources associated to a custom line item. 
    */
  def listResourcesAssociatedToCustomLineItem(params: ListResourcesAssociatedToCustomLineItemInput): Request[ListResourcesAssociatedToCustomLineItemOutput, AWSError] = js.native
  def listResourcesAssociatedToCustomLineItem(
    params: ListResourcesAssociatedToCustomLineItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesAssociatedToCustomLineItemOutput, Unit]
  ): Request[ListResourcesAssociatedToCustomLineItemOutput, AWSError] = js.native
  
  /**
    *  A list the tags for a resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  A list the tags for a resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Deletes specified tags from a resource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Deletes specified tags from a resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * This updates an existing billing group. 
    */
  def updateBillingGroup(): Request[UpdateBillingGroupOutput, AWSError] = js.native
  def updateBillingGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBillingGroupOutput, Unit]): Request[UpdateBillingGroupOutput, AWSError] = js.native
  /**
    * This updates an existing billing group. 
    */
  def updateBillingGroup(params: UpdateBillingGroupInput): Request[UpdateBillingGroupOutput, AWSError] = js.native
  def updateBillingGroup(
    params: UpdateBillingGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBillingGroupOutput, Unit]
  ): Request[UpdateBillingGroupOutput, AWSError] = js.native
  
  /**
    *  Update an existing custom line item in the current or previous billing period. 
    */
  def updateCustomLineItem(): Request[UpdateCustomLineItemOutput, AWSError] = js.native
  def updateCustomLineItem(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomLineItemOutput, Unit]): Request[UpdateCustomLineItemOutput, AWSError] = js.native
  /**
    *  Update an existing custom line item in the current or previous billing period. 
    */
  def updateCustomLineItem(params: UpdateCustomLineItemInput): Request[UpdateCustomLineItemOutput, AWSError] = js.native
  def updateCustomLineItem(
    params: UpdateCustomLineItemInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCustomLineItemOutput, Unit]
  ): Request[UpdateCustomLineItemOutput, AWSError] = js.native
  
  /**
    * This updates an existing pricing plan. 
    */
  def updatePricingPlan(): Request[UpdatePricingPlanOutput, AWSError] = js.native
  def updatePricingPlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePricingPlanOutput, Unit]): Request[UpdatePricingPlanOutput, AWSError] = js.native
  /**
    * This updates an existing pricing plan. 
    */
  def updatePricingPlan(params: UpdatePricingPlanInput): Request[UpdatePricingPlanOutput, AWSError] = js.native
  def updatePricingPlan(
    params: UpdatePricingPlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePricingPlanOutput, Unit]
  ): Request[UpdatePricingPlanOutput, AWSError] = js.native
  
  /**
    *  Updates an existing pricing rule. 
    */
  def updatePricingRule(): Request[UpdatePricingRuleOutput, AWSError] = js.native
  def updatePricingRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePricingRuleOutput, Unit]): Request[UpdatePricingRuleOutput, AWSError] = js.native
  /**
    *  Updates an existing pricing rule. 
    */
  def updatePricingRule(params: UpdatePricingRuleInput): Request[UpdatePricingRuleOutput, AWSError] = js.native
  def updatePricingRule(
    params: UpdatePricingRuleInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePricingRuleOutput, Unit]
  ): Request[UpdatePricingRuleOutput, AWSError] = js.native
}
