package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2RegisterUpdateValueSpec extends StObject {
  
  /**
    * The list of arguments to necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.undefined
  
  /**
    * The trigger context that defines how the update will be triggered.
    * This may modify the dialog in order to narrow down the user's preferences
    * for getting his or her updates.
    */
  var triggerContext: js.UndefOr[GoogleActionsV2TriggerContext] = js.undefined
}
object GoogleActionsV2RegisterUpdateValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2RegisterUpdateValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RegisterUpdateValueSpecMutableBuilder[Self <: GoogleActionsV2RegisterUpdateValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setTriggerContext(value: GoogleActionsV2TriggerContext): Self = StObject.set(x, "triggerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerContextUndefined: Self = StObject.set(x, "triggerContext", js.undefined)
  }
}
