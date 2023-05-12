package typings.awsSdk.clientsSecurityhubMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityHub extends Service {
  
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the invitation was sent from. This operation is only used by member accounts that are not added through Organizations. When the member account accepts the invitation, permission is granted to the administrator account to view findings generated in the member account.
    */
  def acceptAdministratorInvitation(): Request[AcceptAdministratorInvitationResponse, AWSError] = js.native
  def acceptAdministratorInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptAdministratorInvitationResponse, Unit]): Request[AcceptAdministratorInvitationResponse, AWSError] = js.native
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the invitation was sent from. This operation is only used by member accounts that are not added through Organizations. When the member account accepts the invitation, permission is granted to the administrator account to view findings generated in the member account.
    */
  def acceptAdministratorInvitation(params: AcceptAdministratorInvitationRequest): Request[AcceptAdministratorInvitationResponse, AWSError] = js.native
  def acceptAdministratorInvitation(
    params: AcceptAdministratorInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptAdministratorInvitationResponse, Unit]
  ): Request[AcceptAdministratorInvitationResponse, AWSError] = js.native
  
  /**
    * This method is deprecated. Instead, use AcceptAdministratorInvitation. The Security Hub console continues to use AcceptInvitation. It will eventually change to use AcceptAdministratorInvitation. Any IAM policies that specifically control access to this function must continue to use AcceptInvitation. You should also add AcceptAdministratorInvitation to your policies to ensure that the correct permissions are in place after the console begins to use AcceptAdministratorInvitation. Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the invitation was sent from. This operation is only used by member accounts that are not added through Organizations. When the member account accepts the invitation, permission is granted to the administrator account to view findings generated in the member account.
    */
  def acceptInvitation(): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * This method is deprecated. Instead, use AcceptAdministratorInvitation. The Security Hub console continues to use AcceptInvitation. It will eventually change to use AcceptAdministratorInvitation. Any IAM policies that specifically control access to this function must continue to use AcceptInvitation. You should also add AcceptAdministratorInvitation to your policies to ensure that the correct permissions are in place after the console begins to use AcceptAdministratorInvitation. Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the invitation was sent from. This operation is only used by member accounts that are not added through Organizations. When the member account accepts the invitation, permission is granted to the administrator account to view findings generated in the member account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]
  ): Request[AcceptInvitationResponse, AWSError] = js.native
  
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Security Standards section of the Security Hub User Guide.
    */
  def batchDisableStandards(): Request[BatchDisableStandardsResponse, AWSError] = js.native
  def batchDisableStandards(callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableStandardsResponse, Unit]): Request[BatchDisableStandardsResponse, AWSError] = js.native
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Security Standards section of the Security Hub User Guide.
    */
  def batchDisableStandards(params: BatchDisableStandardsRequest): Request[BatchDisableStandardsResponse, AWSError] = js.native
  def batchDisableStandards(
    params: BatchDisableStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableStandardsResponse, Unit]
  ): Request[BatchDisableStandardsResponse, AWSError] = js.native
  
  /**
    * Enables the standards specified by the provided StandardsArn. To obtain the ARN for a standard, use the DescribeStandards operation. For more information, see the Security Standards section of the Security Hub User Guide.
    */
  def batchEnableStandards(): Request[BatchEnableStandardsResponse, AWSError] = js.native
  def batchEnableStandards(callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableStandardsResponse, Unit]): Request[BatchEnableStandardsResponse, AWSError] = js.native
  /**
    * Enables the standards specified by the provided StandardsArn. To obtain the ARN for a standard, use the DescribeStandards operation. For more information, see the Security Standards section of the Security Hub User Guide.
    */
  def batchEnableStandards(params: BatchEnableStandardsRequest): Request[BatchEnableStandardsResponse, AWSError] = js.native
  def batchEnableStandards(
    params: BatchEnableStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableStandardsResponse, Unit]
  ): Request[BatchEnableStandardsResponse, AWSError] = js.native
  
  /**
    *  Provides details about a batch of security controls for the current Amazon Web Services account and Amazon Web Services Region. 
    */
  def batchGetSecurityControls(): Request[BatchGetSecurityControlsResponse, AWSError] = js.native
  def batchGetSecurityControls(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetSecurityControlsResponse, Unit]): Request[BatchGetSecurityControlsResponse, AWSError] = js.native
  /**
    *  Provides details about a batch of security controls for the current Amazon Web Services account and Amazon Web Services Region. 
    */
  def batchGetSecurityControls(params: BatchGetSecurityControlsRequest): Request[BatchGetSecurityControlsResponse, AWSError] = js.native
  def batchGetSecurityControls(
    params: BatchGetSecurityControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetSecurityControlsResponse, Unit]
  ): Request[BatchGetSecurityControlsResponse, AWSError] = js.native
  
  /**
    *  For a batch of security controls and standards, identifies whether each control is currently enabled or disabled in a standard. 
    */
  def batchGetStandardsControlAssociations(): Request[BatchGetStandardsControlAssociationsResponse, AWSError] = js.native
  def batchGetStandardsControlAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetStandardsControlAssociationsResponse, Unit]
  ): Request[BatchGetStandardsControlAssociationsResponse, AWSError] = js.native
  /**
    *  For a batch of security controls and standards, identifies whether each control is currently enabled or disabled in a standard. 
    */
  def batchGetStandardsControlAssociations(params: BatchGetStandardsControlAssociationsRequest): Request[BatchGetStandardsControlAssociationsResponse, AWSError] = js.native
  def batchGetStandardsControlAssociations(
    params: BatchGetStandardsControlAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetStandardsControlAssociationsResponse, Unit]
  ): Request[BatchGetStandardsControlAssociationsResponse, AWSError] = js.native
  
  /**
    * Imports security findings generated by a finding provider into Security Hub. This action is requested by the finding provider to import its findings into Security Hub.  BatchImportFindings must be called by one of the following:   The Amazon Web Services account that is associated with a finding if you are using the default product ARN or are a partner sending findings from within a customer's Amazon Web Services account. In these cases, the identifier of the account that you are calling BatchImportFindings from needs to be the same as the AwsAccountId attribute for the finding.   An Amazon Web Services account that Security Hub has allow-listed for an official partner integration. In this case, you can call BatchImportFindings from the allow-listed account and send findings from different customer accounts in the same batch.   The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb. After a finding is created, BatchImportFindings cannot be used to update the following finding fields and objects, which Security Hub customers use to manage their investigation workflow.    Note     UserDefinedFields     VerificationState     Workflow    Finding providers also should not use BatchImportFindings to update the following attributes.    Confidence     Criticality     RelatedFindings     Severity     Types    Instead, finding providers use FindingProviderFields to provide values for these attributes.
    */
  def batchImportFindings(): Request[BatchImportFindingsResponse, AWSError] = js.native
  def batchImportFindings(callback: js.Function2[/* err */ AWSError, /* data */ BatchImportFindingsResponse, Unit]): Request[BatchImportFindingsResponse, AWSError] = js.native
  /**
    * Imports security findings generated by a finding provider into Security Hub. This action is requested by the finding provider to import its findings into Security Hub.  BatchImportFindings must be called by one of the following:   The Amazon Web Services account that is associated with a finding if you are using the default product ARN or are a partner sending findings from within a customer's Amazon Web Services account. In these cases, the identifier of the account that you are calling BatchImportFindings from needs to be the same as the AwsAccountId attribute for the finding.   An Amazon Web Services account that Security Hub has allow-listed for an official partner integration. In this case, you can call BatchImportFindings from the allow-listed account and send findings from different customer accounts in the same batch.   The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb. After a finding is created, BatchImportFindings cannot be used to update the following finding fields and objects, which Security Hub customers use to manage their investigation workflow.    Note     UserDefinedFields     VerificationState     Workflow    Finding providers also should not use BatchImportFindings to update the following attributes.    Confidence     Criticality     RelatedFindings     Severity     Types    Instead, finding providers use FindingProviderFields to provide values for these attributes.
    */
  def batchImportFindings(params: BatchImportFindingsRequest): Request[BatchImportFindingsResponse, AWSError] = js.native
  def batchImportFindings(
    params: BatchImportFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchImportFindingsResponse, Unit]
  ): Request[BatchImportFindingsResponse, AWSError] = js.native
  
  /**
    * Used by Security Hub customers to update information about their investigation into a finding. Requested by administrator accounts or member accounts. Administrator accounts can update findings for their account and their member accounts. Member accounts can update findings for their account. Updates from BatchUpdateFindings do not affect the value of UpdatedAt for a finding. Administrator and member accounts can use BatchUpdateFindings to update the following finding fields and objects.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow    You can configure IAM policies to restrict access to fields and field values. For example, you might not want member accounts to be able to suppress findings or change the finding severity. See Configuring access to BatchUpdateFindings in the Security Hub User Guide.
    */
  def batchUpdateFindings(): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  def batchUpdateFindings(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateFindingsResponse, Unit]): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  /**
    * Used by Security Hub customers to update information about their investigation into a finding. Requested by administrator accounts or member accounts. Administrator accounts can update findings for their account and their member accounts. Member accounts can update findings for their account. Updates from BatchUpdateFindings do not affect the value of UpdatedAt for a finding. Administrator and member accounts can use BatchUpdateFindings to update the following finding fields and objects.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow    You can configure IAM policies to restrict access to fields and field values. For example, you might not want member accounts to be able to suppress findings or change the finding severity. See Configuring access to BatchUpdateFindings in the Security Hub User Guide.
    */
  def batchUpdateFindings(params: BatchUpdateFindingsRequest): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  def batchUpdateFindings(
    params: BatchUpdateFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateFindingsResponse, Unit]
  ): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  
  /**
    *  For a batch of security controls and standards, this operation updates the enablement status of a control in a standard. 
    */
  def batchUpdateStandardsControlAssociations(): Request[BatchUpdateStandardsControlAssociationsResponse, AWSError] = js.native
  def batchUpdateStandardsControlAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateStandardsControlAssociationsResponse, Unit]
  ): Request[BatchUpdateStandardsControlAssociationsResponse, AWSError] = js.native
  /**
    *  For a batch of security controls and standards, this operation updates the enablement status of a control in a standard. 
    */
  def batchUpdateStandardsControlAssociations(params: BatchUpdateStandardsControlAssociationsRequest): Request[BatchUpdateStandardsControlAssociationsResponse, AWSError] = js.native
  def batchUpdateStandardsControlAssociations(
    params: BatchUpdateStandardsControlAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateStandardsControlAssociationsResponse, Unit]
  ): Request[BatchUpdateStandardsControlAssociationsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_SecurityHub: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(): Request[CreateActionTargetResponse, AWSError] = js.native
  def createActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ CreateActionTargetResponse, Unit]): Request[CreateActionTargetResponse, AWSError] = js.native
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(params: CreateActionTargetRequest): Request[CreateActionTargetResponse, AWSError] = js.native
  def createActionTarget(
    params: CreateActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateActionTargetResponse, Unit]
  ): Request[CreateActionTargetResponse, AWSError] = js.native
  
  /**
    * Used to enable finding aggregation. Must be called from the aggregation Region. For more details about cross-Region replication, see Configuring finding aggregation in the Security Hub User Guide. 
    */
  def createFindingAggregator(): Request[CreateFindingAggregatorResponse, AWSError] = js.native
  def createFindingAggregator(callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingAggregatorResponse, Unit]): Request[CreateFindingAggregatorResponse, AWSError] = js.native
  /**
    * Used to enable finding aggregation. Must be called from the aggregation Region. For more details about cross-Region replication, see Configuring finding aggregation in the Security Hub User Guide. 
    */
  def createFindingAggregator(params: CreateFindingAggregatorRequest): Request[CreateFindingAggregatorResponse, AWSError] = js.native
  def createFindingAggregator(
    params: CreateFindingAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingAggregatorResponse, Unit]
  ): Request[CreateFindingAggregatorResponse, AWSError] = js.native
  
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. To group the related findings in the insight, use the GroupByAttribute.
    */
  def createInsight(): Request[CreateInsightResponse, AWSError] = js.native
  def createInsight(callback: js.Function2[/* err */ AWSError, /* data */ CreateInsightResponse, Unit]): Request[CreateInsightResponse, AWSError] = js.native
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. To group the related findings in the insight, use the GroupByAttribute.
    */
  def createInsight(params: CreateInsightRequest): Request[CreateInsightResponse, AWSError] = js.native
  def createInsight(
    params: CreateInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInsightResponse, Unit]
  ): Request[CreateInsightResponse, AWSError] = js.native
  
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the administrator account. If you are integrated with Organizations, then the administrator account is designated by the organization management account.  CreateMembers is always used to add accounts that are not organization members. For accounts that are managed using Organizations, CreateMembers is only used in the following cases:   Security Hub is not configured to automatically add new organization accounts.   The account was disassociated or deleted in Security Hub.   This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the EnableSecurityHub operation. For accounts that are not organization members, you create the account association and then send an invitation to the member account. To send the invitation, you use the InviteMembers operation. If the account owner accepts the invitation, the account becomes a member account in Security Hub. Accounts that are managed using Organizations do not receive an invitation. They automatically become a member account in Security Hub.   If the organization account does not have Security Hub enabled, then Security Hub and the default standards are automatically enabled. Note that Security Hub cannot be enabled automatically for the organization management account. The organization management account must enable Security Hub before the administrator account enables it as a member account.   For organization accounts that already have Security Hub enabled, Security Hub does not make any other changes to those accounts. It does not change their enabled standards or controls.   A permissions policy is added that permits the administrator account to view the findings generated in the member account. To remove the association between the administrator and member accounts, use the DisassociateFromMasterAccount or DisassociateMembers operation.
    */
  def createMembers(): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the administrator account. If you are integrated with Organizations, then the administrator account is designated by the organization management account.  CreateMembers is always used to add accounts that are not organization members. For accounts that are managed using Organizations, CreateMembers is only used in the following cases:   Security Hub is not configured to automatically add new organization accounts.   The account was disassociated or deleted in Security Hub.   This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the EnableSecurityHub operation. For accounts that are not organization members, you create the account association and then send an invitation to the member account. To send the invitation, you use the InviteMembers operation. If the account owner accepts the invitation, the account becomes a member account in Security Hub. Accounts that are managed using Organizations do not receive an invitation. They automatically become a member account in Security Hub.   If the organization account does not have Security Hub enabled, then Security Hub and the default standards are automatically enabled. Note that Security Hub cannot be enabled automatically for the organization management account. The organization management account must enable Security Hub before the administrator account enables it as a member account.   For organization accounts that already have Security Hub enabled, Security Hub does not make any other changes to those accounts. It does not change their enabled standards or controls.   A permissions policy is added that permits the administrator account to view the findings generated in the member account. To remove the association between the administrator and member accounts, use the DisassociateFromMasterAccount or DisassociateMembers operation.
    */
  def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]
  ): Request[CreateMembersResponse, AWSError] = js.native
  
  /**
    * Declines invitations to become a member account. A prospective member account uses this operation to decline an invitation to become a member. This operation is only called by member accounts that aren't part of an organization. Organization accounts don't receive invitations.
    */
  def declineInvitations(): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Declines invitations to become a member account. A prospective member account uses this operation to decline an invitation to become a member. This operation is only called by member accounts that aren't part of an organization. Organization accounts don't receive invitations.
    */
  def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]
  ): Request[DeclineInvitationsResponse, AWSError] = js.native
  
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target does not affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(): Request[DeleteActionTargetResponse, AWSError] = js.native
  def deleteActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionTargetResponse, Unit]): Request[DeleteActionTargetResponse, AWSError] = js.native
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target does not affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(params: DeleteActionTargetRequest): Request[DeleteActionTargetResponse, AWSError] = js.native
  def deleteActionTarget(
    params: DeleteActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionTargetResponse, Unit]
  ): Request[DeleteActionTargetResponse, AWSError] = js.native
  
  /**
    * Deletes a finding aggregator. When you delete the finding aggregator, you stop finding aggregation. When you stop finding aggregation, findings that were already aggregated to the aggregation Region are still visible from the aggregation Region. New findings and finding updates are not aggregated. 
    */
  def deleteFindingAggregator(): Request[DeleteFindingAggregatorResponse, AWSError] = js.native
  def deleteFindingAggregator(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFindingAggregatorResponse, Unit]): Request[DeleteFindingAggregatorResponse, AWSError] = js.native
  /**
    * Deletes a finding aggregator. When you delete the finding aggregator, you stop finding aggregation. When you stop finding aggregation, findings that were already aggregated to the aggregation Region are still visible from the aggregation Region. New findings and finding updates are not aggregated. 
    */
  def deleteFindingAggregator(params: DeleteFindingAggregatorRequest): Request[DeleteFindingAggregatorResponse, AWSError] = js.native
  def deleteFindingAggregator(
    params: DeleteFindingAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFindingAggregatorResponse, Unit]
  ): Request[DeleteFindingAggregatorResponse, AWSError] = js.native
  
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]): Request[DeleteInsightResponse, AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(
    params: DeleteInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]
  ): Request[DeleteInsightResponse, AWSError] = js.native
  
  /**
    * Deletes invitations received by the Amazon Web Services account to become a member account. A Security Hub administrator account can use this operation to delete invitations sent to one or more member accounts. This operation is only used to delete invitations that are sent to member accounts that aren't part of an organization. Organization accounts don't receive invitations.
    */
  def deleteInvitations(): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes invitations received by the Amazon Web Services account to become a member account. A Security Hub administrator account can use this operation to delete invitations sent to one or more member accounts. This operation is only used to delete invitations that are sent to member accounts that aren't part of an organization. Organization accounts don't receive invitations.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]
  ): Request[DeleteInvitationsResponse, AWSError] = js.native
  
  /**
    * Deletes the specified member accounts from Security Hub. Can be used to delete member accounts that belong to an organization as well as member accounts that were invited manually.
    */
  def deleteMembers(): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Deletes the specified member accounts from Security Hub. Can be used to delete member accounts that belong to an organization as well as member accounts that were invited manually.
    */
  def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]
  ): Request[DeleteMembersResponse, AWSError] = js.native
  
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(): Request[DescribeActionTargetsResponse, AWSError] = js.native
  def describeActionTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionTargetsResponse, Unit]): Request[DescribeActionTargetsResponse, AWSError] = js.native
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(params: DescribeActionTargetsRequest): Request[DescribeActionTargetsResponse, AWSError] = js.native
  def describeActionTargets(
    params: DescribeActionTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionTargetsResponse, Unit]
  ): Request[DescribeActionTargetsResponse, AWSError] = js.native
  
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(): Request[DescribeHubResponse, AWSError] = js.native
  def describeHub(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHubResponse, Unit]): Request[DescribeHubResponse, AWSError] = js.native
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(params: DescribeHubRequest): Request[DescribeHubResponse, AWSError] = js.native
  def describeHub(
    params: DescribeHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHubResponse, Unit]
  ): Request[DescribeHubResponse, AWSError] = js.native
  
  /**
    * Returns information about the Organizations configuration for Security Hub. Can only be called from a Security Hub administrator account.
    */
  def describeOrganizationConfiguration(): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Returns information about the Organizations configuration for Security Hub. Can only be called from a Security Hub administrator account.
    */
  def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    params: DescribeOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns information about product integrations in Security Hub. You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include that integration. If you do not provide an integration ARN, then the results include all of the available product integrations. 
    */
  def describeProducts(): Request[DescribeProductsResponse, AWSError] = js.native
  def describeProducts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductsResponse, Unit]): Request[DescribeProductsResponse, AWSError] = js.native
  /**
    * Returns information about product integrations in Security Hub. You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include that integration. If you do not provide an integration ARN, then the results include all of the available product integrations. 
    */
  def describeProducts(params: DescribeProductsRequest): Request[DescribeProductsResponse, AWSError] = js.native
  def describeProducts(
    params: DescribeProductsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductsResponse, Unit]
  ): Request[DescribeProductsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the available standards in Security Hub. For each standard, the results include the standard ARN, the name, and a description. 
    */
  def describeStandards(): Request[DescribeStandardsResponse, AWSError] = js.native
  def describeStandards(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsResponse, Unit]): Request[DescribeStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of the available standards in Security Hub. For each standard, the results include the standard ARN, the name, and a description. 
    */
  def describeStandards(params: DescribeStandardsRequest): Request[DescribeStandardsResponse, AWSError] = js.native
  def describeStandards(
    params: DescribeStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsResponse, Unit]
  ): Request[DescribeStandardsResponse, AWSError] = js.native
  
  /**
    * Returns a list of security standards controls. For each control, the results include information about whether it is currently enabled, the severity, and a link to remediation information.
    */
  def describeStandardsControls(): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  def describeStandardsControls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsControlsResponse, Unit]): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  /**
    * Returns a list of security standards controls. For each control, the results include information about whether it is currently enabled, the severity, and a link to remediation information.
    */
  def describeStandardsControls(params: DescribeStandardsControlsRequest): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  def describeStandardsControls(
    params: DescribeStandardsControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsControlsResponse, Unit]
  ): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  
  /**
    * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings from that product are no longer sent to Security Hub.
    */
  def disableImportFindingsForProduct(): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  def disableImportFindingsForProduct(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableImportFindingsForProductResponse, Unit]
  ): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings from that product are no longer sent to Security Hub.
    */
  def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  def disableImportFindingsForProduct(
    params: DisableImportFindingsForProductRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableImportFindingsForProductResponse, Unit]
  ): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  
  /**
    * Disables a Security Hub administrator account. Can only be called by the organization management account.
    */
  def disableOrganizationAdminAccount(): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  def disableOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableOrganizationAdminAccountResponse, Unit]
  ): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    * Disables a Security Hub administrator account. Can only be called by the organization management account.
    */
  def disableOrganizationAdminAccount(params: DisableOrganizationAdminAccountRequest): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  def disableOrganizationAdminAccount(
    params: DisableOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableOrganizationAdminAccountResponse, Unit]
  ): Request[DisableOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for an administrator account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your administrator and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(): Request[DisableSecurityHubResponse, AWSError] = js.native
  def disableSecurityHub(callback: js.Function2[/* err */ AWSError, /* data */ DisableSecurityHubResponse, Unit]): Request[DisableSecurityHubResponse, AWSError] = js.native
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for an administrator account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your administrator and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(params: DisableSecurityHubRequest): Request[DisableSecurityHubResponse, AWSError] = js.native
  def disableSecurityHub(
    params: DisableSecurityHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSecurityHubResponse, Unit]
  ): Request[DisableSecurityHubResponse, AWSError] = js.native
  
  /**
    * Disassociates the current Security Hub member account from the associated administrator account. This operation is only used by accounts that are not part of an organization. For organization accounts, only the administrator account can disassociate a member account.
    */
  def disassociateFromAdministratorAccount(): Request[DisassociateFromAdministratorAccountResponse, AWSError] = js.native
  def disassociateFromAdministratorAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromAdministratorAccountResponse, Unit]
  ): Request[DisassociateFromAdministratorAccountResponse, AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from the associated administrator account. This operation is only used by accounts that are not part of an organization. For organization accounts, only the administrator account can disassociate a member account.
    */
  def disassociateFromAdministratorAccount(params: DisassociateFromAdministratorAccountRequest): Request[DisassociateFromAdministratorAccountResponse, AWSError] = js.native
  def disassociateFromAdministratorAccount(
    params: DisassociateFromAdministratorAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromAdministratorAccountResponse, Unit]
  ): Request[DisassociateFromAdministratorAccountResponse, AWSError] = js.native
  
  /**
    * This method is deprecated. Instead, use DisassociateFromAdministratorAccount. The Security Hub console continues to use DisassociateFromMasterAccount. It will eventually change to use DisassociateFromAdministratorAccount. Any IAM policies that specifically control access to this function must continue to use DisassociateFromMasterAccount. You should also add DisassociateFromAdministratorAccount to your policies to ensure that the correct permissions are in place after the console begins to use DisassociateFromAdministratorAccount. Disassociates the current Security Hub member account from the associated administrator account. This operation is only used by accounts that are not part of an organization. For organization accounts, only the administrator account can disassociate a member account.
    */
  def disassociateFromMasterAccount(): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * This method is deprecated. Instead, use DisassociateFromAdministratorAccount. The Security Hub console continues to use DisassociateFromMasterAccount. It will eventually change to use DisassociateFromAdministratorAccount. Any IAM policies that specifically control access to this function must continue to use DisassociateFromMasterAccount. You should also add DisassociateFromAdministratorAccount to your policies to ensure that the correct permissions are in place after the console begins to use DisassociateFromAdministratorAccount. Disassociates the current Security Hub member account from the associated administrator account. This operation is only used by accounts that are not part of an organization. For organization accounts, only the administrator account can disassociate a member account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]
  ): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  
  /**
    * Disassociates the specified member accounts from the associated administrator account. Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited manually.
    */
  def disassociateMembers(): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]): Request[DisassociateMembersResponse, AWSError] = js.native
  /**
    * Disassociates the specified member accounts from the associated administrator account. Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited manually.
    */
  def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(
    params: DisassociateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]
  ): Request[DisassociateMembersResponse, AWSError] = js.native
  
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permissions policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  def enableImportFindingsForProduct(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableImportFindingsForProductResponse, Unit]
  ): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permissions policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  def enableImportFindingsForProduct(
    params: EnableImportFindingsForProductRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableImportFindingsForProductResponse, Unit]
  ): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  
  /**
    * Designates the Security Hub administrator account for an organization. Can only be called by the organization management account.
    */
  def enableOrganizationAdminAccount(): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  def enableOrganizationAdminAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableOrganizationAdminAccountResponse, Unit]
  ): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  /**
    * Designates the Security Hub administrator account for an organization. Can only be called by the organization management account.
    */
  def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  def enableOrganizationAdminAccount(
    params: EnableOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableOrganizationAdminAccountResponse, Unit]
  ): Request[EnableOrganizationAdminAccountResponse, AWSError] = js.native
  
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other services that are integrated with Security Hub. When you use the EnableSecurityHub operation to enable Security Hub, you also automatically enable the following standards:   Center for Internet Security (CIS) Amazon Web Services Foundations Benchmark v1.2.0   Amazon Web Services Foundational Security Best Practices   Other standards are not automatically enabled.  To opt out of automatically enabled standards, set EnableDefaultStandards to false. After you enable Security Hub, to enable a standard, use the BatchEnableStandards operation. To disable a standard, use the BatchDisableStandards operation. To learn more, see the setup information in the Security Hub User Guide.
    */
  def enableSecurityHub(): Request[EnableSecurityHubResponse, AWSError] = js.native
  def enableSecurityHub(callback: js.Function2[/* err */ AWSError, /* data */ EnableSecurityHubResponse, Unit]): Request[EnableSecurityHubResponse, AWSError] = js.native
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other services that are integrated with Security Hub. When you use the EnableSecurityHub operation to enable Security Hub, you also automatically enable the following standards:   Center for Internet Security (CIS) Amazon Web Services Foundations Benchmark v1.2.0   Amazon Web Services Foundational Security Best Practices   Other standards are not automatically enabled.  To opt out of automatically enabled standards, set EnableDefaultStandards to false. After you enable Security Hub, to enable a standard, use the BatchEnableStandards operation. To disable a standard, use the BatchDisableStandards operation. To learn more, see the setup information in the Security Hub User Guide.
    */
  def enableSecurityHub(params: EnableSecurityHubRequest): Request[EnableSecurityHubResponse, AWSError] = js.native
  def enableSecurityHub(
    params: EnableSecurityHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSecurityHubResponse, Unit]
  ): Request[EnableSecurityHubResponse, AWSError] = js.native
  
  /**
    * Provides the details for the Security Hub administrator account for the current member account. Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getAdministratorAccount(): Request[GetAdministratorAccountResponse, AWSError] = js.native
  def getAdministratorAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetAdministratorAccountResponse, Unit]): Request[GetAdministratorAccountResponse, AWSError] = js.native
  /**
    * Provides the details for the Security Hub administrator account for the current member account. Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getAdministratorAccount(params: GetAdministratorAccountRequest): Request[GetAdministratorAccountResponse, AWSError] = js.native
  def getAdministratorAccount(
    params: GetAdministratorAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAdministratorAccountResponse, Unit]
  ): Request[GetAdministratorAccountResponse, AWSError] = js.native
  
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(): Request[GetEnabledStandardsResponse, AWSError] = js.native
  def getEnabledStandards(callback: js.Function2[/* err */ AWSError, /* data */ GetEnabledStandardsResponse, Unit]): Request[GetEnabledStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(params: GetEnabledStandardsRequest): Request[GetEnabledStandardsResponse, AWSError] = js.native
  def getEnabledStandards(
    params: GetEnabledStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnabledStandardsResponse, Unit]
  ): Request[GetEnabledStandardsResponse, AWSError] = js.native
  
  /**
    * Returns the current finding aggregation configuration.
    */
  def getFindingAggregator(): Request[GetFindingAggregatorResponse, AWSError] = js.native
  def getFindingAggregator(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingAggregatorResponse, Unit]): Request[GetFindingAggregatorResponse, AWSError] = js.native
  /**
    * Returns the current finding aggregation configuration.
    */
  def getFindingAggregator(params: GetFindingAggregatorRequest): Request[GetFindingAggregatorResponse, AWSError] = js.native
  def getFindingAggregator(
    params: GetFindingAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingAggregatorResponse, Unit]
  ): Request[GetFindingAggregatorResponse, AWSError] = js.native
  
  /**
    *  Returns history for a Security Hub finding in the last 90 days. The history includes changes made to any fields in the Amazon Web Services Security Finding Format (ASFF). 
    */
  def getFindingHistory(): Request[GetFindingHistoryResponse, AWSError] = js.native
  def getFindingHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingHistoryResponse, Unit]): Request[GetFindingHistoryResponse, AWSError] = js.native
  /**
    *  Returns history for a Security Hub finding in the last 90 days. The history includes changes made to any fields in the Amazon Web Services Security Finding Format (ASFF). 
    */
  def getFindingHistory(params: GetFindingHistoryRequest): Request[GetFindingHistoryResponse, AWSError] = js.native
  def getFindingHistory(
    params: GetFindingHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingHistoryResponse, Unit]
  ): Request[GetFindingHistoryResponse, AWSError] = js.native
  
  /**
    * Returns a list of findings that match the specified criteria. If finding aggregation is enabled, then when you call GetFindings from the aggregation Region, the results include all of the matching findings from both the aggregation Region and the linked Regions.
    */
  def getFindings(): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Returns a list of findings that match the specified criteria. If finding aggregation is enabled, then when you call GetFindings from the aggregation Region, the results include all of the matching findings from both the aggregation Region and the linked Regions.
    */
  def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]
  ): Request[GetFindingsResponse, AWSError] = js.native
  
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(): Request[GetInsightResultsResponse, AWSError] = js.native
  def getInsightResults(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightResultsResponse, Unit]): Request[GetInsightResultsResponse, AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(params: GetInsightResultsRequest): Request[GetInsightResultsResponse, AWSError] = js.native
  def getInsightResults(
    params: GetInsightResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightResultsResponse, Unit]
  ): Request[GetInsightResultsResponse, AWSError] = js.native
  
  /**
    * Lists and describes insights for the specified insight ARNs.
    */
  def getInsights(): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]): Request[GetInsightsResponse, AWSError] = js.native
  /**
    * Lists and describes insights for the specified insight ARNs.
    */
  def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(
    params: GetInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]
  ): Request[GetInsightsResponse, AWSError] = js.native
  
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]
  ): Request[GetInvitationsCountResponse, AWSError] = js.native
  
  /**
    * This method is deprecated. Instead, use GetAdministratorAccount. The Security Hub console continues to use GetMasterAccount. It will eventually change to use GetAdministratorAccount. Any IAM policies that specifically control access to this function must continue to use GetMasterAccount. You should also add GetAdministratorAccount to your policies to ensure that the correct permissions are in place after the console begins to use GetAdministratorAccount. Provides the details for the Security Hub administrator account for the current member account. Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getMasterAccount(): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * This method is deprecated. Instead, use GetAdministratorAccount. The Security Hub console continues to use GetMasterAccount. It will eventually change to use GetAdministratorAccount. Any IAM policies that specifically control access to this function must continue to use GetMasterAccount. You should also add GetAdministratorAccount to your policies to ensure that the correct permissions are in place after the console begins to use GetAdministratorAccount. Provides the details for the Security Hub administrator account for the current member account. Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]
  ): Request[GetMasterAccountResponse, AWSError] = js.native
  
  /**
    * Returns the details for the Security Hub member accounts for the specified account IDs. An administrator account can be either the delegated Security Hub administrator account for an organization or an administrator account that enabled Security Hub manually. The results include both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getMembers(): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Returns the details for the Security Hub member accounts for the specified account IDs. An administrator account can be either the delegated Security Hub administrator account for an organization or an administrator account that enabled Security Hub manually. The results include both member accounts that are managed using Organizations and accounts that were invited manually.
    */
  def getMembers(params: GetMembersRequest): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]
  ): Request[GetMembersResponse, AWSError] = js.native
  
  /**
    * Invites other Amazon Web Services accounts to become member accounts for the Security Hub administrator account that the invitation is sent from. This operation is only used to invite accounts that do not belong to an organization. Organization accounts do not receive invitations. Before you can use this action to invite a member, you must first use the CreateMembers action to create the member account in Security Hub. When the account owner enables Security Hub and accepts the invitation to become a member account, the administrator account can view the findings generated from the member account.
    */
  def inviteMembers(): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]): Request[InviteMembersResponse, AWSError] = js.native
  /**
    * Invites other Amazon Web Services accounts to become member accounts for the Security Hub administrator account that the invitation is sent from. This operation is only used to invite accounts that do not belong to an organization. Organization accounts do not receive invitations. Before you can use this action to invite a member, you must first use the CreateMembers action to create the member account in Security Hub. When the account owner enables Security Hub and accepts the invitation to become a member account, the administrator account can view the findings generated from the member account.
    */
  def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(
    params: InviteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]
  ): Request[InviteMembersResponse, AWSError] = js.native
  
  /**
    * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security Hub.
    */
  def listEnabledProductsForImport(): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  def listEnabledProductsForImport(callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledProductsForImportResponse, Unit]): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security Hub.
    */
  def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  def listEnabledProductsForImport(
    params: ListEnabledProductsForImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledProductsForImportResponse, Unit]
  ): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  
  /**
    * If finding aggregation is enabled, then ListFindingAggregators returns the ARN of the finding aggregator. You can run this operation from any Region.
    */
  def listFindingAggregators(): Request[ListFindingAggregatorsResponse, AWSError] = js.native
  def listFindingAggregators(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingAggregatorsResponse, Unit]): Request[ListFindingAggregatorsResponse, AWSError] = js.native
  /**
    * If finding aggregation is enabled, then ListFindingAggregators returns the ARN of the finding aggregator. You can run this operation from any Region.
    */
  def listFindingAggregators(params: ListFindingAggregatorsRequest): Request[ListFindingAggregatorsResponse, AWSError] = js.native
  def listFindingAggregators(
    params: ListFindingAggregatorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingAggregatorsResponse, Unit]
  ): Request[ListFindingAggregatorsResponse, AWSError] = js.native
  
  /**
    * Lists all Security Hub membership invitations that were sent to the current Amazon Web Services account. This operation is only used by accounts that are managed by invitation. Accounts that are managed using the integration with Organizations do not receive invitations.
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current Amazon Web Services account. This operation is only used by accounts that are managed by invitation. Accounts that are managed using the integration with Organizations do not receive invitations.
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  
  /**
    * Lists details about all member accounts for the current Security Hub administrator account. The results include both member accounts that belong to an organization and member accounts that were invited manually.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub administrator account. The results include both member accounts that belong to an organization and member accounts that were invited manually.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  
  /**
    * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
    */
  def listOrganizationAdminAccounts(): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, Unit]): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  /**
    * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
    */
  def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(
    params: ListOrganizationAdminAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, Unit]
  ): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  
  /**
    *  Lists all of the security controls that apply to a specified standard. 
    */
  def listSecurityControlDefinitions(): Request[ListSecurityControlDefinitionsResponse, AWSError] = js.native
  def listSecurityControlDefinitions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityControlDefinitionsResponse, Unit]
  ): Request[ListSecurityControlDefinitionsResponse, AWSError] = js.native
  /**
    *  Lists all of the security controls that apply to a specified standard. 
    */
  def listSecurityControlDefinitions(params: ListSecurityControlDefinitionsRequest): Request[ListSecurityControlDefinitionsResponse, AWSError] = js.native
  def listSecurityControlDefinitions(
    params: ListSecurityControlDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityControlDefinitionsResponse, Unit]
  ): Request[ListSecurityControlDefinitionsResponse, AWSError] = js.native
  
  /**
    *  Specifies whether a control is currently enabled or disabled in each enabled standard in the calling account. 
    */
  def listStandardsControlAssociations(): Request[ListStandardsControlAssociationsResponse, AWSError] = js.native
  def listStandardsControlAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListStandardsControlAssociationsResponse, Unit]
  ): Request[ListStandardsControlAssociationsResponse, AWSError] = js.native
  /**
    *  Specifies whether a control is currently enabled or disabled in each enabled standard in the calling account. 
    */
  def listStandardsControlAssociations(params: ListStandardsControlAssociationsRequest): Request[ListStandardsControlAssociationsResponse, AWSError] = js.native
  def listStandardsControlAssociations(
    params: ListStandardsControlAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStandardsControlAssociationsResponse, Unit]
  ): Request[ListStandardsControlAssociationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(): Request[UpdateActionTargetResponse, AWSError] = js.native
  def updateActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionTargetResponse, Unit]): Request[UpdateActionTargetResponse, AWSError] = js.native
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(params: UpdateActionTargetRequest): Request[UpdateActionTargetResponse, AWSError] = js.native
  def updateActionTarget(
    params: UpdateActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionTargetResponse, Unit]
  ): Request[UpdateActionTargetResponse, AWSError] = js.native
  
  /**
    * Updates the finding aggregation configuration. Used to update the Region linking mode and the list of included or excluded Regions. You cannot use UpdateFindingAggregator to change the aggregation Region. You must run UpdateFindingAggregator from the current aggregation Region. 
    */
  def updateFindingAggregator(): Request[UpdateFindingAggregatorResponse, AWSError] = js.native
  def updateFindingAggregator(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingAggregatorResponse, Unit]): Request[UpdateFindingAggregatorResponse, AWSError] = js.native
  /**
    * Updates the finding aggregation configuration. Used to update the Region linking mode and the list of included or excluded Regions. You cannot use UpdateFindingAggregator to change the aggregation Region. You must run UpdateFindingAggregator from the current aggregation Region. 
    */
  def updateFindingAggregator(params: UpdateFindingAggregatorRequest): Request[UpdateFindingAggregatorResponse, AWSError] = js.native
  def updateFindingAggregator(
    params: UpdateFindingAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingAggregatorResponse, Unit]
  ): Request[UpdateFindingAggregatorResponse, AWSError] = js.native
  
  /**
    *  UpdateFindings is deprecated. Instead of UpdateFindings, use BatchUpdateFindings. Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(): Request[UpdateFindingsResponse, AWSError] = js.native
  def updateFindings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsResponse, Unit]): Request[UpdateFindingsResponse, AWSError] = js.native
  /**
    *  UpdateFindings is deprecated. Instead of UpdateFindings, use BatchUpdateFindings. Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(params: UpdateFindingsRequest): Request[UpdateFindingsResponse, AWSError] = js.native
  def updateFindings(
    params: UpdateFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsResponse, Unit]
  ): Request[UpdateFindingsResponse, AWSError] = js.native
  
  /**
    * Updates the Security Hub insight identified by the specified insight ARN.
    */
  def updateInsight(): Request[UpdateInsightResponse, AWSError] = js.native
  def updateInsight(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInsightResponse, Unit]): Request[UpdateInsightResponse, AWSError] = js.native
  /**
    * Updates the Security Hub insight identified by the specified insight ARN.
    */
  def updateInsight(params: UpdateInsightRequest): Request[UpdateInsightResponse, AWSError] = js.native
  def updateInsight(
    params: UpdateInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInsightResponse, Unit]
  ): Request[UpdateInsightResponse, AWSError] = js.native
  
  /**
    * Used to update the configuration related to Organizations. Can only be called from a Security Hub administrator account.
    */
  def updateOrganizationConfiguration(): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Used to update the configuration related to Organizations. Can only be called from a Security Hub administrator account.
    */
  def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    params: UpdateOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates configuration options for Security Hub.
    */
  def updateSecurityHubConfiguration(): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  def updateSecurityHubConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityHubConfigurationResponse, Unit]
  ): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  /**
    * Updates configuration options for Security Hub.
    */
  def updateSecurityHubConfiguration(params: UpdateSecurityHubConfigurationRequest): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  def updateSecurityHubConfiguration(
    params: UpdateSecurityHubConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityHubConfigurationResponse, Unit]
  ): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  
  /**
    * Used to control whether an individual security standard control is enabled or disabled.
    */
  def updateStandardsControl(): Request[UpdateStandardsControlResponse, AWSError] = js.native
  def updateStandardsControl(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStandardsControlResponse, Unit]): Request[UpdateStandardsControlResponse, AWSError] = js.native
  /**
    * Used to control whether an individual security standard control is enabled or disabled.
    */
  def updateStandardsControl(params: UpdateStandardsControlRequest): Request[UpdateStandardsControlResponse, AWSError] = js.native
  def updateStandardsControl(
    params: UpdateStandardsControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStandardsControlResponse, Unit]
  ): Request[UpdateStandardsControlResponse, AWSError] = js.native
}
