package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutIntentResponse extends StObject {
  
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
  
  /**
    *  True if a new version of the intent was created. If the createVersion field was not specified in the request, the createVersion field is set to false in the response.
    */
  var createVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
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
    * An array of InputContext objects that lists the contexts that must be active for Amazon Lex to choose the intent in a conversation with the user.
    */
  var inputContexts: js.UndefOr[InputContextList] = js.undefined
  
  /**
    * Configuration information, if any, required to connect to an Amazon Kendra index and use the AMAZON.KendraSearchIntent intent.
    */
  var kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined
  
  /**
    * The date that the intent was updated. When you create a resource, the creation date and last update dates are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.undefined
  
  /**
    * An array of OutputContext objects that lists the contexts that the intent activates when the intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextList] = js.undefined
  
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
object PutIntentResponse {
  
  inline def apply(): PutIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutIntentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutIntentResponse] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setConclusionStatement(value: Statement): Self = StObject.set(x, "conclusionStatement", value.asInstanceOf[js.Any])
    
    inline def setConclusionStatementUndefined: Self = StObject.set(x, "conclusionStatement", js.undefined)
    
    inline def setConfirmationPrompt(value: Prompt): Self = StObject.set(x, "confirmationPrompt", value.asInstanceOf[js.Any])
    
    inline def setConfirmationPromptUndefined: Self = StObject.set(x, "confirmationPrompt", js.undefined)
    
    inline def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDialogCodeHook(value: CodeHook): Self = StObject.set(x, "dialogCodeHook", value.asInstanceOf[js.Any])
    
    inline def setDialogCodeHookUndefined: Self = StObject.set(x, "dialogCodeHook", js.undefined)
    
    inline def setFollowUpPrompt(value: FollowUpPrompt): Self = StObject.set(x, "followUpPrompt", value.asInstanceOf[js.Any])
    
    inline def setFollowUpPromptUndefined: Self = StObject.set(x, "followUpPrompt", js.undefined)
    
    inline def setFulfillmentActivity(value: FulfillmentActivity): Self = StObject.set(x, "fulfillmentActivity", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentActivityUndefined: Self = StObject.set(x, "fulfillmentActivity", js.undefined)
    
    inline def setInputContexts(value: InputContextList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    inline def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    inline def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value*))
    
    inline def setKendraConfiguration(value: KendraConfiguration): Self = StObject.set(x, "kendraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKendraConfigurationUndefined: Self = StObject.set(x, "kendraConfiguration", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: IntentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputContexts(value: OutputContextList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
    
    inline def setRejectionStatement(value: Statement): Self = StObject.set(x, "rejectionStatement", value.asInstanceOf[js.Any])
    
    inline def setRejectionStatementUndefined: Self = StObject.set(x, "rejectionStatement", js.undefined)
    
    inline def setSampleUtterances(value: IntentUtteranceList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: Utterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
    
    inline def setSlots(value: SlotList): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSlotsVarargs(value: Slot*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
