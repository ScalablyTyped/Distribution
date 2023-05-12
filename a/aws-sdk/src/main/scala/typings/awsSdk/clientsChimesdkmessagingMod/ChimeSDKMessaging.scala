package typings.awsSdk.clientsChimesdkmessagingMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChimeSDKMessaging extends Service {
  
  /**
    * Associates a channel flow with a channel. Once associated, all messages to that channel go through channel flow processors. To stop processing, use the DisassociateChannelFlow API.  Only administrators or channel moderators can associate a channel flow. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def associateChannelFlow(): Request[js.Object, AWSError] = js.native
  def associateChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a channel flow with a channel. Once associated, all messages to that channel go through channel flow processors. To stop processing, use the DisassociateChannelFlow API.  Only administrators or channel moderators can associate a channel flow. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def associateChannelFlow(params: AssociateChannelFlowRequest): Request[js.Object, AWSError] = js.native
  def associateChannelFlow(
    params: AssociateChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds a specified number of users and bots to a channel. 
    */
  def batchCreateChannelMembership(): Request[BatchCreateChannelMembershipResponse, AWSError] = js.native
  def batchCreateChannelMembership(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateChannelMembershipResponse, Unit]): Request[BatchCreateChannelMembershipResponse, AWSError] = js.native
  /**
    * Adds a specified number of users and bots to a channel. 
    */
  def batchCreateChannelMembership(params: BatchCreateChannelMembershipRequest): Request[BatchCreateChannelMembershipResponse, AWSError] = js.native
  def batchCreateChannelMembership(
    params: BatchCreateChannelMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateChannelMembershipResponse, Unit]
  ): Request[BatchCreateChannelMembershipResponse, AWSError] = js.native
  
  /**
    * Calls back Chime SDK Messaging with a processing response message. This should be invoked from the processor Lambda. This is a developer API. You can return one of the following processing responses:   Update message content or metadata   Deny a message   Make no changes to the message  
    */
  def channelFlowCallback(): Request[ChannelFlowCallbackResponse, AWSError] = js.native
  def channelFlowCallback(callback: js.Function2[/* err */ AWSError, /* data */ ChannelFlowCallbackResponse, Unit]): Request[ChannelFlowCallbackResponse, AWSError] = js.native
  /**
    * Calls back Chime SDK Messaging with a processing response message. This should be invoked from the processor Lambda. This is a developer API. You can return one of the following processing responses:   Update message content or metadata   Deny a message   Make no changes to the message  
    */
  def channelFlowCallback(params: ChannelFlowCallbackRequest): Request[ChannelFlowCallbackResponse, AWSError] = js.native
  def channelFlowCallback(
    params: ChannelFlowCallbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ChannelFlowCallbackResponse, Unit]
  ): Request[ChannelFlowCallbackResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ChimeSDKMessaging: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a channel to which you can add users and send messages.  Restriction: You can't change a channel's privacy.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a channel to which you can add users and send messages.  Restriction: You can't change a channel's privacy.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  
  /**
    * Permanently bans a member from a channel. Moderators can't add banned members to a channel. To undo a ban, you first have to DeleteChannelBan, and then CreateChannelMembership. Bans are cleaned up when you delete users or channels. If you ban a user who is already part of a channel, that user is automatically kicked from the channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannelBan(): Request[CreateChannelBanResponse, AWSError] = js.native
  def createChannelBan(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelBanResponse, Unit]): Request[CreateChannelBanResponse, AWSError] = js.native
  /**
    * Permanently bans a member from a channel. Moderators can't add banned members to a channel. To undo a ban, you first have to DeleteChannelBan, and then CreateChannelMembership. Bans are cleaned up when you delete users or channels. If you ban a user who is already part of a channel, that user is automatically kicked from the channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannelBan(params: CreateChannelBanRequest): Request[CreateChannelBanResponse, AWSError] = js.native
  def createChannelBan(
    params: CreateChannelBanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelBanResponse, Unit]
  ): Request[CreateChannelBanResponse, AWSError] = js.native
  
  /**
    * Creates a channel flow, a container for processors. Processors are AWS Lambda functions that perform actions on chat messages, such as stripping out profanity. You can associate channel flows with channels, and the processors in the channel flow then take action on all messages sent to that channel. This is a developer API. Channel flows process the following items:   New and updated messages   Persistent and non-persistent messages   The Standard message type    Channel flows don't process Control or System messages. For more information about the message types provided by Chime SDK Messaging, refer to Message types in the Amazon Chime developer guide. 
    */
  def createChannelFlow(): Request[CreateChannelFlowResponse, AWSError] = js.native
  def createChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelFlowResponse, Unit]): Request[CreateChannelFlowResponse, AWSError] = js.native
  /**
    * Creates a channel flow, a container for processors. Processors are AWS Lambda functions that perform actions on chat messages, such as stripping out profanity. You can associate channel flows with channels, and the processors in the channel flow then take action on all messages sent to that channel. This is a developer API. Channel flows process the following items:   New and updated messages   Persistent and non-persistent messages   The Standard message type    Channel flows don't process Control or System messages. For more information about the message types provided by Chime SDK Messaging, refer to Message types in the Amazon Chime developer guide. 
    */
  def createChannelFlow(params: CreateChannelFlowRequest): Request[CreateChannelFlowResponse, AWSError] = js.native
  def createChannelFlow(
    params: CreateChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelFlowResponse, Unit]
  ): Request[CreateChannelFlowResponse, AWSError] = js.native
  
  /**
    * Adds a member to a channel. The InvitedBy field in ChannelMembership is derived from the request header. A channel member can:   List messages   Send messages   Receive messages   Edit their own messages   Leave the channel   Privacy settings impact this action as follows:   Public Channels: You do not need to be a member to list messages, but you must be a member to send messages.   Private Channels: You must be a member to list or send messages.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUserArn or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannelMembership(): Request[CreateChannelMembershipResponse, AWSError] = js.native
  def createChannelMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelMembershipResponse, Unit]): Request[CreateChannelMembershipResponse, AWSError] = js.native
  /**
    * Adds a member to a channel. The InvitedBy field in ChannelMembership is derived from the request header. A channel member can:   List messages   Send messages   Receive messages   Edit their own messages   Leave the channel   Privacy settings impact this action as follows:   Public Channels: You do not need to be a member to list messages, but you must be a member to send messages.   Private Channels: You must be a member to list or send messages.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUserArn or AppInstanceBot that makes the API call as the value in the header. 
    */
  def createChannelMembership(params: CreateChannelMembershipRequest): Request[CreateChannelMembershipResponse, AWSError] = js.native
  def createChannelMembership(
    params: CreateChannelMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelMembershipResponse, Unit]
  ): Request[CreateChannelMembershipResponse, AWSError] = js.native
  
  /**
    * Creates a new ChannelModerator. A channel moderator can:   Add and remove other members of the channel.   Add and remove other moderators of the channel.   Add and remove user bans for the channel.   Redact messages in the channel.   List messages in the channel.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBotof the user that makes the API call as the value in the header. 
    */
  def createChannelModerator(): Request[CreateChannelModeratorResponse, AWSError] = js.native
  def createChannelModerator(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelModeratorResponse, Unit]): Request[CreateChannelModeratorResponse, AWSError] = js.native
  /**
    * Creates a new ChannelModerator. A channel moderator can:   Add and remove other members of the channel.   Add and remove other moderators of the channel.   Add and remove user bans for the channel.   Redact messages in the channel.   List messages in the channel.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBotof the user that makes the API call as the value in the header. 
    */
  def createChannelModerator(params: CreateChannelModeratorRequest): Request[CreateChannelModeratorResponse, AWSError] = js.native
  def createChannelModerator(
    params: CreateChannelModeratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelModeratorResponse, Unit]
  ): Request[CreateChannelModeratorResponse, AWSError] = js.native
  
  /**
    * Immediately makes a channel and its memberships inaccessible and marks them for deletion. This is an irreversible process.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUserArn or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannel(): Request[js.Object, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Immediately makes a channel and its memberships inaccessible and marks them for deletion. This is an irreversible process.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUserArn or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannel(params: DeleteChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a member from a channel's ban list.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelBan(): Request[js.Object, AWSError] = js.native
  def deleteChannelBan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a member from a channel's ban list.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelBan(params: DeleteChannelBanRequest): Request[js.Object, AWSError] = js.native
  def deleteChannelBan(
    params: DeleteChannelBanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a channel flow, an irreversible process. This is a developer API.   This API works only when the channel flow is not associated with any channel. To get a list of all channels that a channel flow is associated with, use the ListChannelsAssociatedWithChannelFlow API. Use the DisassociateChannelFlow API to disassociate a channel flow from all channels.  
    */
  def deleteChannelFlow(): Request[js.Object, AWSError] = js.native
  def deleteChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a channel flow, an irreversible process. This is a developer API.   This API works only when the channel flow is not associated with any channel. To get a list of all channels that a channel flow is associated with, use the ListChannelsAssociatedWithChannelFlow API. Use the DisassociateChannelFlow API to disassociate a channel flow from all channels.  
    */
  def deleteChannelFlow(params: DeleteChannelFlowRequest): Request[js.Object, AWSError] = js.native
  def deleteChannelFlow(
    params: DeleteChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a member from a channel.  The x-amz-chime-bearer request header is mandatory. Use the AppInstanceUserArn of the user that makes the API call as the value in the header. 
    */
  def deleteChannelMembership(): Request[js.Object, AWSError] = js.native
  def deleteChannelMembership(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a member from a channel.  The x-amz-chime-bearer request header is mandatory. Use the AppInstanceUserArn of the user that makes the API call as the value in the header. 
    */
  def deleteChannelMembership(params: DeleteChannelMembershipRequest): Request[js.Object, AWSError] = js.native
  def deleteChannelMembership(
    params: DeleteChannelMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a channel message. Only admins can perform this action. Deletion makes messages inaccessible immediately. A background process deletes any revisions created by UpdateChannelMessage.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelMessage(): Request[js.Object, AWSError] = js.native
  def deleteChannelMessage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a channel message. Only admins can perform this action. Deletion makes messages inaccessible immediately. A background process deletes any revisions created by UpdateChannelMessage.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelMessage(params: DeleteChannelMessageRequest): Request[js.Object, AWSError] = js.native
  def deleteChannelMessage(
    params: DeleteChannelMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a channel moderator.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelModerator(): Request[js.Object, AWSError] = js.native
  def deleteChannelModerator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a channel moderator.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def deleteChannelModerator(params: DeleteChannelModeratorRequest): Request[js.Object, AWSError] = js.native
  def deleteChannelModerator(
    params: DeleteChannelModeratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the streaming configurations for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def deleteMessagingStreamingConfigurations(): Request[js.Object, AWSError] = js.native
  def deleteMessagingStreamingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the streaming configurations for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def deleteMessagingStreamingConfigurations(params: DeleteMessagingStreamingConfigurationsRequest): Request[js.Object, AWSError] = js.native
  def deleteMessagingStreamingConfigurations(
    params: DeleteMessagingStreamingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns the full details of a channel in an Amazon Chime AppInstance.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Returns the full details of a channel in an Amazon Chime AppInstance.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  
  /**
    * Returns the full details of a channel ban.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelBan(): Request[DescribeChannelBanResponse, AWSError] = js.native
  def describeChannelBan(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelBanResponse, Unit]): Request[DescribeChannelBanResponse, AWSError] = js.native
  /**
    * Returns the full details of a channel ban.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelBan(params: DescribeChannelBanRequest): Request[DescribeChannelBanResponse, AWSError] = js.native
  def describeChannelBan(
    params: DescribeChannelBanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelBanResponse, Unit]
  ): Request[DescribeChannelBanResponse, AWSError] = js.native
  
  /**
    * Returns the full details of a channel flow in an Amazon Chime AppInstance. This is a developer API.
    */
  def describeChannelFlow(): Request[DescribeChannelFlowResponse, AWSError] = js.native
  def describeChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelFlowResponse, Unit]): Request[DescribeChannelFlowResponse, AWSError] = js.native
  /**
    * Returns the full details of a channel flow in an Amazon Chime AppInstance. This is a developer API.
    */
  def describeChannelFlow(params: DescribeChannelFlowRequest): Request[DescribeChannelFlowResponse, AWSError] = js.native
  def describeChannelFlow(
    params: DescribeChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelFlowResponse, Unit]
  ): Request[DescribeChannelFlowResponse, AWSError] = js.native
  
  /**
    * Returns the full details of a user's channel membership.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelMembership(): Request[DescribeChannelMembershipResponse, AWSError] = js.native
  def describeChannelMembership(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelMembershipResponse, Unit]): Request[DescribeChannelMembershipResponse, AWSError] = js.native
  /**
    * Returns the full details of a user's channel membership.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelMembership(params: DescribeChannelMembershipRequest): Request[DescribeChannelMembershipResponse, AWSError] = js.native
  def describeChannelMembership(
    params: DescribeChannelMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelMembershipResponse, Unit]
  ): Request[DescribeChannelMembershipResponse, AWSError] = js.native
  
  /**
    *  Returns the details of a channel based on the membership of the specified AppInstanceUser or AppInstanceBot.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelMembershipForAppInstanceUser(): Request[DescribeChannelMembershipForAppInstanceUserResponse, AWSError] = js.native
  def describeChannelMembershipForAppInstanceUser(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeChannelMembershipForAppInstanceUserResponse, 
      Unit
    ]
  ): Request[DescribeChannelMembershipForAppInstanceUserResponse, AWSError] = js.native
  /**
    *  Returns the details of a channel based on the membership of the specified AppInstanceUser or AppInstanceBot.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelMembershipForAppInstanceUser(params: DescribeChannelMembershipForAppInstanceUserRequest): Request[DescribeChannelMembershipForAppInstanceUserResponse, AWSError] = js.native
  def describeChannelMembershipForAppInstanceUser(
    params: DescribeChannelMembershipForAppInstanceUserRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeChannelMembershipForAppInstanceUserResponse, 
      Unit
    ]
  ): Request[DescribeChannelMembershipForAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Returns the full details of a channel moderated by the specified AppInstanceUser or AppInstanceBot.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelModeratedByAppInstanceUser(): Request[DescribeChannelModeratedByAppInstanceUserResponse, AWSError] = js.native
  def describeChannelModeratedByAppInstanceUser(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeChannelModeratedByAppInstanceUserResponse, 
      Unit
    ]
  ): Request[DescribeChannelModeratedByAppInstanceUserResponse, AWSError] = js.native
  /**
    * Returns the full details of a channel moderated by the specified AppInstanceUser or AppInstanceBot.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def describeChannelModeratedByAppInstanceUser(params: DescribeChannelModeratedByAppInstanceUserRequest): Request[DescribeChannelModeratedByAppInstanceUserResponse, AWSError] = js.native
  def describeChannelModeratedByAppInstanceUser(
    params: DescribeChannelModeratedByAppInstanceUserRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeChannelModeratedByAppInstanceUserResponse, 
      Unit
    ]
  ): Request[DescribeChannelModeratedByAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Returns the full details of a single ChannelModerator.  The x-amz-chime-bearer request header is mandatory. Use the AppInstanceUserArn of the user that makes the API call as the value in the header. 
    */
  def describeChannelModerator(): Request[DescribeChannelModeratorResponse, AWSError] = js.native
  def describeChannelModerator(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelModeratorResponse, Unit]): Request[DescribeChannelModeratorResponse, AWSError] = js.native
  /**
    * Returns the full details of a single ChannelModerator.  The x-amz-chime-bearer request header is mandatory. Use the AppInstanceUserArn of the user that makes the API call as the value in the header. 
    */
  def describeChannelModerator(params: DescribeChannelModeratorRequest): Request[DescribeChannelModeratorResponse, AWSError] = js.native
  def describeChannelModerator(
    params: DescribeChannelModeratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelModeratorResponse, Unit]
  ): Request[DescribeChannelModeratorResponse, AWSError] = js.native
  
  /**
    * Disassociates a channel flow from all its channels. Once disassociated, all messages to that channel stop going through the channel flow processor.  Only administrators or channel moderators can disassociate a channel flow. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def disassociateChannelFlow(): Request[js.Object, AWSError] = js.native
  def disassociateChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a channel flow from all its channels. Once disassociated, all messages to that channel stop going through the channel flow processor.  Only administrators or channel moderators can disassociate a channel flow. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def disassociateChannelFlow(params: DisassociateChannelFlowRequest): Request[js.Object, AWSError] = js.native
  def disassociateChannelFlow(
    params: DisassociateChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the membership preferences of an AppInstanceUser or AppInstanceBot for the specified channel. A user or a bot must be a member of the channel and own the membership to be able to retrieve membership preferences. Users or bots in the AppInstanceAdmin and channel moderator roles can't retrieve preferences for other users or bots. Banned users or bots can't retrieve membership preferences for the channel from which they are banned.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def getChannelMembershipPreferences(): Request[GetChannelMembershipPreferencesResponse, AWSError] = js.native
  def getChannelMembershipPreferences(
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMembershipPreferencesResponse, Unit]
  ): Request[GetChannelMembershipPreferencesResponse, AWSError] = js.native
  /**
    * Gets the membership preferences of an AppInstanceUser or AppInstanceBot for the specified channel. A user or a bot must be a member of the channel and own the membership to be able to retrieve membership preferences. Users or bots in the AppInstanceAdmin and channel moderator roles can't retrieve preferences for other users or bots. Banned users or bots can't retrieve membership preferences for the channel from which they are banned.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def getChannelMembershipPreferences(params: GetChannelMembershipPreferencesRequest): Request[GetChannelMembershipPreferencesResponse, AWSError] = js.native
  def getChannelMembershipPreferences(
    params: GetChannelMembershipPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMembershipPreferencesResponse, Unit]
  ): Request[GetChannelMembershipPreferencesResponse, AWSError] = js.native
  
  /**
    * Gets the full details of a channel message.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def getChannelMessage(): Request[GetChannelMessageResponse, AWSError] = js.native
  def getChannelMessage(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMessageResponse, Unit]): Request[GetChannelMessageResponse, AWSError] = js.native
  /**
    * Gets the full details of a channel message.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def getChannelMessage(params: GetChannelMessageRequest): Request[GetChannelMessageResponse, AWSError] = js.native
  def getChannelMessage(
    params: GetChannelMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMessageResponse, Unit]
  ): Request[GetChannelMessageResponse, AWSError] = js.native
  
  /**
    * Gets message status for a specified messageId. Use this API to determine the intermediate status of messages going through channel flow processing. The API provides an alternative to retrieving message status if the event was not received because a client wasn't connected to a websocket.  Messages can have any one of these statuses.  SENT  Message processed successfully  PENDING  Ongoing processing  FAILED  Processing failed  DENIED  Messasge denied by the processor      This API does not return statuses for denied messages, because we don't store them once the processor denies them.    Only the message sender can invoke this API.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.   
    */
  def getChannelMessageStatus(): Request[GetChannelMessageStatusResponse, AWSError] = js.native
  def getChannelMessageStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMessageStatusResponse, Unit]): Request[GetChannelMessageStatusResponse, AWSError] = js.native
  /**
    * Gets message status for a specified messageId. Use this API to determine the intermediate status of messages going through channel flow processing. The API provides an alternative to retrieving message status if the event was not received because a client wasn't connected to a websocket.  Messages can have any one of these statuses.  SENT  Message processed successfully  PENDING  Ongoing processing  FAILED  Processing failed  DENIED  Messasge denied by the processor      This API does not return statuses for denied messages, because we don't store them once the processor denies them.    Only the message sender can invoke this API.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.   
    */
  def getChannelMessageStatus(params: GetChannelMessageStatusRequest): Request[GetChannelMessageStatusResponse, AWSError] = js.native
  def getChannelMessageStatus(
    params: GetChannelMessageStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelMessageStatusResponse, Unit]
  ): Request[GetChannelMessageStatusResponse, AWSError] = js.native
  
  /**
    * The details of the endpoint for the messaging session.
    */
  def getMessagingSessionEndpoint(): Request[GetMessagingSessionEndpointResponse, AWSError] = js.native
  def getMessagingSessionEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetMessagingSessionEndpointResponse, Unit]): Request[GetMessagingSessionEndpointResponse, AWSError] = js.native
  /**
    * The details of the endpoint for the messaging session.
    */
  def getMessagingSessionEndpoint(params: GetMessagingSessionEndpointRequest): Request[GetMessagingSessionEndpointResponse, AWSError] = js.native
  def getMessagingSessionEndpoint(
    params: GetMessagingSessionEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMessagingSessionEndpointResponse, Unit]
  ): Request[GetMessagingSessionEndpointResponse, AWSError] = js.native
  
  /**
    * Retrieves the data streaming configuration for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def getMessagingStreamingConfigurations(): Request[GetMessagingStreamingConfigurationsResponse, AWSError] = js.native
  def getMessagingStreamingConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetMessagingStreamingConfigurationsResponse, Unit]
  ): Request[GetMessagingStreamingConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves the data streaming configuration for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def getMessagingStreamingConfigurations(params: GetMessagingStreamingConfigurationsRequest): Request[GetMessagingStreamingConfigurationsResponse, AWSError] = js.native
  def getMessagingStreamingConfigurations(
    params: GetMessagingStreamingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMessagingStreamingConfigurationsResponse, Unit]
  ): Request[GetMessagingStreamingConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists all the users and bots banned from a particular channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelBans(): Request[ListChannelBansResponse, AWSError] = js.native
  def listChannelBans(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelBansResponse, Unit]): Request[ListChannelBansResponse, AWSError] = js.native
  /**
    * Lists all the users and bots banned from a particular channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelBans(params: ListChannelBansRequest): Request[ListChannelBansResponse, AWSError] = js.native
  def listChannelBans(
    params: ListChannelBansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelBansResponse, Unit]
  ): Request[ListChannelBansResponse, AWSError] = js.native
  
  /**
    * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
    */
  def listChannelFlows(): Request[ListChannelFlowsResponse, AWSError] = js.native
  def listChannelFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelFlowsResponse, Unit]): Request[ListChannelFlowsResponse, AWSError] = js.native
  /**
    * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
    */
  def listChannelFlows(params: ListChannelFlowsRequest): Request[ListChannelFlowsResponse, AWSError] = js.native
  def listChannelFlows(
    params: ListChannelFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelFlowsResponse, Unit]
  ): Request[ListChannelFlowsResponse, AWSError] = js.native
  
  /**
    * Lists all channel memberships in a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.  If you want to list the channels to which a specific app instance user belongs, see the ListChannelMembershipsForAppInstanceUser API.
    */
  def listChannelMemberships(): Request[ListChannelMembershipsResponse, AWSError] = js.native
  def listChannelMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelMembershipsResponse, Unit]): Request[ListChannelMembershipsResponse, AWSError] = js.native
  /**
    * Lists all channel memberships in a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.  If you want to list the channels to which a specific app instance user belongs, see the ListChannelMembershipsForAppInstanceUser API.
    */
  def listChannelMemberships(params: ListChannelMembershipsRequest): Request[ListChannelMembershipsResponse, AWSError] = js.native
  def listChannelMemberships(
    params: ListChannelMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelMembershipsResponse, Unit]
  ): Request[ListChannelMembershipsResponse, AWSError] = js.native
  
  /**
    *  Lists all channels that anr AppInstanceUser or AppInstanceBot is a part of. Only an AppInstanceAdmin can call the API with a user ARN that is not their own.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelMembershipsForAppInstanceUser(): Request[ListChannelMembershipsForAppInstanceUserResponse, AWSError] = js.native
  def listChannelMembershipsForAppInstanceUser(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListChannelMembershipsForAppInstanceUserResponse, 
      Unit
    ]
  ): Request[ListChannelMembershipsForAppInstanceUserResponse, AWSError] = js.native
  /**
    *  Lists all channels that anr AppInstanceUser or AppInstanceBot is a part of. Only an AppInstanceAdmin can call the API with a user ARN that is not their own.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelMembershipsForAppInstanceUser(params: ListChannelMembershipsForAppInstanceUserRequest): Request[ListChannelMembershipsForAppInstanceUserResponse, AWSError] = js.native
  def listChannelMembershipsForAppInstanceUser(
    params: ListChannelMembershipsForAppInstanceUserRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListChannelMembershipsForAppInstanceUserResponse, 
      Unit
    ]
  ): Request[ListChannelMembershipsForAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * List all the messages in a channel. Returns a paginated list of ChannelMessages. By default, sorted by creation timestamp in descending order.  Redacted messages appear in the results as empty, since they are only redacted, not deleted. Deleted messages do not appear in the results. This action always returns the latest version of an edited message. Also, the x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelMessages(): Request[ListChannelMessagesResponse, AWSError] = js.native
  def listChannelMessages(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelMessagesResponse, Unit]): Request[ListChannelMessagesResponse, AWSError] = js.native
  /**
    * List all the messages in a channel. Returns a paginated list of ChannelMessages. By default, sorted by creation timestamp in descending order.  Redacted messages appear in the results as empty, since they are only redacted, not deleted. Deleted messages do not appear in the results. This action always returns the latest version of an edited message. Also, the x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelMessages(params: ListChannelMessagesRequest): Request[ListChannelMessagesResponse, AWSError] = js.native
  def listChannelMessages(
    params: ListChannelMessagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelMessagesResponse, Unit]
  ): Request[ListChannelMessagesResponse, AWSError] = js.native
  
  /**
    * Lists all the moderators for a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelModerators(): Request[ListChannelModeratorsResponse, AWSError] = js.native
  def listChannelModerators(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelModeratorsResponse, Unit]): Request[ListChannelModeratorsResponse, AWSError] = js.native
  /**
    * Lists all the moderators for a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelModerators(params: ListChannelModeratorsRequest): Request[ListChannelModeratorsResponse, AWSError] = js.native
  def listChannelModerators(
    params: ListChannelModeratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelModeratorsResponse, Unit]
  ): Request[ListChannelModeratorsResponse, AWSError] = js.native
  
  /**
    * Lists all Channels created under a single Chime App as a paginated list. You can specify filters to narrow results.  Functionality &amp; restrictions    Use privacy = PUBLIC to retrieve all public channels in the account.   Only an AppInstanceAdmin can set privacy = PRIVATE to list the private channels in an account.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Lists all Channels created under a single Chime App as a paginated list. You can specify filters to narrow results.  Functionality &amp; restrictions    Use privacy = PUBLIC to retrieve all public channels in the account.   Only an AppInstanceAdmin can set privacy = PRIVATE to list the private channels in an account.    The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple channels, but you can only associate a channel with one channel flow. This is a developer API.
    */
  def listChannelsAssociatedWithChannelFlow(): Request[ListChannelsAssociatedWithChannelFlowResponse, AWSError] = js.native
  def listChannelsAssociatedWithChannelFlow(
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsAssociatedWithChannelFlowResponse, Unit]
  ): Request[ListChannelsAssociatedWithChannelFlowResponse, AWSError] = js.native
  /**
    * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple channels, but you can only associate a channel with one channel flow. This is a developer API.
    */
  def listChannelsAssociatedWithChannelFlow(params: ListChannelsAssociatedWithChannelFlowRequest): Request[ListChannelsAssociatedWithChannelFlowResponse, AWSError] = js.native
  def listChannelsAssociatedWithChannelFlow(
    params: ListChannelsAssociatedWithChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsAssociatedWithChannelFlowResponse, Unit]
  ): Request[ListChannelsAssociatedWithChannelFlowResponse, AWSError] = js.native
  
  /**
    * A list of the channels moderated by an AppInstanceUser.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelsModeratedByAppInstanceUser(): Request[ListChannelsModeratedByAppInstanceUserResponse, AWSError] = js.native
  def listChannelsModeratedByAppInstanceUser(
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsModeratedByAppInstanceUserResponse, Unit]
  ): Request[ListChannelsModeratedByAppInstanceUserResponse, AWSError] = js.native
  /**
    * A list of the channels moderated by an AppInstanceUser.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def listChannelsModeratedByAppInstanceUser(params: ListChannelsModeratedByAppInstanceUserRequest): Request[ListChannelsModeratedByAppInstanceUserResponse, AWSError] = js.native
  def listChannelsModeratedByAppInstanceUser(
    params: ListChannelsModeratedByAppInstanceUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsModeratedByAppInstanceUserResponse, Unit]
  ): Request[ListChannelsModeratedByAppInstanceUserResponse, AWSError] = js.native
  
  /**
    * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance admins and channel moderators of elastic channels.
    */
  def listSubChannels(): Request[ListSubChannelsResponse, AWSError] = js.native
  def listSubChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListSubChannelsResponse, Unit]): Request[ListSubChannelsResponse, AWSError] = js.native
  /**
    * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance admins and channel moderators of elastic channels.
    */
  def listSubChannels(params: ListSubChannelsRequest): Request[ListSubChannelsResponse, AWSError] = js.native
  def listSubChannels(
    params: ListSubChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubChannelsResponse, Unit]
  ): Request[ListSubChannelsResponse, AWSError] = js.native
  
  /**
    * Lists the tags applied to an Amazon Chime SDK messaging resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags applied to an Amazon Chime SDK messaging resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sets the number of days before the channel is automatically deleted.    A background process deletes expired channels within 6 hours of expiration. Actual deletion times may vary.   Expired channels that have not yet been deleted appear as active, and you can update their expiration settings. The system honors the new settings.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.   
    */
  def putChannelExpirationSettings(): Request[PutChannelExpirationSettingsResponse, AWSError] = js.native
  def putChannelExpirationSettings(callback: js.Function2[/* err */ AWSError, /* data */ PutChannelExpirationSettingsResponse, Unit]): Request[PutChannelExpirationSettingsResponse, AWSError] = js.native
  /**
    * Sets the number of days before the channel is automatically deleted.    A background process deletes expired channels within 6 hours of expiration. Actual deletion times may vary.   Expired channels that have not yet been deleted appear as active, and you can update their expiration settings. The system honors the new settings.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.   
    */
  def putChannelExpirationSettings(params: PutChannelExpirationSettingsRequest): Request[PutChannelExpirationSettingsResponse, AWSError] = js.native
  def putChannelExpirationSettings(
    params: PutChannelExpirationSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutChannelExpirationSettingsResponse, Unit]
  ): Request[PutChannelExpirationSettingsResponse, AWSError] = js.native
  
  /**
    * Sets the membership preferences of an AppInstanceUser or AppIntanceBot for the specified channel. The user or bot must be a member of the channel. Only the user or bot who owns the membership can set preferences. Users or bots in the AppInstanceAdmin and channel moderator roles can't set preferences for other users or users. Banned users or bots can't set membership preferences for the channel from which they are banned.  The x-amz-chime-bearer request header is mandatory. Use the ARN of an AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def putChannelMembershipPreferences(): Request[PutChannelMembershipPreferencesResponse, AWSError] = js.native
  def putChannelMembershipPreferences(
    callback: js.Function2[/* err */ AWSError, /* data */ PutChannelMembershipPreferencesResponse, Unit]
  ): Request[PutChannelMembershipPreferencesResponse, AWSError] = js.native
  /**
    * Sets the membership preferences of an AppInstanceUser or AppIntanceBot for the specified channel. The user or bot must be a member of the channel. Only the user or bot who owns the membership can set preferences. Users or bots in the AppInstanceAdmin and channel moderator roles can't set preferences for other users or users. Banned users or bots can't set membership preferences for the channel from which they are banned.  The x-amz-chime-bearer request header is mandatory. Use the ARN of an AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def putChannelMembershipPreferences(params: PutChannelMembershipPreferencesRequest): Request[PutChannelMembershipPreferencesResponse, AWSError] = js.native
  def putChannelMembershipPreferences(
    params: PutChannelMembershipPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutChannelMembershipPreferencesResponse, Unit]
  ): Request[PutChannelMembershipPreferencesResponse, AWSError] = js.native
  
  /**
    * Sets the data streaming configuration for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def putMessagingStreamingConfigurations(): Request[PutMessagingStreamingConfigurationsResponse, AWSError] = js.native
  def putMessagingStreamingConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ PutMessagingStreamingConfigurationsResponse, Unit]
  ): Request[PutMessagingStreamingConfigurationsResponse, AWSError] = js.native
  /**
    * Sets the data streaming configuration for an AppInstance. For more information, see Streaming messaging data in the Amazon Chime SDK Developer Guide.
    */
  def putMessagingStreamingConfigurations(params: PutMessagingStreamingConfigurationsRequest): Request[PutMessagingStreamingConfigurationsResponse, AWSError] = js.native
  def putMessagingStreamingConfigurations(
    params: PutMessagingStreamingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMessagingStreamingConfigurationsResponse, Unit]
  ): Request[PutMessagingStreamingConfigurationsResponse, AWSError] = js.native
  
  /**
    * Redacts message content, but not metadata. The message exists in the back end, but the action returns null content, and the state shows as redacted.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def redactChannelMessage(): Request[RedactChannelMessageResponse, AWSError] = js.native
  def redactChannelMessage(callback: js.Function2[/* err */ AWSError, /* data */ RedactChannelMessageResponse, Unit]): Request[RedactChannelMessageResponse, AWSError] = js.native
  /**
    * Redacts message content, but not metadata. The message exists in the back end, but the action returns null content, and the state shows as redacted.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def redactChannelMessage(params: RedactChannelMessageRequest): Request[RedactChannelMessageResponse, AWSError] = js.native
  def redactChannelMessage(
    params: RedactChannelMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RedactChannelMessageResponse, Unit]
  ): Request[RedactChannelMessageResponse, AWSError] = js.native
  
  /**
    * Allows the ChimeBearer to search channels by channel members. Users or bots can search across the channels that they belong to. Users in the AppInstanceAdmin role can search across all channels. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.
    */
  def searchChannels(): Request[SearchChannelsResponse, AWSError] = js.native
  def searchChannels(callback: js.Function2[/* err */ AWSError, /* data */ SearchChannelsResponse, Unit]): Request[SearchChannelsResponse, AWSError] = js.native
  /**
    * Allows the ChimeBearer to search channels by channel members. Users or bots can search across the channels that they belong to. Users in the AppInstanceAdmin role can search across all channels. The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header.
    */
  def searchChannels(params: SearchChannelsRequest): Request[SearchChannelsResponse, AWSError] = js.native
  def searchChannels(
    params: SearchChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchChannelsResponse, Unit]
  ): Request[SearchChannelsResponse, AWSError] = js.native
  
  /**
    * Sends a message to a particular channel that the member is a part of.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. Also, STANDARD messages can contain 4KB of data and the 1KB of metadata. CONTROL messages can contain 30 bytes of data and no metadata. 
    */
  def sendChannelMessage(): Request[SendChannelMessageResponse, AWSError] = js.native
  def sendChannelMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendChannelMessageResponse, Unit]): Request[SendChannelMessageResponse, AWSError] = js.native
  /**
    * Sends a message to a particular channel that the member is a part of.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. Also, STANDARD messages can contain 4KB of data and the 1KB of metadata. CONTROL messages can contain 30 bytes of data and no metadata. 
    */
  def sendChannelMessage(params: SendChannelMessageRequest): Request[SendChannelMessageResponse, AWSError] = js.native
  def sendChannelMessage(
    params: SendChannelMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendChannelMessageResponse, Unit]
  ): Request[SendChannelMessageResponse, AWSError] = js.native
  
  /**
    * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Update a channel's attributes.  Restriction: You can't change a channel's privacy.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Update a channel's attributes.  Restriction: You can't change a channel's privacy.   The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
  
  /**
    * Updates channel flow attributes. This is a developer API.
    */
  def updateChannelFlow(): Request[UpdateChannelFlowResponse, AWSError] = js.native
  def updateChannelFlow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelFlowResponse, Unit]): Request[UpdateChannelFlowResponse, AWSError] = js.native
  /**
    * Updates channel flow attributes. This is a developer API.
    */
  def updateChannelFlow(params: UpdateChannelFlowRequest): Request[UpdateChannelFlowResponse, AWSError] = js.native
  def updateChannelFlow(
    params: UpdateChannelFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelFlowResponse, Unit]
  ): Request[UpdateChannelFlowResponse, AWSError] = js.native
  
  /**
    * Updates the content of a message.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannelMessage(): Request[UpdateChannelMessageResponse, AWSError] = js.native
  def updateChannelMessage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelMessageResponse, Unit]): Request[UpdateChannelMessageResponse, AWSError] = js.native
  /**
    * Updates the content of a message.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannelMessage(params: UpdateChannelMessageRequest): Request[UpdateChannelMessageResponse, AWSError] = js.native
  def updateChannelMessage(
    params: UpdateChannelMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelMessageResponse, Unit]
  ): Request[UpdateChannelMessageResponse, AWSError] = js.native
  
  /**
    * The details of the time when a user last read messages in a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannelReadMarker(): Request[UpdateChannelReadMarkerResponse, AWSError] = js.native
  def updateChannelReadMarker(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelReadMarkerResponse, Unit]): Request[UpdateChannelReadMarkerResponse, AWSError] = js.native
  /**
    * The details of the time when a user last read messages in a channel.  The x-amz-chime-bearer request header is mandatory. Use the ARN of the AppInstanceUser or AppInstanceBot that makes the API call as the value in the header. 
    */
  def updateChannelReadMarker(params: UpdateChannelReadMarkerRequest): Request[UpdateChannelReadMarkerResponse, AWSError] = js.native
  def updateChannelReadMarker(
    params: UpdateChannelReadMarkerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelReadMarkerResponse, Unit]
  ): Request[UpdateChannelReadMarkerResponse, AWSError] = js.native
}
