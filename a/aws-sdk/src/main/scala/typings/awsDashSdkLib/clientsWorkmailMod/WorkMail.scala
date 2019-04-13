package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkMail
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkMail: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDelegateToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDelegateToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(params: AssociateDelegateToResourceRequest): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateDelegateToResource(
    params: AssociateDelegateToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateDelegateToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateDelegateToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateMemberToGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateMemberToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(params: AssociateMemberToGroupRequest): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateMemberToGroup(
    params: AssociateMemberToGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateMemberToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateMemberToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAlias(
    params: CreateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(params: CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResource(
    params: CreateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(params: DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlias(
    params: DeleteAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMailboxPermissions(
    params: DeleteMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(params: DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResource(
    params: DeleteResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterFromWorkMail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterFromWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(params: DeregisterFromWorkMailRequest): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterFromWorkMail(
    params: DeregisterFromWorkMailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterFromWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterFromWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(params: DescribeGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(params: DescribeOrganizationRequest): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeOrganization(
    params: DescribeOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeOrganizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(params: DescribeResourceRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResource(
    params: DescribeResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDelegateFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDelegateFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateDelegateFromResource(
    params: DisassociateDelegateFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateDelegateFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateDelegateFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMemberFromGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMemberFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMemberFromGroup(
    params: DisassociateMemberFromGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMemberFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMemberFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(params: ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAliases(
    params: ListAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(params: ListGroupMembersRequest): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupMembers(
    params: ListGroupMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(params: ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(params: ListMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMailboxPermissions(
    params: ListMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(params: ListOrganizationsRequest): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOrganizations(
    params: ListOrganizationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOrganizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOrganizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDelegates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDelegatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(params: ListResourceDelegatesRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDelegates(
    params: ListResourceDelegatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDelegatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDelegatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(params: ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(params: PutMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putMailboxPermissions(
    params: PutMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutMailboxPermissionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerToWorkMail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterToWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(params: RegisterToWorkMailRequest): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerToWorkMail(
    params: RegisterToWorkMailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterToWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterToWorkMailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(params: ResetPasswordRequest): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetPassword(
    params: ResetPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePrimaryEmailAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePrimaryEmailAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePrimaryEmailAddress(
    params: UpdatePrimaryEmailAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePrimaryEmailAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePrimaryEmailAddressResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(params: UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

