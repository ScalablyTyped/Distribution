package typings.awsSdk.clientsDetectiveMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detective extends Service {
  
  /**
    * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be called by an invited member account.  The request provides the ARN of behavior graph. The member account status in the graph must be INVITED.
    */
  def acceptInvitation(): Request[js.Object, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be called by an invited member account.  The request provides the ARN of behavior graph. The member account status in the graph must be INVITED.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[js.Object, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets data source package information for the behavior graph.
    */
  def batchGetGraphMemberDatasources(): Request[BatchGetGraphMemberDatasourcesResponse, AWSError] = js.native
  def batchGetGraphMemberDatasources(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetGraphMemberDatasourcesResponse, Unit]
  ): Request[BatchGetGraphMemberDatasourcesResponse, AWSError] = js.native
  /**
    * Gets data source package information for the behavior graph.
    */
  def batchGetGraphMemberDatasources(params: BatchGetGraphMemberDatasourcesRequest): Request[BatchGetGraphMemberDatasourcesResponse, AWSError] = js.native
  def batchGetGraphMemberDatasources(
    params: BatchGetGraphMemberDatasourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetGraphMemberDatasourcesResponse, Unit]
  ): Request[BatchGetGraphMemberDatasourcesResponse, AWSError] = js.native
  
  /**
    * Gets information on the data source package history for an account.
    */
  def batchGetMembershipDatasources(): Request[BatchGetMembershipDatasourcesResponse, AWSError] = js.native
  def batchGetMembershipDatasources(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetMembershipDatasourcesResponse, Unit]): Request[BatchGetMembershipDatasourcesResponse, AWSError] = js.native
  /**
    * Gets information on the data source package history for an account.
    */
  def batchGetMembershipDatasources(params: BatchGetMembershipDatasourcesRequest): Request[BatchGetMembershipDatasourcesResponse, AWSError] = js.native
  def batchGetMembershipDatasources(
    params: BatchGetMembershipDatasourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetMembershipDatasourcesResponse, Unit]
  ): Request[BatchGetMembershipDatasourcesResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Detective: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This operation is called by the account that is enabling Detective. Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within the Detective quota. If it exceeds the quota, then you cannot enable Detective.  The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN of the new behavior graph.  CreateGraph triggers a process to create the corresponding data tables for the new behavior graph. An account can only be the administrator account for one behavior graph within a Region. If the same account calls CreateGraph with the same administrator account, it always returns the same behavior graph ARN. It does not create a new behavior graph.
    */
  def createGraph(): Request[CreateGraphResponse, AWSError] = js.native
  def createGraph(callback: js.Function2[/* err */ AWSError, /* data */ CreateGraphResponse, Unit]): Request[CreateGraphResponse, AWSError] = js.native
  /**
    * Creates a new behavior graph for the calling account, and sets that account as the administrator account. This operation is called by the account that is enabling Detective. Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within the Detective quota. If it exceeds the quota, then you cannot enable Detective.  The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN of the new behavior graph.  CreateGraph triggers a process to create the corresponding data tables for the new behavior graph. An account can only be the administrator account for one behavior graph within a Region. If the same account calls CreateGraph with the same administrator account, it always returns the same behavior graph ARN. It does not create a new behavior graph.
    */
  def createGraph(params: CreateGraphRequest): Request[CreateGraphResponse, AWSError] = js.native
  def createGraph(
    params: CreateGraphRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGraphResponse, Unit]
  ): Request[CreateGraphResponse, AWSError] = js.native
  
  /**
    *  CreateMembers is used to send invitations to accounts. For the organization behavior graph, the Detective administrator account uses CreateMembers to enable organization accounts as member accounts. For invited accounts, CreateMembers sends a request to invite the specified Amazon Web Services accounts to be member accounts in the behavior graph. This operation can only be called by the administrator account for a behavior graph.   CreateMembers verifies the accounts and then invites the verified accounts. The administrator can optionally specify to not send invitation emails to the member accounts. This would be used when the administrator manages their member accounts centrally. For organization accounts in the organization behavior graph, CreateMembers attempts to enable the accounts. The organization accounts do not receive invitations. The request provides the behavior graph ARN and the list of accounts to invite or to enable. The response separates the requested accounts into two lists:   The accounts that CreateMembers was able to process. For invited accounts, includes member accounts that are being verified, that have passed verification and are to be invited, and that have failed verification. For organization accounts in the organization behavior graph, includes accounts that can be enabled and that cannot be enabled.   The accounts that CreateMembers was unable to process. This list includes accounts that were already invited to be member accounts in the behavior graph.  
    */
  def createMembers(): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]): Request[CreateMembersResponse, AWSError] = js.native
  /**
    *  CreateMembers is used to send invitations to accounts. For the organization behavior graph, the Detective administrator account uses CreateMembers to enable organization accounts as member accounts. For invited accounts, CreateMembers sends a request to invite the specified Amazon Web Services accounts to be member accounts in the behavior graph. This operation can only be called by the administrator account for a behavior graph.   CreateMembers verifies the accounts and then invites the verified accounts. The administrator can optionally specify to not send invitation emails to the member accounts. This would be used when the administrator manages their member accounts centrally. For organization accounts in the organization behavior graph, CreateMembers attempts to enable the accounts. The organization accounts do not receive invitations. The request provides the behavior graph ARN and the list of accounts to invite or to enable. The response separates the requested accounts into two lists:   The accounts that CreateMembers was able to process. For invited accounts, includes member accounts that are being verified, that have passed verification and are to be invited, and that have failed verification. For organization accounts in the organization behavior graph, includes accounts that can be enabled and that cannot be enabled.   The accounts that CreateMembers was unable to process. This list includes accounts that were already invited to be member accounts in the behavior graph.  
    */
  def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]
  ): Request[CreateMembersResponse, AWSError] = js.native
  
  /**
    * Disables the specified behavior graph and queues it to be deleted. This operation removes the behavior graph from each member account's list of behavior graphs.  DeleteGraph can only be called by the administrator account for a behavior graph.
    */
  def deleteGraph(): Request[js.Object, AWSError] = js.native
  def deleteGraph(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables the specified behavior graph and queues it to be deleted. This operation removes the behavior graph from each member account's list of behavior graphs.  DeleteGraph can only be called by the administrator account for a behavior graph.
    */
  def deleteGraph(params: DeleteGraphRequest): Request[js.Object, AWSError] = js.native
  def deleteGraph(params: DeleteGraphRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified member accounts from the behavior graph. The removed accounts no longer contribute data to the behavior graph. This operation can only be called by the administrator account for the behavior graph. For invited accounts, the removed accounts are deleted from the list of accounts in the behavior graph. To restore the account, the administrator account must send another invitation. For organization accounts in the organization behavior graph, the Detective administrator account can always enable the organization account again. Organization accounts that are not enabled as member accounts are not included in the ListMembers results for the organization behavior graph. An administrator account cannot use DeleteMembers to remove their own account from the behavior graph. To disable a behavior graph, the administrator account uses the DeleteGraph API method.
    */
  def deleteMembers(): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Removes the specified member accounts from the behavior graph. The removed accounts no longer contribute data to the behavior graph. This operation can only be called by the administrator account for the behavior graph. For invited accounts, the removed accounts are deleted from the list of accounts in the behavior graph. To restore the account, the administrator account must send another invitation. For organization accounts in the organization behavior graph, the Detective administrator account can always enable the organization account again. Organization accounts that are not enabled as member accounts are not included in the ListMembers results for the organization behavior graph. An administrator account cannot use DeleteMembers to remove their own account from the behavior graph. To disable a behavior graph, the administrator account uses the DeleteGraph API method.
    */
  def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]
  ): Request[DeleteMembersResponse, AWSError] = js.native
  
  /**
    * Returns information about the configuration for the organization behavior graph. Currently indicates whether to automatically enable new organization accounts as member accounts. Can only be called by the Detective administrator account for the organization. 
    */
  def describeOrganizationConfiguration(): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Returns information about the configuration for the organization behavior graph. Currently indicates whether to automatically enable new organization accounts as member accounts. Can only be called by the Detective administrator account for the organization. 
    */
  def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    params: DescribeOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  
  /**
    * Removes the Detective administrator account in the current Region. Deletes the organization behavior graph. Can only be called by the organization management account. Removing the Detective administrator account does not affect the delegated administrator account for Detective in Organizations. To remove the delegated administrator account in Organizations, use the Organizations API. Removing the delegated administrator account also removes the Detective administrator account in all Regions, except for Regions where the Detective administrator account is the organization management account.
    */
  def disableOrganizationAdminAccount(): Request[js.Object, AWSError] = js.native
  def disableOrganizationAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the member account from the specified behavior graph. This operation can only be called by an invited member account that has the ENABLED status.  DisassociateMembership cannot be called by an organization account in the organization behavior graph. For the organization behavior graph, the Detective administrator account determines which organization accounts to enable or disable as member accounts.
    */
  def disassociateMembership(): Request[js.Object, AWSError] = js.native
  def disassociateMembership(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the member account from the specified behavior graph. This operation can only be called by an invited member account that has the ENABLED status.  DisassociateMembership cannot be called by an organization account in the organization behavior graph. For the organization behavior graph, the Detective administrator account determines which organization accounts to enable or disable as member accounts.
    */
  def disassociateMembership(params: DisassociateMembershipRequest): Request[js.Object, AWSError] = js.native
  def disassociateMembership(
    params: DisassociateMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Designates the Detective administrator account for the organization in the current Region. If the account does not have Detective enabled, then enables Detective for that account and creates a new behavior graph. Can only be called by the organization management account. If the organization has a delegated administrator account in Organizations, then the Detective administrator account must be either the delegated administrator account or the organization management account. If the organization does not have a delegated administrator account in Organizations, then you can choose any account in the organization. If you choose an account other than the organization management account, Detective calls Organizations to make that account the delegated administrator account for Detective. The organization management account cannot be the delegated administrator account.
    */
  def enableOrganizationAdminAccount(): Request[js.Object, AWSError] = js.native
  def enableOrganizationAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Designates the Detective administrator account for the organization in the current Region. If the account does not have Detective enabled, then enables Detective for that account and creates a new behavior graph. Can only be called by the organization management account. If the organization has a delegated administrator account in Organizations, then the Detective administrator account must be either the delegated administrator account or the organization management account. If the organization does not have a delegated administrator account in Organizations, then you can choose any account in the organization. If you choose an account other than the organization management account, Detective calls Organizations to make that account the delegated administrator account for Detective. The organization management account cannot be the delegated administrator account.
    */
  def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[js.Object, AWSError] = js.native
  def enableOrganizationAdminAccount(
    params: EnableOrganizationAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns the membership details for specified member accounts for a behavior graph.
    */
  def getMembers(): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Returns the membership details for specified member accounts for a behavior graph.
    */
  def getMembers(params: GetMembersRequest): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]
  ): Request[GetMembersResponse, AWSError] = js.native
  
  /**
    * Lists data source packages in the behavior graph.
    */
  def listDatasourcePackages(): Request[ListDatasourcePackagesResponse, AWSError] = js.native
  def listDatasourcePackages(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasourcePackagesResponse, Unit]): Request[ListDatasourcePackagesResponse, AWSError] = js.native
  /**
    * Lists data source packages in the behavior graph.
    */
  def listDatasourcePackages(params: ListDatasourcePackagesRequest): Request[ListDatasourcePackagesResponse, AWSError] = js.native
  def listDatasourcePackages(
    params: ListDatasourcePackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasourcePackagesResponse, Unit]
  ): Request[ListDatasourcePackagesResponse, AWSError] = js.native
  
  /**
    * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can only be called by an administrator account. Because an account can currently only be the administrator of one behavior graph within a Region, the results always contain a single behavior graph.
    */
  def listGraphs(): Request[ListGraphsResponse, AWSError] = js.native
  def listGraphs(callback: js.Function2[/* err */ AWSError, /* data */ ListGraphsResponse, Unit]): Request[ListGraphsResponse, AWSError] = js.native
  /**
    * Returns the list of behavior graphs that the calling account is an administrator account of. This operation can only be called by an administrator account. Because an account can currently only be the administrator of one behavior graph within a Region, the results always contain a single behavior graph.
    */
  def listGraphs(params: ListGraphsRequest): Request[ListGraphsResponse, AWSError] = js.native
  def listGraphs(
    params: ListGraphsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGraphsResponse, Unit]
  ): Request[ListGraphsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can only be called by an invited member account. Open invitations are invitations that the member account has not responded to. The results do not include behavior graphs for which the member account declined the invitation. The results also do not include behavior graphs that the member account resigned from or was removed from.
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can only be called by an invited member account. Open invitations are invitations that the member account has not responded to. The results do not include behavior graphs for which the member account declined the invitation. The results also do not include behavior graphs that the member account resigned from or was removed from.
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of member accounts for a behavior graph. For invited accounts, the results do not include member accounts that were removed from the behavior graph. For the organization behavior graph, the results do not include organization accounts that the Detective administrator account has not enabled as member accounts.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Retrieves the list of member accounts for a behavior graph. For invited accounts, the results do not include member accounts that were removed from the behavior graph. For the organization behavior graph, the results do not include organization accounts that the Detective administrator account has not enabled as member accounts.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  
  /**
    * Returns information about the Detective administrator account for an organization. Can only be called by the organization management account.
    */
  def listOrganizationAdminAccounts(): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, Unit]): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  /**
    * Returns information about the Detective administrator account for an organization. Can only be called by the organization management account.
    */
  def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  def listOrganizationAdminAccounts(
    params: ListOrganizationAdminAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationAdminAccountsResponse, Unit]
  ): Request[ListOrganizationAdminAccountsResponse, AWSError] = js.native
  
  /**
    * Returns the tag values that are assigned to a behavior graph.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns the tag values that are assigned to a behavior graph.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by an invited member account that has the INVITED status.  RejectInvitation cannot be called by an organization account in the organization behavior graph. In the organization behavior graph, organization accounts do not receive an invitation.
    */
  def rejectInvitation(): Request[js.Object, AWSError] = js.native
  def rejectInvitation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by an invited member account that has the INVITED status.  RejectInvitation cannot be called by an organization account in the organization behavior graph. In the organization behavior graph, organization accounts do not receive an invitation.
    */
  def rejectInvitation(params: RejectInvitationRequest): Request[js.Object, AWSError] = js.native
  def rejectInvitation(
    params: RejectInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sends a request to enable data ingest for a member account that has a status of ACCEPTED_BUT_DISABLED. For valid member accounts, the status is updated as follows.   If Detective enabled the member account, then the new status is ENABLED.   If Detective cannot enable the member account, the status remains ACCEPTED_BUT_DISABLED.   
    */
  def startMonitoringMember(): Request[js.Object, AWSError] = js.native
  def startMonitoringMember(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sends a request to enable data ingest for a member account that has a status of ACCEPTED_BUT_DISABLED. For valid member accounts, the status is updated as follows.   If Detective enabled the member account, then the new status is ENABLED.   If Detective cannot enable the member account, the status remains ACCEPTED_BUT_DISABLED.   
    */
  def startMonitoringMember(params: StartMonitoringMemberRequest): Request[js.Object, AWSError] = js.native
  def startMonitoringMember(
    params: StartMonitoringMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Applies tag values to a behavior graph.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies tag values to a behavior graph.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a behavior graph.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a behavior graph.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Starts a data source packages for the behavior graph.
    */
  def updateDatasourcePackages(): Request[js.Object, AWSError] = js.native
  def updateDatasourcePackages(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a data source packages for the behavior graph.
    */
  def updateDatasourcePackages(params: UpdateDatasourcePackagesRequest): Request[js.Object, AWSError] = js.native
  def updateDatasourcePackages(
    params: UpdateDatasourcePackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the configuration for the Organizations integration in the current Region. Can only be called by the Detective administrator account for the organization.
    */
  def updateOrganizationConfiguration(): Request[js.Object, AWSError] = js.native
  def updateOrganizationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the configuration for the Organizations integration in the current Region. Can only be called by the Detective administrator account for the organization.
    */
  def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[js.Object, AWSError] = js.native
  def updateOrganizationConfiguration(
    params: UpdateOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
