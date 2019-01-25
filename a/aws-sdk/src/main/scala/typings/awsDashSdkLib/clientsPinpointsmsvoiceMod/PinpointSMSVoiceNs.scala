package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/pinpointsmsvoice", "PinpointSMSVoice")
@js.native
object PinpointSMSVoiceNs extends js.Object {
  trait CallInstructionsMessageType extends js.Object {
    /**
      * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
      */
    var Text: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudWatchLogsDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
      */
    var IamRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the Amazon CloudWatch Log Group that you want to record events in.
      */
    var LogGroupArn: js.UndefOr[String] = js.undefined
  }
  
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * ConfigurationSetName
      */
    var ConfigurationSetName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
    /**
      * A name that identifies the event destination.
      */
    var EventDestinationName: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait CreateConfigurationSetEventDestinationResponse extends js.Object
  
  trait CreateConfigurationSetRequest extends js.Object {
    /**
      * The name that you want to give the configuration set.
      */
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
  }
  
  trait CreateConfigurationSetResponse extends js.Object
  
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * ConfigurationSetName
      */
    var ConfigurationSetName: __string
    /**
      * EventDestinationName
      */
    var EventDestinationName: __string
  }
  
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object
  
  trait DeleteConfigurationSetRequest extends js.Object {
    /**
      * ConfigurationSetName
      */
    var ConfigurationSetName: __string
  }
  
  trait DeleteConfigurationSetResponse extends js.Object
  
  trait EventDestination extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined
    /**
      * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
    var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
    /**
      * A name that identifies the event destination configuration.
      */
    var Name: js.UndefOr[String] = js.undefined
    var SnsDestination: js.UndefOr[SnsDestination] = js.undefined
  }
  
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined
    /**
      * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined
    var MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined
    var SnsDestination: js.UndefOr[SnsDestination] = js.undefined
  }
  
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    /**
      * ConfigurationSetName
      */
    var ConfigurationSetName: __string
  }
  
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations] = js.undefined
  }
  
  trait KinesisFirehoseDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
      */
    var DeliveryStreamArn: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
      */
    var IamRoleArn: js.UndefOr[String] = js.undefined
  }
  
  trait ListConfigurationSetsRequest extends js.Object {
    /**
      * A token returned from a previous call to the API that indicates the position in the list of results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Used to specify the number of items that should be returned in the response.
      */
    var PageSize: js.UndefOr[__string] = js.undefined
  }
  
  trait ListConfigurationSetsResponse extends js.Object {
    /**
      * An object that contains a list of configuration sets for your account in the current region.
      */
    var ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined
    /**
      * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
      */
    var NextToken: js.UndefOr[NextTokenString] = js.undefined
  }
  
  trait PlainTextMessageType extends js.Object {
    /**
      * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
      */
    var LanguageCode: js.UndefOr[String] = js.undefined
    /**
      * The plain (not SSML-formatted) text to deliver to the recipient.
      */
    var Text: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
      */
    var VoiceId: js.UndefOr[String] = js.undefined
  }
  
  trait SSMLMessageType extends js.Object {
    /**
      * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
      */
    var LanguageCode: js.UndefOr[String] = js.undefined
    /**
      * The SSML-formatted text to deliver to the recipient.
      */
    var Text: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
      */
    var VoiceId: js.UndefOr[String] = js.undefined
  }
  
  trait SendVoiceMessageRequest extends js.Object {
    /**
      * The phone number that appears on recipients' devices when they receive the message.
      */
    var CallerId: js.UndefOr[String] = js.undefined
    /**
      * The name of the configuration set that you want to use to send the message.
      */
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
    var Content: js.UndefOr[VoiceMessageContent] = js.undefined
    /**
      * The phone number that you want to send the voice message to.
      */
    var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
      */
    var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait SendVoiceMessageResponse extends js.Object {
    /**
      * A unique identifier for the voice message.
      */
    var MessageId: js.UndefOr[String] = js.undefined
  }
  
  trait SnsDestination extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
      */
    var TopicArn: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
      */
    def createConfigurationSet(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
      */
    def createConfigurationSet(params: CreateConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSet(
      params: CreateConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new event destination in a configuration set.
      */
    def createConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new event destination in a configuration set.
      */
    def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConfigurationSetEventDestination(
      params: CreateConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing configuration set.
      */
    def deleteConfigurationSet(): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing configuration set.
      */
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSet(
      params: DeleteConfigurationSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an event destination in a configuration set.
      */
    def deleteConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an event destination in a configuration set.
      */
    def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConfigurationSetEventDestination(
      params: DeleteConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
      */
    def getConfigurationSetEventDestinations(): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSetEventDestinations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetEventDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
      */
    def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConfigurationSetEventDestinations(
      params: GetConfigurationSetEventDestinationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConfigurationSetEventDestinationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConfigurationSetEventDestinationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
      */
    def listConfigurationSets(): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurationSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
      */
    def listConfigurationSets(params: ListConfigurationSetsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConfigurationSets(
      params: ListConfigurationSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new voice message and send it to a recipient's phone number.
      */
    def sendVoiceMessage(): awsDashSdkLib.libRequestMod.Request[SendVoiceMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendVoiceMessage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendVoiceMessageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendVoiceMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new voice message and send it to a recipient's phone number.
      */
    def sendVoiceMessage(params: SendVoiceMessageRequest): awsDashSdkLib.libRequestMod.Request[SendVoiceMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendVoiceMessage(
      params: SendVoiceMessageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendVoiceMessageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendVoiceMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
      */
    def updateConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetEventDestination(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
      */
    def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConfigurationSetEventDestination(
      params: UpdateConfigurationSetEventDestinationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationSetEventDestinationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationSetEventDestinationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    /**
      * ConfigurationSetName
      */
    var ConfigurationSetName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
    /**
      * EventDestinationName
      */
    var EventDestinationName: __string
  }
  
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object
  
  trait VoiceMessageContent extends js.Object {
    var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.undefined
    var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.undefined
    var SSMLMessage: js.UndefOr[SSMLMessageType] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationSets = js.Array[WordCharactersWithDelimiters]
  type EventDestinations = js.Array[EventDestination]
  type EventType = awsDashSdkLib.awsDashSdkLibStrings.INITIATED_CALL | awsDashSdkLib.awsDashSdkLibStrings.RINGING | awsDashSdkLib.awsDashSdkLibStrings.ANSWERED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_CALL | awsDashSdkLib.awsDashSdkLibStrings.BUSY | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.NO_ANSWER | java.lang.String
  type EventTypes = js.Array[EventType]
  type NextTokenString = java.lang.String
  type NonEmptyString = java.lang.String
  type String = java.lang.String
  type WordCharactersWithDelimiters = java.lang.String
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-09-05` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

