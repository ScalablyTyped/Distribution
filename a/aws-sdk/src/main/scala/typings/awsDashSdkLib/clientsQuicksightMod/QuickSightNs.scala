package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/quicksight", "QuickSight")
@js.native
object QuickSightNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateGroupMembershipRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The name of the group that you want to add the user to.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The name of the user that you want to add to the group membership.
      */
    var MemberName: GroupMemberName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait CreateGroupMembershipResponse extends js.Object {
    /**
      * The group member.
      */
    var GroupMember: js.UndefOr[GroupMember] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait CreateGroupRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * A description for the group that you want to create.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * A name for the group that you want to create.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait CreateGroupResponse extends js.Object {
    /**
      * The name of the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DeleteGroupMembershipRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The name of the group that you want to delete the user from.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The name of the user that you want to delete from the group membership.
      */
    var MemberName: GroupMemberName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait DeleteGroupMembershipResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DeleteGroupRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The name of the group that you want to delete.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait DeleteGroupResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DeleteUserByPrincipalIdRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * The principal ID of the user.
      */
    var PrincipalId: String
  }
  
  trait DeleteUserByPrincipalIdResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * The name of the user that you want to delete.
      */
    var UserName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UserName
  }
  
  trait DeleteUserResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DescribeGroupRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The name of the group that you want to describe.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait DescribeGroupResponse extends js.Object {
    /**
      * The name of the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait DescribeUserRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * The name of the user that you want to describe.
      */
    var UserName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UserName
  }
  
  trait DescribeUserResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
    /**
      * The user name.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait GetDashboardEmbedUrlRequest extends js.Object {
    /**
      * AWS account ID that contains the dashboard you are embedding.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The ID for the dashboard, also added to IAM policy
      */
    var DashboardId: String
    /**
      * The authentication method the user uses to sign in (IAM only).
      */
    var IdentityType: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.IdentityType
    /**
      * Remove the reset button on embedded dashboard. The default is FALSE, which allows the reset button.
      */
    var ResetDisabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * How many minutes the session is valid. The session lifetime must be between 15 and 600 minutes.
      */
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined
    /**
      * Remove the undo/redo button on embedded dashboard. The default is FALSE, which enables the undo/redo button.
      */
    var UndoRedoDisabled: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait GetDashboardEmbedUrlResponse extends js.Object {
    /**
      * URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5 minutes, and the resulting session is valid for 10 hours. The API provides the URL with an auth_code that enables a single-signon session. 
      */
    var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait Group extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the group.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The group description.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * The name of the group.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
    /**
      * The principal ID of the group.
      */
    var PrincipalId: js.UndefOr[String] = js.undefined
  }
  
  trait GroupMember extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the group member (user).
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the group member (user).
      */
    var MemberName: js.UndefOr[GroupMemberName] = js.undefined
  }
  
  trait ListGroupMembershipsRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The name of the group that you want to see a membership list of.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The maximum number of results to return from this request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListGroupMembershipsResponse extends js.Object {
    /**
      * The list of the members of the group.
      */
    var GroupMemberList: js.UndefOr[GroupMemberList] = js.undefined
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait ListGroupsRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The maximum number of results to return.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListGroupsResponse extends js.Object {
    /**
      * The list of the groups.
      */
    var GroupList: js.UndefOr[GroupList] = js.undefined
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait ListUserGroupsRequest extends js.Object {
    /**
      * The AWS Account ID that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The maximum number of results to return from this request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The Amazon QuickSight user name that you want to list group memberships for.
      */
    var UserName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UserName
  }
  
  trait ListUserGroupsResponse extends js.Object {
    /**
      * The list of groups the user is a member of.
      */
    var GroupList: js.UndefOr[GroupList] = js.undefined
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The HTTP status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The maximum number of results to return from this request.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * A pagination token that can be used in a subsequent request.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
    /**
      * The list of users.
      */
    var UserList: js.UndefOr[UserList] = js.undefined
  }
  
  trait RegisterUserRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The email address of the user that you want to register.
      */
    var Email: String
    /**
      * The ARN of the IAM user or role that you are registering with Amazon QuickSight. 
      */
    var IamArn: js.UndefOr[String] = js.undefined
    /**
      * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:    IAM: A user whose identity maps to an existing IAM user or role.     QUICKSIGHT: A user whose identity is owned and managed internally by Amazon QuickSight.   
      */
    var IdentityType: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.IdentityType
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * The name of the session with the assumed IAM role. By using this parameter, you can register multiple users with the same IAM role, provided that each has a different session name. For more information on assuming IAM roles, see  assume-role  in the AWS CLI Reference. 
      */
    var SessionName: js.UndefOr[RoleSessionName] = js.undefined
    /**
      * The Amazon QuickSight user name that you want to create for the user you are registering.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
    /**
      * The Amazon QuickSight role of the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, data sets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.  
      */
    var UserRole: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UserRole
  }
  
  trait RegisterUserResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
    /**
      * The user name.
      */
    var User: js.UndefOr[User] = js.undefined
    /**
      * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
      */
    var UserInvitationUrl: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
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
      * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
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
      * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
      */
    def createGroupMembership(): awsDashSdkLib.libRequestMod.Request[CreateGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroupMembership(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupMembershipResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
      */
    def createGroupMembership(params: CreateGroupMembershipRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGroupMembership(
      params: CreateGroupMembershipRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGroupMembershipResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
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
      * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
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
      * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
      */
    def deleteGroupMembership(): awsDashSdkLib.libRequestMod.Request[DeleteGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroupMembership(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupMembershipResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
      */
    def deleteGroupMembership(params: DeleteGroupMembershipRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGroupMembership(
      params: DeleteGroupMembershipRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGroupMembershipResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGroupMembershipResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
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
      * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
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
      * Deletes a user after locating the user by its principal ID.
      */
    def deleteUserByPrincipalId(): awsDashSdkLib.libRequestMod.Request[DeleteUserByPrincipalIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserByPrincipalId(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserByPrincipalIdResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserByPrincipalIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user after locating the user by its principal ID.
      */
    def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserByPrincipalIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUserByPrincipalId(
      params: DeleteUserByPrincipalIdRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserByPrincipalIdResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserByPrincipalIdResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
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
      * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
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
      * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
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
      * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
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
      * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
      */
    def getDashboardEmbedUrl(): awsDashSdkLib.libRequestMod.Request[GetDashboardEmbedUrlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDashboardEmbedUrl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDashboardEmbedUrlResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDashboardEmbedUrlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
      */
    def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): awsDashSdkLib.libRequestMod.Request[GetDashboardEmbedUrlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDashboardEmbedUrl(
      params: GetDashboardEmbedUrlRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDashboardEmbedUrlResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDashboardEmbedUrlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
      */
    def listGroupMemberships(): awsDashSdkLib.libRequestMod.Request[ListGroupMembershipsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupMemberships(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupMembershipsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupMembershipsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
      */
    def listGroupMemberships(params: ListGroupMembershipsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupMembershipsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGroupMemberships(
      params: ListGroupMembershipsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGroupMembershipsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGroupMembershipsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
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
      * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
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
      * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
      */
    def listUserGroups(): awsDashSdkLib.libRequestMod.Request[ListUserGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
      */
    def listUserGroups(params: ListUserGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListUserGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUserGroups(
      params: ListUserGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUserGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUserGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
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
      * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
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
      * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
      */
    def registerUser(): awsDashSdkLib.libRequestMod.Request[RegisterUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
      */
    def registerUser(params: RegisterUserRequest): awsDashSdkLib.libRequestMod.Request[RegisterUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerUser(
      params: RegisterUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
      */
    def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
      */
    def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGroup(
      params: UpdateGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
      */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
      */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateGroupRequest extends js.Object {
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The description for the group that you want to update.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * The name of the group that you want to update.
      */
    var GroupName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GroupName
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
  }
  
  trait UpdateGroupResponse extends js.Object {
    /**
      * The name of the group.
      */
    var Group: js.UndefOr[Group] = js.undefined
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
  }
  
  trait UpdateUserRequest extends js.Object {
    /**
      * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.AwsAccountId
    /**
      * The email address of the user that you want to update.
      */
    var Email: String
    /**
      * The namespace. Currently, you should set this to default.
      */
    var Namespace: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.Namespace
    /**
      * The Amazon QuickSight role of the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, data sets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.  
      */
    var Role: UserRole
    /**
      * The Amazon QuickSight user name that you want to update.
      */
    var UserName: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UserName
  }
  
  trait UpdateUserResponse extends js.Object {
    /**
      * The AWS request ID for this operation.
      */
    var RequestId: js.UndefOr[String] = js.undefined
    /**
      * The http status of the request.
      */
    var Status: js.UndefOr[StatusCode] = js.undefined
    /**
      * The Amazon QuickSight user.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait User extends js.Object {
    /**
      * Active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an AD user, that user is inactive until they sign in and provide a password
      */
    var Active: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the user.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The user's email address.
      */
    var Email: js.UndefOr[String] = js.undefined
    /**
      * The type of identity authentication used by the user.
      */
    var IdentityType: js.UndefOr[IdentityType] = js.undefined
    /**
      * The principal ID of the user.
      */
    var PrincipalId: js.UndefOr[String] = js.undefined
    /**
      * The Amazon QuickSight role for the user.
      */
    var Role: js.UndefOr[UserRole] = js.undefined
    /**
      * The user's user name.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
  }
  
  trait _IdentityType extends js.Object
  
  trait _UserRole extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type AwsAccountId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EmbeddingUrl = java.lang.String
  type GroupDescription = java.lang.String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = java.lang.String
  type GroupName = java.lang.String
  type IdentityType = _IdentityType | java.lang.String
  type MaxResults = scala.Double
  type Namespace = java.lang.String
  type RoleSessionName = java.lang.String
  type SessionLifetimeInMinutes = scala.Double
  type StatusCode = scala.Double
  type String = java.lang.String
  type UserList = js.Array[User]
  type UserName = java.lang.String
  type UserRole = _UserRole | java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

