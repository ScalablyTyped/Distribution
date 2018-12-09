package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/sns", "SNS")
@js.native
object SNSNs extends js.Object {
  
  trait AddPermissionInput extends js.Object {
    /**
         * The AWS account IDs of the users (principals) who will be given access to the specified actions. The users must have AWS accounts, but do not need to be signed up for this service.
         */
    var AWSAccountId: DelegatesList
    /**
         * The action you want to allow for the specified principal(s). Valid values: any Amazon SNS action name.
         */
    var ActionName: ActionsList
    /**
         * A unique identifier for the new policy statement.
         */
    var Label: label
    /**
         * The ARN of the topic whose access control policy you wish to modify.
         */
    var TopicArn: topicARN
  }
  
  
  trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
    /**
         * The phone number for which you want to check the opt out status.
         */
    var phoneNumber: PhoneNumber
  }
  
  
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    /**
         * Indicates whether the phone number is opted out:    true – The phone number is opted out, meaning you cannot publish SMS messages to it.    false – The phone number is opted in, meaning you can publish SMS messages to it.  
         */
    var isOptedOut: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ConfirmSubscriptionInput extends js.Object {
    /**
         * Disallows unauthenticated unsubscribes of the subscription. If the value of this parameter is true and the request has an AWS signature, then only the topic owner and the subscription owner can unsubscribe the endpoint. The unsubscribe action requires AWS authentication. 
         */
    var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.undefined
    /**
         * Short-lived token sent to an endpoint during the Subscribe action.
         */
    var Token: token
    /**
         * The ARN of the topic for which you wish to confirm a subscription.
         */
    var TopicArn: topicARN
  }
  
  
  trait ConfirmSubscriptionResponse extends js.Object {
    /**
         * The ARN of the created subscription.
         */
    var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
  }
  
  
  trait CreateEndpointResponse extends js.Object {
    /**
         * EndpointArn returned from CreateEndpoint action.
         */
    var EndpointArn: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreatePlatformApplicationInput extends js.Object {
    /**
         * For a list of attributes, see SetPlatformApplicationAttributes 
         */
    var Attributes: MapStringToString
    /**
         * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens, and periods, and must be between 1 and 256 characters long.
         */
    var Name: String
    /**
         * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Google Cloud Messaging).
         */
    var Platform: String
  }
  
  
  trait CreatePlatformApplicationResponse extends js.Object {
    /**
         * PlatformApplicationArn is returned.
         */
    var PlatformApplicationArn: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreatePlatformEndpointInput extends js.Object {
    /**
         * For a list of attributes, see SetEndpointAttributes.
         */
    var Attributes: js.UndefOr[MapStringToString] = js.undefined
    /**
         * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.
         */
    var CustomUserData: js.UndefOr[String] = js.undefined
    /**
         * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
         */
    var PlatformApplicationArn: String
    /**
         * Unique identifier created by the notification service for an app on a device. The specific name for Token will vary, depending on which notification service is being used. For example, when using APNS as the notification service, you need the device token. Alternatively, when using GCM or ADM, the device token equivalent is called the registration ID.
         */
    var Token: String
  }
  
  
  trait CreateTopicInput extends js.Object {
    /**
         * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the CreateTopic action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.  
         */
    var Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
    /**
         * The name of the topic you want to create. Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long.
         */
    var Name: topicName
  }
  
  
  trait CreateTopicResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) assigned to the created topic.
         */
    var TopicArn: js.UndefOr[topicARN] = js.undefined
  }
  
  
  trait DeleteEndpointInput extends js.Object {
    /**
         * EndpointArn of endpoint to delete.
         */
    var EndpointArn: String
  }
  
  
  trait DeletePlatformApplicationInput extends js.Object {
    /**
         * PlatformApplicationArn of platform application object to delete.
         */
    var PlatformApplicationArn: String
  }
  
  
  trait DeleteTopicInput extends js.Object {
    /**
         * The ARN of the topic you want to delete.
         */
    var TopicArn: topicARN
  }
  
  
  trait Endpoint extends js.Object {
    /**
         * Attributes for endpoint.
         */
    var Attributes: js.UndefOr[MapStringToString] = js.undefined
    /**
         * EndpointArn for mobile app and device.
         */
    var EndpointArn: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetEndpointAttributesInput extends js.Object {
    /**
         * EndpointArn for GetEndpointAttributes input.
         */
    var EndpointArn: String
  }
  
  
  trait GetEndpointAttributesResponse extends js.Object {
    /**
         * Attributes include the following:    CustomUserData – arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.    Enabled – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true, typically after updating Token.    Token – device token, also referred to as a registration id, for an app and mobile device. This is returned from the notification service when an app and mobile device are registered with the notification service.  
         */
    var Attributes: js.UndefOr[MapStringToString] = js.undefined
  }
  
  
  trait GetPlatformApplicationAttributesInput extends js.Object {
    /**
         * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
         */
    var PlatformApplicationArn: String
  }
  
  
  trait GetPlatformApplicationAttributesResponse extends js.Object {
    /**
         * Attributes include the following:    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.  
         */
    var Attributes: js.UndefOr[MapStringToString] = js.undefined
  }
  
  
  trait GetSMSAttributesInput extends js.Object {
    /**
         * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
         */
    var attributes: js.UndefOr[ListString] = js.undefined
  }
  
  
  trait GetSMSAttributesResponse extends js.Object {
    /**
         * The SMS attribute names and their values.
         */
    var attributes: js.UndefOr[MapStringToString] = js.undefined
  }
  
  
  trait GetSubscriptionAttributesInput extends js.Object {
    /**
         * The ARN of the subscription whose properties you want to get.
         */
    var SubscriptionArn: subscriptionARN
  }
  
  
  trait GetSubscriptionAttributesResponse extends js.Object {
    /**
         * A map of the subscription's attributes. Attributes in this map include the following:    ConfirmationWasAuthenticated – true if the subscription confirmation request was authenticated.    DeliveryPolicy – The JSON serialization of the subscription's delivery policy.    EffectiveDeliveryPolicy – The JSON serialization of the effective delivery policy that takes into account the topic delivery policy and account system defaults.    FilterPolicy – The filter policy JSON that is assigned to the subscription.    Owner – The AWS account ID of the subscription's owner.    PendingConfirmation – true if the subscription hasn't been confirmed. To confirm a pending subscription, call the ConfirmSubscription action with a confirmation token.    RawMessageDelivery – true if raw message delivery is enabled for the subscription. Raw messages are free of JSON formatting and can be sent to HTTP/S and Amazon SQS endpoints.    SubscriptionArn – The subscription's ARN.    TopicArn – The topic ARN that the subscription is associated with.  
         */
    var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
  }
  
  
  trait GetTopicAttributesInput extends js.Object {
    /**
         * The ARN of the topic whose properties you want to get.
         */
    var TopicArn: topicARN
  }
  
  
  trait GetTopicAttributesResponse extends js.Object {
    /**
         * A map of the topic's attributes. Attributes in this map include the following:    TopicArn – the topic's ARN    Owner – the AWS account ID of the topic's owner    Policy – the JSON serialization of the topic's access control policy    DisplayName – the human-readable name used in the "From" field for notifications to email and email-json endpoints    SubscriptionsPending – the number of subscriptions pending confirmation on this topic    SubscriptionsConfirmed – the number of confirmed subscriptions on this topic    SubscriptionsDeleted – the number of deleted subscriptions on this topic    DeliveryPolicy – the JSON serialization of the topic's delivery policy    EffectiveDeliveryPolicy – the JSON serialization of the effective delivery policy that takes into account system defaults  
         */
    var Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
  }
  
  
  trait ListEndpointsByPlatformApplicationInput extends js.Object {
    /**
         * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records that are available after the first page results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
         */
    var PlatformApplicationArn: String
  }
  
  
  trait ListEndpointsByPlatformApplicationResponse extends js.Object {
    /**
         * Endpoints returned for ListEndpointsByPlatformApplication action.
         */
    var Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined
    /**
         * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    /**
         * A NextToken string is used when you call the ListPhoneNumbersOptedOut action to retrieve additional records that are available after the first page of results.
         */
    var nextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    /**
         * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
         */
    var nextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
         */
    var phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
  }
  
  
  trait ListPlatformApplicationsInput extends js.Object {
    /**
         * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are available after the first page results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListPlatformApplicationsResponse extends js.Object {
    /**
         * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * Platform applications returned when calling ListPlatformApplications action.
         */
    var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.undefined
  }
  
  
  trait ListSubscriptionsByTopicInput extends js.Object {
    /**
         * Token returned by the previous ListSubscriptionsByTopic request.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
    /**
         * The ARN of the topic for which you wish to find subscriptions.
         */
    var TopicArn: topicARN
  }
  
  
  trait ListSubscriptionsByTopicResponse extends js.Object {
    /**
         * Token to pass along to the next ListSubscriptionsByTopic request. This element is returned if there are more subscriptions to retrieve.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
    /**
         * A list of subscriptions.
         */
    var Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
  }
  
  
  trait ListSubscriptionsInput extends js.Object {
    /**
         * Token returned by the previous ListSubscriptions request.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  
  trait ListSubscriptionsResponse extends js.Object {
    /**
         * Token to pass along to the next ListSubscriptions request. This element is returned if there are more subscriptions to retrieve.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
    /**
         * A list of subscriptions.
         */
    var Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
  }
  
  
  trait ListTopicsInput extends js.Object {
    /**
         * Token returned by the previous ListTopics request.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
  }
  
  
  trait ListTopicsResponse extends js.Object {
    /**
         * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
         */
    var NextToken: js.UndefOr[nextToken] = js.undefined
    /**
         * A list of topic ARNs.
         */
    var Topics: js.UndefOr[TopicsList] = js.undefined
  }
  
  
  trait MapStringToString
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
  trait MessageAttributeMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[MessageAttributeValue]
  
  
  trait MessageAttributeValue extends js.Object {
    /**
         * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
         */
    var BinaryValue: js.UndefOr[Binary] = js.undefined
    /**
         * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more information, see Message Attribute Data Types.
         */
    var DataType: String
    /**
         * Strings are Unicode with UTF8 binary encoding. For a list of code values, see http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters.
         */
    var StringValue: js.UndefOr[String] = js.undefined
  }
  
  
  trait OptInPhoneNumberInput extends js.Object {
    /**
         * The phone number to opt in.
         */
    var phoneNumber: PhoneNumber
  }
  
  
  trait OptInPhoneNumberResponse extends js.Object
  
  
  trait PlatformApplication extends js.Object {
    /**
         * Attributes for platform application object.
         */
    var Attributes: js.UndefOr[MapStringToString] = js.undefined
    /**
         * PlatformApplicationArn for platform application object.
         */
    var PlatformApplicationArn: js.UndefOr[String] = js.undefined
  }
  
  
  trait PublishInput extends js.Object {
    /**
         * The message you want to send.  The Message parameter is always a string. If you set MessageStructure to json, you must string-encode the Message parameter.  If you are publishing to a topic and you want to send the same message to all transport protocols, include the text of the message as a String value. If you want to send different messages for each transport protocol, set the value of the MessageStructure parameter to json and use a JSON object for the Message parameter.   Constraints:   With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not 262,144 characters).   For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters. If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries. The total size limit for a single SMS Publish action is 1,600 characters.   JSON-specific constraints:   Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.   The values will be parsed (unescaped) before they are used in outgoing messages.   Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).   Values have a minimum length of 0 (the empty string, "", is allowed).   Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit message sizes).   Non-string values will cause the key to be ignored.   Keys that do not correspond to supported transport protocols are ignored.   Duplicate keys are not allowed.   Failure to parse or validate any key or value in the message will cause the Publish call to return an error (no partial delivery).  
         */
    var Message: message
    /**
         * Message attributes for Publish action.
         */
    var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined
    /**
         * Set MessageStructure to json if you want to send a different message for each protocol. For example, using one publish action, you can send a short message to your SMS subscribers and a longer message to your email subscribers. If you set MessageStructure to json, the value of the Message parameter must:    be a syntactically valid JSON object; and   contain at least a top-level JSON key of "default" with a value that is a string.   You can define other top-level keys that define the message you want to send to a specific transport protocol (e.g., "http"). For information about sending different messages for each protocol using the AWS Management Console, go to Create Different Messages for Each Protocol in the Amazon Simple Notification Service Getting Started Guide.  Valid value: json 
         */
    var MessageStructure: js.UndefOr[messageStructure] = js.undefined
    /**
         * The phone number to which you want to deliver an SMS message. Use E.164 format. If you don't specify a value for the PhoneNumber parameter, you must specify a value for the TargetArn or TopicArn parameters.
         */
    var PhoneNumber: js.UndefOr[String] = js.undefined
    /**
         * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field will also be included, if present, in the standard JSON messages delivered to other endpoints. Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include line breaks or control characters; and must be less than 100 characters long.
         */
    var Subject: js.UndefOr[subject] = js.undefined
    /**
         * Either TopicArn or EndpointArn, but not both. If you don't specify a value for the TargetArn parameter, you must specify a value for the PhoneNumber or TopicArn parameters.
         */
    var TargetArn: js.UndefOr[String] = js.undefined
    /**
         * The topic you want to publish to. If you don't specify a value for the TopicArn parameter, you must specify a value for the PhoneNumber or TargetArn parameters.
         */
    var TopicArn: js.UndefOr[topicARN] = js.undefined
  }
  
  
  trait PublishResponse extends js.Object {
    /**
         * Unique identifier assigned to the published message. Length Constraint: Maximum 100 characters
         */
    var MessageId: js.UndefOr[messageId] = js.undefined
  }
  
  
  trait RemovePermissionInput extends js.Object {
    /**
         * The unique label of the statement you want to remove.
         */
    var Label: label
    /**
         * The ARN of the topic whose access control policy you wish to modify.
         */
    var TopicArn: topicARN
  }
  
  
  trait SetEndpointAttributesInput extends js.Object {
    /**
         * A map of the endpoint attributes. Attributes in this map include the following:    CustomUserData – arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.    Enabled – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true, typically after updating Token.    Token – device token, also referred to as a registration id, for an app and mobile device. This is returned from the notification service when an app and mobile device are registered with the notification service.  
         */
    var Attributes: MapStringToString
    /**
         * EndpointArn used for SetEndpointAttributes action.
         */
    var EndpointArn: String
  }
  
  
  trait SetPlatformApplicationAttributesInput extends js.Object {
    /**
         * A map of the platform application attributes. Attributes in this map include the following:    PlatformCredential – The credential received from the notification service. For APNS/APNS_SANDBOX, PlatformCredential is private key. For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret".    PlatformPrincipal – The principal received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL certificate. For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id".    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.    SuccessFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    FailureFeedbackRoleArn – IAM role ARN used to give Amazon SNS write access to use CloudWatch Logs on your behalf.    SuccessFeedbackSampleRate – Sample rate percentage (0-100) of successfully delivered messages.  
         */
    var Attributes: MapStringToString
    /**
         * PlatformApplicationArn for SetPlatformApplicationAttributes action.
         */
    var PlatformApplicationArn: String
  }
  
  
  trait SetSMSAttributesInput extends js.Object {
    /**
         * The default settings for sending SMS messages from your account. You can set values for the following attribute names:  MonthlySpendLimit – The maximum amount in USD that you are willing to spend each month to send SMS messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds this limit, it stops sending SMS messages within minutes.  Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if you continue to send SMS messages, you will incur costs that exceed your limit.  By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit, submit an SNS Limit Increase case. For New limit value, enter your desired monthly spend limit. In the Use Case Description field, explain that you are requesting an SMS monthly spend limit increase.  DeliveryStatusIAMRole – The ARN of the IAM role that allows Amazon SNS to write logs about SMS deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that includes the message price, the success or failure status, the reason for failure (if the message failed), the message dwell time, and other information.  DeliveryStatusSuccessSamplingRate – The percentage of successful SMS deliveries for which Amazon SNS will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to write logs only for failed deliveries, set this value to 0. To write logs for 10% of your successful deliveries, set it to 10.  DefaultSenderID – A string, such as your business brand, that is displayed as the sender on the receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric characters, and it must contain at least one letter.  DefaultSMSType – The type of SMS message that you will send by default. You can assign the following values:    Promotional – (Default) Noncritical messages, such as marketing messages. Amazon SNS optimizes the message delivery to incur the lowest cost.    Transactional – Critical messages that support customer transactions, such as one-time passcodes for multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the highest reliability.    UsageReportS3Bucket – The name of the Amazon S3 bucket to receive daily SMS usage reports from Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report includes the following information for each SMS message that was successfully delivered by your account:   Time that the message was published (in UTC)   Message ID   Destination phone number   Message type   Delivery status   Message price (in USD)   Part number (a message is split into multiple parts if it is too long for a single message)   Total number of parts   To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to perform the s3:PutObject and s3:GetBucketLocation actions. For an example bucket policy and usage report, see Monitoring SMS Activity in the Amazon SNS Developer Guide.
         */
    var attributes: MapStringToString
  }
  
  
  trait SetSMSAttributesResponse extends js.Object
  
  
  trait SetSubscriptionAttributesInput extends js.Object {
    /**
         * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.  
         */
    var AttributeName: attributeName
    /**
         * The new value for the attribute in JSON format.
         */
    var AttributeValue: js.UndefOr[attributeValue] = js.undefined
    /**
         * The ARN of the subscription to modify.
         */
    var SubscriptionArn: subscriptionARN
  }
  
  
  trait SetTopicAttributesInput extends js.Object {
    /**
         * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.  
         */
    var AttributeName: attributeName
    /**
         * The new value for the attribute.
         */
    var AttributeValue: js.UndefOr[attributeValue] = js.undefined
    /**
         * The ARN of the topic to modify.
         */
    var TopicArn: topicARN
  }
  
  
  trait SubscribeInput extends js.Object {
    /**
         * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    FilterPolicy – The simple JSON object that lets your subscriber receive only a subset of messages, rather than receiving every message published to the topic.    RawMessageDelivery – When set to true, enables raw message delivery to Amazon SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise created for Amazon SNS metadata.  
         */
    var Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
    /**
         * The endpoint that you want to receive notifications. Endpoints vary by protocol:   For the http protocol, the endpoint is an URL beginning with "http://"   For the https protocol, the endpoint is a URL beginning with "https://"   For the email protocol, the endpoint is an email address   For the email-json protocol, the endpoint is an email address   For the sms protocol, the endpoint is a phone number of an SMS-enabled device   For the sqs protocol, the endpoint is the ARN of an Amazon SQS queue   For the application protocol, the endpoint is the EndpointArn of a mobile app and device.   For the lambda protocol, the endpoint is the ARN of an AWS Lambda function.  
         */
    var Endpoint: js.UndefOr[endpoint] = js.undefined
    /**
         * The protocol you want to use. Supported protocols include:    http – delivery of JSON-encoded message via HTTP POST    https – delivery of JSON-encoded message via HTTPS POST    email – delivery of message via SMTP    email-json – delivery of JSON-encoded message via SMTP    sms – delivery of message via SMS    sqs – delivery of JSON-encoded message to an Amazon SQS queue    application – delivery of JSON-encoded message to an EndpointArn for a mobile app and device.    lambda – delivery of JSON-encoded message to an AWS Lambda function.  
         */
    var Protocol: protocol
    /**
         * Sets whether the response from the Subscribe request includes the subscription ARN, even if the subscription is not yet confirmed. If you set this parameter to false, the response includes the ARN for confirmed subscriptions, but it includes an ARN value of "pending subscription" for subscriptions that are not yet confirmed. A subscription becomes confirmed when the subscriber calls the ConfirmSubscription action with a confirmation token. If you set this parameter to true, the response includes the ARN in all cases, even if the subscription is not yet confirmed. The default value is false.
         */
    var ReturnSubscriptionArn: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The ARN of the topic you want to subscribe to.
         */
    var TopicArn: topicARN
  }
  
  
  trait SubscribeResponse extends js.Object {
    /**
         * The ARN of the subscription if it is confirmed, or the string "pending confirmation" if the subscription requires confirmation. However, if the API request parameter ReturnSubscriptionArn is true, then the value is always the subscription ARN, even if the subscription requires confirmation.
         */
    var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
  }
  
  
  trait Subscription extends js.Object {
    /**
         * The subscription's endpoint (format depends on the protocol).
         */
    var Endpoint: js.UndefOr[endpoint] = js.undefined
    /**
         * The subscription's owner.
         */
    var Owner: js.UndefOr[account] = js.undefined
    /**
         * The subscription's protocol.
         */
    var Protocol: js.UndefOr[protocol] = js.undefined
    /**
         * The subscription's ARN.
         */
    var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    /**
         * The ARN of the subscription's topic.
         */
    var TopicArn: js.UndefOr[topicARN] = js.undefined
  }
  
  
  trait SubscriptionAttributesMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[attributeValue]
  
  
  trait Topic extends js.Object {
    /**
         * The topic's ARN.
         */
    var TopicArn: js.UndefOr[topicARN] = js.undefined
  }
  
  
  trait TopicAttributesMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[attributeValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def addPermission(params: AddPermissionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a statement to a topic's access control policy, granting access for the specified AWS accounts to the specified actions.
       */
    def addPermission(
      params: AddPermissionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
       */
    def checkIfPhoneNumberIsOptedOut(): awsDashSdkLib.libRequestMod.Request[CheckIfPhoneNumberIsOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
       */
    def checkIfPhoneNumberIsOptedOut(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckIfPhoneNumberIsOptedOutResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckIfPhoneNumberIsOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
       */
    def checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput): awsDashSdkLib.libRequestMod.Request[CheckIfPhoneNumberIsOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your account. You cannot send SMS messages to a number that is opted out. To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.
       */
    def checkIfPhoneNumberIsOptedOut(
      params: CheckIfPhoneNumberIsOptedOutInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CheckIfPhoneNumberIsOptedOutResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CheckIfPhoneNumberIsOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
       */
    def confirmSubscription(): awsDashSdkLib.libRequestMod.Request[ConfirmSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
       */
    def confirmSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfirmSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfirmSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
       */
    def confirmSubscription(params: ConfirmSubscriptionInput): awsDashSdkLib.libRequestMod.Request[ConfirmSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Verifies an endpoint owner's intent to receive messages by validating the token sent to the endpoint by an earlier Subscribe action. If the token is valid, the action creates a new subscription and returns its Amazon Resource Name (ARN). This call requires an AWS signature only when the AuthenticateOnUnsubscribe flag is set to "true".
       */
    def confirmSubscription(
      params: ConfirmSubscriptionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConfirmSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConfirmSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
       */
    def createPlatformApplication(): awsDashSdkLib.libRequestMod.Request[CreatePlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
       */
    def createPlatformApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlatformApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
       */
    def createPlatformApplication(params: CreatePlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[CreatePlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a platform application object for one of the supported push notification services, such as APNS and GCM, to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL certificate". For GCM, PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is "client id". The PlatformCredential is also received from the notification service. For WNS, PlatformPrincipal is "Package Security Identifier". For MPNS, PlatformPrincipal is "TLS certificate". For Baidu, PlatformPrincipal is "API key". For APNS/APNS_SANDBOX, PlatformCredential is "private key". For GCM, PlatformCredential is "API key". For ADM, PlatformCredential is "client secret". For WNS, PlatformCredential is "secret key". For MPNS, PlatformCredential is "private key". For Baidu, PlatformCredential is "secret key". The PlatformApplicationArn that is returned when using CreatePlatformApplication is then used as an attribute for the CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of the supported push notification services, see Getting Started with Apple Push Notification Service, Getting Started with Amazon Device Messaging, Getting Started with Baidu Cloud Push, Getting Started with Google Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS. 
       */
    def createPlatformApplication(
      params: CreatePlatformApplicationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlatformApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
       */
    def createPlatformEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
       */
    def createPlatformEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
       */
    def createPlatformEndpoint(params: CreatePlatformEndpointInput): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from CreatePlatformApplication. The EndpointArn that is returned when using CreatePlatformEndpoint can then be used by the Publish action to send a message to a mobile app or by the Subscribe action for subscription to a topic. The CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more information, see Using Amazon SNS Mobile Push Notifications.  When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId. The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint for Baidu. 
       */
    def createPlatformEndpoint(
      params: CreatePlatformEndpointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
       */
    def createTopic(): awsDashSdkLib.libRequestMod.Request[CreateTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
       */
    def createTopic(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
       */
    def createTopic(params: CreateTopicInput): awsDashSdkLib.libRequestMod.Request[CreateTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more information, see http://aws.amazon.com/sns. This action is idempotent, so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a new topic.
       */
    def createTopic(
      params: CreateTopicInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def deleteEndpoint(params: DeleteEndpointInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more information, see Using Amazon SNS Mobile Push Notifications.  When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from the topic.
       */
    def deleteEndpoint(
      params: DeleteEndpointInput,
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
    def deletePlatformApplication(params: DeletePlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a platform application object for one of the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def deletePlatformApplication(
      params: DeletePlatformApplicationInput,
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
    def deleteTopic(params: DeleteTopicInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist does not result in an error.
       */
    def deleteTopic(
      params: DeleteTopicInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getEndpointAttributes(): awsDashSdkLib.libRequestMod.Request[GetEndpointAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getEndpointAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEndpointAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEndpointAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getEndpointAttributes(params: GetEndpointAttributesInput): awsDashSdkLib.libRequestMod.Request[GetEndpointAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getEndpointAttributes(
      params: GetEndpointAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEndpointAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEndpointAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getPlatformApplicationAttributes(): awsDashSdkLib.libRequestMod.Request[GetPlatformApplicationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getPlatformApplicationAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPlatformApplicationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPlatformApplicationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput): awsDashSdkLib.libRequestMod.Request[GetPlatformApplicationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def getPlatformApplicationAttributes(
      params: GetPlatformApplicationAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPlatformApplicationAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPlatformApplicationAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
       */
    def getSMSAttributes(): awsDashSdkLib.libRequestMod.Request[GetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
       */
    def getSMSAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSMSAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
       */
    def getSMSAttributes(params: GetSMSAttributesInput): awsDashSdkLib.libRequestMod.Request[GetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the settings for sending SMS messages from your account. These settings are set with the SetSMSAttributes action.
       */
    def getSMSAttributes(
      params: GetSMSAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSMSAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a subscription.
       */
    def getSubscriptionAttributes(): awsDashSdkLib.libRequestMod.Request[GetSubscriptionAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a subscription.
       */
    def getSubscriptionAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSubscriptionAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a subscription.
       */
    def getSubscriptionAttributes(params: GetSubscriptionAttributesInput): awsDashSdkLib.libRequestMod.Request[GetSubscriptionAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a subscription.
       */
    def getSubscriptionAttributes(
      params: GetSubscriptionAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSubscriptionAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
       */
    def getTopicAttributes(): awsDashSdkLib.libRequestMod.Request[GetTopicAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
       */
    def getTopicAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTopicAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTopicAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
       */
    def getTopicAttributes(params: GetTopicAttributesInput): awsDashSdkLib.libRequestMod.Request[GetTopicAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of the user.
       */
    def getTopicAttributes(
      params: GetTopicAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTopicAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTopicAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
       */
    def listEndpointsByPlatformApplication(): awsDashSdkLib.libRequestMod.Request[ListEndpointsByPlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
       */
    def listEndpointsByPlatformApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEndpointsByPlatformApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEndpointsByPlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
       */
    def listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput): awsDashSdkLib.libRequestMod.Request[ListEndpointsByPlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of endpoints, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 30 transactions per second (TPS).
       */
    def listEndpointsByPlatformApplication(
      params: ListEndpointsByPlatformApplicationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEndpointsByPlatformApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEndpointsByPlatformApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
       */
    def listPhoneNumbersOptedOut(): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
       */
    def listPhoneNumbersOptedOut(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumbersOptedOutResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
       */
    def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them. The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone numbers. If additional phone numbers are available after the first page of results, then a NextToken string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null.
       */
    def listPhoneNumbersOptedOut(
      params: ListPhoneNumbersOptedOutInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPhoneNumbersOptedOutResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersOptedOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
       */
    def listPlatformApplications(): awsDashSdkLib.libRequestMod.Request[ListPlatformApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
       */
    def listPlatformApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlatformApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlatformApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
       */
    def listPlatformApplications(params: ListPlatformApplicationsInput): awsDashSdkLib.libRequestMod.Request[ListPlatformApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the platform application objects for the supported push notification services, such as APNS and GCM. The results for ListPlatformApplications are paginated and return a limited list of applications, up to 100. If additional records are available after the first page results, then a NextToken string will be returned. To receive the next page, you call ListPlatformApplications using the NextToken string received from the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push Notifications.  This action is throttled at 15 transactions per second (TPS).
       */
    def listPlatformApplications(
      params: ListPlatformApplicationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlatformApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlatformApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptions(): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptions(params: ListSubscriptionsInput): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptions call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptions(
      params: ListSubscriptionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptionsByTopic(): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsByTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptionsByTopic(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscriptionsByTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsByTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsByTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the subscriptions to a specific topic. Each call returns a limited list of subscriptions, up to 100. If there are more subscriptions, a NextToken is also returned. Use the NextToken parameter in a new ListSubscriptionsByTopic call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listSubscriptionsByTopic(
      params: ListSubscriptionsByTopicInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscriptionsByTopicResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionsByTopicResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listTopics(): awsDashSdkLib.libRequestMod.Request[ListTopicsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listTopics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTopicsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTopicsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listTopics(params: ListTopicsInput): awsDashSdkLib.libRequestMod.Request[ListTopicsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are more topics, a NextToken is also returned. Use the NextToken parameter in a new ListTopics call to get further results. This action is throttled at 30 transactions per second (TPS).
       */
    def listTopics(
      params: ListTopicsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTopicsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTopicsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
       */
    def optInPhoneNumber(): awsDashSdkLib.libRequestMod.Request[OptInPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
       */
    def optInPhoneNumber(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OptInPhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OptInPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
       */
    def optInPhoneNumber(params: OptInPhoneNumberInput): awsDashSdkLib.libRequestMod.Request[OptInPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to the number. You can opt in a phone number only once every 30 days.
       */
    def optInPhoneNumber(
      params: OptInPhoneNumberInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ OptInPhoneNumberResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[OptInPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
       */
    def publish(): awsDashSdkLib.libRequestMod.Request[PublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
       */
    def publish(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PublishResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
       */
    def publish(params: PublishInput): awsDashSdkLib.libRequestMod.Request[PublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends a message to an Amazon SNS topic or sends a text message (SMS message) directly to a phone number.  If you send a message to a topic, Amazon SNS delivers the message to each endpoint that is subscribed to the topic. The format of the message depends on the notification protocol for each subscribed endpoint. When a messageId is returned, the message has been saved and Amazon SNS will attempt to deliver it shortly. To use the Publish action for sending a message to a mobile endpoint, such as an app on a Kindle device or mobile phone, you must specify the EndpointArn for the TargetArn parameter. The EndpointArn is returned when making a call with the CreatePlatformEndpoint action.  For more information about formatting messages, see Send Custom Platform-Specific Payloads in Messages to Mobile Devices. 
       */
    def publish(
      params: PublishInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PublishResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def removePermission(params: RemovePermissionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a statement from a topic's access control policy.
       */
    def removePermission(
      params: RemovePermissionInput,
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
    def setEndpointAttributes(params: SetEndpointAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM and APNS. For more information, see Using Amazon SNS Mobile Push Notifications. 
       */
    def setEndpointAttributes(
      params: SetEndpointAttributesInput,
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
    def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the attributes of the platform application object for the supported push notification services, such as APNS and GCM. For more information, see Using Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status, see Using Amazon SNS Application Attributes for Message Delivery Status. 
       */
    def setPlatformApplicationAttributes(
      params: SetPlatformApplicationAttributesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
       */
    def setSMSAttributes(): awsDashSdkLib.libRequestMod.Request[SetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
       */
    def setSMSAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSMSAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
       */
    def setSMSAttributes(params: SetSMSAttributesInput): awsDashSdkLib.libRequestMod.Request[SetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports. You can override some of these settings for a single message when you use the Publish action with the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the Amazon SNS Developer Guide.
       */
    def setSMSAttributes(
      params: SetSMSAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetSMSAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetSMSAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def setSubscriptionAttributes(params: SetSubscriptionAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a subscription owner to set an attribute of the subscription to a new value.
       */
    def setSubscriptionAttributes(
      params: SetSubscriptionAttributesInput,
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
    def setTopicAttributes(params: SetTopicAttributesInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a topic owner to set an attribute of the topic to a new value.
       */
    def setTopicAttributes(
      params: SetTopicAttributesInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
       */
    def subscribe(): awsDashSdkLib.libRequestMod.Request[SubscribeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
       */
    def subscribe(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SubscribeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SubscribeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
       */
    def subscribe(params: SubscribeInput): awsDashSdkLib.libRequestMod.Request[SubscribeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Prepares to subscribe an endpoint by sending the endpoint a confirmation message. To actually create a subscription, the endpoint owner must call the ConfirmSubscription action with the token from the confirmation message. Confirmation tokens are valid for three days. This action is throttled at 100 transactions per second (TPS).
       */
    def subscribe(
      params: SubscribeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SubscribeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SubscribeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    def unsubscribe(params: UnsubscribeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the Unsubscribe call does not require authentication and the requester is not the subscription owner, a final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the topic if the Unsubscribe request was unintended. This action is throttled at 100 transactions per second (TPS).
       */
    def unsubscribe(
      params: UnsubscribeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnsubscribeInput extends js.Object {
    /**
         * The ARN of the subscription to be deleted.
         */
    var SubscriptionArn: subscriptionARN
  }
  
  val TypesNs: this.type = js.native
  type ActionsList = js.Array[action]
  type Binary = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsSnsMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DelegatesList = js.Array[delegate]
  type ListOfEndpoints = js.Array[Endpoint]
  type ListOfPlatformApplications = js.Array[PlatformApplication]
  type ListString = js.Array[String]
  type PhoneNumber = java.lang.String
  type PhoneNumberList = js.Array[PhoneNumber]
  type String = java.lang.String
  type SubscriptionsList = js.Array[Subscription]
  type TopicsList = js.Array[Topic]
  type account = java.lang.String
  type action = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2010-03-31` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type attributeName = java.lang.String
  type attributeValue = java.lang.String
  type authenticateOnUnsubscribe = java.lang.String
  type delegate = java.lang.String
  type endpoint = java.lang.String
  type label = java.lang.String
  type message = java.lang.String
  type messageId = java.lang.String
  type messageStructure = java.lang.String
  type nextToken = java.lang.String
  type protocol = java.lang.String
  type subject = java.lang.String
  type subscriptionARN = java.lang.String
  type token = java.lang.String
  type topicARN = java.lang.String
  type topicName = java.lang.String
}

