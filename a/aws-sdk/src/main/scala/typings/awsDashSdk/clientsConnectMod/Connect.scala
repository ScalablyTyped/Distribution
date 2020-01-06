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
    * Creates a user account for the specified Amazon Connect instance.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user account for the specified Amazon Connect instance.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Deletes a user account from the specified Amazon Connect instance.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user account from the specified Amazon Connect instance.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the specified user account. You can find the instance ID in the console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    params: DescribeUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    params: DescribeUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(
    params: GetContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]
  ): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For more information, see Real-time Metrics Reports in the Amazon Connect Administrator Guide.
    */
  def getCurrentMetricData(): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For more information, see Real-time Metrics Reports in the Amazon Connect Administrator Guide.
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
    * Gets historical metric data from the specified Amazon Connect instance. For more information, see Historical Metrics Reports in the Amazon Connect Administrator Guide.
    */
  def getMetricData(): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * Gets historical metric data from the specified Amazon Connect instance. For more information, see Historical Metrics Reports in the Amazon Connect Administrator Guide.
    */
  def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(
    params: GetMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]
  ): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * Provides information about the contact flows for the specified Amazon Connect instance.
    */
  def listContactFlows(): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]): Request[ListContactFlowsResponse, AWSError] = js.native
  /**
    * Provides information about the contact flows for the specified Amazon Connect instance.
    */
  def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(
    params: ListContactFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]
  ): Request[ListContactFlowsResponse, AWSError] = js.native
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance.
    */
  def listHoursOfOperations(): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance.
    */
  def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(
    params: ListHoursOfOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]
  ): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.
    */
  def listPhoneNumbers(): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]
  ): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Provides information about the queues for the specified Amazon Connect instance.
    */
  def listQueues(): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Provides information about the queues for the specified Amazon Connect instance.
    */
  def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]
  ): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance.
    */
  def listRoutingProfiles(): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance.
    */
  def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(
    params: ListRoutingProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]
  ): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance.
    */
  def listSecurityProfiles(): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]
  ): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
    */
  def listUserHierarchyGroups(): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
    */
  def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(
    params: ListUserHierarchyGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]
  ): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS. 
    */
  def startChatContact(): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]): Request[StartChatContactResponse, AWSError] = js.native
  /**
    * Initiates a contact flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients need to subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS. 
    */
  def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(
    params: StartChatContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]
  ): Request[StartChatContactResponse, AWSError] = js.native
  /**
    * Initiates a contact flow to place an outbound call to a customer. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
    */
  def startOutboundVoiceContact(): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * Initiates a contact flow to place an outbound call to a customer. There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
    */
  def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    params: StartOutboundVoiceContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * Ends the specified contact.
    */
  def stopContact(): Request[StopContactResponse, AWSError] = js.native
  def stopContact(callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]): Request[StopContactResponse, AWSError] = js.native
  /**
    * Ends the specified contact.
    */
  def stopContact(params: StopContactRequest): Request[StopContactResponse, AWSError] = js.native
  def stopContact(
    params: StopContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]
  ): Request[StopContactResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. The supported resource type is users.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. The supported resource type is users.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates the contact attributes associated with the specified contact. You can add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important: You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * Creates or updates the contact attributes associated with the specified contact. You can add or update attributes for both ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called while the call is active, or add notes about steps that the agent took during the call that are displayed to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted.  Important: You cannot use the operation to update attributes for contacts that occurred prior to the release of the API, September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still active in your instance.
    */
  def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(
    params: UpdateContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]
  ): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(
    params: UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user.
    */
  def updateUserIdentityInfo(): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user.
    */
  def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(
    params: UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(
    params: UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(
    params: UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(
    params: UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
}

