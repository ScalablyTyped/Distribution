package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntentRequest extends StObject {
  
  /**
    * The identifier of the bot associated with this intent.
    */
  var botId: Id
  
  /**
    * The identifier of the version of the bot associated with this intent.
    */
  var botVersion: DraftBotVersion
  
  /**
    * A description of the intent. Use the description to help identify the intent in lists.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. For example, suppose that your bot determines that the user's name is John. You Lambda function might retrieve John's information from a backend database and prepopulate some of the values. For example, if you find that John is gluten intolerant, you might set the corresponding intent slot, glutenIntolerant to true. You might find John's phone number and set the corresponding session attribute.
    */
  var dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined
  
  /**
    * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot's transaction with the user. For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the customer's location and then place an order on the customer's behalf.
    */
  var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined
  
  /**
    * Configuration settings for the response that is sent to the user at the beginning of a conversation, before eliciting slot values.
    */
  var initialResponseSetting: js.UndefOr[InitialResponseSetting] = js.undefined
  
  /**
    * A list of contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime.  For example, if there are two intents with different input contexts that respond to the same utterances, only the intent with the active context will respond. An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be active to consider the intent.
    */
  var inputContexts: js.UndefOr[InputContextsList] = js.undefined
  
  /**
    * Sets the response that Amazon Lex sends to the user when the intent is closed.
    */
  var intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined
  
  /**
    * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user answers "no," the settings contain a statement that is sent to the user to end the intent.
    */
  var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined
  
  /**
    * The name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the name of any built-in intent.
    */
  var intentName: Name
  
  /**
    * Configuration information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can't determine another intent to invoke.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * The identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used by the intent must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * A lists of contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer.  When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active.
    */
  var outputContexts: js.UndefOr[OutputContextsList] = js.undefined
  
  /**
    * A unique identifier for the built-in intent to base this intent on.
    */
  var parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
  
  /**
    * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or "I want a {PizzaSize} pizza".  In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in the utterance shown to the user.. 
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
}
object CreateIntentRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, intentName: Name, localeId: LocaleId): CreateIntentRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentName = intentName.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIntentRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDialogCodeHook(value: DialogCodeHookSettings): Self = StObject.set(x, "dialogCodeHook", value.asInstanceOf[js.Any])
    
    inline def setDialogCodeHookUndefined: Self = StObject.set(x, "dialogCodeHook", js.undefined)
    
    inline def setFulfillmentCodeHook(value: FulfillmentCodeHookSettings): Self = StObject.set(x, "fulfillmentCodeHook", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentCodeHookUndefined: Self = StObject.set(x, "fulfillmentCodeHook", js.undefined)
    
    inline def setInitialResponseSetting(value: InitialResponseSetting): Self = StObject.set(x, "initialResponseSetting", value.asInstanceOf[js.Any])
    
    inline def setInitialResponseSettingUndefined: Self = StObject.set(x, "initialResponseSetting", js.undefined)
    
    inline def setInputContexts(value: InputContextsList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    inline def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    inline def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value*))
    
    inline def setIntentClosingSetting(value: IntentClosingSetting): Self = StObject.set(x, "intentClosingSetting", value.asInstanceOf[js.Any])
    
    inline def setIntentClosingSettingUndefined: Self = StObject.set(x, "intentClosingSetting", js.undefined)
    
    inline def setIntentConfirmationSetting(value: IntentConfirmationSetting): Self = StObject.set(x, "intentConfirmationSetting", value.asInstanceOf[js.Any])
    
    inline def setIntentConfirmationSettingUndefined: Self = StObject.set(x, "intentConfirmationSetting", js.undefined)
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setOutputContexts(value: OutputContextsList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: IntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
  }
}
