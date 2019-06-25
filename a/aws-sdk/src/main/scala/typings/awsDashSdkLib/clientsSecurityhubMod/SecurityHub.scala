package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityHub
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SecurityHub: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub master account that the invitation was sent from. When the member account accepts the invitation, permission is granted to the master account to view findings generated in the member account.
    */
  def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub master account that the invitation was sent from. When the member account accepts the invitation, permission is granted to the master account to view findings generated in the member account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Standards Supported in AWS Security Hub.
    */
  def batchDisableStandards(): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Standards Supported in AWS Security Hub.
    */
  def batchDisableStandards(params: BatchDisableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisableStandards(
    params: BatchDisableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the standards specified by the provided standardsArn. In this release, only CIS AWS Foundations standards are supported. For more information, see Standards Supported in AWS Security Hub.
    */
  def batchEnableStandards(): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchEnableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the standards specified by the provided standardsArn. In this release, only CIS AWS Foundations standards are supported. For more information, see Standards Supported in AWS Security Hub.
    */
  def batchEnableStandards(params: BatchEnableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchEnableStandards(
    params: BatchEnableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub. This action is requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
    */
  def batchImportFindings(): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchImportFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub. This action is requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
    */
  def batchImportFindings(params: BatchImportFindingsRequest): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchImportFindings(
    params: BatchImportFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(): awsDashSdkLib.libRequestMod.Request[CreateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createActionTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(params: CreateActionTargetRequest): awsDashSdkLib.libRequestMod.Request[CreateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createActionTarget(
    params: CreateActionTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. Use the GroupByAttribute to group the related findings in the insight.
    */
  def createInsight(): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. Use the GroupByAttribute to group the related findings in the insight.
    */
  def createInsight(params: CreateInsightRequest): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInsight(
    params: CreateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the master account. To successfully create a member, you must use this action from an account that already has Security Hub enabled. You can use the EnableSecurityHub to enable Security Hub. After you use CreateMembers to create member account associations in Security Hub, you need to use the InviteMembers action, which invites the accounts to enable Security Hub and become member accounts in Security Hub. If the invitation is accepted by the account owner, the account becomes a member account in Security Hub, and a permission policy is added that permits the master account to view the findings generated in the member account. When Security Hub is enabled in the invited account, findings start being sent to both the member and master accounts. You can remove the association between the master and member accounts by using the DisassociateFromMasterAccount or DisassociateMembers operation.
    */
  def createMembers(): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the master account. To successfully create a member, you must use this action from an account that already has Security Hub enabled. You can use the EnableSecurityHub to enable Security Hub. After you use CreateMembers to create member account associations in Security Hub, you need to use the InviteMembers action, which invites the accounts to enable Security Hub and become member accounts in Security Hub. If the invitation is accepted by the account owner, the account becomes a member account in Security Hub, and a permission policy is added that permits the master account to view the findings generated in the member account. When Security Hub is enabled in the invited account, findings start being sent to both the member and master accounts. You can remove the association between the master and member accounts by using the DisassociateFromMasterAccount or DisassociateMembers operation.
    */
  def createMembers(params: CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines invitations to become a member account.
    */
  def declineInvitations(): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines invitations to become a member account.
    */
  def declineInvitations(params: DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target doesn't affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(): awsDashSdkLib.libRequestMod.Request[DeleteActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteActionTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target doesn't affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(params: DeleteActionTargetRequest): awsDashSdkLib.libRequestMod.Request[DeleteActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteActionTarget(
    params: DeleteActionTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(params: DeleteInsightRequest): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInsight(
    params: DeleteInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes invitations received by the AWS account to become a member account.
    */
  def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes invitations received by the AWS account to become a member account.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified member accounts from Security Hub.
    */
  def deleteMembers(): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified member accounts from Security Hub.
    */
  def deleteMembers(params: DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(): awsDashSdkLib.libRequestMod.Request[DescribeActionTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActionTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActionTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActionTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(params: DescribeActionTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeActionTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActionTargets(
    params: DescribeActionTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActionTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActionTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(): awsDashSdkLib.libRequestMod.Request[DescribeHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(params: DescribeHubRequest): awsDashSdkLib.libRequestMod.Request[DescribeHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHub(
    params: DescribeHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the products available that you can subscribe to and integrate with Security Hub to consolidate findings.
    */
  def describeProducts(): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the products available that you can subscribe to and integrate with Security Hub to consolidate findings.
    */
  def describeProducts(params: DescribeProductsRequest): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProducts(
    params: DescribeProductsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the integration of the specified product with Security Hub. Findings from that product are no longer sent to Security Hub after the integration is disabled.
    */
  def disableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the integration of the specified product with Security Hub. Findings from that product are no longer sent to Security Hub after the integration is disabled.
    */
  def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableImportFindingsForProduct(
    params: DisableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a master account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and can't be recovered. Any standards that were enabled are disabled, and your master and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a master account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and can't be recovered. Any standards that were enabled are disabled, and your master and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(params: DisableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSecurityHub(
    params: DisableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from the associated master account.
    */
  def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFromMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from the associated master account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified member accounts from the associated master account.
    */
  def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified member accounts from the associated master account.
    */
  def disassociateMembers(params: DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMembers(
    params: DisassociateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permission policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permission policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableImportFindingsForProduct(
    params: EnableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from AWS Config, Amazon GuardDuty, Amazon Inspector, and Amazon Macie. To learn more, see Setting Up AWS Security Hub.
    */
  def enableSecurityHub(): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from AWS Config, Amazon GuardDuty, Amazon Inspector, and Amazon Macie. To learn more, see Setting Up AWS Security Hub.
    */
  def enableSecurityHub(params: EnableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSecurityHub(
    params: EnableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEnabledStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(params: GetEnabledStandardsRequest): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEnabledStandards(
    params: GetEnabledStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of findings that match the specified criteria.
    */
  def getFindings(): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of findings that match the specified criteria.
    */
  def getFindings(params: GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight that the insight ARN specifies.
    */
  def getInsightResults(): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsightResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight that the insight ARN specifies.
    */
  def getInsightResults(params: GetInsightResultsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsightResults(
    params: GetInsightResultsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes insights that insight ARNs specify.
    */
  def getInsights(): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsights(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes insights that insight ARNs specify.
    */
  def getInsights(params: GetInsightsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsights(
    params: GetInsightsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvitationsCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides the details for the Security Hub master account to the current member account. 
    */
  def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides the details for the Security Hub master account to the current member account. 
    */
  def getMasterAccount(params: GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details on the Security Hub member accounts that the account IDs specify.
    */
  def getMembers(): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details on the Security Hub member accounts that the account IDs specify.
    */
  def getMembers(params: GetMembersRequest): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is sent from. Before you can use this action to invite a member, you must first create the member account in Security Hub by using the CreateMembers action. When the account owner accepts the invitation to become a member account and enables Security Hub, the master account can view the findings generated from member account.
    */
  def inviteMembers(): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is sent from. Before you can use this action to invite a member, you must first create the member account in Security Hub by using the CreateMembers action. When the account owner accepts the invitation to become a member account and enables Security Hub, the master account can view the findings generated from member account.
    */
  def inviteMembers(params: InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteMembers(
    params: InviteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.
    */
  def listEnabledProductsForImport(): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnabledProductsForImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.
    */
  def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnabledProductsForImport(
    params: ListEnabledProductsForImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(params: ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(params: ListMembersRequest): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(): awsDashSdkLib.libRequestMod.Request[UpdateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateActionTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(params: UpdateActionTargetRequest): awsDashSdkLib.libRequestMod.Request[UpdateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateActionTarget(
    params: UpdateActionTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateActionTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateActionTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(params: UpdateFindingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindings(
    params: UpdateFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Security Hub insight that the insight ARN specifies.
    */
  def updateInsight(): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Security Hub insight that the insight ARN specifies.
    */
  def updateInsight(params: UpdateInsightRequest): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInsight(
    params: UpdateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

