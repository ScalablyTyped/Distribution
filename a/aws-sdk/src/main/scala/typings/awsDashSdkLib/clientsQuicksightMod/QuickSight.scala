package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickSight
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_QuickSight: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ClientConfiguration = js.native
  /**
     * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
     */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
     */
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
     */
  def createGroup(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight create-group --aws-account-id=111122223333 --namespace=default --group-name="Sales-Management" --description="Sales Management - Forecasting"  
     */
  def createGroup(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
     */
  def createGroupMembership(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
     */
  def createGroupMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
     */
  def createGroupMembership(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName. The response is the group member object.  CLI Sample:   aws quicksight create-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales --member-name=Pat  
     */
  def createGroupMembership(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.CreateGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
     */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
     */
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
     */
  def deleteGroup(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user group from Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; .  CLI Sample:   aws quicksight delete-group -\-aws-account-id=111122223333 -\-namespace=default -\-group-name=Sales-Management  
     */
  def deleteGroup(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
     */
  def deleteGroupMembership(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
     */
  def deleteGroupMembership(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
     */
  def deleteGroupMembership(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a user from a group so that the user is no longer a member of the group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The condition resource is the user name. The condition key is quicksight:UserName.  CLI Sample:   aws quicksight delete-group-membership --aws-account-id=111122223333 --namespace=default --group-name=Sales-Management --member-name=Charlie  
     */
  def deleteGroupMembership(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteGroupMembershipResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def deleteUser(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt;  .  CLI Sample:   aws quicksight delete-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def deleteUser(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
     */
  def describeGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
     */
  def describeGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
     */
  def describeGroup(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN).  The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is the group object.   CLI Sample:   aws quicksight describe-group -\-aws-account-id=11112222333 -\-namespace=default -\-group-name=Sales  
     */
  def describeGroup(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def describeUser(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a user, given the user name.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight describe-user --aws-account-id=111122223333 --namespace=default --user-name=Pat  
     */
  def describeUser(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
     */
  def getDashboardEmbedUrl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
     */
  def getDashboardEmbedUrl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
     */
  def getDashboardEmbedUrl(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates a server-side embeddable URL and authorization code. Before this can work properly, first you need to configure the dashboards and user permissions. For more information, see  Embedding Amazon QuickSight Dashboards. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.  CLI Sample:  Assume the role with permissions enabled for actions: quickSight:RegisterUser and quicksight:GetDashboardEmbedURL. You can use assume-role, assume-role-with-web-identity, or assume-role-with-saml.   aws sts assume-role --role-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --role-session-name embeddingsession  If the user does not exist in QuickSight, register the user:  aws quicksight register-user --aws-account-id 111122223333 --namespace default --identity-type IAM --iam-arn "arn:aws:iam::111122223333:role/embedding_quicksight_dashboard_role" --user-role READER --session-name "embeddingsession" --email user123@example.com --region us-east-1  Get the URL for the embedded dashboard  aws quicksight get-dashboard-embed-url --aws-account-id 111122223333 --dashboard-id 1a1ac2b2-3fc3-4b44-5e5d-c6db6778df89 --identity-type IAM 
     */
  def getDashboardEmbedUrl(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.GetDashboardEmbedUrlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroupMemberships(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroupMemberships(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroupMemberships(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists member users in a group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a list of group member objects.  CLI Sample:   aws quicksight list-group-memberships -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroupMemberships(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupMembershipsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroups(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all user groups in Amazon QuickSight.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/ *. The response is a list of group objects.   CLI Sample:   aws quicksight list-groups -\-aws-account-id=111122223333 -\-namespace=default  
     */
  def listGroups(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
     */
  def listUserGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
     */
  def listUserGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
     */
  def listUserGroups(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a one or more group objects.   CLI Sample:   aws quicksight list-user-groups -\-user-name=Pat -\-aws-account-id=111122223333 -\-namespace=default -\-region=us-east-1  
     */
  def listUserGroups(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUserGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
     */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
     */
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
     */
  def listUsers(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the Amazon QuickSight users belonging to this account.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/ * . The response is a list of user objects, containing each user's Amazon Resource Name (ARN), AWS Identity and Access Management (IAM) role, and email address.   CLI Sample:   aws quicksight list-users --aws-account-id=111122223333 --namespace=default  
     */
  def listUsers(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
     */
  def registerUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
     */
  def registerUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
     */
  def registerUser(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request.  The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; . The condition resource is the Amazon Resource Name (ARN) for the IAM user or role, and the session name.  The condition keys are quicksight:IamArn and quicksight:SessionName.   CLI Sample:   aws quicksight register-user -\-aws-account-id=111122223333 -\-namespace=default -\-email=pat@example.com -\-identity-type=IAM -\-user-role=AUTHOR -\-iam-arn=arn:aws:iam::111122223333:user/Pat  
     */
  def registerUser(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.RegisterUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
     */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
     */
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
     */
  def updateGroup(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Changes a group description.  The permissions resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.  CLI Sample:   aws quicksight update-group --aws-account-id=111122223333 --namespace=default --group-name=Sales --description="Sales BI Dashboards"  
     */
  def updateGroup(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
     */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
     */
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
     */
  def updateUser(params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon QuickSight user. The permission resource is arn:aws:quicksight:us-east-1:&lt;aws-account-id&gt;:user/default/&lt;user-name&gt; .  The response is a user object that contains the user's Amazon QuickSight user name, email address, active or inactive status in Amazon QuickSight, Amazon QuickSight role, and Amazon Resource Name (ARN).   CLI Sample:   aws quicksight update-user --user-name=Pat --role=ADMIN --email=new_address@amazon.com --aws-account-id=111122223333 --namespace=default --region=us-east-1  
     */
  def updateUser(
    params: awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsQuicksightMod.QuickSightNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

