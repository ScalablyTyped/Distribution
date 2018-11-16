package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Connect: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsConnectMod.ConnectNs.ClientConfiguration = js.native
  /**
     * Creates a new user account in your Amazon Connect instance.
     */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user account in your Amazon Connect instance.
     */
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user account in your Amazon Connect instance.
     */
  def createUser(params: awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user account in your Amazon Connect instance.
     */
  def createUser(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a user account from Amazon Connect.
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user account from Amazon Connect.
     */
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user account from Amazon Connect.
     */
  def deleteUser(params: awsDashSdkLib.clientsConnectMod.ConnectNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user account from Amazon Connect.
     */
  def deleteUser(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Returns a User object that contains information about the user account specified by the UserId.
     */
  def describeUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a User object that contains information about the user account specified by the UserId.
     */
  def describeUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a User object that contains information about the user account specified by the UserId.
     */
  def describeUser(params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a User object that contains information about the user account specified by the UserId.
     */
  def describeUser(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
     */
  def describeUserHierarchyGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
     */
  def describeUserHierarchyGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
     */
  def describeUserHierarchyGroup(params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
     */
  def describeUserHierarchyGroup(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
     */
  def describeUserHierarchyStructure(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
     */
  def describeUserHierarchyStructure(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
     */
  def describeUserHierarchyStructure(params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
     */
  def describeUserHierarchyStructure(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.DescribeUserHierarchyStructureResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
     */
  def getCurrentMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
     */
  def getCurrentMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
     */
  def getCurrentMetricData(params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
     */
  def getCurrentMetricData(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetCurrentMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token for federation.
     */
  def getFederationToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token for federation.
     */
  def getFederationToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token for federation.
     */
  def getFederationToken(params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a token for federation.
     */
  def getFederationToken(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetFederationTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
     */
  def getMetricData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
     */
  def getMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
     */
  def getMetricData(params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
     */
  def getMetricData(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.GetMetricDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
     */
  def listRoutingProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
     */
  def listRoutingProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
     */
  def listRoutingProfiles(params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
     */
  def listRoutingProfiles(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListRoutingProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
     */
  def listSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
     */
  def listSecurityProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
     */
  def listSecurityProfiles(params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
     */
  def listSecurityProfiles(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListSecurityProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
     */
  def listUserHierarchyGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
     */
  def listUserHierarchyGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
     */
  def listUserHierarchyGroups(params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
     */
  def listUserHierarchyGroups(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUserHierarchyGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserSummaryList, which is an array of UserSummary objects.
     */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserSummaryList, which is an array of UserSummary objects.
     */
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserSummaryList, which is an array of UserSummary objects.
     */
  def listUsers(params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a UserSummaryList, which is an array of UserSummary objects.
     */
  def listUsers(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action.
     */
  def startOutboundVoiceContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action.
     */
  def startOutboundVoiceContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action.
     */
  def startOutboundVoiceContact(params: awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action.
     */
  def startOutboundVoiceContact(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StartOutboundVoiceContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
     */
  def stopContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
     */
  def stopContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
     */
  def stopContact(params: awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
     */
  def stopContact(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.StopContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
     */
  def updateContactAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
     */
  def updateContactAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
     */
  def updateContactAttributes(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
     */
  def updateContactAttributes(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateContactAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Assigns the specified hierarchy group to the user.
     */
  def updateUserHierarchy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified hierarchy group to the user.
     */
  def updateUserHierarchy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified hierarchy group to the user.
     */
  def updateUserHierarchy(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserHierarchyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified hierarchy group to the user.
     */
  def updateUserHierarchy(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
     */
  def updateUserIdentityInfo(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
     */
  def updateUserIdentityInfo(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
     */
  def updateUserIdentityInfo(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserIdentityInfoRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
     */
  def updateUserIdentityInfo(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
     */
  def updateUserPhoneConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
     */
  def updateUserPhoneConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
     */
  def updateUserPhoneConfig(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserPhoneConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
     */
  def updateUserPhoneConfig(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified routing profile to a user.
     */
  def updateUserRoutingProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified routing profile to a user.
     */
  def updateUserRoutingProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified routing profile to a user.
     */
  def updateUserRoutingProfile(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserRoutingProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns the specified routing profile to a user.
     */
  def updateUserRoutingProfile(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the security profiles assigned to the user.
     */
  def updateUserSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the security profiles assigned to the user.
     */
  def updateUserSecurityProfiles(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the security profiles assigned to the user.
     */
  def updateUserSecurityProfiles(params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the security profiles assigned to the user.
     */
  def updateUserSecurityProfiles(
    params: awsDashSdkLib.clientsConnectMod.ConnectNs.UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

