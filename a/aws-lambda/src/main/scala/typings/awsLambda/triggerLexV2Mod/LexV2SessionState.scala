package typings.awsLambda.triggerLexV2Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2SessionState extends StObject {
  
  var activeContexts: js.UndefOr[js.Array[LexV2ActiveContext]] = js.undefined
  
  var dialogAction: js.UndefOr[LexV2DialogAction] = js.undefined
  
  var intent: LexV2Intent
  
  var originatingRequestId: String
  
  var sessionAttributes: js.UndefOr[Record[String, String]] = js.undefined
}
object LexV2SessionState {
  
  inline def apply(intent: LexV2Intent, originatingRequestId: String): LexV2SessionState = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], originatingRequestId = originatingRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2SessionState]
  }
  
  extension [Self <: LexV2SessionState](x: Self) {
    
    inline def setActiveContexts(value: js.Array[LexV2ActiveContext]): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    inline def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    inline def setActiveContextsVarargs(value: LexV2ActiveContext*): Self = StObject.set(x, "activeContexts", js.Array(value*))
    
    inline def setDialogAction(value: LexV2DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
    
    inline def setIntent(value: LexV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setOriginatingRequestId(value: String): Self = StObject.set(x, "originatingRequestId", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributes(value: Record[String, String]): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
  }
}
