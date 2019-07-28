package typings.awsDashSdk.clientsConnectMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect extends Service {
  @JSName("config")
  var config_Connect: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new user account in your Amazon Connect instance.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a new user account in your Amazon Connect instance.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Deletes a user account from Amazon Connect.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user account from Amazon Connect.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns a User object that contains information about the user account specified by the UserId.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns a User object that contains information about the user account specified by the UserId.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
    */
  def describeUserHierarchyGroup(): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Returns a HierarchyGroup object that includes information about a hierarchy group in your instance.
    */
  def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    params: DescribeUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
    */
  def describeUserHierarchyStructure(): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Returns a HiearchyGroupStructure object, which contains data about the levels in the agent hierarchy.
    */
  def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    params: DescribeUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes associated with a contact.
    */
  def getContactAttributes(): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes associated with a contact.
    */
  def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(
    params: GetContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]
  ): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
    */
  def getCurrentMetricData(): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  /**
    * The GetCurrentMetricData operation retrieves current metric data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetCurrentMetricData action.
    */
  def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(
    params: GetCurrentMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]
  ): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]): Request[GetFederationTokenResponse, AWSError] = js.native
  /**
    * Retrieves a token for federation.
    */
  def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(
    params: GetFederationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]
  ): Request[GetFederationTokenResponse, AWSError] = js.native
  /**
    * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
    */
  def getMetricData(): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * The GetMetricData operation retrieves historical metrics data from your Amazon Connect instance. If you are using an IAM account, it must have permission to the connect:GetMetricData action.
    */
  def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(
    params: GetMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]
  ): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
    */
  def listRoutingProfiles(): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Returns an array of RoutingProfileSummary objects that includes information about the routing profiles in your instance.
    */
  def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(
    params: ListRoutingProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]
  ): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
    */
  def listSecurityProfiles(): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your instance, including the ARN, Id, and Name of the security profile.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]
  ): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
    */
  def listUserHierarchyGroups(): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Returns a UserHierarchyGroupSummaryList, which is an array of HierarchyGroupSummary objects that contain information about the hierarchy groups in your instance.
    */
  def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(
    params: ListUserHierarchyGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]
  ): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Returns a UserSummaryList, which is an array of UserSummary objects.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a UserSummaryList, which is an array of UserSummary objects.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
    */
  def startOutboundVoiceContact(): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * The StartOutboundVoiceContact operation initiates a contact flow to place an outbound call to a customer. If you are using an IAM account, it must have permission to the connect:StartOutboundVoiceContact action. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call fails.
    */
  def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    params: StartOutboundVoiceContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
    */
  def stopContact(): Request[StopContactResponse, AWSError] = js.native
  def stopContact(callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]): Request[StopContactResponse, AWSError] = js.native
  /**
    * Ends the contact initiated by the StartOutboundVoiceContact operation. If you are using an IAM account, it must have permission to the connect:StopContact action.
    */
  def stopContact(params: StopContactRequest): Request[StopContactResponse, AWSError] = js.native
  def stopContact(
    params: StopContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]
  ): Request[StopContactResponse, AWSError] = js.native
  /**
    * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * The UpdateContactAttributes operation lets you programmatically create new, or update existing, contact attributes associated with a contact. You can use the operation to add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also use the UpdateContactAttributes operation to update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important:  You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(
    params: UpdateContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]
  ): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the user.
    */
  def updateUserHierarchy(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the user.
    */
  def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(
    params: UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
    */
  def updateUserIdentityInfo(): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user in a UserIdentityInfo object, including email, first name, and last name.
    */
  def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(
    params: UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
    */
  def updateUserPhoneConfig(): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings in the UserPhoneConfig object for the specified user.
    */
  def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(
    params: UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to a user.
    */
  def updateUserRoutingProfile(): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to a user.
    */
  def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(
    params: UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the security profiles assigned to the user.
    */
  def updateUserSecurityProfiles(): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the security profiles assigned to the user.
    */
  def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(
    params: UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
}

