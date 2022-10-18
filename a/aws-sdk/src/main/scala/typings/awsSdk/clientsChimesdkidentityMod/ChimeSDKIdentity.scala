package typings.awsSdk.clientsChimesdkidentityMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChimeSDKIdentity extends Service {
  
  @JSName("config")
  var config_ChimeSDKIdentity: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon Chime SDK messaging AppInstance under an AWS account. Only SDK messaging customers use this API. CreateAppInstance supports idempotency behavior as described in the AWS API Standard. identity
    */
  def createAppInstance(): Request[CreateAppInstanceResponse, AWSError] = js.native
  def createAppInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceResponse, Unit]): Request[CreateAppInstanceResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime SDK messaging AppInstance under an AWS account. Only SDK messaging customers use this API. CreateAppInstance supports idempotency behavior as described in the AWS API Standard. identity
    */
  def createAppInstance(params: CreateAppInstanceRequest): Request[CreateAppInstanceResponse, AWSError] = js.native
  def createAppInstance(
    params: CreateAppInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceResponse, Unit]
  ): Request[CreateAppInstanceResponse, AWSError] = js.native
  
  /**
    * Promotes an AppInstanceUser to an AppInstanceAdmin. The promoted user can perform the following actions.     ChannelModerator actions across all channels in the AppInstance.    DeleteChannelMessage actions.   Only an AppInstanceUser can be promoted to an AppInstanceAdmin role.
    */
  def createAppInstanceAdmin(): Request[CreateAppInstanceAdminResponse, AWSError] = js.native
  def createAppInstanceAdmin(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceAdminResponse, Unit]): Request[CreateAppInstanceAdminResponse, AWSError] = js.native
  /**
    * Promotes an AppInstanceUser to an AppInstanceAdmin. The promoted user can perform the following actions.     ChannelModerator actions across all channels in the AppInstance.    DeleteChannelMessage actions.   Only an AppInstanceUser can be promoted to an AppInstanceAdmin role.
    */
  def createAppInstanceAdmin(params: CreateAppInstanceAdminRequest): Request[CreateAppInstanceAdminResponse, AWSError] = js.native
  def createAppInstanceAdmin(
    params: CreateAppInstanceAdminRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceAdminResponse, Unit]
  ): Request[CreateAppInstanceAdminResponse, AWSError] = js.native
  
  /**
    * Creates a user under an Amazon Chime AppInstance. The request consists of a unique appInstanceUserId and Name for that user.
    */
  def createAppInstanceUser(): Request[CreateAppInstanceUserResponse, AWSError] = js.native
  def createAppInstanceUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceUserResponse, Unit]): Request[CreateAppInstanceUserResponse, AWSError] = js.native
  /**
    * Creates a user under an Amazon Chime AppInstance. The request consists of a unique appInstanceUserId and Name for that user.
    */
  def createAppInstanceUser(params: CreateAppInstanceUserRequest): Request[CreateAppInstanceUserResponse, AWSError] = js.native
  def createAppInstanceUser(
    params: CreateAppInstanceUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppInstanceUserResponse, Unit]
  ): Request[CreateAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Deletes an AppInstance and all associated data asynchronously.
    */
  def deleteAppInstance(): Request[js.Object, AWSError] = js.native
  def deleteAppInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AppInstance and all associated data asynchronously.
    */
  def deleteAppInstance(params: DeleteAppInstanceRequest): Request[js.Object, AWSError] = js.native
  def deleteAppInstance(
    params: DeleteAppInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Demotes an AppInstanceAdmin to an AppInstanceUser. This action does not delete the user.
    */
  def deleteAppInstanceAdmin(): Request[js.Object, AWSError] = js.native
  def deleteAppInstanceAdmin(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Demotes an AppInstanceAdmin to an AppInstanceUser. This action does not delete the user.
    */
  def deleteAppInstanceAdmin(params: DeleteAppInstanceAdminRequest): Request[js.Object, AWSError] = js.native
  def deleteAppInstanceAdmin(
    params: DeleteAppInstanceAdminRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an AppInstanceUser.
    */
  def deleteAppInstanceUser(): Request[js.Object, AWSError] = js.native
  def deleteAppInstanceUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AppInstanceUser.
    */
  def deleteAppInstanceUser(params: DeleteAppInstanceUserRequest): Request[js.Object, AWSError] = js.native
  def deleteAppInstanceUser(
    params: DeleteAppInstanceUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregisters an AppInstanceUserEndpoint.
    */
  def deregisterAppInstanceUserEndpoint(): Request[js.Object, AWSError] = js.native
  def deregisterAppInstanceUserEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters an AppInstanceUserEndpoint.
    */
  def deregisterAppInstanceUserEndpoint(params: DeregisterAppInstanceUserEndpointRequest): Request[js.Object, AWSError] = js.native
  def deregisterAppInstanceUserEndpoint(
    params: DeregisterAppInstanceUserEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns the full details of an AppInstance.
    */
  def describeAppInstance(): Request[DescribeAppInstanceResponse, AWSError] = js.native
  def describeAppInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceResponse, Unit]): Request[DescribeAppInstanceResponse, AWSError] = js.native
  /**
    * Returns the full details of an AppInstance.
    */
  def describeAppInstance(params: DescribeAppInstanceRequest): Request[DescribeAppInstanceResponse, AWSError] = js.native
  def describeAppInstance(
    params: DescribeAppInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceResponse, Unit]
  ): Request[DescribeAppInstanceResponse, AWSError] = js.native
  
  /**
    * Returns the full details of an AppInstanceAdmin.
    */
  def describeAppInstanceAdmin(): Request[DescribeAppInstanceAdminResponse, AWSError] = js.native
  def describeAppInstanceAdmin(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceAdminResponse, Unit]): Request[DescribeAppInstanceAdminResponse, AWSError] = js.native
  /**
    * Returns the full details of an AppInstanceAdmin.
    */
  def describeAppInstanceAdmin(params: DescribeAppInstanceAdminRequest): Request[DescribeAppInstanceAdminResponse, AWSError] = js.native
  def describeAppInstanceAdmin(
    params: DescribeAppInstanceAdminRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceAdminResponse, Unit]
  ): Request[DescribeAppInstanceAdminResponse, AWSError] = js.native
  
  /**
    * Returns the full details of an AppInstanceUser.
    */
  def describeAppInstanceUser(): Request[DescribeAppInstanceUserResponse, AWSError] = js.native
  def describeAppInstanceUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceUserResponse, Unit]): Request[DescribeAppInstanceUserResponse, AWSError] = js.native
  /**
    * Returns the full details of an AppInstanceUser.
    */
  def describeAppInstanceUser(params: DescribeAppInstanceUserRequest): Request[DescribeAppInstanceUserResponse, AWSError] = js.native
  def describeAppInstanceUser(
    params: DescribeAppInstanceUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceUserResponse, Unit]
  ): Request[DescribeAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Returns the full details of an AppInstanceUserEndpoint.
    */
  def describeAppInstanceUserEndpoint(): Request[DescribeAppInstanceUserEndpointResponse, AWSError] = js.native
  def describeAppInstanceUserEndpoint(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceUserEndpointResponse, Unit]
  ): Request[DescribeAppInstanceUserEndpointResponse, AWSError] = js.native
  /**
    * Returns the full details of an AppInstanceUserEndpoint.
    */
  def describeAppInstanceUserEndpoint(params: DescribeAppInstanceUserEndpointRequest): Request[DescribeAppInstanceUserEndpointResponse, AWSError] = js.native
  def describeAppInstanceUserEndpoint(
    params: DescribeAppInstanceUserEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppInstanceUserEndpointResponse, Unit]
  ): Request[DescribeAppInstanceUserEndpointResponse, AWSError] = js.native
  
  /**
    * Gets the retention settings for an AppInstance.
    */
  def getAppInstanceRetentionSettings(): Request[GetAppInstanceRetentionSettingsResponse, AWSError] = js.native
  def getAppInstanceRetentionSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppInstanceRetentionSettingsResponse, Unit]
  ): Request[GetAppInstanceRetentionSettingsResponse, AWSError] = js.native
  /**
    * Gets the retention settings for an AppInstance.
    */
  def getAppInstanceRetentionSettings(params: GetAppInstanceRetentionSettingsRequest): Request[GetAppInstanceRetentionSettingsResponse, AWSError] = js.native
  def getAppInstanceRetentionSettings(
    params: GetAppInstanceRetentionSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppInstanceRetentionSettingsResponse, Unit]
  ): Request[GetAppInstanceRetentionSettingsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the administrators in the AppInstance.
    */
  def listAppInstanceAdmins(): Request[ListAppInstanceAdminsResponse, AWSError] = js.native
  def listAppInstanceAdmins(callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceAdminsResponse, Unit]): Request[ListAppInstanceAdminsResponse, AWSError] = js.native
  /**
    * Returns a list of the administrators in the AppInstance.
    */
  def listAppInstanceAdmins(params: ListAppInstanceAdminsRequest): Request[ListAppInstanceAdminsResponse, AWSError] = js.native
  def listAppInstanceAdmins(
    params: ListAppInstanceAdminsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceAdminsResponse, Unit]
  ): Request[ListAppInstanceAdminsResponse, AWSError] = js.native
  
  /**
    * Lists all the AppInstanceUserEndpoints created under a single AppInstanceUser.
    */
  def listAppInstanceUserEndpoints(): Request[ListAppInstanceUserEndpointsResponse, AWSError] = js.native
  def listAppInstanceUserEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceUserEndpointsResponse, Unit]): Request[ListAppInstanceUserEndpointsResponse, AWSError] = js.native
  /**
    * Lists all the AppInstanceUserEndpoints created under a single AppInstanceUser.
    */
  def listAppInstanceUserEndpoints(params: ListAppInstanceUserEndpointsRequest): Request[ListAppInstanceUserEndpointsResponse, AWSError] = js.native
  def listAppInstanceUserEndpoints(
    params: ListAppInstanceUserEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceUserEndpointsResponse, Unit]
  ): Request[ListAppInstanceUserEndpointsResponse, AWSError] = js.native
  
  /**
    * List all AppInstanceUsers created under a single AppInstance.
    */
  def listAppInstanceUsers(): Request[ListAppInstanceUsersResponse, AWSError] = js.native
  def listAppInstanceUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceUsersResponse, Unit]): Request[ListAppInstanceUsersResponse, AWSError] = js.native
  /**
    * List all AppInstanceUsers created under a single AppInstance.
    */
  def listAppInstanceUsers(params: ListAppInstanceUsersRequest): Request[ListAppInstanceUsersResponse, AWSError] = js.native
  def listAppInstanceUsers(
    params: ListAppInstanceUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstanceUsersResponse, Unit]
  ): Request[ListAppInstanceUsersResponse, AWSError] = js.native
  
  /**
    * Lists all Amazon Chime AppInstances created under a single AWS account.
    */
  def listAppInstances(): Request[ListAppInstancesResponse, AWSError] = js.native
  def listAppInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstancesResponse, Unit]): Request[ListAppInstancesResponse, AWSError] = js.native
  /**
    * Lists all Amazon Chime AppInstances created under a single AWS account.
    */
  def listAppInstances(params: ListAppInstancesRequest): Request[ListAppInstancesResponse, AWSError] = js.native
  def listAppInstances(
    params: ListAppInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppInstancesResponse, Unit]
  ): Request[ListAppInstancesResponse, AWSError] = js.native
  
  /**
    * Lists the tags applied to an Amazon Chime SDK identity resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags applied to an Amazon Chime SDK identity resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sets the amount of time in days that a given AppInstance retains data.
    */
  def putAppInstanceRetentionSettings(): Request[PutAppInstanceRetentionSettingsResponse, AWSError] = js.native
  def putAppInstanceRetentionSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppInstanceRetentionSettingsResponse, Unit]
  ): Request[PutAppInstanceRetentionSettingsResponse, AWSError] = js.native
  /**
    * Sets the amount of time in days that a given AppInstance retains data.
    */
  def putAppInstanceRetentionSettings(params: PutAppInstanceRetentionSettingsRequest): Request[PutAppInstanceRetentionSettingsResponse, AWSError] = js.native
  def putAppInstanceRetentionSettings(
    params: PutAppInstanceRetentionSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppInstanceRetentionSettingsResponse, Unit]
  ): Request[PutAppInstanceRetentionSettingsResponse, AWSError] = js.native
  
  /**
    * Registers an endpoint under an Amazon Chime AppInstanceUser. The endpoint receives messages for a user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a user.
    */
  def registerAppInstanceUserEndpoint(): Request[RegisterAppInstanceUserEndpointResponse, AWSError] = js.native
  def registerAppInstanceUserEndpoint(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterAppInstanceUserEndpointResponse, Unit]
  ): Request[RegisterAppInstanceUserEndpointResponse, AWSError] = js.native
  /**
    * Registers an endpoint under an Amazon Chime AppInstanceUser. The endpoint receives messages for a user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a user.
    */
  def registerAppInstanceUserEndpoint(params: RegisterAppInstanceUserEndpointRequest): Request[RegisterAppInstanceUserEndpointResponse, AWSError] = js.native
  def registerAppInstanceUserEndpoint(
    params: RegisterAppInstanceUserEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterAppInstanceUserEndpointResponse, Unit]
  ): Request[RegisterAppInstanceUserEndpointResponse, AWSError] = js.native
  
  /**
    * Applies the specified tags to the specified Amazon Chime SDK identity resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Applies the specified tags to the specified Amazon Chime SDK identity resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified Amazon Chime SDK identity resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified Amazon Chime SDK identity resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates AppInstance metadata.
    */
  def updateAppInstance(): Request[UpdateAppInstanceResponse, AWSError] = js.native
  def updateAppInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceResponse, Unit]): Request[UpdateAppInstanceResponse, AWSError] = js.native
  /**
    * Updates AppInstance metadata.
    */
  def updateAppInstance(params: UpdateAppInstanceRequest): Request[UpdateAppInstanceResponse, AWSError] = js.native
  def updateAppInstance(
    params: UpdateAppInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceResponse, Unit]
  ): Request[UpdateAppInstanceResponse, AWSError] = js.native
  
  /**
    * Updates the details of an AppInstanceUser. You can update names and metadata.
    */
  def updateAppInstanceUser(): Request[UpdateAppInstanceUserResponse, AWSError] = js.native
  def updateAppInstanceUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceUserResponse, Unit]): Request[UpdateAppInstanceUserResponse, AWSError] = js.native
  /**
    * Updates the details of an AppInstanceUser. You can update names and metadata.
    */
  def updateAppInstanceUser(params: UpdateAppInstanceUserRequest): Request[UpdateAppInstanceUserResponse, AWSError] = js.native
  def updateAppInstanceUser(
    params: UpdateAppInstanceUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceUserResponse, Unit]
  ): Request[UpdateAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Updates the details of an AppInstanceUserEndpoint. You can update the name and AllowMessage values.
    */
  def updateAppInstanceUserEndpoint(): Request[UpdateAppInstanceUserEndpointResponse, AWSError] = js.native
  def updateAppInstanceUserEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceUserEndpointResponse, Unit]): Request[UpdateAppInstanceUserEndpointResponse, AWSError] = js.native
  /**
    * Updates the details of an AppInstanceUserEndpoint. You can update the name and AllowMessage values.
    */
  def updateAppInstanceUserEndpoint(params: UpdateAppInstanceUserEndpointRequest): Request[UpdateAppInstanceUserEndpointResponse, AWSError] = js.native
  def updateAppInstanceUserEndpoint(
    params: UpdateAppInstanceUserEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppInstanceUserEndpointResponse, Unit]
  ): Request[UpdateAppInstanceUserEndpointResponse, AWSError] = js.native
}
