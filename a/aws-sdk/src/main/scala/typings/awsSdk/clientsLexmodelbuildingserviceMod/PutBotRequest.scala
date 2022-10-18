package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBotRequest extends StObject {
  
  /**
    * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times. After that, Amazon Lex sends the message defined in abortStatement to the user, and then cancels the conversation. To set the number of retries, use the valueElicitationPrompt field for the slot type.  For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a correct response a few more times.  For example, in a pizza ordering application, OrderPizza might be one of the intents. This intent might require the CrustType slot. You specify the valueElicitationPrompt field when you create the CrustType slot. If you have defined a fallback intent the cancel statement will not be sent to the user, the fallback intent is used instead. For more information, see  AMAZON.FallbackIntent.
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
    * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how many times Amazon Lex should repeat the clarification prompt, use the maxAttempts field. If Amazon Lex still doesn't understand, it sends the message in the abortStatement field.  When you create a clarification prompt, make sure that it suggests the correct response from the user. for example, for a bot that orders pizza and drinks, you might create this clarification prompt: "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'" If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of times defined in the maxAttempts field. For more information, see  AMAZON.FallbackIntent. If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in three cases:    Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to get an intent.   Lambda function - When using a Lambda function, you return an ElicitIntent dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.   PutSession operation - When using the PutSession operation, you send an ElicitIntent dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.  
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
  
  /**
    * When set to true a new numbered version of the bot is created. This is the same as calling the CreateBotVersion operation. If you don't specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is false.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to enable access to natural language understanding improvements.  When you set the enableModelImprovements parameter to true you can use the nluIntentConfidenceThreshold parameter to configure confidence scores. For more information, see Confidence Scores. You can only set the enableModelImprovements parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. The Regions where you can set the enableModelImprovements parameter to true are:   US East (N. Virginia) (us-east-1)   US West (Oregon) (us-west-2)   Asia Pacific (Sydney) (ap-southeast-2)   EU (Ireland) (eu-west-1)   In other Regions, the enableModelImprovements parameter is set to true by default. In these Regions setting the parameter to false throws a ValidationException exception.
    */
  var enableModelImprovements: js.UndefOr[Boolean] = js.undefined
  
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
    * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. You must set the enableModelImprovements parameter to true to use confidence scores in the following regions.   US East (N. Virginia) (us-east-1)   US West (Oregon) (us-west-2)   Asia Pacific (Sydney) (ap-southeast-2)   EU (Ireland) (eu-west-1)   In other Regions, the enableModelImprovements parameter is set to true by default. For example, suppose a bot is configured with the confidence threshold of 0.80 and the AMAZON.FallbackIntent. Amazon Lex returns three alternative intents with the following confidence scores: IntentA (0.70), IntentB (0.60), IntentC (0.50). The response from the PostText operation would be:   AMAZON.FallbackIntent   IntentA   IntentB   IntentC  
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  /**
    * If you set the processBehavior element to BUILD, Amazon Lex builds the bot so that it can be run. If you set the element to SAVE Amazon Lex saves the bot, but doesn't build it.  If you don't specify this value, the default value is BUILD.
    */
  var processBehavior: js.UndefOr[ProcessBehavior] = js.undefined
  
  /**
    * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the PutBot operation to update the tags on a bot. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see Voices in Amazon Polly in the Amazon Polly Developer Guide.
    */
  var voiceId: js.UndefOr[String] = js.undefined
}
object PutBotRequest {
  
  inline def apply(childDirected: Boolean, locale: Locale, name: BotName): PutBotRequest = {
    val __obj = js.Dynamic.literal(childDirected = childDirected.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotRequest]
  }
  
  extension [Self <: PutBotRequest](x: Self) {
    
    inline def setAbortStatement(value: Statement): Self = StObject.set(x, "abortStatement", value.asInstanceOf[js.Any])
    
    inline def setAbortStatementUndefined: Self = StObject.set(x, "abortStatement", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setChildDirected(value: Boolean): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
    
    inline def setClarificationPrompt(value: Prompt): Self = StObject.set(x, "clarificationPrompt", value.asInstanceOf[js.Any])
    
    inline def setClarificationPromptUndefined: Self = StObject.set(x, "clarificationPrompt", js.undefined)
    
    inline def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectSentiment(value: Boolean): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
    
    inline def setDetectSentimentUndefined: Self = StObject.set(x, "detectSentiment", js.undefined)
    
    inline def setEnableModelImprovements(value: Boolean): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
    
    inline def setEnableModelImprovementsUndefined: Self = StObject.set(x, "enableModelImprovements", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setIntents(value: IntentList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: Intent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    inline def setProcessBehavior(value: ProcessBehavior): Self = StObject.set(x, "processBehavior", value.asInstanceOf[js.Any])
    
    inline def setProcessBehaviorUndefined: Self = StObject.set(x, "processBehavior", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVoiceId(value: String): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
    
    inline def setVoiceIdUndefined: Self = StObject.set(x, "voiceId", js.undefined)
  }
}
