package typings.awsDashSdk.clientsWorkmailMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkMail extends Service {
  @JSName("config")
  var config_WorkMail: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  def associateDelegateToResource(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDelegateToResourceResponse, Unit]): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(params: AssociateDelegateToResourceRequest): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  def associateDelegateToResource(
    params: AssociateDelegateToResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDelegateToResourceResponse, Unit]
  ): Request[AssociateDelegateToResourceResponse, AWSError] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  def associateMemberToGroup(callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberToGroupResponse, Unit]): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(params: AssociateMemberToGroupRequest): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  def associateMemberToGroup(
    params: AssociateMemberToGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberToGroupResponse, Unit]
  ): Request[AssociateMemberToGroupResponse, AWSError] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(): Request[CreateAliasResponse, AWSError] = js.native
  def createAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResponse, Unit]): Request[CreateAliasResponse, AWSError] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(params: CreateAliasRequest): Request[CreateAliasResponse, AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAliasResponse, Unit]
  ): Request[CreateAliasResponse, AWSError] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(): Request[CreateResourceResponse, AWSError] = js.native
  def createResource(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceResponse, Unit]): Request[CreateResourceResponse, AWSError] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(params: CreateResourceRequest): Request[CreateResourceResponse, AWSError] = js.native
  def createResource(
    params: CreateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceResponse, Unit]
  ): Request[CreateResourceResponse, AWSError] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(): Request[DeleteAliasResponse, AWSError] = js.native
  def deleteAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAliasResponse, Unit]): Request[DeleteAliasResponse, AWSError] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(params: DeleteAliasRequest): Request[DeleteAliasResponse, AWSError] = js.native
  def deleteAlias(
    params: DeleteAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAliasResponse, Unit]
  ): Request[DeleteAliasResponse, AWSError] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  def deleteMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMailboxPermissionsResponse, Unit]): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  def deleteMailboxPermissions(
    params: DeleteMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMailboxPermissionsResponse, Unit]
  ): Request[DeleteMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(): Request[DeleteResourceResponse, AWSError] = js.native
  def deleteResource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceResponse, Unit]): Request[DeleteResourceResponse, AWSError] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(params: DeleteResourceRequest): Request[DeleteResourceResponse, AWSError] = js.native
  def deleteResource(
    params: DeleteResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceResponse, Unit]
  ): Request[DeleteResourceResponse, AWSError] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  def deregisterFromWorkMail(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterFromWorkMailResponse, Unit]): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  def deregisterFromWorkMail(
    params: DeregisterFromWorkMailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterFromWorkMailResponse, Unit]
  ): Request[DeregisterFromWorkMailResponse, AWSError] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(): Request[DescribeOrganizationResponse, AWSError] = js.native
  def describeOrganization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationResponse, Unit]): Request[DescribeOrganizationResponse, AWSError] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(params: DescribeOrganizationRequest): Request[DescribeOrganizationResponse, AWSError] = js.native
  def describeOrganization(
    params: DescribeOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationResponse, Unit]
  ): Request[DescribeOrganizationResponse, AWSError] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]): Request[DescribeResourceResponse, AWSError] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(
    params: DescribeResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]
  ): Request[DescribeResourceResponse, AWSError] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  def disassociateDelegateFromResource(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDelegateFromResourceResponse, Unit]
  ): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  def disassociateDelegateFromResource(
    params: DisassociateDelegateFromResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDelegateFromResourceResponse, Unit]
  ): Request[DisassociateDelegateFromResourceResponse, AWSError] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  def disassociateMemberFromGroup(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberFromGroupResponse, Unit]): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  def disassociateMemberFromGroup(
    params: DisassociateMemberFromGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberFromGroupResponse, Unit]
  ): Request[DisassociateMemberFromGroupResponse, AWSError] = js.native
  /**
    * Requests a user's mailbox details for a specified organization and user.
    */
  def getMailboxDetails(): Request[GetMailboxDetailsResponse, AWSError] = js.native
  def getMailboxDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetMailboxDetailsResponse, Unit]): Request[GetMailboxDetailsResponse, AWSError] = js.native
  /**
    * Requests a user's mailbox details for a specified organization and user.
    */
  def getMailboxDetails(params: GetMailboxDetailsRequest): Request[GetMailboxDetailsResponse, AWSError] = js.native
  def getMailboxDetails(
    params: GetMailboxDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMailboxDetailsResponse, Unit]
  ): Request[GetMailboxDetailsResponse, AWSError] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]): Request[ListAliasesResponse, AWSError] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse, AWSError] = js.native
  def listAliases(
    params: ListAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAliasesResponse, Unit]
  ): Request[ListAliasesResponse, AWSError] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(): Request[ListGroupMembersResponse, AWSError] = js.native
  def listGroupMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembersResponse, Unit]): Request[ListGroupMembersResponse, AWSError] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(params: ListGroupMembersRequest): Request[ListGroupMembersResponse, AWSError] = js.native
  def listGroupMembers(
    params: ListGroupMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembersResponse, Unit]
  ): Request[ListGroupMembersResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  def listMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxPermissionsResponse, Unit]): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(params: ListMailboxPermissionsRequest): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  def listMailboxPermissions(
    params: ListMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMailboxPermissionsResponse, Unit]
  ): Request[ListMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(): Request[ListOrganizationsResponse, AWSError] = js.native
  def listOrganizations(callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationsResponse, Unit]): Request[ListOrganizationsResponse, AWSError] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(params: ListOrganizationsRequest): Request[ListOrganizationsResponse, AWSError] = js.native
  def listOrganizations(
    params: ListOrganizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOrganizationsResponse, Unit]
  ): Request[ListOrganizationsResponse, AWSError] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(): Request[ListResourceDelegatesResponse, AWSError] = js.native
  def listResourceDelegates(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDelegatesResponse, Unit]): Request[ListResourceDelegatesResponse, AWSError] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(params: ListResourceDelegatesRequest): Request[ListResourceDelegatesResponse, AWSError] = js.native
  def listResourceDelegates(
    params: ListResourceDelegatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceDelegatesResponse, Unit]
  ): Request[ListResourceDelegatesResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  def putMailboxPermissions(callback: js.Function2[/* err */ AWSError, /* data */ PutMailboxPermissionsResponse, Unit]): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(params: PutMailboxPermissionsRequest): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  def putMailboxPermissions(
    params: PutMailboxPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMailboxPermissionsResponse, Unit]
  ): Request[PutMailboxPermissionsResponse, AWSError] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(): Request[RegisterToWorkMailResponse, AWSError] = js.native
  def registerToWorkMail(callback: js.Function2[/* err */ AWSError, /* data */ RegisterToWorkMailResponse, Unit]): Request[RegisterToWorkMailResponse, AWSError] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(params: RegisterToWorkMailRequest): Request[RegisterToWorkMailResponse, AWSError] = js.native
  def registerToWorkMail(
    params: RegisterToWorkMailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterToWorkMailResponse, Unit]
  ): Request[RegisterToWorkMailResponse, AWSError] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(): Request[ResetPasswordResponse, AWSError] = js.native
  def resetPassword(callback: js.Function2[/* err */ AWSError, /* data */ ResetPasswordResponse, Unit]): Request[ResetPasswordResponse, AWSError] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(params: ResetPasswordRequest): Request[ResetPasswordResponse, AWSError] = js.native
  def resetPassword(
    params: ResetPasswordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetPasswordResponse, Unit]
  ): Request[ResetPasswordResponse, AWSError] = js.native
  /**
    * Updates a user's current mailbox quota for a specified organization and user.
    */
  def updateMailboxQuota(): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  def updateMailboxQuota(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMailboxQuotaResponse, Unit]): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  /**
    * Updates a user's current mailbox quota for a specified organization and user.
    */
  def updateMailboxQuota(params: UpdateMailboxQuotaRequest): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  def updateMailboxQuota(
    params: UpdateMailboxQuotaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMailboxQuotaResponse, Unit]
  ): Request[UpdateMailboxQuotaResponse, AWSError] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  def updatePrimaryEmailAddress(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrimaryEmailAddressResponse, Unit]): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  def updatePrimaryEmailAddress(
    params: UpdatePrimaryEmailAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePrimaryEmailAddressResponse, Unit]
  ): Request[UpdatePrimaryEmailAddressResponse, AWSError] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]): Request[UpdateResourceResponse, AWSError] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]
  ): Request[UpdateResourceResponse, AWSError] = js.native
}

