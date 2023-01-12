package typings.awsLambda.anon

import typings.awsLambda.triggerLexV2Mod.LexV2DialogAction
import typings.awsLambda.triggerLexV2Mod.LexV2Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  var dialogAction: LexV2DialogAction
  
  var intent: LexV2Intent
}
object DialogAction {
  
  inline def apply(dialogAction: LexV2DialogAction, intent: LexV2Intent): DialogAction = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    inline def setDialogAction(value: LexV2DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
    
    inline def setIntent(value: LexV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
  }
}
