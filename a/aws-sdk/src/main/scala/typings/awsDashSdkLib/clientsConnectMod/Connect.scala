package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Connect: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new user account in your Amazon Connect instance.
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
    * Creates a new user account in your Amazon Connect instance.
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
    * Deletes a user account from Amazon Connect.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user account from Amazon Connect.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a User object that contains information about the user account specified by the UserId.
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
    * Returns a User object that contains information about the user account specified by the UserId.
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
    * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
    */
  def describeUserHierarchyGroup(): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserHierarchyGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserHierarchyGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
    */
  def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserHierarchyGroup(
    params: DescribeUserHierarchyGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserHierarchyGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
    */
  def describeUserHierarchyStructure(): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserHierarchyStructure(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserHierarchyStructureResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
    */
  def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserHierarchyStructure(
    params: DescribeUserHierarchyStructureRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserHierarchyStructureResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserHierarchyStructureResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the contact attributes associated with a contact.
    */
  def getContactAttributes(): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getContactAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the contact attributes associated with a contact.
    */
  def getContactAttributes(params: GetContactAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getContactAttributes(
    params: GetContactAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
    */
  def getCurrentMetricData(): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCurrentMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCurrentMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
    */
  def getCurrentMetricData(params: GetCurrentMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCurrentMetricData(
    params: GetCurrentMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCurrentMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCurrentMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFederationToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFederationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(params: GetFederationTokenRequest): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFederationToken(
    params: GetFederationTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFederationTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFederationTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
    */
  def getMetricData(): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMetricData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
    */
  def getMetricData(params: GetMetricDataRequest): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMetricData(
    params: GetMetricDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMetricDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMetricDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
    */
  def listRoutingProfiles(): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoutingProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRoutingProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
    */
  def listRoutingProfiles(params: ListRoutingProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRoutingProfiles(
    params: ListRoutingProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRoutingProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRoutingProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
    */
  def listSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSecurityProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSecurityProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
    */
  def listUserHierarchyGroups(): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserHierarchyGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserHierarchyGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
    */
  def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserHierarchyGroups(
    params: ListUserHierarchyGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserHierarchyGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserHierarchyGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a UserSummaryList, which is an array of UserSummary objects.
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
    * Returns a UserSummaryList, which is an array of UserSummary objects.
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
    * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
    */
  def startOutboundVoiceContact(): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOutboundVoiceContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOutboundVoiceContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
    */
  def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startOutboundVoiceContact(
    params: StartOutboundVoiceContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartOutboundVoiceContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartOutboundVoiceContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
    */
  def stopContact(): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
    */
  def stopContact(params: StopContactRequest): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopContact(
    params: StopContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateContactAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(params: UpdateContactAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateContactAttributes(
    params: UpdateContactAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateContactAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateContactAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the user.
    */
  def updateUserHierarchy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserHierarchy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the user.
    */
  def updateUserHierarchy(params: UpdateUserHierarchyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserHierarchy(
    params: UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
    */
  def updateUserIdentityInfo(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserIdentityInfo(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
    */
  def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserIdentityInfo(
    params: UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
    */
  def updateUserPhoneConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPhoneConfig(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
    */
  def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPhoneConfig(
    params: UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns the specified routing profile to a user.
    */
  def updateUserRoutingProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserRoutingProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns the specified routing profile to a user.
    */
  def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserRoutingProfile(
    params: UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the security profiles assigned to the user.
    */
  def updateUserSecurityProfiles(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserSecurityProfiles(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the security profiles assigned to the user.
    */
  def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserSecurityProfiles(
    params: UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

