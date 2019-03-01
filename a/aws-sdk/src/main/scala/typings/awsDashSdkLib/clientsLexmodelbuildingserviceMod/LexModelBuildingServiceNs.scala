package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/lexmodelbuildingservice", "LexModelBuildingService")
@js.native
object LexModelBuildingServiceNs extends js.Object {
  trait BotAliasMetadata extends js.Object {
    /**
      * The name of the bot to which the alias points.
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * The version of the Amazon Lex bot to which the alias points.
      */
    var botVersion: js.UndefOr[Version] = js.undefined
    /**
      * Checksum of the bot alias.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The date that the bot alias was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot alias.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and last updated date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the bot alias.
      */
    var name: js.UndefOr[AliasName] = js.undefined
  }
  
  trait BotChannelAssociation extends js.Object {
    /**
      * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made. 
      */
    var botAlias: js.UndefOr[AliasName] = js.undefined
    /**
      * Provides information necessary to communicate with the messaging platform. 
      */
    var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined
    /**
      * The name of the Amazon Lex bot to which this association is being made.   Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio. 
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * The date that the association between the Amazon Lex bot and the channel was created. 
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A text description of the association you are creating. 
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The name of the association between the bot and the channel. 
      */
    var name: js.UndefOr[BotChannelName] = js.undefined
    /**
      * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
      */
    var status: js.UndefOr[ChannelStatus] = js.undefined
    /**
      * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot and the external messaging platform.
      */
    var `type`: js.UndefOr[ChannelType] = js.undefined
  }
  
  trait BotMetadata extends js.Object {
    /**
      * The date that the bot was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the bot. 
      */
    var name: js.UndefOr[BotName] = js.undefined
    /**
      * The status of the bot.
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The version of the bot. For a new bot, the version is always $LATEST.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait BuiltinIntentMetadata extends js.Object {
    /**
      * A unique identifier for the built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
      */
    var signature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * A list of identifiers for the locales that the intent supports.
      */
    var supportedLocales: js.UndefOr[LocaleList] = js.undefined
  }
  
  trait BuiltinIntentSlot extends js.Object {
    /**
      * A list of the slots defined for the intent.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  
  trait BuiltinSlotTypeMetadata extends js.Object {
    /**
      * A unique identifier for the built-in slot type. To find the signature for a slot type, see Slot Type Reference in the Alexa Skills Kit.
      */
    var signature: js.UndefOr[BuiltinSlotTypeSignature] = js.undefined
    /**
      * A list of target locales for the slot. 
      */
    var supportedLocales: js.UndefOr[LocaleList] = js.undefined
  }
  
  trait ChannelConfigurationMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CodeHook extends js.Object {
    /**
      * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more information, see using-lambda.
      */
    var messageVersion: MessageVersion
    /**
      * The Amazon Resource Name (ARN) of the Lambda function.
      */
    var uri: LambdaARN
  }
  
  trait CreateBotVersionRequest extends js.Object {
    /**
      * Identifies a specific revision of the $LATEST version of the bot. If you specify a checksum and the $LATEST version of the bot has a different checksum, a PreconditionFailedException exception is returned and Amazon Lex doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The name of the bot that you want to create a new version of. The name is case sensitive. 
      */
    var name: BotName
  }
  
  trait CreateBotVersionResponse extends js.Object {
    /**
      * The message that Amazon Lex uses to abort a conversation. For more information, see PutBot.
      */
    var abortStatement: js.UndefOr[Statement] = js.undefined
    /**
      * Checksum identifying the version of the bot that was created.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
      */
    var childDirected: js.UndefOr[Boolean] = js.undefined
    /**
      * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
      */
    var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
    /**
      * The date when the bot version was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
      */
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
    /**
      * An array of Intent objects. For more information, see PutBot.
      */
    var intents: js.UndefOr[IntentList] = js.undefined
    /**
      * The date when the $LATEST version of this bot was updated. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      *  Specifies the target locale for the bot. 
      */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
      * The name of the bot.
      */
    var name: js.UndefOr[BotName] = js.undefined
    /**
      *  When you send a request to create or update a bot, Amazon Lex sets the status response element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element. 
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The version of the bot. 
      */
    var version: js.UndefOr[Version] = js.undefined
    /**
      * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
      */
    var voiceId: js.UndefOr[String] = js.undefined
  }
  
  trait CreateIntentVersionRequest extends js.Object {
    /**
      * Checksum of the $LATEST version of the intent that should be used to create the new version. If you specify a checksum and the $LATEST version of the intent has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The name of the intent that you want to create a new version of. The name is case sensitive. 
      */
    var name: IntentName
  }
  
  trait CreateIntentVersionResponse extends js.Object {
    /**
      * Checksum of the intent version created.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * After the Lambda function specified in the fulfillmentActivity field fulfills the intent, Amazon Lex conveys this statement to the user. 
      */
    var conclusionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * If defined, the prompt that Amazon Lex uses to confirm the user's intent before fulfilling it. 
      */
    var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
    /**
      * The date that the intent was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the intent.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If defined, Amazon Lex invokes this Lambda function for each user input.
      */
    var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
    /**
      * If defined, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. 
      */
    var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
    /**
      *  Describes how the intent is fulfilled. 
      */
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
    /**
      * The date that the intent was updated. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the intent.
      */
    var name: js.UndefOr[IntentName] = js.undefined
    /**
      * A unique identifier for a built-in intent.
      */
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
      */
    var rejectionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * An array of sample utterances configured for the intent. 
      */
    var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
    /**
      * An array of slot types that defines the information required to fulfill the intent.
      */
    var slots: js.UndefOr[SlotList] = js.undefined
    /**
      * The version number assigned to the new version of the intent.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait CreateSlotTypeVersionRequest extends js.Object {
    /**
      * Checksum for the $LATEST version of the slot type that you want to publish. If you specify a checksum and the $LATEST version of the slot type has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish the new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The name of the slot type that you want to create a new version for. The name is case sensitive. 
      */
    var name: SlotTypeName
  }
  
  trait CreateSlotTypeVersionResponse extends js.Object {
    /**
      * Checksum of the $LATEST version of the slot type.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The date that the slot type was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the slot type.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * A list of EnumerationValue objects that defines the values that the slot type can take.
      */
    var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
    /**
      * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the slot type.
      */
    var name: js.UndefOr[SlotTypeName] = js.undefined
    /**
      * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
      */
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
    /**
      * The version assigned to the new slot type version. 
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DeleteBotAliasRequest extends js.Object {
    /**
      * The name of the bot that the alias points to.
      */
    var botName: BotName
    /**
      * The name of the alias to delete. The name is case sensitive. 
      */
    var name: AliasName
  }
  
  trait DeleteBotChannelAssociationRequest extends js.Object {
    /**
      * An alias that points to the specific version of the Amazon Lex bot to which this association is being made.
      */
    var botAlias: AliasName
    /**
      * The name of the Amazon Lex bot.
      */
    var botName: BotName
    /**
      * The name of the association. The name is case sensitive. 
      */
    var name: BotChannelName
  }
  
  trait DeleteBotRequest extends js.Object {
    /**
      * The name of the bot. The name is case sensitive. 
      */
    var name: BotName
  }
  
  trait DeleteBotVersionRequest extends js.Object {
    /**
      * The name of the bot.
      */
    var name: BotName
    /**
      * The version of the bot to delete. You cannot delete the $LATEST version of the bot. To delete the $LATEST version, use the DeleteBot operation.
      */
    var version: NumericalVersion
  }
  
  trait DeleteIntentRequest extends js.Object {
    /**
      * The name of the intent. The name is case sensitive. 
      */
    var name: IntentName
  }
  
  trait DeleteIntentVersionRequest extends js.Object {
    /**
      * The name of the intent.
      */
    var name: IntentName
    /**
      * The version of the intent to delete. You cannot delete the $LATEST version of the intent. To delete the $LATEST version, use the DeleteIntent operation.
      */
    var version: NumericalVersion
  }
  
  trait DeleteSlotTypeRequest extends js.Object {
    /**
      * The name of the slot type. The name is case sensitive. 
      */
    var name: SlotTypeName
  }
  
  trait DeleteSlotTypeVersionRequest extends js.Object {
    /**
      * The name of the slot type.
      */
    var name: SlotTypeName
    /**
      * The version of the slot type to delete. You cannot delete the $LATEST version of the slot type. To delete the $LATEST version, use the DeleteSlotType operation.
      */
    var version: NumericalVersion
  }
  
  trait DeleteUtterancesRequest extends js.Object {
    /**
      * The name of the bot that stored the utterances.
      */
    var botName: BotName
    /**
      *  The unique identifier for the user that made the utterances. This is the user ID that was sent in the PostContent or PostText operation request that contained the utterance.
      */
    var userId: UserId
  }
  
  trait EnumerationValue extends js.Object {
    /**
      * Additional values related to the slot type value.
      */
    var synonyms: js.UndefOr[SynonymList] = js.undefined
    /**
      * The value of the slot type.
      */
    var value: Value
  }
  
  trait FollowUpPrompt extends js.Object {
    /**
      * Prompts for information from the user. 
      */
    var prompt: Prompt
    /**
      * If the user answers "no" to the question defined in the prompt field, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
      */
    var rejectionStatement: Statement
  }
  
  trait FulfillmentActivity extends js.Object {
    /**
      *  A description of the Lambda function that is run to fulfill the intent. 
      */
    var codeHook: js.UndefOr[CodeHook] = js.undefined
    /**
      *  How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the client application. 
      */
    var `type`: FulfillmentActivityType
  }
  
  trait GetBotAliasRequest extends js.Object {
    /**
      * The name of the bot.
      */
    var botName: BotName
    /**
      * The name of the bot alias. The name is case sensitive.
      */
    var name: AliasName
  }
  
  trait GetBotAliasResponse extends js.Object {
    /**
      * The name of the bot that the alias points to.
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * The version of the bot that the alias points to.
      */
    var botVersion: js.UndefOr[Version] = js.undefined
    /**
      * Checksum of the bot alias.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The date that the bot alias was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot alias.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the bot alias.
      */
    var name: js.UndefOr[AliasName] = js.undefined
  }
  
  trait GetBotAliasesRequest extends js.Object {
    /**
      * The name of the bot.
      */
    var botName: BotName
    /**
      * The maximum number of aliases to return in the response. The default is 50. . 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
      */
    var nameContains: js.UndefOr[AliasName] = js.undefined
    /**
      * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotAliasesResponse extends js.Object {
    /**
      * An array of BotAliasMetadata objects, each describing a bot alias.
      */
    var BotAliases: js.UndefOr[BotAliasMetadataList] = js.undefined
    /**
      * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotChannelAssociationRequest extends js.Object {
    /**
      * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
      */
    var botAlias: AliasName
    /**
      * The name of the Amazon Lex bot.
      */
    var botName: BotName
    /**
      * The name of the association between the bot and the channel. The name is case sensitive. 
      */
    var name: BotChannelName
  }
  
  trait GetBotChannelAssociationResponse extends js.Object {
    /**
      * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
      */
    var botAlias: js.UndefOr[AliasName] = js.undefined
    /**
      * Provides information that the messaging platform needs to communicate with the Amazon Lex bot.
      */
    var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined
    /**
      * The name of the Amazon Lex bot.
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * The date that the association between the bot and the channel was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the association between the bot and the channel.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The name of the association between the bot and the channel.
      */
    var name: js.UndefOr[BotChannelName] = js.undefined
    /**
      * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
      */
    var status: js.UndefOr[ChannelStatus] = js.undefined
    /**
      * The type of the messaging platform.
      */
    var `type`: js.UndefOr[ChannelType] = js.undefined
  }
  
  trait GetBotChannelAssociationsRequest extends js.Object {
    /**
      * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
      */
    var botAlias: AliasNameOrListAll
    /**
      * The name of the Amazon Lex bot in the association.
      */
    var botName: BotName
    /**
      * The maximum number of associations to return in the response. The default is 50. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Substring to match in channel association names. An association will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel associations, use a hyphen ("-") as the nameContains parameter.
      */
    var nameContains: js.UndefOr[BotChannelName] = js.undefined
    /**
      * A pagination token for fetching the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotChannelAssociationsResponse extends js.Object {
    /**
      * An array of objects, one for each association, that provides information about the Amazon Lex bot and its association with the channel. 
      */
    var botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.undefined
    /**
      * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotRequest extends js.Object {
    /**
      * The name of the bot. The name is case sensitive. 
      */
    var name: BotName
    /**
      * The version or alias of the bot.
      */
    var versionOrAlias: String
  }
  
  trait GetBotResponse extends js.Object {
    /**
      * The message that Amazon Lex returns when the user elects to end the conversation without completing it. For more information, see PutBot.
      */
    var abortStatement: js.UndefOr[Statement] = js.undefined
    /**
      * Checksum of the bot used to identify a specific revision of the bot's $LATEST version.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
      */
    var childDirected: js.UndefOr[Boolean] = js.undefined
    /**
      * The message Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
      */
    var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
    /**
      * The date that the bot was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If status is FAILED, Amazon Lex explains why it failed to build the bot.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
      */
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
    /**
      * An array of intent objects. For more information, see PutBot.
      */
    var intents: js.UndefOr[IntentList] = js.undefined
    /**
      * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The target locale for the bot. 
      */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
      * The name of the bot.
      */
    var name: js.UndefOr[BotName] = js.undefined
    /**
      * The status of the bot. If the bot is ready to run, the status is READY. If there was a problem with building the bot, the status is FAILED and the failureReason explains why the bot did not build. If the bot was saved but not built, the status is NOT BUILT.
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The version of the bot. For a new bot, the version is always $LATEST.
      */
    var version: js.UndefOr[Version] = js.undefined
    /**
      * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
      */
    var voiceId: js.UndefOr[String] = js.undefined
  }
  
  trait GetBotVersionsRequest extends js.Object {
    /**
      * The maximum number of bot versions to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the bot for which versions should be returned.
      */
    var name: BotName
    /**
      * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotVersionsResponse extends js.Object {
    /**
      * An array of BotMetadata objects, one for each numbered version of the bot plus one for the $LATEST version.
      */
    var bots: js.UndefOr[BotMetadataList] = js.undefined
    /**
      * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotsRequest extends js.Object {
    /**
      * The maximum number of bots to return in the response that the request will return. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Substring to match in bot names. A bot will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
      */
    var nameContains: js.UndefOr[BotName] = js.undefined
    /**
      * A pagination token that fetches the next page of bots. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of bots, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBotsResponse extends js.Object {
    /**
      * An array of botMetadata objects, with one entry for each bot. 
      */
    var bots: js.UndefOr[BotMetadataList] = js.undefined
    /**
      * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of bots. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBuiltinIntentRequest extends js.Object {
    /**
      * The unique identifier for a built-in intent. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
      */
    var signature: BuiltinIntentSignature
  }
  
  trait GetBuiltinIntentResponse extends js.Object {
    /**
      * The unique identifier for a built-in intent.
      */
    var signature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * An array of BuiltinIntentSlot objects, one entry for each slot type in the intent.
      */
    var slots: js.UndefOr[BuiltinIntentSlotList] = js.undefined
    /**
      * A list of locales that the intent supports.
      */
    var supportedLocales: js.UndefOr[LocaleList] = js.undefined
  }
  
  trait GetBuiltinIntentsRequest extends js.Object {
    /**
      * A list of locales that the intent supports.
      */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
      * The maximum number of intents to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, use the pagination token in the next request.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
      */
    var signatureContains: js.UndefOr[String] = js.undefined
  }
  
  trait GetBuiltinIntentsResponse extends js.Object {
    /**
      * An array of builtinIntentMetadata objects, one for each intent in the response.
      */
    var intents: js.UndefOr[BuiltinIntentMetadataList] = js.undefined
    /**
      * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetBuiltinSlotTypesRequest extends js.Object {
    /**
      * A list of locales that the slot type supports.
      */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
      * The maximum number of slot types to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of slot types, specify the pagination token in the next request.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Substring to match in built-in slot type signatures. A slot type will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
      */
    var signatureContains: js.UndefOr[String] = js.undefined
  }
  
  trait GetBuiltinSlotTypesResponse extends js.Object {
    /**
      * If the response is truncated, the response includes a pagination token that you can use in your next request to fetch the next page of slot types.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of BuiltInSlotTypeMetadata objects, one entry for each slot type returned.
      */
    var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.undefined
  }
  
  trait GetExportRequest extends js.Object {
    /**
      * The format of the exported data.
      */
    var exportType: ExportType
    /**
      * The name of the bot to export.
      */
    var name: Name
    /**
      * The type of resource to export. 
      */
    var resourceType: ResourceType
    /**
      * The version of the bot to export.
      */
    var version: NumericalVersion
  }
  
  trait GetExportResponse extends js.Object {
    /**
      * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
      */
    var exportStatus: js.UndefOr[ExportStatus] = js.undefined
    /**
      * The format of the exported data.
      */
    var exportType: js.UndefOr[ExportType] = js.undefined
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The name of the bot being exported.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The type of the exported resource.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
      */
    var url: js.UndefOr[String] = js.undefined
    /**
      * The version of the bot being exported.
      */
    var version: js.UndefOr[NumericalVersion] = js.undefined
  }
  
  trait GetImportRequest extends js.Object {
    /**
      * The identifier of the import job information to return.
      */
    var importId: String
  }
  
  trait GetImportResponse extends js.Object {
    /**
      * A timestamp for the date and time that the import job was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A string that describes why an import job failed to complete.
      */
    var failureReason: js.UndefOr[StringList] = js.undefined
    /**
      * The identifier for the specific import job.
      */
    var importId: js.UndefOr[String] = js.undefined
    /**
      * The status of the import job. If the status is FAILED, you can get the reason for the failure from the failureReason field.
      */
    var importStatus: js.UndefOr[ImportStatus] = js.undefined
    /**
      * The action taken when there was a conflict between an existing resource and a resource in the import file.
      */
    var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
    /**
      * The name given to the import job.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The type of resource imported.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait GetIntentRequest extends js.Object {
    /**
      * The name of the intent. The name is case sensitive. 
      */
    var name: IntentName
    /**
      * The version of the intent.
      */
    var version: Version
  }
  
  trait GetIntentResponse extends js.Object {
    /**
      * Checksum of the intent.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * After the Lambda function specified in the fulfillmentActivity element fulfills the intent, Amazon Lex conveys this statement to the user.
      */
    var conclusionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For more information, see PutIntent. 
      */
    var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
    /**
      * The date that the intent was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the intent.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information, see PutIntent. 
      */
    var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
    /**
      * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. For more information, see PutIntent.
      */
    var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
    /**
      * Describes how the intent is fulfilled. For more information, see PutIntent. 
      */
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
    /**
      * The date that the intent was updated. When you create a resource, the creation date and the last updated date are the same. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the intent.
      */
    var name: js.UndefOr[IntentName] = js.undefined
    /**
      * A unique identifier for a built-in intent.
      */
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
      */
    var rejectionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * An array of sample utterances configured for the intent.
      */
    var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
    /**
      * An array of intent slots configured for the intent.
      */
    var slots: js.UndefOr[SlotList] = js.undefined
    /**
      * The version of the intent.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait GetIntentVersionsRequest extends js.Object {
    /**
      * The maximum number of intent versions to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the intent for which versions should be returned.
      */
    var name: IntentName
    /**
      * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetIntentVersionsResponse extends js.Object {
    /**
      * An array of IntentMetadata objects, one for each numbered version of the intent plus one for the $LATEST version.
      */
    var intents: js.UndefOr[IntentMetadataList] = js.undefined
    /**
      * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetIntentsRequest extends js.Object {
    /**
      * The maximum number of intents to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Substring to match in intent names. An intent will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
      */
    var nameContains: js.UndefOr[IntentName] = js.undefined
    /**
      * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetIntentsResponse extends js.Object {
    /**
      * An array of Intent objects. For more information, see PutBot.
      */
    var intents: js.UndefOr[IntentMetadataList] = js.undefined
    /**
      * If the response is truncated, the response includes a pagination token that you can specify in your next request to fetch the next page of intents. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetSlotTypeRequest extends js.Object {
    /**
      * The name of the slot type. The name is case sensitive. 
      */
    var name: SlotTypeName
    /**
      * The version of the slot type. 
      */
    var version: Version
  }
  
  trait GetSlotTypeResponse extends js.Object {
    /**
      * Checksum of the $LATEST version of the slot type.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The date that the slot type was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the slot type.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * A list of EnumerationValue objects that defines the values that the slot type can take.
      */
    var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
    /**
      * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the slot type.
      */
    var name: js.UndefOr[SlotTypeName] = js.undefined
    /**
      * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
      */
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
    /**
      * The version of the slot type.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait GetSlotTypeVersionsRequest extends js.Object {
    /**
      * The maximum number of slot type versions to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the slot type for which versions should be returned.
      */
    var name: SlotTypeName
    /**
      * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetSlotTypeVersionsResponse extends js.Object {
    /**
      * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of SlotTypeMetadata objects, one for each numbered version of the slot type plus one for the $LATEST version.
      */
    var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
  }
  
  trait GetSlotTypesRequest extends js.Object {
    /**
      * The maximum number of slot types to return in the response. The default is 10.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * Substring to match in slot type names. A slot type will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
      */
    var nameContains: js.UndefOr[SlotTypeName] = js.undefined
    /**
      * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch next page of slot types, specify the pagination token in the next request.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait GetSlotTypesResponse extends js.Object {
    /**
      * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of slot types.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * An array of objects, one for each slot type, that provides information such as the name of the slot type, the version, and a description.
      */
    var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
  }
  
  trait GetUtterancesViewRequest extends js.Object {
    /**
      * The name of the bot for which utterance information should be returned.
      */
    var botName: BotName
    /**
      * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
      */
    var botVersions: BotVersions
    /**
      * To return utterances that were recognized and handled, useDetected. To return utterances that were not recognized, use Missed.
      */
    var statusType: StatusType
  }
  
  trait GetUtterancesViewResponse extends js.Object {
    /**
      * The name of the bot for which utterance information was returned.
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * An array of UtteranceList objects, each containing a list of UtteranceData objects describing the utterances that were processed by your bot. The response contains a maximum of 100 UtteranceData objects for each version.
      */
    var utterances: js.UndefOr[ListsOfUtterances] = js.undefined
  }
  
  trait Intent extends js.Object {
    /**
      * The name of the intent.
      */
    var intentName: IntentName
    /**
      * The version of the intent.
      */
    var intentVersion: Version
  }
  
  trait IntentMetadata extends js.Object {
    /**
      * The date that the intent was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the intent.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the intent was updated. When you create an intent, the creation date and last updated date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the intent.
      */
    var name: js.UndefOr[IntentName] = js.undefined
    /**
      * The version of the intent.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait Message extends js.Object {
    /**
      * The text of the message.
      */
    var content: ContentString
    /**
      * The content type of the message string.
      */
    var contentType: ContentType
    /**
      * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex returns one message from each group in the response.
      */
    var groupNumber: js.UndefOr[GroupNumber] = js.undefined
  }
  
  trait Prompt extends js.Object {
    /**
      * The number of times to prompt the user for information.
      */
    var maxAttempts: PromptMaxAttempts
    /**
      * An array of objects, each of which provides a message string and its type. You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
      */
    var messages: MessageList
    /**
      * A response card. Amazon Lex uses this prompt at runtime, in the PostText API response. It substitutes session attributes and slot values for placeholders in the response card. For more information, see ex-resp-card. 
      */
    var responseCard: js.UndefOr[ResponseCard] = js.undefined
  }
  
  trait PutBotAliasRequest extends js.Object {
    /**
      * The name of the bot.
      */
    var botName: BotName
    /**
      * The version of the bot.
      */
    var botVersion: Version
    /**
      * Identifies a specific revision of the $LATEST version. When you create a new bot alias, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot alias, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * A description of the alias.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the alias. The name is not case sensitive.
      */
    var name: AliasName
  }
  
  trait PutBotAliasResponse extends js.Object {
    /**
      * The name of the bot that the alias points to.
      */
    var botName: js.UndefOr[BotName] = js.undefined
    /**
      * The version of the bot that the alias points to.
      */
    var botVersion: js.UndefOr[Version] = js.undefined
    /**
      * The checksum for the current version of the alias.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * The date that the bot alias was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the alias.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the alias.
      */
    var name: js.UndefOr[AliasName] = js.undefined
  }
  
  trait PutBotRequest extends js.Object {
    /**
      * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times. After that, Amazon Lex sends the message defined in abortStatement to the user, and then aborts the conversation. To set the number of retries, use the valueElicitationPrompt field for the slot type.  For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a correct response a few more times.  For example, in a pizza ordering application, OrderPizza might be one of the intents. This intent might require the CrustType slot. You specify the valueElicitationPrompt field when you create the CrustType slot.
      */
    var abortStatement: js.UndefOr[Statement] = js.undefined
    /**
      * Identifies a specific revision of the $LATEST version. When you create a new bot, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
      */
    var childDirected: Boolean
    /**
      * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how many times Amazon Lex should repeate the clarification prompt, use the maxAttempts field. If Amazon Lex still doesn't understand, it sends the message in the abortStatement field.  When you create a clarification prompt, make sure that it suggests the correct response from the user. for example, for a bot that orders pizza and drinks, you might create this clarification prompt: "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
      */
    var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * A description of the bot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. A user interaction session remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information that it gathered, and the user must start over. If you don't include the idleSessionTTLInSeconds element in a PutBot operation request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot. The default is 300 seconds (5 minutes).
      */
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
    /**
      * An array of Intent objects. Each intent represents a command that a user can express. For example, a pizza ordering bot might support an OrderPizza intent. For more information, see how-it-works.
      */
    var intents: js.UndefOr[IntentList] = js.undefined
    /**
      *  Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.  The default is en-US.
      */
    var locale: Locale
    /**
      * The name of the bot. The name is not case sensitive. 
      */
    var name: BotName
    /**
      * If you set the processBehavior element to BUILD, Amazon Lex builds the bot so that it can be run. If you set the element to SAVE Amazon Lex saves the bot, but doesn't build it.  If you don't specify this value, the default value is BUILD.
      */
    var processBehavior: js.UndefOr[ProcessBehavior] = js.undefined
    /**
      * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see Available Voices in the Amazon Polly Developer Guide.
      */
    var voiceId: js.UndefOr[String] = js.undefined
  }
  
  trait PutBotResponse extends js.Object {
    /**
      * The message that Amazon Lex uses to abort a conversation. For more information, see PutBot.
      */
    var abortStatement: js.UndefOr[Statement] = js.undefined
    /**
      * Checksum of the bot that you created.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
      */
    var childDirected: js.UndefOr[Boolean] = js.undefined
    /**
      *  The prompts that Amazon Lex uses when it doesn't understand the user's intent. For more information, see PutBot. 
      */
    var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * The date that the bot was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the bot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
      */
    var failureReason: js.UndefOr[String] = js.undefined
    /**
      * The maximum length of time that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
      */
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
    /**
      * An array of Intent objects. For more information, see PutBot.
      */
    var intents: js.UndefOr[IntentList] = js.undefined
    /**
      * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The target locale for the bot. 
      */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
      * The name of the bot.
      */
    var name: js.UndefOr[BotName] = js.undefined
    /**
      *  When you send a request to create a bot with processBehavior set to BUILD, Amazon Lex sets the status response element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't build the bot, Amazon Lex sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element.  When you set processBehaviorto SAVE, Amazon Lex sets the status code to NOT BUILT.
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The version of the bot. For a new bot, the version is always $LATEST.
      */
    var version: js.UndefOr[Version] = js.undefined
    /**
      * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
      */
    var voiceId: js.UndefOr[String] = js.undefined
  }
  
  trait PutIntentRequest extends js.Object {
    /**
      * Identifies a specific revision of the $LATEST version. When you create a new intent, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a intent, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      *  The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the Lambda function.  This element is relevant only if you provide a Lambda function in the fulfillmentActivity. If you return the intent to the client application, you can't specify this element.  The followUpPrompt and conclusionStatement are mutually exclusive. You can specify only one. 
      */
    var conclusionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * Prompts the user to confirm the intent. This question should have a yes or no answer. Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For example, with the OrderPizza intent, you might want to confirm that the order is correct before placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask the user for confirmation before providing the information.   You you must provide both the rejectionStatement and the confirmationPrompt, or neither. 
      */
    var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * A description of the intent.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      *  Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize user interaction.  For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's information from a backend database and prepopulate some of the values. For example, if you find that John is gluten intolerant, you might set the corresponding intent slot, GlutenIntolerant, to true. You might find John's phone number and set the corresponding session attribute. 
      */
    var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
    /**
      * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the user to order a drink. The action that Amazon Lex takes depends on the user's response, as follows:   If the user says "Yes" it responds with the clarification prompt that is configured for the bot.   if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the intent.   If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.   If it doesn't recognize the utterance it repeats the follow-up prompt again.   The followUpPrompt field and the conclusionStatement field are mutually exclusive. You can specify only one. 
      */
    var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
    /**
      * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a pizza order, fulfillmentActivity defines how the bot places an order with a local pizza store.   You might configure Amazon Lex to return all of the intent information to the client application, or direct it to invoke a Lambda function that can process the intent (for example, place an order with a pizzeria). 
      */
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
    /**
      * The name of the intent. The name is not case sensitive.  The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example, because there is a built-in intent called AMAZON.HelpIntent, you can't create a custom intent called HelpIntent. For a list of built-in intents, see Standard Built-in Intents in the Alexa Skills Kit.
      */
    var name: IntentName
    /**
      * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
      */
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * When the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled.   You must provide both the rejectionStatement and the confirmationPrompt, or neither. 
      */
    var rejectionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * An array of utterances (strings) that a user might say to signal the intent. For example, "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".  In each utterance, a slot name is enclosed in curly braces. 
      */
    var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
    /**
      * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined in the slots. For more information, see how-it-works. 
      */
    var slots: js.UndefOr[SlotList] = js.undefined
  }
  
  trait PutIntentResponse extends js.Object {
    /**
      * Checksum of the $LATESTversion of the intent created or updated.
      */
    var checksum: js.UndefOr[String] = js.undefined
    /**
      * After the Lambda function specified in thefulfillmentActivityintent fulfills the intent, Amazon Lex conveys this statement to the user.
      */
    var conclusionStatement: js.UndefOr[Statement] = js.undefined
    /**
      * If defined in the intent, Amazon Lex prompts the user to confirm the intent before fulfilling it.
      */
    var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * The date that the intent was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the intent.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * If defined in the intent, Amazon Lex invokes this Lambda function for each user input.
      */
    var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
    /**
      * If defined in the intent, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled.
      */
    var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
    /**
      * If defined in the intent, Amazon Lex invokes this Lambda function to fulfill the intent after the user provides all of the information required by the intent.
      */
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
    /**
      * The date that the intent was updated. When you create a resource, the creation date and last update dates are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the intent.
      */
    var name: js.UndefOr[IntentName] = js.undefined
    /**
      * A unique identifier for the built-in intent that this intent is based on.
      */
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
    /**
      * If the user answers "no" to the question defined in confirmationPrompt Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
      */
    var rejectionStatement: js.UndefOr[Statement] = js.undefined
    /**
      *  An array of sample utterances that are configured for the intent. 
      */
    var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
    /**
      * An array of intent slots that are configured for the intent.
      */
    var slots: js.UndefOr[SlotList] = js.undefined
    /**
      * The version of the intent. For a new intent, the version is always $LATEST.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait PutSlotTypeRequest extends js.Object {
    /**
      * Identifies a specific revision of the $LATEST version. When you create a new slot type, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a slot type, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
      */
    var checksum: js.UndefOr[String] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * A description of the slot type.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * A list of EnumerationValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, which are additional values that help train the machine learning model about the values that it resolves for a slot.  When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not using a Lambda function you can choose to return the value that the user entered or the first value in the resolution list as the slot value. The valueSelectionStrategy field indicates the option to use. 
      */
    var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
    /**
      * The name of the slot type. The name is not case sensitive.  The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example, because there is a built-in slot type called AMAZON.DATE, you can't create a custom slot type called DATE. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.
      */
    var name: SlotTypeName
    /**
      * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:    ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to the slot value.    TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is ORIGINAL_VALUE.
      */
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
  }
  
  trait PutSlotTypeResponse extends js.Object {
    /**
      * Checksum of the $LATEST version of the slot type.
      */
    var checksum: js.UndefOr[String] = js.undefined
    var createVersion: js.UndefOr[Boolean] = js.undefined
    /**
      * The date that the slot type was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the slot type.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * A list of EnumerationValue objects that defines the values that the slot type can take.
      */
    var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
    /**
      * The date that the slot type was updated. When you create a slot type, the creation date and last update date are the same.
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the slot type.
      */
    var name: js.UndefOr[SlotTypeName] = js.undefined
    /**
      * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
      */
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
    /**
      * The version of the slot type. For a new slot type, the version is always $LATEST. 
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait Slot extends js.Object {
    /**
      * A description of the slot.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the slot.
      */
    var name: SlotName
    /**
      *  Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
      */
    var priority: js.UndefOr[Priority] = js.undefined
    /**
      *  A set of possible responses for the slot type used by text-based clients. A user chooses an option from the response card, instead of using text to reply. 
      */
    var responseCard: js.UndefOr[ResponseCard] = js.undefined
    /**
      *  If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of understanding user utterances. 
      */
    var sampleUtterances: js.UndefOr[SlotUtteranceList] = js.undefined
    /**
      * Specifies whether the slot is required or optional. 
      */
    var slotConstraint: SlotConstraint
    /**
      * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
      */
    var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined
    /**
      * The version of the slot type.
      */
    var slotTypeVersion: js.UndefOr[Version] = js.undefined
    /**
      * The prompt that Amazon Lex uses to elicit the slot value from the user.
      */
    var valueElicitationPrompt: js.UndefOr[Prompt] = js.undefined
  }
  
  trait SlotTypeMetadata extends js.Object {
    /**
      * The date that the slot type was created.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * A description of the slot type.
      */
    var description: js.UndefOr[Description] = js.undefined
    /**
      * The date that the slot type was updated. When you create a resource, the creation date and last updated date are the same. 
      */
    var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the slot type.
      */
    var name: js.UndefOr[SlotTypeName] = js.undefined
    /**
      * The version of the slot type.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait StartImportRequest extends js.Object {
    /**
      * Specifies the action that the StartImport operation should take when there is an existing resource with the same name.   FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file and an existing resource. The name of the resource causing the conflict is in the failureReason field of the response to the GetImport operation. OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The $LASTEST version of the existing resource is overwritten with the data from the import file.  
      */
    var mergeStrategy: MergeStrategy
    /**
      * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to import. The resource should match the type specified in the resourceType field.
      */
    var payload: _Blob
    /**
      * Specifies the type of resource to export. Each resource also exports any resources that it depends on.    A bot exports dependent intents.   An intent exports dependent slot types.  
      */
    var resourceType: ResourceType
  }
  
  trait StartImportResponse extends js.Object {
    /**
      * A timestamp for the date and time that the import job was requested.
      */
    var createdDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The identifier for the specific import job.
      */
    var importId: js.UndefOr[String] = js.undefined
    /**
      * The status of the import job. If the status is FAILED, you can get the reason for the failure using the GetImport operation.
      */
    var importStatus: js.UndefOr[ImportStatus] = js.undefined
    /**
      * The action to take when there is a merge conflict.
      */
    var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
    /**
      * The name given to the import job.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The type of resource to import.
      */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait Statement extends js.Object {
    /**
      * A collection of message objects.
      */
    var messages: MessageList
    /**
      *  At runtime, if the client is using the PostText API, Amazon Lex includes the response card in the response. It substitutes all of the session attributes and slot values for placeholders in the response card. 
      */
    var responseCard: js.UndefOr[ResponseCard] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
      */
    def createBotVersion(): awsDashSdkLib.libRequestMod.Request[CreateBotVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBotVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBotVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBotVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
      */
    def createBotVersion(params: CreateBotVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateBotVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBotVersion(
      params: CreateBotVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBotVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBotVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
      */
    def createIntentVersion(): awsDashSdkLib.libRequestMod.Request[CreateIntentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIntentVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIntentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIntentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
      */
    def createIntentVersion(params: CreateIntentVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateIntentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIntentVersion(
      params: CreateIntentVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIntentVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIntentVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
      */
    def createSlotTypeVersion(): awsDashSdkLib.libRequestMod.Request[CreateSlotTypeVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSlotTypeVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSlotTypeVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSlotTypeVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
      */
    def createSlotTypeVersion(params: CreateSlotTypeVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateSlotTypeVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSlotTypeVersion(
      params: CreateSlotTypeVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSlotTypeVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSlotTypeVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
      */
    def deleteBot(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBot(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
      */
    def deleteBot(params: DeleteBotRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBot(
      params: DeleteBotRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
      */
    def deleteBotAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
      */
    def deleteBotAlias(params: DeleteBotAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotAlias(
      params: DeleteBotAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
      */
    def deleteBotChannelAssociation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotChannelAssociation(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
      */
    def deleteBotChannelAssociation(params: DeleteBotChannelAssociationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotChannelAssociation(
      params: DeleteBotChannelAssociationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
      */
    def deleteBotVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
      */
    def deleteBotVersion(params: DeleteBotVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBotVersion(
      params: DeleteBotVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
      */
    def deleteIntent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIntent(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
      */
    def deleteIntent(params: DeleteIntentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIntent(
      params: DeleteIntentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
      */
    def deleteIntentVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIntentVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
      */
    def deleteIntentVersion(params: DeleteIntentVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIntentVersion(
      params: DeleteIntentVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
      */
    def deleteSlotType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSlotType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
      */
    def deleteSlotType(params: DeleteSlotTypeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSlotType(
      params: DeleteSlotTypeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
      */
    def deleteSlotTypeVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSlotTypeVersion(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
      */
    def deleteSlotTypeVersion(params: DeleteSlotTypeVersionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSlotTypeVersion(
      params: DeleteSlotTypeVersionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user. This operation requires permissions for the lex:DeleteUtterances action.
      */
    def deleteUtterances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUtterances(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user. This operation requires permissions for the lex:DeleteUtterances action.
      */
    def deleteUtterances(params: DeleteUtterancesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUtterances(
      params: DeleteUtterancesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
      */
    def getBot(): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBot(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
      */
    def getBot(params: GetBotRequest): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBot(
      params: GetBotRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
      */
    def getBotAlias(): awsDashSdkLib.libRequestMod.Request[GetBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
      */
    def getBotAlias(params: GetBotAliasRequest): awsDashSdkLib.libRequestMod.Request[GetBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotAlias(
      params: GetBotAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
      */
    def getBotAliases(): awsDashSdkLib.libRequestMod.Request[GetBotAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
      */
    def getBotAliases(params: GetBotAliasesRequest): awsDashSdkLib.libRequestMod.Request[GetBotAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotAliases(
      params: GetBotAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
      */
    def getBotChannelAssociation(): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotChannelAssociation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotChannelAssociationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
      */
    def getBotChannelAssociation(params: GetBotChannelAssociationRequest): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotChannelAssociation(
      params: GetBotChannelAssociationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotChannelAssociationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
      */
    def getBotChannelAssociations(): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotChannelAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotChannelAssociationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
      */
    def getBotChannelAssociations(params: GetBotChannelAssociationsRequest): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotChannelAssociations(
      params: GetBotChannelAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotChannelAssociationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotChannelAssociationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
      */
    def getBotVersions(): awsDashSdkLib.libRequestMod.Request[GetBotVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
      */
    def getBotVersions(params: GetBotVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetBotVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBotVersions(
      params: GetBotVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBotVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBotVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
      */
    def getBots(): awsDashSdkLib.libRequestMod.Request[GetBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBots(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
      */
    def getBots(params: GetBotsRequest): awsDashSdkLib.libRequestMod.Request[GetBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBots(
      params: GetBotsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
      */
    def getBuiltinIntent(): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinIntent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
      */
    def getBuiltinIntent(params: GetBuiltinIntentRequest): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinIntent(
      params: GetBuiltinIntentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
      */
    def getBuiltinIntents(): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinIntents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinIntentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
      */
    def getBuiltinIntents(params: GetBuiltinIntentsRequest): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinIntents(
      params: GetBuiltinIntentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinIntentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
      */
    def getBuiltinSlotTypes(): awsDashSdkLib.libRequestMod.Request[GetBuiltinSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinSlotTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinSlotTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
      */
    def getBuiltinSlotTypes(params: GetBuiltinSlotTypesRequest): awsDashSdkLib.libRequestMod.Request[GetBuiltinSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBuiltinSlotTypes(
      params: GetBuiltinSlotTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBuiltinSlotTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBuiltinSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Exports the contents of a Amazon Lex resource in a specified format. 
      */
    def getExport(): awsDashSdkLib.libRequestMod.Request[GetExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Exports the contents of a Amazon Lex resource in a specified format. 
      */
    def getExport(params: GetExportRequest): awsDashSdkLib.libRequestMod.Request[GetExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExport(
      params: GetExportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an import job started with the StartImport operation.
      */
    def getImport(): awsDashSdkLib.libRequestMod.Request[GetImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about an import job started with the StartImport operation.
      */
    def getImport(params: GetImportRequest): awsDashSdkLib.libRequestMod.Request[GetImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getImport(
      params: GetImportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
      */
    def getIntent(): awsDashSdkLib.libRequestMod.Request[GetIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
      */
    def getIntent(params: GetIntentRequest): awsDashSdkLib.libRequestMod.Request[GetIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntent(
      params: GetIntentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
      */
    def getIntentVersions(): awsDashSdkLib.libRequestMod.Request[GetIntentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntentVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
      */
    def getIntentVersions(params: GetIntentVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetIntentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntentVersions(
      params: GetIntentVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
      */
    def getIntents(): awsDashSdkLib.libRequestMod.Request[GetIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
      */
    def getIntents(params: GetIntentsRequest): awsDashSdkLib.libRequestMod.Request[GetIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getIntents(
      params: GetIntentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIntentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIntentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
      */
    def getSlotType(): awsDashSdkLib.libRequestMod.Request[GetSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
      */
    def getSlotType(params: GetSlotTypeRequest): awsDashSdkLib.libRequestMod.Request[GetSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotType(
      params: GetSlotTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
      */
    def getSlotTypeVersions(): awsDashSdkLib.libRequestMod.Request[GetSlotTypeVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotTypeVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypeVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypeVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
      */
    def getSlotTypeVersions(params: GetSlotTypeVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetSlotTypeVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotTypeVersions(
      params: GetSlotTypeVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypeVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypeVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
      */
    def getSlotTypes(): awsDashSdkLib.libRequestMod.Request[GetSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
      */
    def getSlotTypes(params: GetSlotTypesRequest): awsDashSdkLib.libRequestMod.Request[GetSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSlotTypes(
      params: GetSlotTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSlotTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSlotTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions in each request. The response contains information about a maximum of 100 utterances for each version.  This operation requires permissions for the lex:GetUtterancesView action.
      */
    def getUtterancesView(): awsDashSdkLib.libRequestMod.Request[GetUtterancesViewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUtterancesView(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUtterancesViewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUtterancesViewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions in each request. The response contains information about a maximum of 100 utterances for each version.  This operation requires permissions for the lex:GetUtterancesView action.
      */
    def getUtterancesView(params: GetUtterancesViewRequest): awsDashSdkLib.libRequestMod.Request[GetUtterancesViewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getUtterancesView(
      params: GetUtterancesViewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetUtterancesViewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetUtterancesViewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see auth-and-access-control.
      */
    def putBot(): awsDashSdkLib.libRequestMod.Request[PutBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBot(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutBotResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see auth-and-access-control.
      */
    def putBot(params: PutBotRequest): awsDashSdkLib.libRequestMod.Request[PutBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBot(
      params: PutBotRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutBotResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
      */
    def putBotAlias(): awsDashSdkLib.libRequestMod.Request[PutBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBotAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutBotAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
      */
    def putBotAlias(params: PutBotAliasRequest): awsDashSdkLib.libRequestMod.Request[PutBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBotAlias(
      params: PutBotAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutBotAliasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutBotAliasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
      */
    def putIntent(): awsDashSdkLib.libRequestMod.Request[PutIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putIntent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
      */
    def putIntent(params: PutIntentRequest): awsDashSdkLib.libRequestMod.Request[PutIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putIntent(
      params: PutIntentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutIntentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutIntentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
      */
    def putSlotType(): awsDashSdkLib.libRequestMod.Request[PutSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSlotType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSlotTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
      */
    def putSlotType(params: PutSlotTypeRequest): awsDashSdkLib.libRequestMod.Request[PutSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSlotType(
      params: PutSlotTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSlotTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSlotTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a job to import a resource to Amazon Lex.
      */
    def startImport(): awsDashSdkLib.libRequestMod.Request[StartImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a job to import a resource to Amazon Lex.
      */
    def startImport(params: StartImportRequest): awsDashSdkLib.libRequestMod.Request[StartImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImport(
      params: StartImportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UtteranceData extends js.Object {
    /**
      * The number of times that the utterance was processed.
      */
    var count: js.UndefOr[Count] = js.undefined
    /**
      * The total number of individuals that used the utterance.
      */
    var distinctUsers: js.UndefOr[Count] = js.undefined
    /**
      * The date that the utterance was first recorded.
      */
    var firstUtteredDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The date that the utterance was last recorded.
      */
    var lastUtteredDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The text that was entered by the user or the text representation of an audio clip.
      */
    var utteranceString: js.UndefOr[UtteranceString] = js.undefined
  }
  
  trait UtteranceList extends js.Object {
    /**
      * The version of the bot that processed the list.
      */
    var botVersion: js.UndefOr[Version] = js.undefined
    /**
      * One or more UtteranceData objects that contain information about the utterances that have been made to a bot. The maximum number of object is 100.
      */
    var utterances: js.UndefOr[ListOfUtterance] = js.undefined
  }
  
  trait _ChannelStatus extends js.Object
  
  trait _ChannelType extends js.Object
  
  trait _ContentType extends js.Object
  
  trait _ExportStatus extends js.Object
  
  trait _ExportType extends js.Object
  
  trait _FulfillmentActivityType extends js.Object
  
  trait _ImportStatus extends js.Object
  
  trait _Locale extends js.Object
  
  trait _MergeStrategy extends js.Object
  
  trait _ProcessBehavior extends js.Object
  
  trait _ResourceType extends js.Object
  
  trait _SlotConstraint extends js.Object
  
  trait _SlotValueSelectionStrategy extends js.Object
  
  trait _Status extends js.Object
  
  trait _StatusType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AliasName = java.lang.String
  type AliasNameOrListAll = java.lang.String
  type Boolean = scala.Boolean
  type BotAliasMetadataList = js.Array[BotAliasMetadata]
  type BotChannelAssociationList = js.Array[BotChannelAssociation]
  type BotChannelName = java.lang.String
  type BotMetadataList = js.Array[BotMetadata]
  type BotName = java.lang.String
  type BotVersions = js.Array[Version]
  type BuiltinIntentMetadataList = js.Array[BuiltinIntentMetadata]
  type BuiltinIntentSignature = java.lang.String
  type BuiltinIntentSlotList = js.Array[BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature = java.lang.String
  type ChannelStatus = _ChannelStatus | java.lang.String
  type ChannelType = _ChannelType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentString = java.lang.String
  type ContentType = _ContentType | java.lang.String
  type Count = scala.Double
  type CustomOrBuiltinSlotTypeName = java.lang.String
  type Description = java.lang.String
  type EnumerationValues = js.Array[EnumerationValue]
  type ExportStatus = _ExportStatus | java.lang.String
  type ExportType = _ExportType | java.lang.String
  type FulfillmentActivityType = _FulfillmentActivityType | java.lang.String
  type GroupNumber = scala.Double
  type ImportStatus = _ImportStatus | java.lang.String
  type IntentList = js.Array[Intent]
  type IntentMetadataList = js.Array[IntentMetadata]
  type IntentName = java.lang.String
  type IntentUtteranceList = js.Array[Utterance]
  type LambdaARN = java.lang.String
  type ListOfUtterance = js.Array[UtteranceData]
  type ListsOfUtterances = js.Array[UtteranceList]
  type Locale = _Locale | java.lang.String
  type LocaleList = js.Array[Locale]
  type MaxResults = scala.Double
  type MergeStrategy = _MergeStrategy | java.lang.String
  type MessageList = js.Array[Message]
  type MessageVersion = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumericalVersion = java.lang.String
  type Priority = scala.Double
  type ProcessBehavior = _ProcessBehavior | java.lang.String
  type PromptMaxAttempts = scala.Double
  type ResourceType = _ResourceType | java.lang.String
  type ResponseCard = java.lang.String
  type SessionTTL = scala.Double
  type SlotConstraint = _SlotConstraint | java.lang.String
  type SlotList = js.Array[Slot]
  type SlotName = java.lang.String
  type SlotTypeMetadataList = js.Array[SlotTypeMetadata]
  type SlotTypeName = java.lang.String
  type SlotUtteranceList = js.Array[Utterance]
  type SlotValueSelectionStrategy = _SlotValueSelectionStrategy | java.lang.String
  type Status = _Status | java.lang.String
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SynonymList = js.Array[Value]
  type Timestamp = stdLib.Date
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type UtteranceString = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsLexmodelbuildingserviceMod.Blob | java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

