package typings.awsDashSdk.clientsQuicksightMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickSight extends Service {
  @JSName("config")
  var config_QuickSight: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
    */
  def createGroupMembership(): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
    */
  def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(
    params: CreateGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]
  ): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
    */
  def deleteGroupMembership(): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
    */
  def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(
    params: DeleteGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]
  ): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS  
    */
  def deleteUserByPrincipalId(): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user-by-principal-id --aws-account-id=111122223333 --namespace=default --principal-id=ABCDEFJA26JLI7EUUOEHS  
    */
  def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(
    params: DeleteUserByPrincipalIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]
  ): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
    */
  def getDashboardEmbedUrl(): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
    */
  def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(
    params: GetDashboardEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]
  ): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
    */
  def listGroupMemberships(): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
    */
  def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(
    params: ListGroupMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]
  ): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
    */
  def listUserGroups(): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
    */
  def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(
    params: ListUserGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]
  ): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
    */
  def registerUser(): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
    */
  def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(
    params: RegisterUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]
  ): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}

