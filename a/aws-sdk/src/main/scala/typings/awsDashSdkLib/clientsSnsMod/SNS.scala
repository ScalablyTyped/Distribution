package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SNS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSnsMod.SNSNs.ClientConfiguration = js.native
  /**
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.
     */
  def addPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.
     */
  def addPermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.
     */
  def addPermission(params: awsDashSdkLib.clientsSnsMod.SNSNs.AddPermissionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.
     */
  def addPermission(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.AddPermissionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
     */
  def checkIfPhoneNumberIsOptedOut(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
     */
  def checkIfPhoneNumberIsOptedOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
     */
  def checkIfPhoneNumberIsOptedOut(params: awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
     */
  def checkIfPhoneNumberIsOptedOut(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CheckIfPhoneNumberIsOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
     */
  def confirmSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
     */
  def confirmSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
     */
  def confirmSubscription(params: awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
     */
  def confirmSubscription(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ConfirmSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
     */
  def createPlatformApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
     */
  def createPlatformApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
     */
  def createPlatformApplication(params: awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
     */
  def createPlatformApplication(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
     */
  def createPlatformEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
     */
  def createPlatformEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
     */
  def createPlatformEndpoint(params: awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
     */
  def createPlatformEndpoint(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.CreatePlatformEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
     */
  def createTopic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
     */
  def createTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
     */
  def createTopic(params: awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
     */
  def createTopic(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.CreateTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
     */
  def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
     */
  def deleteEndpoint(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
     */
  def deleteEndpoint(params: awsDashSdkLib.clientsSnsMod.SNSNs.DeleteEndpointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
     */
  def deleteEndpoint(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.DeleteEndpointInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def deletePlatformApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def deletePlatformApplication(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def deletePlatformApplication(params: awsDashSdkLib.clientsSnsMod.SNSNs.DeletePlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def deletePlatformApplication(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.DeletePlatformApplicationInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
     */
  def deleteTopic(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
     */
  def deleteTopic(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
     */
  def deleteTopic(params: awsDashSdkLib.clientsSnsMod.SNSNs.DeleteTopicInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
     */
  def deleteTopic(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.DeleteTopicInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getEndpointAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getEndpointAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getEndpointAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getEndpointAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetEndpointAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getPlatformApplicationAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getPlatformApplicationAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getPlatformApplicationAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def getPlatformApplicationAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetPlatformApplicationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
     */
  def getSMSAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
     */
  def getSMSAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
     */
  def getSMSAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
     */
  def getSMSAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a subscription.
     */
  def getSubscriptionAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a subscription.
     */
  def getSubscriptionAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a subscription.
     */
  def getSubscriptionAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a subscription.
     */
  def getSubscriptionAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetSubscriptionAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
     */
  def getTopicAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
     */
  def getTopicAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
     */
  def getTopicAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
     */
  def getTopicAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.GetTopicAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
     */
  def listEndpointsByPlatformApplication(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
     */
  def listEndpointsByPlatformApplication(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
     */
  def listEndpointsByPlatformApplication(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
     */
  def listEndpointsByPlatformApplication(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListEndpointsByPlatformApplicationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
     */
  def listPhoneNumbersOptedOut(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
     */
  def listPhoneNumbersOptedOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
     */
  def listPhoneNumbersOptedOut(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
     */
  def listPhoneNumbersOptedOut(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPhoneNumbersOptedOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
     */
  def listPlatformApplications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
     */
  def listPlatformApplications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
     */
  def listPlatformApplications(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
     */
  def listPlatformApplications(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListPlatformApplicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptions(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptions(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptionsByTopic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptionsByTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptionsByTopic(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listSubscriptionsByTopic(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListSubscriptionsByTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listTopics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listTopics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listTopics(params: awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
     */
  def listTopics(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.ListTopicsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
     */
  def optInPhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
     */
  def optInPhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
     */
  def optInPhoneNumber(params: awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
     */
  def optInPhoneNumber(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.OptInPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
     */
  def publish(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
     */
  def publish(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
     */
  def publish(params: awsDashSdkLib.clientsSnsMod.SNSNs.PublishInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
     */
  def publish(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.PublishInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.PublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a statement from a topic's access control policy.
     */
  def removePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes a statement from a topic's access control policy.
     */
  def removePermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes a statement from a topic's access control policy.
     */
  def removePermission(params: awsDashSdkLib.clientsSnsMod.SNSNs.RemovePermissionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes a statement from a topic's access control policy.
     */
  def removePermission(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.RemovePermissionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def setEndpointAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def setEndpointAttributes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def setEndpointAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.SetEndpointAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
     */
  def setEndpointAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SetEndpointAttributesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
     */
  def setPlatformApplicationAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
     */
  def setPlatformApplicationAttributes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
     */
  def setPlatformApplicationAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.SetPlatformApplicationAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
     */
  def setPlatformApplicationAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SetPlatformApplicationAttributesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
     */
  def setSMSAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
     */
  def setSMSAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
     */
  def setSMSAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
     */
  def setSMSAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SetSMSAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     */
  def setSubscriptionAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     */
  def setSubscriptionAttributes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     */
  def setSubscriptionAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.SetSubscriptionAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a subscription owner to set an attribute of the subscription to a new value.
     */
  def setSubscriptionAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SetSubscriptionAttributesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a topic owner to set an attribute of the topic to a new value.
     */
  def setTopicAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a topic owner to set an attribute of the topic to a new value.
     */
  def setTopicAttributes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a topic owner to set an attribute of the topic to a new value.
     */
  def setTopicAttributes(params: awsDashSdkLib.clientsSnsMod.SNSNs.SetTopicAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Allows a topic owner to set an attribute of the topic to a new value.
     */
  def setTopicAttributes(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SetTopicAttributesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
     */
  def subscribe(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
     */
  def subscribe(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
     */
  def subscribe(params: awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
     */
  def subscribe(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSnsMod.SNSNs.SubscribeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
     */
  def unsubscribe(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
     */
  def unsubscribe(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
     */
  def unsubscribe(params: awsDashSdkLib.clientsSnsMod.SNSNs.UnsubscribeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
     */
  def unsubscribe(
    params: awsDashSdkLib.clientsSnsMod.SNSNs.UnsubscribeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

