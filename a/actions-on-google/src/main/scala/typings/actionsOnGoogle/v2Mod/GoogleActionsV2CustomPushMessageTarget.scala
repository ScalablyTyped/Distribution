package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2CustomPushMessageTarget extends StObject {
  
  /**
    * The argument to target for an intent. For V1, only one Argument is
    * supported.
    */
  var argument: js.UndefOr[GoogleActionsV2Argument] = js.undefined
  
  /**
    * The intent to target.
    */
  var intent: js.UndefOr[String] = js.undefined
  
  /**
    * The locale to target. Follows IETF BCP-47 language code.
    * Can be used by a multi-lingual app to target a user on a specified
    * localized app. If not specified, it will default to en-US.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The user to target.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2CustomPushMessageTarget {
  
  @scala.inline
  def apply(): GoogleActionsV2CustomPushMessageTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessageTarget]
  }
  
  @scala.inline
  implicit class GoogleActionsV2CustomPushMessageTargetMutableBuilder[Self <: GoogleActionsV2CustomPushMessageTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: GoogleActionsV2Argument): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
