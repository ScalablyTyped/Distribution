package typings.awsLambda.anon

import typings.awsLambda.triggerLexV2Mod.LexV2ResultDialogAction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intent extends StObject {
  
  var dialogAction: LexV2ResultDialogAction
  
  var intent: js.UndefOr[Slots] = js.undefined
  
  var sessionAttributes: js.UndefOr[Record[String, String]] = js.undefined
}
object Intent {
  
  inline def apply(dialogAction: LexV2ResultDialogAction): Intent = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  
  extension [Self <: Intent](x: Self) {
    
    inline def setDialogAction(value: LexV2ResultDialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: Slots): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setSessionAttributes(value: Record[String, String]): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
  }
}
