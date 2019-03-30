package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkMail
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkMail: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ClientConfiguration = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDelegateToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a member (user or group) to the resource's set of delegates.
    */
  def associateDelegateToResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDelegateToResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateDelegateToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateMemberToGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a member (user or group) to the group's set.
    */
  def associateMemberToGroup(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateMemberToGroup(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.AssociateMemberToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an alias to the set of a given member (user or group) of Amazon WorkMail.
    */
  def createAlias(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a group that can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createGroup(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon WorkMail resource. 
    */
  def createResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a user who can be used in Amazon WorkMail by calling the RegisterToWorkMail operation.
    */
  def createUser(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUser(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove one or more specified aliases from a set of aliases for a given user.
    */
  def deleteAlias(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAlias(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a group from Amazon WorkMail.
    */
  def deleteGroup(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGroup(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes permissions granted to a member (user or group).
    */
  def deleteMailboxPermissions(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMailboxPermissions(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified resource. 
    */
  def deleteResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a user from Amazon WorkMail and all subsequent systems. Before you can delete a user, the user state must be DISABLED. Use the DescribeUser action to confirm the user state. Deleting a user is permanent and cannot be undone. WorkMail archives user mailboxes for 30 days before they are permanently removed.
    */
  def deleteUser(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUser(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterFromWorkMail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Mark a user, group, or resource as no longer used in Amazon WorkMail. This action disassociates the mailbox and schedules it for clean-up. WorkMail keeps mailboxes for 30 days before they are permanently removed. The functionality in the console is Disable.
    */
  def deregisterFromWorkMail(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterFromWorkMail(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DeregisterFromWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data available for the group.
    */
  def describeGroup(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGroup(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrganization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides more information regarding a given organization based on its identifier.
    */
  def describeOrganization(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeOrganization(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeOrganizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the data available for the resource.
    */
  def describeResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information regarding the user.
    */
  def describeUser(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUser(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDelegateFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a member from the resource's set of delegates.
    */
  def disassociateDelegateFromResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDelegateFromResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateDelegateFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateMemberFromGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a member from a group.
    */
  def disassociateMemberFromGroup(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateMemberFromGroup(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.DisassociateMemberFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a paginated call to list the aliases associated with a given entity.
    */
  def listAliases(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroupMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an overview of the members of a group. Users and groups can be members of a group.
    */
  def listGroupMembers(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroupMembers(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's groups.
    */
  def listGroups(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the mailbox permissions associated with a user, group, or resource mailbox.
    */
  def listMailboxPermissions(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMailboxPermissions(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listOrganizations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the customer's non-deleted organizations.
    */
  def listOrganizations(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listOrganizations(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListOrganizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceDelegates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the delegates associated with a resource. Users and groups can be resource delegates and answer requests on behalf of the resource.
    */
  def listResourceDelegates(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceDelegates(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourceDelegatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's resources.
    */
  def listResources(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResources(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns summaries of the organization's users.
    */
  def listUsers(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMailboxPermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets permissions for a user, group, or resource. This replaces any pre-existing permissions.
    */
  def putMailboxPermissions(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putMailboxPermissions(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.PutMailboxPermissionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerToWorkMail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers an existing and disabled user, group, or resource for Amazon WorkMail use by associating a mailbox and calendaring capabilities. It performs no change if the user, group, or resource is enabled and fails if the user, group, or resource is deleted. This operation results in the accumulation of costs. For more information, see Pricing. The equivalent console functionality for this operation is Enable.  Users can either be created by calling the CreateUser API operation or they can be synchronized from your directory. For more information, see DeregisterFromWorkMail.
    */
  def registerToWorkMail(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerToWorkMail(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.RegisterToWorkMailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows the administrator to reset the password for a user.
    */
  def resetPassword(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetPassword(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.ResetPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePrimaryEmailAddress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the primary email for a user, group, or resource. The current email is moved into the list of aliases (or swapped between an existing alias and the current primary email), and the email provided in the input is promoted as the primary.
    */
  def updatePrimaryEmailAddress(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePrimaryEmailAddress(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdatePrimaryEmailAddressResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates data for the resource. To have the latest information, it must be preceded by a DescribeResource call. The dataset in the request should be the one expected when performing another DescribeResource call.
    */
  def updateResource(params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResource(
    params: awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsWorkmailMod.WorkMailNs.UpdateResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

