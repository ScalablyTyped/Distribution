package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentSummary extends StObject {
  
  /**
    * The description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The input contexts that must be active for this intent to be considered for recognition.
    */
  var inputContexts: js.UndefOr[InputContextsList] = js.undefined
  
  /**
    * The unique identifier assigned to the intent. Use this ID to get detailed information about the intent with the DescribeIntent operation.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the intent.
    */
  var intentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The timestamp of the date and time that the intent was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The output contexts that are activated when this intent is fulfilled.
    */
  var outputContexts: js.UndefOr[OutputContextsList] = js.undefined
  
  /**
    * If this intent is derived from a built-in intent, the name of the parent intent.
    */
  var parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
}
object IntentSummary {
  
  inline def apply(): IntentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInputContexts(value: InputContextsList): Self = StObject.set(x, "inputContexts", value.asInstanceOf[js.Any])
    
    inline def setInputContextsUndefined: Self = StObject.set(x, "inputContexts", js.undefined)
    
    inline def setInputContextsVarargs(value: InputContext*): Self = StObject.set(x, "inputContexts", js.Array(value*))
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setIntentName(value: Name): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setOutputContexts(value: OutputContextsList): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: OutputContext*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParentIntentSignature(value: IntentSignature): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
    
    inline def setParentIntentSignatureUndefined: Self = StObject.set(x, "parentIntentSignature", js.undefined)
  }
}
