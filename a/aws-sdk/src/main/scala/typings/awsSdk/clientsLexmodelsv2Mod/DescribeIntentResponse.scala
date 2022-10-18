package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIntentResponse extends StObject {
  
  /**
    * The identifier of the bot associated with the intent.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot associated with the intent.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the intent was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The Lambda function called during each turn of a conversation with the intent.
    */
  var dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined
  
  /**
    * The Lambda function called when the intent is complete and ready for fulfillment.
    */
  var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined
  
  /**
    * 
    */
  var initialResponseSetting: js.UndefOr[InitialResponseSetting] = js.undefined
  
  /**
    * A list of contexts that must be active for the intent to be considered for sending to the user.
    */
  var inputContexts: js.UndefOr[InputContextsList] = js.undefined
  
  /**
    * The response that Amazon Lex sends to when the intent is closed.
    */
  var intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined
  
  /**
    * Prompts that Amazon Lex sends to the user to confirm completion of an intent.
    */
  var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined
  
  /**
    * The unique identifier assigned to the intent when it was created.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name specified for the intent.
    */
  var intentName: js.UndefOr[Name] = js.undefined
  
  /**
    * Configuration information required to use the AMAZON.KendraSearchIntent intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * A timestamp of the date and time that the intent was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale specified for the intent.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A list of contexts that are activated when the intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextsList] = js.undefined
  
  /**
    * The identifier of the built-in intent that this intent is derived from, if any.
    */
  var parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
  
  /**
    * User utterances that trigger this intent.
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
  
  /**
    * The list that determines the priority that slots should be elicited from the user.
    */
  var slotPriorities: js.UndefOr[SlotPrioritiesList] = js.undefined
}
object DescribeIntentResponse {
  
  inline def apply(): DescribeIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIntentResponse]
  }
  
  extension [Self <: DescribeIntentResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
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
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setOutputContexts(value: OutputContextsList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: IntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
    
    inline def setSlotPriorities(value: SlotPrioritiesList): Self = StObject.set(x, "slotPriorities", value.asInstanceOf[js.Any])
    
    inline def setSlotPrioritiesUndefined: Self = StObject.set(x, "slotPriorities", js.undefined)
    
    inline def setSlotPrioritiesVarargs(value: SlotPriority*): Self = StObject.set(x, "slotPriorities", js.Array(value*))
  }
}
